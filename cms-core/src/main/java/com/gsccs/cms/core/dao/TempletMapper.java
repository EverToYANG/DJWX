package com.gsccs.cms.core.dao;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsccs.cms.core.model.Templet;
import com.gsccs.cms.core.model.TempletExample;

public interface TempletMapper {
    
    int countByExample(TempletExample example);

    
    int deleteByExample(TempletExample example);

    
    int deleteByPrimaryKey(String id);

    
    int insert(Templet record);

    
    int insertSelective(Templet record);

    
    List<Templet> selectByExample(TempletExample example);
    
    List<Templet> selectPageByExample(TempletExample example);
    
    /**    
     * @param 查询站点模板
     * @return
     */
    List<Templet> selectPageSiteTemplet(TempletExample example);
    
    
    Templet selectByPrimaryKey(String id);

    
    int updateByExampleSelective(@Param("record") Templet record, @Param("example") TempletExample example);

    
    int updateByExample(@Param("record") Templet record, @Param("example") TempletExample example);

    
    int updateByPrimaryKeySelective(Templet record);

    
    int updateByPrimaryKey(Templet record);
}