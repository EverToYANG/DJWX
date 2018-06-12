package com.gsccs.cms.course.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsccs.cms.course.model.Courselog;
import com.gsccs.cms.course.model.CourselogExample;

public interface CourselogMapper {

	int countByExample(CourselogExample example);

	int deleteByExample(CourselogExample example);

	int deleteByPrimaryKey(String id);

	int insert(Courselog record);

	int insertSelective(Courselog record);

	List<Courselog> selectByExample(CourselogExample example);

	List<Courselog> selectPageByExample(CourselogExample example);

	Courselog selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") Courselog record,
			@Param("example") CourselogExample example);

	int updateByExample(@Param("record") Courselog record,
			@Param("example") CourselogExample example);

	int updateByPrimaryKeySelective(Courselog record);

	int updateByPrimaryKey(Courselog record);
}