package com.gsccs.cms.member.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsccs.cms.member.model.Member;
import com.gsccs.cms.member.model.MemberExample;

public interface MemberMapper {

	int countByExample(MemberExample example);

	int deleteByExample(MemberExample example);

	int deleteByPrimaryKey(String id);

	int insert(Member record);

	List<Member> selectByExample(MemberExample example);

	List<Member> selectPageByExample(MemberExample example);

	Member selectByPrimaryKey(String id);

	List<Member> selectAuthedList(@Param("wxappid") String  wxappid,
			@Param("unitid") String unitid);

	int updateByExample(@Param("record") Member record,
			@Param("example") MemberExample example);

	int updateByPrimaryKeySelective(Member record);

	int updateByPrimaryKey(Member record);
}