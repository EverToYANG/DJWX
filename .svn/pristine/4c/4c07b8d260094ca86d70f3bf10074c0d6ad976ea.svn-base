package com.gsccs.cms.member.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsccs.cms.member.model.Membergroup;
import com.gsccs.cms.member.model.MembergroupExample;

public interface MembergroupMapper {
    
    int countByExample(MembergroupExample example);

    
    int deleteByExample(MembergroupExample example);

    
    int deleteByPrimaryKey(String id);

    
    int insert(Membergroup record);

    
    int insertSelective(Membergroup record);

    
    List<Membergroup> selectByExample(MembergroupExample example);
    List<Membergroup> selectPageByExample(MembergroupExample example);

    
    Membergroup selectByPrimaryKey(String id);

    
    int updateByExampleSelective(@Param("record") Membergroup record, @Param("example") MembergroupExample example);

    
    int updateByExample(@Param("record") Membergroup record, @Param("example") MembergroupExample example);

    
    int updateByPrimaryKeySelective(Membergroup record);

    
    int updateByPrimaryKey(Membergroup record);
}