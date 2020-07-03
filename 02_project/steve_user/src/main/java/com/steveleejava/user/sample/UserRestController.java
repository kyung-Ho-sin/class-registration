package com.steveleejava.user.sample;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.apache.ibatis.session.SqlSession;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

@CrossOrigin(origins = "*")
@RestController
public class UserRestController {

//	@Autowired
//	private SqlSession sqlSession;
	
	/*
	@RequestMapping("/userchkgetdto")
	public Map<String, Object> userchkgetdto(HttpServletRequest request, HttpServletResponse response
			,@RequestParam UserDto udto	) throws Exception {
			
		
		//get 방식으로만 전달
		//String id = request.getParameter("email_id");
		
		//post는 body에서 빼서 써야한다.
		Map<String, Object> result = new HashMap<String, Object>();
		Map<String, Object> result2;
		Map<String, Object> result3;
		
		if(udto.getMail_id() == null) {
			result.put("result", "11");
			return result;
		}else if(udto.getPw() == null) {
			result.put("result", "12");
			return result;
		}else {
			result2 = sqlSession.selectOne("usermapper.userchkselectid", udto.getMail_id());
			System.out.println("cnt id:" + result2.get("cnt"));
			long cnt = (long) result2.get("cnt");
			if(cnt == 1) {
				result3 = sqlSession.selectOne("usermapper.userchkselect", udto);
				long cnt2 = (long) result3.get("cnt");
				if(cnt2 == 0) {
					result.put("result", "1");
					
				}else {
					result = sqlSession.selectOne("usermapper.userchkselectinfo", udto);
					result.put("result", "2");
					
				}
				
			}else {
				result.put("result", "0");
				
			}
		}
		
		 
		System.out.println(result);
		
		
		return result;
		
	}	

	
	
	@RequestMapping("/userchkgetmap")
	public Map<String, Object> userchkgetmap(HttpServletRequest request, HttpServletResponse response
			,@RequestParam Map<String, Object> parammap	) throws Exception {
			
		
		//get 방식으로만 전달
		//String id = request.getParameter("email_id");
		
		//post는 body에서 빼서 써야한다.
		Map<String, Object> result = new HashMap<String, Object>();
		Map<String, Object> result2;
		Map<String, Object> result3;
		
		if(parammap.get("mail_id") == null) {
			result.put("result", "11");
			return result;
		}else if(parammap.get("pw") == null) {
			result.put("result", "12");
			return result;
		}else {
			result2 = sqlSession.selectOne("usermapper.userchkselectid", parammap.get("mail_id"));
			System.out.println("cnt id:" + result2.get("cnt"));
			long cnt = (long) result2.get("cnt");
			if(cnt == 1) {
				result3 = sqlSession.selectOne("usermapper.userchkselect", parammap);
				long cnt2 = (long) result3.get("cnt");
				if(cnt2 == 0) {
					result.put("result", "1");
					
				}else {
					result = sqlSession.selectOne("usermapper.userchkselectinfo", parammap);
					result.put("result", "2");
					
				}
				
			}else {
				result.put("result", "0");
				
			}
		}
		
		 
		System.out.println(result);
		
		
		return result;
		
	}	
	*/	
	
	
//	@RequestMapping("/userchk")
//	public Map<String, Object> userselectonepostparam(HttpServletRequest request, HttpServletResponse response
//			,@RequestBody Map<String, Object> udto	) throws Exception {
//		
//		//get 방식으로만 전달
//		//String id = request.getParameter("email_id");
//		
//		//post는 body에서 빼서 써야한다.
//		Map<String, Object> result = new HashMap<String, Object>();
//		Map<String, Object> result2;
//		Map<String, Object> result3;
//		
//		if(udto.get("mail_id") == null) {
//			result.put("result", "11");
//			return result;
//		}else if(udto.get("pw") == null) {
//			result.put("result", "12");
//			return result;
//		}else {
//			result2 = sqlSession.selectOne("usermapper.userchkselectid", udto.get("mail_id"));
//			System.out.println("cnt id:" + result2.get("cnt"));
//			long cnt = (long) result2.get("cnt");
//			if(cnt == 1) {
//				result3 = sqlSession.selectOne("usermapper.userchkselect", udto);
//				long cnt2 = (long) result3.get("cnt");
//				if(cnt2 == 0) {
//					result.put("result", "1");
//					
//				}else {
//					result = sqlSession.selectOne("usermapper.userchkselectinfo", udto);
//					result.put("result", "2");
//					
//				}
//				
//			}else {
//				result.put("result", "0");
//				
//			}
//		}
//		
//		 
//		System.out.println(result);
//		
//		
//		return result;
//		
//	}	
	/*
	@RequestMapping("/userinsert")
	public Map<String, Object> userinsert(HttpServletRequest request, HttpServletResponse response
			,@RequestBody UserDto udto	) throws Exception {
		
		
	
		
		//Map<String, Object> result = new HashMap<String, Object>();
		Map<String, Object> result;
		
		Date dt = new Date();
		udto.setCreate_dt(dt);
		udto.setUse_yn("y");

		result = sqlSession.selectOne("usercudmapper.userinsert", udto);
		//System.out.println("insert result:" + result.toString());
 
		//System.out.println(result);
		
		
		return result;
		
	}	
	*/
	
//	@RequestMapping("/userinsert")
//	public Map<String, Object> userinsert2(HttpServletRequest request, HttpServletResponse response
//			,@RequestBody Map<String, Object> udto	) {
//
//		Map<String, Object> result =new HashMap<String, Object>();
//		int resultint = 0;
//		
//		try {
//			resultint = sqlSession.insert("usercudmapper.userinsert", udto);
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("catch");
//		}finally {
//			System.out.println("result:" + resultint);
//			if(resultint != 1) {
//				result.put("result", "1");
//				result.put("resultmsg", "insert실패");
//			}else {
//				result.put("result", "2");
//				result.put("resultmsg", "insert성공");
//			}
//		}
//		
//		
//		return result;
//		
//	}	
	
	
}
