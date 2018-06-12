package com.gsccs.cms.core.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsccs.cms.core.model.TempletLink;
import com.gsccs.cms.core.model.TempletLinkExample;

public interface TempletLinkMapper {
    
    int countByExample(TempletLinkExample example);

    
    int deleteByExample(TempletLinkExample example);

    
    int deleteByPrimaryKey(String id);

    
    int insert(TempletLink record);

    
    int insertSelective(TempletLink record);

    
    List<TempletLink> selectByExample(TempletLinkExample example);

    
    TempletLink selectByPrimaryKey(String id);

    
    int updateByExampleSelective(@Param("record") TempletLink record, @Param("example") TempletLinkExample example);

    
    int updateByExample(@Param("record") TempletLink record, @Param("example") TempletLinkExample example);

    
    int updateByPrimaryKeySelective(TempletLink record);

    
    int updateByPrimaryKey(TempletLink record);
}