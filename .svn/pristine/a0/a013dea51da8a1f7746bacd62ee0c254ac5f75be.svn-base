package com.gsccs.cms.core.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsccs.cms.core.model.Visit;
import com.gsccs.cms.core.model.VisitExample;

public interface VisitMapper {

	int countByExample(VisitExample example);

	int countByExampleCache(VisitExample example);

	int deleteByExample(VisitExample example);

	int deleteByPrimaryKey(String id);

	int insert(Visit record);

	int insertSelective(Visit record);

	List<Visit> selectByExample(VisitExample example);

	List<Visit> channelVisit(VisitExample example);

	List<Visit> channelVisitPage(VisitExample example);

	int channelVisitCount(VisitExample example);

	int channelVisitSum(VisitExample example);

	int siteVisitSum(VisitExample example);

	List<Visit> siteVisit(VisitExample example);

	List<Visit> siteVisitPage(VisitExample example);

	int siteVisitCount(VisitExample example);

	List<Visit> infoVisit(VisitExample example);

	List<Visit> infoVisitPage(VisitExample example);

	int infoVisitCount(VisitExample example);

	int infoVisitSum(VisitExample example);

	int visitSum(VisitExample example);

	List<Visit> visitYear(VisitExample example);

	List<Visit> visitYearPage(VisitExample example);

	int visitYearCount(VisitExample example);

	List<Visit> visitMonth(VisitExample example);

	List<Visit> visitMonthPage(VisitExample example);

	int visitMonthCount(VisitExample example);

	List<Visit> visitDay(VisitExample example);

	List<Visit> visitDayPage(VisitExample example);

	int visitDayCount(VisitExample example);

	List<Visit> visitWeek(VisitExample example);

	Visit selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") Visit record,
			@Param("example") VisitExample example);

	int updateByExample(@Param("record") Visit record,
			@Param("example") VisitExample example);

	int updateByPrimaryKeySelective(Visit record);

	int updateByPrimaryKey(Visit record);
}