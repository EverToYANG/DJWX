package com.gsccs.cms.core.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsccs.cms.core.model.Link;
import com.gsccs.cms.core.model.LinkExample;

public interface LinkMapper {

	int countByExample(LinkExample example);

	List<Link> selectPageByExample(LinkExample example);

	int deleteByExample(LinkExample example);

	int deleteByPrimaryKey(String id);

	int insert(Link record);

	int insertSelective(Link record);

	List<Link> selectByExample(LinkExample example);

	Link selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") Link record,
			@Param("example") LinkExample example);

	int updateByExample(@Param("record") Link record,
			@Param("example") LinkExample example);

	int updateByPrimaryKeySelective(Link record);

	int updateByPrimaryKey(Link record);
}