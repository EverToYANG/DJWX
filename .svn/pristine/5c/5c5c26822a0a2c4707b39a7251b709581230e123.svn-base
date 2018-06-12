package com.gsccs.cms.module.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsccs.cms.module.model.VoteItem;
import com.gsccs.cms.module.model.VoteItemExample;

public interface VoteItemMapper {

	int countByExample(VoteItemExample example);

	int countSelectnumByExample(VoteItemExample example);

	int countSelectnumByExampleCache(VoteItemExample example);

	int deleteByExample(VoteItemExample example);

	int deleteByPrimaryKey(String id);

	int insert(VoteItem record);

	int insertSelective(VoteItem record);

	List<VoteItem> selectByExample(VoteItemExample example);

	List<VoteItem> selectByExampleCache(VoteItemExample example);

	VoteItem selectByPrimaryKey(String id);

	VoteItem selectByPrimaryKeyCache(String id);

	int updateByExampleSelective(@Param("record") VoteItem record,
			@Param("example") VoteItemExample example);

	int updateByExample(@Param("record") VoteItem record,
			@Param("example") VoteItemExample example);

	int updateByPrimaryKeySelective(VoteItem record);

	int updateByPrimaryKey(VoteItem record);

	int selectnum(String id);
}