package com.gsccs.cms.core.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsccs.cms.core.model.RoleWxapp;
import com.gsccs.cms.core.model.RoleWxappExample;

public interface RoleWxAppMapper {

	int countByExample(RoleWxappExample example);

	int deleteByExample(RoleWxappExample example);

	int deleteByPrimaryKey(String id);

	int insert(RoleWxapp record);

	int insertSelective(RoleWxapp record);

	List<RoleWxapp> selectByExample(RoleWxappExample example);

	RoleWxapp selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") RoleWxapp record,
			@Param("example") RoleWxappExample example);

	int updateByExample(@Param("record") RoleWxapp record,
			@Param("example") RoleWxappExample example);

	int updateByPrimaryKeySelective(RoleWxapp record);

	int updateByPrimaryKey(RoleWxapp record);
}