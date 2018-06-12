package com.gsccs.cms.exam.service;

import java.util.List;

import com.gsccs.cms.exam.model.PracticePaper;
import com.gsccs.cms.exam.model.Question;

/**
 * 试题业务
 * @author x.d zhang
 */
public interface PracticeService {

	List<Question> getQuestionListByQuestionTypeIdAndReferenceId(
			int questionTypeId, int fieldId, int limitNum);

	PracticePaper getPracticePaperByUserID(String userid);

	int insertPracticePaper(PracticePaper practicePaper);

}
