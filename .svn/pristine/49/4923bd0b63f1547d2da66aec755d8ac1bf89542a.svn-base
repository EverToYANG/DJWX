package com.gsccs.cms.core.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsccs.cms.core.model.Sensitive;
import com.gsccs.cms.core.model.SensitiveExample;

public interface SensitiveMapper {
    
    int countByExample(SensitiveExample example);

    
    int deleteByExample(SensitiveExample example);

    
    int deleteByPrimaryKey(String id);

    
    int insert(Sensitive record);

    
    int insertSelective(Sensitive record);

    
    List<Sensitive> selectByExample(SensitiveExample example);
    List<Sensitive> selectPageByExample(SensitiveExample example);
    List<Sensitive> selectByExampleCache(SensitiveExample example);

    
    Sensitive selectByPrimaryKey(String id);

    
    int updateByExampleSelective(@Param("record") Sensitive record, @Param("example") SensitiveExample example);

    
    int updateByExample(@Param("record") Sensitive record, @Param("example") SensitiveExample example);

    
    int updateByPrimaryKeySelective(Sensitive record);

    
    int updateByPrimaryKey(Sensitive record);
}