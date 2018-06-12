package com.gsccs.cms.core.dao;

import com.gsccs.cms.core.model.WxConfig;
import com.gsccs.cms.core.model.WxConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WxConfigMapper {
    int countByExample(WxConfigExample example);

    int deleteByExample(WxConfigExample example);

    int deleteByPrimaryKey(String appId);

    int insert(WxConfig record);

    int insertSelective(WxConfig record);

    List<WxConfig> selectByExample(WxConfigExample example);

    WxConfig selectByPrimaryKey(String appId);

    int updateByExampleSelective(@Param("record") WxConfig record, @Param("example") WxConfigExample example);

    int updateByExample(@Param("record") WxConfig record, @Param("example") WxConfigExample example);

    int updateByPrimaryKeySelective(WxConfig record);

    int updateByPrimaryKey(WxConfig record);
}