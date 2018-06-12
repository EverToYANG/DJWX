package com.gsccs.cms.auth.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsccs.cms.auth.model.Msg;
import com.gsccs.cms.auth.model.MsgExample;

public interface MsgMapper {
	int countByExample(MsgExample example);

	int deleteByExample(MsgExample example);

	int deleteByPrimaryKey(String id);

	int insert(Msg record);

	int insertSelective(Msg record);

	List<Msg> selectByExample(MsgExample example);

	List<Msg> selectPageByExample(MsgExample example);

	Msg selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") Msg record,
			@Param("example") MsgExample example);

	int updateByExample(@Param("record") Msg record,
			@Param("example") MsgExample example);

	int updateByPrimaryKeySelective(Msg record);

	int updateByPrimaryKey(Msg record);
}