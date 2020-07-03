package com.steveleejava.user.mypage;


import java.util.Date;

import lombok.Data;

@Data
public class UserDto {
	
	private String mail_id;
	private String pw;
	private String type;
	private String addr;
	private String sn7;
	private String phone_num;
	private String use_yn;
	private Date create_dt;
	

}
