package com.steveleejava.push.service;

import java.util.List;

import com.steveleejava.push.vo.PushUserVO;

public interface PushService {

	
	public List<PushUserVO> notUserReader() throws Exception;
	
}
