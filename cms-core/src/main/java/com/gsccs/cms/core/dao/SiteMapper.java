package com.gsccs.cms.core.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsccs.cms.core.model.Site;
import com.gsccs.cms.core.model.SiteExample;

public interface SiteMapper {

	int countByExample(SiteExample example);

	int deleteByExample(SiteExample example);

	int deleteByPrimaryKey(String id);

	int insert(Site record);

	int insertSelective(Site record);

	List<Site> selectByExample(SiteExample example);

	List<Site> selectPageByExample(SiteExample example);

	List<Site> selectPageByExampleCache(SiteExample example);

	Site selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") Site record,
			@Param("example") SiteExample example);

	int updateByExample(@Param("record") Site record,
			@Param("example") SiteExample example);

	int updateByPrimaryKeySelective(Site record);

	int updateByPrimaryKey(Site record);
}