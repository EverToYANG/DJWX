package com.gsccs.cms.member.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsccs.cms.member.model.Creditrule;
import com.gsccs.cms.member.model.CreditruleExample;

public interface CreditruleMapper {

	int countByExample(CreditruleExample example);

	int deleteByExample(CreditruleExample example);

	int deleteByPrimaryKey(String id);

	int insert(Creditrule record);

	int insertSelective(Creditrule record);

	List<Creditrule> selectByExample(CreditruleExample example);

	List<Creditrule> selectByExampleCache(CreditruleExample example);

	List<Creditrule> selectPageByExample(CreditruleExample example);

	Creditrule selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") Creditrule record,
			@Param("example") CreditruleExample example);

	int updateByExample(@Param("record") Creditrule record,
			@Param("example") CreditruleExample example);

	int updateByPrimaryKeySelective(Creditrule record);

	int updateByPrimaryKey(Creditrule record);
}