package com.gsccs.cms.auth.dao;

import com.gsccs.cms.auth.model.RoleOper;
import com.gsccs.cms.auth.model.RoleOperExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface RoleOperMapper {

	int countByExample(RoleOperExample example);

	int deleteByExample(RoleOperExample example);

	int deleteByPrimaryKey(String id);

	int insert(RoleOper record);

	int insertSelective(RoleOper record);

	List<RoleOper> selectByExample(RoleOperExample example);

	RoleOper selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") RoleOper record,
			@Param("example") RoleOperExample example);

	int updateByExample(@Param("record") RoleOper record,
			@Param("example") RoleOperExample example);

	int updateByPrimaryKeySelective(RoleOper record);

	int updateByPrimaryKey(RoleOper record);
}