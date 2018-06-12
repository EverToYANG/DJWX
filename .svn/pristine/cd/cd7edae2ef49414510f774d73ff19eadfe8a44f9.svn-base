package com.gsccs.cms.exam.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsccs.cms.exam.model.ExamPaper;
import com.gsccs.cms.exam.utils.Page;

public interface ExamPaperMapper {

	public void insertExamPaper(ExamPaper examPaper);

	public ExamPaper getExamPaperById(@Param("examPaperId") int examPaperId);

	public List<ExamPaper> getExamPaperListByPaperType(
			@Param("paperType") String paperType,
			@Param("page") Page<ExamPaper> page);
	
	public void updateExamPaper(ExamPaper examPaper);

	public List<ExamPaper> getExamPaperList4Exam(@Param("paperType")int paperType);
	
	public void deleteExamPaper(int id);
}
