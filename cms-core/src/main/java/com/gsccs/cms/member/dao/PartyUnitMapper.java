package com.gsccs.cms.member.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsccs.cms.member.model.PartyUnit;
import com.gsccs.cms.member.model.PartyUnitExample;

public interface PartyUnitMapper {

	int countByExample(PartyUnitExample example);

	int deleteByExample(PartyUnitExample example);

	int deleteByPrimaryKey(Long id);

	int insert(PartyUnit record);

	List<PartyUnit> selectByExample(PartyUnitExample example);
	List<PartyUnit> selectPageByExample(PartyUnitExample example);

	PartyUnit selectByPrimaryKey(Long id);

	int updateByExampleSelective(@Param("record") PartyUnit record,
			@Param("example") PartyUnitExample example);

	int updateByExample(@Param("record") PartyUnit record,
			@Param("example") PartyUnitExample example);

	int updateByPrimaryKeySelective(PartyUnit record);

	int updateByPrimaryKey(PartyUnit record);
}