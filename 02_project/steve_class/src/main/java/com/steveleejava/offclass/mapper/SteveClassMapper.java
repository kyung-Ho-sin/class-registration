package com.steveleejava.offclass.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SteveClassMapper {

	public List<Map<String, Object>> searchCardList (Map<String, Object> param);

}
