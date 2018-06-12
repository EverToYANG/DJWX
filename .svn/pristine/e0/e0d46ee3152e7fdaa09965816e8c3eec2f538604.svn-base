package com.gsccs.cms.exam.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsccs.cms.exam.model.ExamHistory;
import com.gsccs.cms.exam.utils.Page;

public interface ExamMapper {

	public void addUserExamHistory(ExamHistory examHistory);

	public ExamHistory getUserExamHistoryByUserIdAndExamPaperId(
			@Param("userId") String userId, @Param("examPaperId") int examPaperId);
	
	public ExamHistory getUserExamHistoryByHistId(
			@Param("histId") int histId);
	
	public void updateExamHistory(ExamHistory examHistory);
	
	public List<ExamHistory> getUserExamHistoryListByUserId(@Param("userId") String userId,@Param("page") Page<ExamHistory> page);
}
