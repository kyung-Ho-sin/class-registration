package com.steveleejava.user.login.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.steveleejava.user.login.JwtService;
import com.steveleejava.user.login.UserDto;
import com.steveleejava.user.login.service.LoginService;

@RestController
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	
	
	@GetMapping("/")
	public String test() {
		return "1";
	}
	
	
	
	@CrossOrigin
	@GetMapping("/login")
	//@PostMapping("/login")
	public ResponseEntity<Map<String, Object>> login(HttpServletResponse res, UserDto userDto) {
		
		Map<String, Object> resultMap = new HashMap<>();
		HttpStatus status = null;
		System.out.println(userDto.toString());
		
		try {
			UserDto userInfo = loginService.login(userDto);
			String jwt = JwtService.createToken(userInfo);

			res.setHeader("auth_token", jwt);
			resultMap.put("status", true);
			resultMap.put("data", userInfo);
			status = HttpStatus.ACCEPTED;
			
		} catch (Exception e) {
			resultMap.put("status", false);
			resultMap.put("message", e.getMessage());
			status = HttpStatus.INTERNAL_SERVER_ERROR;
		}

		return new ResponseEntity<Map<String,Object>>(resultMap, status);
	}
	
	
	
	@CrossOrigin
	@GetMapping("/checkJwt")
	public String checkJwt() {
		return "1";
	}
	
	
	
	@CrossOrigin
	@GetMapping("/jwtTest")
	public String jwtTest() {
		
		String jwt = "";
		
		JwtService.detailTocken(jwt);
		return "1";
	}
}
