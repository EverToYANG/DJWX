package com.gsccs.cms.auth.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsccs.cms.auth.model.RoleFunc;
import com.gsccs.cms.auth.model.RoleFuncExample;

public interface RoleFuncMapper {

	int countByExample(RoleFuncExample example);

	int deleteByExample(RoleFuncExample example);

	int deleteByPrimaryKey(String id);

	int insert(RoleFunc record);

	int insertSelective(RoleFunc record);

	List<RoleFunc> selectByExample(RoleFuncExample example);

	RoleFunc selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") RoleFunc record,
			@Param("example") RoleFuncExample example);

	int updateByExample(@Param("record") RoleFunc record,
			@Param("example") RoleFuncExample example);

	int updateByPrimaryKeySelective(RoleFunc record);

	int updateByPrimaryKey(RoleFunc record);
}