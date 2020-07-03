package com.steveleejava.offclass.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.steveleejava.offclass.mapper.SteveClassMapper;

@Service
public class SteveClassService {
	
	@Autowired
	private SteveClassMapper steveClassMapper;

	public List<Map<String, Object>> searchCardList(Map<String, Object> param) {

		return steveClassMapper.searchCardList(param);
	}

}
