package com.gsccs.cms.auth.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsccs.cms.auth.model.Operlogs;
import com.gsccs.cms.auth.model.OperlogsExample;

public interface OperlogsMapper {
	
	int countByExample(OperlogsExample example);

	List<Operlogs> selectPageByExample(OperlogsExample example);

	int deleteByExample(OperlogsExample example);

	int deleteByPrimaryKey(String id);

	int insert(Operlogs record);

	int insertSelective(Operlogs record);

	List<Operlogs> selectByExample(OperlogsExample example);

	Operlogs selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") Operlogs record,
			@Param("example") OperlogsExample example);

	int updateByExample(@Param("record") Operlogs record,
			@Param("example") OperlogsExample example);

	int updateByPrimaryKeySelective(Operlogs record);

	int updateByPrimaryKey(Operlogs record);
}