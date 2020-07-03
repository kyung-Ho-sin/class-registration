package com.steveleejava.user.board.dto;

import lombok.Data;

@Data
public class BoardDto {
	
	private int board_no;
	private String title;
	private String contents;
	private String mail_id;
	private String type;
	private String approval_yn;
	private String use_yn;
	private String create_id;
	private String create_dt;
	private String update_id;
	private String update_dt;
	
}
