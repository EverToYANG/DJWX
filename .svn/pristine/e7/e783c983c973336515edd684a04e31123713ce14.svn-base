package com.gsccs.cms.course.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsccs.cms.course.model.CourseVote;
import com.gsccs.cms.course.model.CourseVoteExample;

public interface CourseVoteMapper {

	int countByExample(CourseVoteExample example);

	int countByExampleCache(CourseVoteExample example);

	int deleteByExample(CourseVoteExample example);

	int deleteByPrimaryKey(String id);

	int insert(CourseVote record);

	int insertSelective(CourseVote record);

	List<CourseVote> selectByExample(CourseVoteExample example);

	List<CourseVote> selectPageByExample(CourseVoteExample example);

	List<CourseVote> selectPageByExampleCache(CourseVoteExample example);

	CourseVote selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") CourseVote record,
			@Param("example") CourseVoteExample example);

	int updateByExample(@Param("record") CourseVote record,
			@Param("example") CourseVoteExample example);

	int updateByPrimaryKeySelective(CourseVote record);

	int updateByPrimaryKey(CourseVote record);
}