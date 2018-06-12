package com.gsccs.cms.module.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsccs.cms.module.model.Consult;
import com.gsccs.cms.module.model.ConsultExample;

public interface ConsultMapper {

	int countByExample(ConsultExample example);

	int countByExampleCache(ConsultExample example);

	List<Consult> guestbookUpdateYear(ConsultExample example);

	List<Consult> guestbookUpdateYearPage(ConsultExample example);

	List<Consult> guestbookUpdateMonth(ConsultExample example);

	List<Consult> guestbookUpdateMonthPage(ConsultExample example);

	List<Consult> guestbookUpdateDay(ConsultExample example);

	List<Consult> guestbookUpdateDayPage(ConsultExample example);

	List<Consult> guestbookUpdateWeek(ConsultExample example);

	int guestbookUpdateYearCount(ConsultExample example);

	int guestbookUpdateYearSum(ConsultExample example);

	int guestbookUpdateMonthCount(ConsultExample example);

	int guestbookUpdateMonthSum(ConsultExample example);

	int guestbookUpdateDayCount(ConsultExample example);

	int guestbookUpdateDaySum(ConsultExample example);

	int guestbookUpdateWeekSum(ConsultExample example);

	List<Consult> sysSiteGuestbookPage(ConsultExample example);

	List<Consult> sysSiteGuestbook(ConsultExample example);

	int sysSiteGuestbookCount(ConsultExample example);

	int sysSiteGuestbookSum(ConsultExample example);

	int deleteByExample(ConsultExample example);

	int deleteByPrimaryKey(Long id);

	int insert(Consult record);

	List<Consult> selectByExample(ConsultExample example);

	List<Consult> selectPageByExample(ConsultExample example);

	List<Consult> selectPageByExampleCache(ConsultExample example);

	Consult selectByPrimaryKey(Long id);

	int updateByExampleSelective(@Param("record") Consult record,
			@Param("example") ConsultExample example);

	int updateByExample(@Param("record") Consult record,
			@Param("example") ConsultExample example);

	int updateByPrimaryKeySelective(Consult record);

	int updateByPrimaryKey(Consult record);
}