package com.steveleejava.user.signup.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class UserDto {
	
	private String mailId;
	private String pw;
	private String type;
	private String addr;
	private String sn7;
	private String phoneNum;
	private String useYn;
	private String createDt;
	
}
