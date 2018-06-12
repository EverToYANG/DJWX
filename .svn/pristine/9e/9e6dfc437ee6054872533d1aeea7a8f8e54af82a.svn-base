package com.gsccs.cms.module.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsccs.cms.module.model.Resume;
import com.gsccs.cms.module.model.ResumeExample;

public interface ResumeMapper {

	int countByExample(ResumeExample example);

	int deleteByExample(ResumeExample example);

	int deleteByPrimaryKey(String id);

	int insert(Resume record);

	int insertSelective(Resume record);

	List<Resume> selectByExample(ResumeExample example);

	List<Resume> selectPageByExample(ResumeExample example);

	Resume selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") Resume record,
			@Param("example") ResumeExample example);

	int updateByExample(@Param("record") Resume record,
			@Param("example") ResumeExample example);

	int updateByPrimaryKeySelective(Resume record);

	int updateByPrimaryKey(Resume record);
}