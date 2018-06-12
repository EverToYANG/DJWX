package com.gsccs.cms.core.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsccs.cms.core.model.RoleSite;
import com.gsccs.cms.core.model.RoleSiteExample;

public interface RoleSiteMapper {
    
    int countByExample(RoleSiteExample example);

    
    int deleteByExample(RoleSiteExample example);

    
    int deleteByPrimaryKey(String id);

    
    int insert(RoleSite record);

    
    int insertSelective(RoleSite record);

    
    List<RoleSite> selectByExample(RoleSiteExample example);

    
    RoleSite selectByPrimaryKey(String id);

    
    int updateByExampleSelective(@Param("record") RoleSite record, @Param("example") RoleSiteExample example);

    
    int updateByExample(@Param("record") RoleSite record, @Param("example") RoleSiteExample example);

    
    int updateByPrimaryKeySelective(RoleSite record);

    
    int updateByPrimaryKey(RoleSite record);
}