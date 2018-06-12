package com.gsccs.cms.core.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsccs.cms.core.model.ContentSign;
import com.gsccs.cms.core.model.ContentSignExample;

public interface ContentSignMapper {

	int countByExample(ContentSignExample example);

	int deleteByExample(ContentSignExample example);

	int deleteByPrimaryKey(String id);

	int insert(ContentSign record);

	int insertSelective(ContentSign record);

	List<ContentSign> selectByExample(ContentSignExample example);

	List<ContentSign> selectSignByExample(ContentSignExample example);

	ContentSign selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") ContentSign record,
			@Param("example") ContentSignExample example);

	int updateByExample(@Param("record") ContentSign record,
			@Param("example") ContentSignExample example);

	int updateByPrimaryKeySelective(ContentSign record);

	int updateByPrimaryKey(ContentSign record);
}