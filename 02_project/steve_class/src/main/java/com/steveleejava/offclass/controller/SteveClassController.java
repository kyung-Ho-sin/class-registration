package com.steveleejava.offclass.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.steveleejava.offclass.service.SteveClassService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(path = "/steveclass")
public class SteveClassController {
	
	@Autowired
	private SteveClassService steveClassService;

	@PostMapping(path = "/cardlist", produces = { "application/json"}, consumes = { "application/json" })
	public Map<String, Object> SeachCardList(@RequestBody Map<String, Object> param) {
		
		LinkedHashMap<String, Object> result = new LinkedHashMap<String, Object>();
		
		try {
			result.put("list", steveClassService.searchCardList(param));
			result.put("response", "성공했습니다.");
			
		} catch (Exception e) {
//			log.error(e.getMessage());
			
			result.put("list", null);
			result.put("response", "실패했습니다.");
		}
		
		return result;
	}
	
}
