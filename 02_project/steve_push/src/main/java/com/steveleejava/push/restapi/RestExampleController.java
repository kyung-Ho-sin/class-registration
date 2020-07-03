package com.steveleejava.push.restapi;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.springframework.batch.core.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.steveleejava.common.JsonUtil;
import com.steveleejava.push.SendMailJobConfig;
import net.minidev.json.JSONArray;

@RestController
public class RestExampleController {
	
	@Autowired
	private SqlSession sqlSession;

	
	//메일 전송배치
	// cron expression 초  분  시 날짜  달  요일 년(생략가능)
	 
	//@Scheduled(cron=" */10****?")
	/*
	@RequestMapping("/mailtest")
	public void mailBatchSchedule() throws Exception {
		
		// bean 호출
		ApplicationContext context = new AnnotationConfigApplicationContext(SendMailJobConfig.class);
		context.getAutowireCapableBeanFactory();
		Job job = context.getBean("notSendUserJob",Job.class);
		((SendMailJobConfig) job).notSendUserJob();
		
	}*/
	
	@RequestMapping("/paylistutil")
	public JSONArray paylistutil(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		
		List<Map<String, Object>> userlist;
		
		userlist = sqlSession.selectList("payinfo.paylist");
		System.out.println(userlist);
		
		
		return JsonUtil.getJsonArrayFromList(userlist);
	}
	
	@RequestMapping("/paylist")
	public List<Map<String, Object>> paylist(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		
		List<Map<String, Object>> userlist;
		
		userlist = sqlSession.selectList("payinfo.paylist");
		System.out.println(userlist);
		
		
		return userlist;
	}	
	
}
