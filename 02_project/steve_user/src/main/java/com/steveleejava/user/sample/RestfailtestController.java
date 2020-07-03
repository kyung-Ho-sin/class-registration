package com.steveleejava.user.sample;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/*
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
 */

@CrossOrigin(origins = "*")
@RestController
public class RestfailtestController {
	
//	@Autowired
//	private SqlSession sqlSession;
//
//
//
//	
//	@RequestMapping("/userchkpostselect")
//	public Map<String, Object> userchkpostselect(HttpServletRequest request, HttpServletResponse response
//		,@RequestBody UserDto udto	) throws Exception {
//		
//
//
//		//System.out.println("ajaxtext:" + ajaxtext);
//		String id = request.getParameter("email_id");
//		String pw = request.getParameter("pw");
//		System.out.println("udto:" + udto.getEmail_id());
//		System.out.println("udto:" + udto.getPw());
//		
//		Map<String, Object> params = new HashMap<>(); 
//		params.put("email_id", id);
//		params.put("pw", pw);
//		
//		Map<String, Object> result = sqlSession.selectOne("userinfo.userchkselect", params);
//		System.out.println(result);
//		
//		
//		return result;
//		
//		//return null;
//	}	
//	
//	
//
//	@RequestMapping("/userchkmapstringselect")
//	public Map<String, Object> userchkmapstringselect(HttpServletRequest request, HttpServletResponse response
//		,@RequestBody UserDto udto	) throws Exception {
//		
//		//System.out.println("ajaxtext:" + ajaxtext);
//		String id = request.getParameter("email_id");
//		String pw = request.getParameter("pw");
//		System.out.println("udto:" + udto.getEmail_id());
//		System.out.println("udto:" + udto.getPw());
//		
//		Map<String, Object> params = new HashMap<>();	
//		params.put("email_id", id);
//		params.put("pw", pw);
//		
//		Map<String, Object> result = sqlSession.selectOne("userinfo.userchkmapstringselect", params);
//		System.out.println(result);
//		
//		
//		return result;
//		
//		//return null;
//	}	
//	
//
//	@RequestMapping("/userchkmapselect")
//	public Map<String, Object> userchkmapselect(HttpServletRequest request, HttpServletResponse response
//		,@RequestBody UserDto udto	) throws Exception {
//		
//		//System.out.println("ajaxtext:" + ajaxtext);
//		String id = request.getParameter("email_id");
//		String pw = request.getParameter("pw");
//		System.out.println("udto:" + udto.getEmail_id());
//		System.out.println("udto:" + udto.getPw());
//		
//		Map<String, String> params = new HashMap<String, String>();	
//		params.put("email_id", id);
//		params.put("pw", pw);
//		
//		Map<String, Object> result = sqlSession.selectOne("userinfo.userchkmapselect", params);
//		System.out.println(result);
//		
//		
//		return result;
//		
//		//return null;
//	}		
	
	
}
