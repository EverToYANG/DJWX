package com.gsccs.cms.auth.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsccs.cms.auth.model.Unit;
import com.gsccs.cms.auth.model.UnitExample;


public interface UnitMapper {
   
    int countByExample(UnitExample example);
    int deleteByExample(UnitExample example);
    int deleteByPrimaryKey(Long id);
    int insert(Unit record);
    List<Unit> selectByExample(UnitExample example);
    List<Unit> selectByExampleCache(UnitExample example);
    List<Unit> findByUser(UnitExample example);
    List<Unit> selectPageByExample(UnitExample example);
    Unit selectByPrimaryKey(Long id);
    int updateByExampleSelective(@Param("record") Unit record, @Param("example") UnitExample example);
    int updateByExample(@Param("record") Unit record, @Param("example") UnitExample example);
    int updateByPrimaryKeySelective(Unit record);
    int updateByPrimaryKey(Unit record);
    
    public List<Unit> selectUnitByparid(@Param("parid")Long parid);
    public List<Unit> selectUnitByCorpid(@Param("corpid")String corpid);
    
    public void updatePar(Unit unit);
}