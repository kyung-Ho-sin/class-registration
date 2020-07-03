package com.steveleejava.user.board.Controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
public class BoardController {
	
	@Autowired
	SqlSession sql;
	
	@RequestMapping(value="/selectboard", method = RequestMethod.POST )
	public List<Map<String, Object>> selectboard(HttpServletRequest req, HttpServletResponse res, @RequestBody Map<String, Object> selectboard) {
		System.out.println(selectboard.toString());
		
		List<Map<String,Object>> selectAll;
		
		if(selectboard.get("select").equals("Front-end게시판")) {
			selectAll = sql.selectList("Board.selectFront");
		}else if(selectboard.get("select").equals("Back-end게시판")){
			selectAll = sql.selectList("Board.selectBack");
		}else {
			selectAll = sql.selectList("Board.selectAll");
		}
		System.out.println(selectAll.toString());
		return selectAll;
	}
	//게시판 클릭 
	@RequestMapping(value="/clickboard", method = RequestMethod.POST )
	public Map<String, Object> clickboard(HttpServletRequest req, HttpServletResponse res, @RequestBody Map<String, Object> clickboard) {
		System.out.println(clickboard.get("board_no"));
		
		Map<String, Object> board_Content;
		board_Content = sql.selectOne("Board.boardClick", clickboard);
		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd/HH:mm");
		board_Content.put("update_dt", date.format(board_Content.get("update_dt")));
		board_Content.put("create_dt", date.format(board_Content.get("create_dt")));

		return board_Content;
	}
	//입력
	@RequestMapping(value="/Insertboard", method = RequestMethod.POST )
	public void boardInsert(HttpServletRequest req, HttpServletResponse res, @RequestBody Map<String, Object> boardInsert) {
		
		Map<String, Object> selectAll = new HashMap<String, Object>();
		//날짜 Format ex)2020/06/15/12:33 
		Date today = new Date();
		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd/HH:mm");
		
		if(boardInsert.get("type").equals("Front-end게시판")) {
			boardInsert.put("type", "f");
		}else {
			boardInsert.put("type", "b");
		}
		
//		int result_insert = sql.insert("Board.insertBoard", boardInsert);
		
	}
	//삭제
	@RequestMapping(value="/delboard", method = RequestMethod.POST )
	public int delBaord(HttpServletRequest req, HttpServletResponse res, @RequestBody Map<String, Object> boardInsert) {
		
		Map<String, Object> selectAll = new HashMap<String, Object>();
		
		int result_insert = sql.update("Board.deleteBoard", boardInsert);
		
		return result_insert;
	}
	
	@RequestMapping(value="/modifyboard", method = RequestMethod.POST )
	public int modifyboard(HttpServletRequest req, HttpServletResponse res, @RequestBody Map<String, Object> boardInsert) {
		
		Map<String, Object> selectAll = new HashMap<String, Object>();
		
		int result_insert = sql.update("Board.deleteBoard", boardInsert);
		
		return result_insert;
	}
}
