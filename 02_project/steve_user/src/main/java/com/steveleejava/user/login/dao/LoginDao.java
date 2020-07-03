package com.steveleejava.user.login.dao;

import org.apache.ibatis.annotations.Mapper;

import com.steveleejava.user.login.UserDto;

@Mapper
public interface LoginDao {
	
	public UserDto getUserInfo(UserDto userDto);
	
}
