package com.gsccs.cms.core.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsccs.cms.module.model.Report;
import com.gsccs.cms.module.model.ReportExample;

public interface ReportMapper {

	int countByExample(ReportExample example);

	int countByExampleCache(ReportExample example);

	int deleteByExample(ReportExample example);

	int deleteByPrimaryKey(String id);

	int insert(Report record);

	int insertSelective(Report record);

	List<Report> selectByExample(ReportExample example);

	List<Report> selectPageByExample(ReportExample example);

	List<Report> selectPageByExampleCache(ReportExample example);

	Report selectByQuerycode(String querycode);

	Report selectByQuerycodeCache(String querycode);

	Report selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") Report record,
			@Param("example") ReportExample example);

	int updateByExample(@Param("record") Report record,
			@Param("example") ReportExample example);

	int updateByPrimaryKeySelective(Report record);

	int updateByPrimaryKey(Report record);
}