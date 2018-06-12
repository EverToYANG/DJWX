package com.gsccs.cms.core.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsccs.cms.core.model.Channel;
import com.gsccs.cms.core.model.ChannelExample;

public interface ChannelMapper {
	
	int countByExample(ChannelExample example);
	int deleteByExample(ChannelExample example);
	int deleteByPrimaryKey(Long id);
	int insert(Channel record);

	List<Channel> selectByExampleWithBLOBs(ChannelExample example);

	List<Channel> selectByExample(ChannelExample example);

	List<Channel> selectPageByExample(ChannelExample example);

	Channel selectByPrimaryKey(Long id);

	int updateByExampleSelective(@Param("record") Channel record,
			@Param("example") ChannelExample example);

	int updateByExampleWithBLOBs(@Param("record") Channel record,
			@Param("example") ChannelExample example);

	int updateByExample(@Param("record") Channel record,
			@Param("example") ChannelExample example);

	int updateByPrimaryKeySelective(Channel record);

	int updateByPrimaryKeyWithBLOBs(Channel record);

	int updateByPrimaryKey(Channel record);

	int selectMaxIndexnum();
}