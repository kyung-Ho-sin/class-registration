package com.steveleejava.user.sample;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.steveleejava.common.JsonUtil;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/*
import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
 */

@RequestMapping(value = "/test/*")
@CrossOrigin(origins = "*")
@RestController
public class ResttestController {
	
//	@Autowired
//	private SqlSession sqlSession;
//
//
//	
//	@RequestMapping("/userseleconeutil")
//	public JSONObject userseleconeutil(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		
//		
//		
//		String id = "jjj@naver.com";
//		System.out.println("id:" + id);
//		Map<String, Object> result = sqlSession.selectOne("userinfo.userselect", id);
//		System.out.println(result);
//		
//		
//		return JsonUtil.getJsonStringFromMap(result);
//	}	
//	
//	@RequestMapping("/userselecone")
//	public Map<String, Object> userselecone(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		
//		
//		
//		String id = "jjj@naver.com";
//		System.out.println("id:" + id);
//		Map<String, Object> result = sqlSession.selectOne("userinfo.userselect", id);
//		System.out.println(result);
//		
//		
//		return result;
//	}	
//
//	@RequestMapping("/useralllistutil")
//	public JSONArray useralllistutil(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		
//		
//		
//		
//		List<Map<String, Object>> userlist;
//		
//		userlist = sqlSession.selectList("userinfo.useralllist");
//		System.out.println(userlist);
//		
//		
//		return JsonUtil.getJsonArrayFromList(userlist);
//	}
	
	
}
