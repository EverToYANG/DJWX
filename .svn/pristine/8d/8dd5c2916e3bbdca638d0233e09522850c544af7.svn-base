package com.gsccs.cms.auth.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsccs.cms.auth.model.Func;
import com.gsccs.cms.auth.model.FuncExample;

public interface FuncMapper {

	int countByExample(FuncExample example);

	int deleteByExample(FuncExample example);

	int deleteByPrimaryKey(String id);

	int updatePar(Func record);

	Func selectParById(String id);

	int insert(Func record);

	int insertSelective(Func record);

	List<Func> selectByExample(FuncExample example);

	List<Func> selectPageByExample(FuncExample example);

	List<Func> selectRoot();

	List<Func> selectRootAuth(String userid);

	List<Func> selectAllAuth(String userid);

	List<Func> selectByParid(String id);

	List<Func> selectByParidAuth(FuncExample example);

	Func selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") Func record,
			@Param("example") FuncExample example);

	int updateByExample(@Param("record") Func record,
			@Param("example") FuncExample example);

	int updateByPrimaryKeySelective(Func record);

	int updateByPrimaryKey(Func record);
}