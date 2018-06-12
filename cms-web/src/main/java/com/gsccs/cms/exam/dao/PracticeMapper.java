package com.gsccs.cms.exam.dao;

import org.apache.ibatis.annotations.Param;

import com.gsccs.cms.exam.model.PracticePaper;

/**
 * @author Ocelot
 * @date 2014年6月8日 下午8:40:22
 */
public interface PracticeMapper {

	PracticePaper getPracticePaperByUserID(@Param("userId")String userId);

	void deletePracticePaperByUserId(@Param("userId")String userId);

	void insertPracticePaper(PracticePaper practicePaper);

}
