package com.steveleejava.user.signup.controller;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.steveleejava.user.signup.dto.UserDto;

@Controller
public class SignupController {
	
	//소스입력
	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping("/signup/signUp")
	public String signUp() {
		
		return "signUp";
	}
	
	
	@ResponseBody
	@RequestMapping(value = "signup/insert.do", method = RequestMethod.GET)
	public String insert(@RequestParam Map<String, Object> mparam) {
		
		int result = sqlSession.insert("usermapper.insert", mparam);
		
//		String url = "";
		
		String msg = "";
		
//		System.out.println(""+);
		
		if(result != 0) 
			msg = "회원등록이 되었습니다.";
		else 
			msg = "안되었습니다.";
		
		
//		model.addAttribute("msg", msg);
		
		return msg;
	}

}
