package com.steveleejava.user.login.service.impl;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.steveleejava.user.login.UserDto;
import com.steveleejava.user.login.dao.LoginDao;
import com.steveleejava.user.login.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	SqlSession sqlSession;
		
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	
  public UserDto login(UserDto userDto) throws Exception {
  	
    try{
    	
    	UserDto userInfo = sqlSession.getMapper(LoginDao.class).getUserInfo(userDto);
    	return userInfo;
        
    }catch (NullPointerException e){
			logger.error("[Exception] login : {}", e);
			throw e;
    }catch (RuntimeException e){
			logger.error("[Exception] login : {}", e);
			throw e;
    }catch (Exception e){
			logger.error("[Exception] login : {}", e);
			throw e;
    }
  }
  
  
  
  public String createJwt() throws Exception {
  	
    try{
    	
    	return "";
        
    }catch (NullPointerException e){
			logger.error("[Exception] createJwt : {}", e);
			throw e;
    }catch (RuntimeException e){
			logger.error("[Exception] createJwt : {}", e);
			throw e;
    }catch (Exception e){
			logger.error("[Exception] createJwt : {}", e);
			throw e;
    }
  }
  
  
  
  public String checkJwt() throws Exception {
  	
    try{
    	return "";
        
    }catch (NullPointerException e){
			logger.error("[Exception] checkJwt : {}", e);
			throw e;
    }catch (RuntimeException e){
			logger.error("[Exception] checkJwt : {}", e);
			throw e;
    }catch (Exception e){
			logger.error("[Exception] checkJwt : {}", e);
			throw e;
    }
  }
  
  
  
  public String refreshJwt() throws Exception {
  	
    try{
    	return "";
        
    }catch (NullPointerException e){
			logger.error("[Exception] refreshJwt : {}", e);
			throw e;
    }catch (RuntimeException e){
			logger.error("[Exception] refreshJwt : {}", e);
			throw e;
    }catch (Exception e){
			logger.error("[Exception] refreshJwt : {}", e);
			throw e;
    }
  }  
}
