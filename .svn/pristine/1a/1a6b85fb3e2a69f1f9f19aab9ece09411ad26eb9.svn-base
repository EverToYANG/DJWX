package com.gsccs.cms.course.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsccs.cms.course.model.CourseFeed;
import com.gsccs.cms.course.model.CourseFeedExample;

public interface CourseFeedMapper {

	int countByExample(CourseFeedExample example);

	int countByExampleCache(CourseFeedExample example);

	int deleteByExample(CourseFeedExample example);

	int deleteByPrimaryKey(String id);

	int insert(CourseFeed record);

	int insertSelective(CourseFeed record);

	List<CourseFeed> selectByExample(CourseFeedExample example);

	List<CourseFeed> selectPageByExample(CourseFeedExample example);

	List<CourseFeed> selectPageByExampleCache(CourseFeedExample example);

	CourseFeed selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") CourseFeed record,
			@Param("example") CourseFeedExample example);

	int updateByExample(@Param("record") CourseFeed record,
			@Param("example") CourseFeedExample example);

	int updateByPrimaryKeySelective(CourseFeed record);

	int updateByPrimaryKey(CourseFeed record);
}