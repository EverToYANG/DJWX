package com.gsccs.cms.core.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsccs.cms.core.model.Content;
import com.gsccs.cms.core.model.ContentExample;

public interface ContentMapper {

	int countByExample(ContentExample example);

	int deleteByExample(ContentExample example);

	int deleteByPrimaryKey(String id);

	int insert(Content record);

	List<Content> selectByExampleWithBLOBs(ContentExample example);

	List<Content> workloadPage(ContentExample example);

	List<Content> workload(ContentExample example);

	List<Content> siteStatPage(ContentExample example);

	List<Content> siteStat(ContentExample example);

	List<Content> channelStat(ContentExample example);

	List<Content> infoUpdateYear(ContentExample example);

	List<Content> infoUpdateYearPage(ContentExample example);

	List<Content> infoUpdateMonth(ContentExample example);

	List<Content> infoUpdateMonthPage(ContentExample example);

	List<Content> infoUpdateDay(ContentExample example);

	List<Content> infoUpdateDayPage(ContentExample example);

	List<Content> infoUpdateWeek(ContentExample example);

	int workloadCount(ContentExample example);

	int workloadSum(ContentExample example);

	int siteStatCount(ContentExample example);

	int siteStatSum(ContentExample example);

	int channelStatCount(ContentExample example);

	int channelStatSum(ContentExample example);

	int infoUpdateYearCount(ContentExample example);

	int infoUpdateYearSum(ContentExample example);

	int infoUpdateMonthCount(ContentExample example);

	int infoUpdateMonthSum(ContentExample example);

	int infoUpdateDayCount(ContentExample example);

	int infoUpdateDaySum(ContentExample example);

	int infoUpdateWeekSum(ContentExample example);

	List<Content> selectByExample(ContentExample example);

	List<Content> selectPageByExample(ContentExample example);

	Content selectByPrimaryKey(Long id);
	Content selectClickByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") Content record,
			@Param("example") ContentExample example);

	int updateByExampleWithBLOBs(@Param("record") Content record,
			@Param("example") ContentExample example);

	int updateByExample(@Param("record") Content record,
			@Param("example") ContentExample example);

	int updateByPrimaryKeySelective(Content record);

	int click(Content record);

	int updateByPrimaryKeyWithBLOBs(Content record);

	int updateByPrimaryKey(Content record);
}