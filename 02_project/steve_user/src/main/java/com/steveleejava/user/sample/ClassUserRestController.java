package com.steveleejava.user.sample;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.steveleejava.common.JsonUtil;

import org.apache.ibatis.session.SqlSession;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

@CrossOrigin(origins = "*")
@RestController
public class ClassUserRestController {

//	@Autowired
//	private SqlSession sqlSession;
//	
//	
//
//	@RequestMapping("/useralllist")
//	public List<Map<String, Object>> useralllist(HttpServletRequest request, HttpServletResponse response) throws Exception {
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
//		return userlist;
//	}
//
//	
//	@RequestMapping("/userselectonegetparam")
//	public Map<String, Object> userselectonegetparam(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		
//		
//		
//		String id = request.getParameter("email_id");
//		System.out.println("id:" + id);
//		Map<String, Object> result = sqlSession.selectOne("userinfo.userselect", id);
//		System.out.println(result);
//		
//		
//		return result;
//	}
//	
//	@RequestMapping("/userselectonepostparam")
//	public Map<String, Object> userselectonepostparam(HttpServletRequest request, HttpServletResponse response
//			,@RequestBody String ajaxtext) throws Exception {
//		
//		
//		System.out.println("tostring:" + request.toString());
//		
//		System.out.println("ajaxtext" + ajaxtext);
//		
//		//get 방식으로만 전달
//		//String id = request.getParameter("email_id");
//		
//		//post는 body에서 빼서 써야한다.
//		JSONParser jpars = new JSONParser();
//		JSONObject jobj = (JSONObject) jpars.parse(ajaxtext);
//		
//		System.out.println("jobj.get(\"email_id\")" + jobj.get("email_id"));
//		
//		Map<String, Object> result = sqlSession.selectOne("userinfo.userselect", jobj.get("email_id"));
//		System.out.println(result);
//		
//		
//		return result;
//		
//	}	
//	
//	
//	@RequestMapping("/userselecturl/{email_id}")
//	public Map<String, Object>  userselecturl(HttpServletRequest request, HttpServletResponse response,@PathVariable("email_id") String email_id) throws Exception {
//		
//		
//		
//		System.out.println("id:" + email_id);
//		Map<String, Object> result = sqlSession.selectOne("userinfo.userselect", email_id);
//		System.out.println(result);
//		
//		
//		return result;
//	}	
//	
//
//	
//	
//	@RequestMapping("/userchkbodydtoselect")
//	public Map<String, Object> userchkbodydtoselect(HttpServletRequest request, HttpServletResponse response
//		,@RequestBody UserDto udto	) throws Exception {
//		
//		//System.out.println("ajaxtext:" + ajaxtext);
//		String id = request.getParameter("email_id");
//		String pw = request.getParameter("pw");
//		System.out.println("udto:" + udto.getEmail_id());
//		System.out.println("udto:" + udto.getPw());
//		
//	
//		
//		Map<String, Object> result = sqlSession.selectOne("userinfo.userchkdtoselect", udto);
//		System.out.println(result);
//		
//		
//		return result;
//		
//	}	
	
}
