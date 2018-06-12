package com.gsccs.cms.core.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsccs.cms.core.model.ContentImg;
import com.gsccs.cms.core.model.ContentImgExample;

public interface ContentImgMapper {

	int countByExample(ContentImgExample example);

	int deleteByExample(ContentImgExample example);

	int deleteByPrimaryKey(String id);

	int insert(ContentImg record);

	int insertSelective(ContentImg record);

	List<ContentImg> selectByExample(ContentImgExample example);

	ContentImg selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") ContentImg record,
			@Param("example") ContentImgExample example);

	int updateByExample(@Param("record") ContentImg record,
			@Param("example") ContentImgExample example);

	int updateByPrimaryKeySelective(ContentImg record);

	int updateByPrimaryKey(ContentImg record);
}