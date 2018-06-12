package com.gsccs.cms.exam.service;

import java.util.HashMap;
import java.util.List;

import com.gsccs.cms.exam.model.ExamHistory;
import com.gsccs.cms.exam.model.ExamPaper;
import com.gsccs.cms.exam.model.Question;
import com.gsccs.cms.exam.model.QuestionQueryResult;
import com.gsccs.cms.exam.model.QuestionStruts;
import com.gsccs.cms.exam.utils.Page;

/**
 * @author Ocelot
 * @date 2014年6月8日 下午5:52:44
 */
public interface ExamService {

	List<QuestionQueryResult> getQuestionDescribeListByIdList(
			List<Integer> idList);

	List<Question> getQuestionListByIdListNew(List<Integer> idList);

	public void createExamPaper(
			HashMap<Integer, HashMap<Integer, List<QuestionStruts>>> questionMap,
			HashMap<Integer, Integer> questionTypeNum,
			HashMap<Integer, Float> questionTypePoint,
			HashMap<Integer, Float> knowledgePointRate, ExamPaper examPaper);

	public List<ExamPaper> getExamPaperListByPaperType(String paperType,
			Page<ExamPaper> page);

	public void updateExamPaper(ExamPaper examPaper);

	public ExamPaper getExamPaperById(int examPaperId);

	public void insertExamPaper(ExamPaper examPaper);

	public List<ExamPaper> getExamPaperList4Exam(int paperType);

	public void addUserExamHistory(ExamHistory examHistory);

	public ExamHistory getUserExamHistoryByUserIdAndExamPaperId(String userId,
			int examPaperId);

	public void updateExamHistory(ExamHistory examHistory);
	
	public ExamHistory getUserExamHistoryByHistId(int histId);
	
	public List<ExamHistory> getUserExamHistoryListByUserId(String userId,Page<ExamHistory> page);
	
	public void deleteExamPaper(int id);
}
