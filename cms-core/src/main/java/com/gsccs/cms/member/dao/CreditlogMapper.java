package com.gsccs.cms.member.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsccs.cms.member.model.Creditlog;
import com.gsccs.cms.member.model.CreditlogExample;

public interface CreditlogMapper {

	int countByExample(CreditlogExample example);

	int deleteByExample(CreditlogExample example);

	int deleteByPrimaryKey(String id);

	int insert(Creditlog record);

	int insertSelective(Creditlog record);

	List<Creditlog> selectByExample(CreditlogExample example);

	List<Creditlog> selectPageByExample(CreditlogExample example);

	Creditlog selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") Creditlog record,
			@Param("example") CreditlogExample example);

	int updateByExample(@Param("record") Creditlog record,
			@Param("example") CreditlogExample example);

	int updateByPrimaryKeySelective(Creditlog record);

	int updateByPrimaryKey(Creditlog record);
}