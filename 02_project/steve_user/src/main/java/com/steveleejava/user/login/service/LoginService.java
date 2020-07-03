package com.steveleejava.user.login.service;

import org.springframework.stereotype.Service;

import com.steveleejava.user.login.UserDto;

@Service
public interface LoginService {
	
	public UserDto login(UserDto userDto) throws Exception;
	public String createJwt() throws Exception;
	public String checkJwt() throws Exception;
	public String refreshJwt() throws Exception;

}
