package com.gsccs.cms.module.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsccs.cms.module.model.VoteTopic;
import com.gsccs.cms.module.model.VoteTopicExample;

public interface VoteTopicMapper {

	int countByExample(VoteTopicExample example);

	int countByExampleCache(VoteTopicExample example);

	int deleteByExample(VoteTopicExample example);

	int deleteByPrimaryKey(String id);

	int insert(VoteTopic record);

	int insertSelective(VoteTopic record);

	List<VoteTopic> selectByExample(VoteTopicExample example);

	List<VoteTopic> selectPageByExample(VoteTopicExample example);

	List<VoteTopic> selectPageByExampleCache(VoteTopicExample example);

	VoteTopic selectByPrimaryKey(String id);

	VoteTopic selectByPrimaryKeyCache(String id);

	int updateByExampleSelective(@Param("record") VoteTopic record,
			@Param("example") VoteTopicExample example);

	int updateByExample(@Param("record") VoteTopic record,
			@Param("example") VoteTopicExample example);

	int updateByPrimaryKeySelective(VoteTopic record);

	int updateByPrimaryKey(VoteTopic record);
}