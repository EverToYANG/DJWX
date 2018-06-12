package com.gsccs.cms.auth.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsccs.cms.auth.model.Users;
import com.gsccs.cms.auth.model.UsersExample;

public interface UsersMapper {
	int countByExample(UsersExample example);

	int countByExampleUnits(UsersExample example);

	List<Users> selectPageByExample(UsersExample example);

	List<Users> selectPageByExampleUnits(UsersExample example);

	int updateById(@Param("id") String id, @Param("state") String state);

	int resetPwdByIds(@Param("ids") String ids, @Param("pwd") String pwd);

	int deleteByExample(UsersExample example);

	int deleteByPrimaryKey(String id);

	int insert(Users record);

	/**
	 * 大于0则表示存在
	 * 
	 * @param record
	 * @return
	 */
	int have(Users record);

	List<Users> selectByExample(UsersExample example);

	List<Users> selectByExampleCache(UsersExample example);

	Users selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") Users record,
			@Param("example") UsersExample example);

	int updateByExample(@Param("record") Users record,
			@Param("example") UsersExample example);

	int updateByPrimaryKeySelective(Users record);

	int updateByPrimaryKey(Users record);

	int updateLastLoginTime(Users record);

	int updatePwd(Users record);

	int resetPwd(Users record);
}