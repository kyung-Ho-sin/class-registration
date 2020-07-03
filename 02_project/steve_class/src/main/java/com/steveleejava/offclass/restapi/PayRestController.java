package com.steveleejava.offclass.restapi;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.steveleejava.common.JsonUtil;
import net.minidev.json.JSONArray;

@RestController
public class PayRestController {
	
//	@Autowired
//	private SqlSession sqlSession;
//
//	
//	@RequestMapping("/paylist")
//	public List<Map<String, Object>> useralllist(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		
//		
//		List<Map<String, Object>> userlist;
//		
//		userlist = sqlSession.selectList("paymapper.payalllist");
//		//System.out.println(userlist);
//		
//		
//		return userlist;
//	}
	
}
