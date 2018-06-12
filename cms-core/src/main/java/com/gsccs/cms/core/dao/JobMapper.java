package com.gsccs.cms.core.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsccs.cms.core.model.Job;
import com.gsccs.cms.core.model.JobExample;

public interface JobMapper {

	int countByExample(JobExample example);

	int countByExampleCache(JobExample example);

	int deleteByExample(JobExample example);

	int deleteByPrimaryKey(String id);

	int insert(Job record);

	int insertSelective(Job record);

	List<Job> selectByExample(JobExample example);

	List<Job> selectPageByExample(JobExample example);

	List<Job> selectPageByExampleCache(JobExample example);

	Job selectByPrimaryKey(String id);

	Job selectByPrimaryKeyCache(String id);

	int updateByExampleSelective(@Param("record") Job record,
			@Param("example") JobExample example);

	int updateByExample(@Param("record") Job record,
			@Param("example") JobExample example);

	int updateByPrimaryKeySelective(Job record);

	int updateByPrimaryKey(Job record);
}