package com.gsccs.cms.core.dao;

import com.gsccs.cms.core.model.TempletSite;
import com.gsccs.cms.core.model.TempletSiteExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TempletSiteMapper {

	int countByExample(TempletSiteExample example);

	int deleteByExample(TempletSiteExample example);

	int deleteByPrimaryKey(String id);

	int insert(TempletSite record);

	int insertSelective(TempletSite record);

	List<TempletSite> selectByExample(TempletSiteExample example);
	
	List<TempletSite> selectBySiteId(String siteId);

	TempletSite selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") TempletSite record,
			@Param("example") TempletSiteExample example);

	int updateByExample(@Param("record") TempletSite record,
			@Param("example") TempletSiteExample example);

	int updateByPrimaryKeySelective(TempletSite record);

	int updateByPrimaryKey(TempletSite record);

	List<TempletSite> selectBySiteIdAndTempletId(String siteId, String templetId);
}