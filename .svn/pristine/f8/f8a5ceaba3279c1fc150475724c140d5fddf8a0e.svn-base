package com.gsccs.cms.core.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsccs.cms.core.model.TempletChannel;
import com.gsccs.cms.core.model.TempletChannelExample;

public interface TempletChannelMapper {

	int countByExample(TempletChannelExample example);

	int deleteByExample(TempletChannelExample example);

	int deleteByPrimaryKey(String id);

	int insert(TempletChannel record);

	int insertSelective(TempletChannel record);

	List<TempletChannel> selectByExampleWithBLOBs(TempletChannelExample example);

	List<TempletChannel> selectByExample(TempletChannelExample example);

	List<TempletChannel> selectPageByExample(TempletChannelExample example);

	TempletChannel selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") TempletChannel record,
			@Param("example") TempletChannelExample example);

	int updateByExampleWithBLOBs(@Param("record") TempletChannel record,
			@Param("example") TempletChannelExample example);

	int updateByExample(@Param("record") TempletChannel record,
			@Param("example") TempletChannelExample example);

	int updateByPrimaryKeySelective(TempletChannel record);

	int updateByPrimaryKeyWithBLOBs(TempletChannel record);

	int updateByPrimaryKey(TempletChannel record);
}