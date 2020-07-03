package com.steveleejava.offclass.restapi;

import java.util.ArrayList;
import java.util.Date;
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
import com.steveleejava.offclass.Dto.UserDto;

import org.apache.ibatis.session.SqlSession;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

@CrossOrigin(origins = "*")
@RestController
public class OffClassRestController {

//	@Autowired
//	private SqlSession sqlSession;
//	
//
//	@RequestMapping("/offalllist")
//	public List<Map<String, Object>> useralllist(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		
//		List<Map<String, Object>> offlist;
//		offlist = sqlSession.selectList("offclassmapper.offalllist");
//		
//		return offlist;
//	}
//	
//	
//	@RequestMapping("/offselectnopost")
//	public Map<String, Map<String, Object>> offselectnopost(HttpServletRequest request, HttpServletResponse response
//			,@RequestBody String ajaxtext) throws Exception {
//		
//		JSONParser jpars = new JSONParser();
//		JSONObject jobj = (JSONObject) jpars.parse(ajaxtext);
//		
//		Map<String, Map<String, Object>> result = new HashMap<String, Map<String, Object>>();
//		Map<String, Object> resultout1 = new HashMap<String, Object>();
//		Map<String, Object> resultin1 = new HashMap<String, Object>();
//		
//		if(jobj.get("class_no") == null) {
//			
//			resultin1.put("code", "0");
//			resultin1.put("msg", "파라미터null입력");
//			result.put("result", resultin1);
//		}else {
//			resultout1 = sqlSession.selectOne("offclassmapper.offselectno", jobj.get("class_no"));
//			if(resultout1.get("class_no") == null) {
//				resultin1.put("code", "1");
//				resultin1.put("msg", "결과없음");
//				result.put("result", resultin1);
//			}else {
//				resultin1.put("code", "2");
//				resultin1.put("msg", "조회성공");
//				result.put("result", resultin1);
//				result.put("result", resultout1);
//				
//			}
//		}
//			
//		return result;
//		
//	}	
//	
//	
//	
//	
//	@RequestMapping("/offpayselectidpost")
//	public List<Map<String, Object>> offpayselectidpost(HttpServletRequest request, HttpServletResponse response
//			,@RequestBody Map<String, Object> ajaxmap) throws Exception {
//		
//		
//		List<Map<String, Object>> result =new ArrayList<Map<String,Object>>();
//		Map<String, Object> resultmap = new HashMap<String, Object>();
//		
//		if(ajaxmap.get("mail_id") == null) {
//			
//			resultmap.put("result", "0");
//			resultmap.put("resultmsg", "파라미터null입력");
//			result.add(resultmap);
//		}else {
//			result = sqlSession.selectList("paymapper.offpayselectid", ajaxmap.get("mail_id"));
//			
//			if(result.get(0).get("mail_id") == null) {
//				resultmap.put("result", "1");
//				resultmap.put("resultmsg", "결과없음");
//				result.add(resultmap);
//			}else {
//				resultmap.put("result", "2");
//				resultmap.put("resultmsg", "조회성공");
//				result.add(resultmap);
//			}
//		}
//		
//		
//			
//		return result;
//		
//	}	
//	
//	
//	
//
//	@RequestMapping("/offinsert")
//	public Map<String, Object> offinsert(HttpServletRequest request, HttpServletResponse response
//			,@RequestBody Map<String, Object> ajaxmap	) throws Exception {
//		
//		
//	
//		
//		Map<String, Object> result = new HashMap<String, Object>();
//		
//		Date dt = new Date();		
//		ajaxmap.put("create_dt", dt);
//
//		int resultint = sqlSession.insert("offclasscudmapper.offinsert", ajaxmap);
//		System.out.println("insert result:" + resultint);
// 
//		//System.out.println(result);
//		if(resultint != 1) {
//			result.put("result", "1");
//			result.put("resultmsg", "insert실패");
//		}else {
//			result.put("result", "2");
//			result.put("resultmsg", "insert성공");
//		}
//		
//		
//		return result;
//		
//	}		
//	///
	
	
}
