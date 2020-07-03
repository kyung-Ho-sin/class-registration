package com.steveleejava.user.login;

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
	private String createId;
	private String createDt;
	private String updateId;
	private String updateDt;

}
