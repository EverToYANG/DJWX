package com.gsccs.cms.gis.dao;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsccs.cms.gis.model.GisMap;
import com.gsccs.cms.gis.model.GisMapExample;

public interface GisMapMapper {
    int countByExample(GisMapExample example);

    int deleteByExample(GisMapExample example);

    int deleteByPrimaryKey(String id);

    int insert(GisMap record);

    int insertSelective(GisMap record);

    List<GisMap> selectByExample(GisMapExample example);
    
    List<GisMap> selectPageByExample(GisMapExample example);

    GisMap selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") GisMap record, @Param("example") GisMapExample example);

    int updateByExample(@Param("record") GisMap record, @Param("example") GisMapExample example);

    int updateByPrimaryKeySelective(GisMap record);

    int updateByPrimaryKey(GisMap record);
}