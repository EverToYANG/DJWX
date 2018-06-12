package com.gsccs.cms.member.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsccs.cms.member.model.Memberauth;
import com.gsccs.cms.member.model.MemberauthExample;

public interface MemberauthMapper {

	int countByExample(MemberauthExample example);

	int deleteByExample(MemberauthExample example);

	int deleteByPrimaryKey(String id);

	int insert(Memberauth record);

	int insertSelective(Memberauth record);

	List<Memberauth> selectByExample(MemberauthExample example);

	List<Memberauth> selectPageByExample(MemberauthExample example);

	Memberauth selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") Memberauth record,
			@Param("example") MemberauthExample example);

	int updateByExample(@Param("record") Memberauth record,
			@Param("example") MemberauthExample example);

	int updateByPrimaryKeySelective(Memberauth record);

	int updateByPrimaryKey(Memberauth record);
}