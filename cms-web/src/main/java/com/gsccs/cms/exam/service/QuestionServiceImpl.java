package com.gsccs.cms.exam.service;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gsccs.cms.exam.dao.QuestionMapper;
import com.gsccs.cms.exam.domain.QuestionContent;
import com.gsccs.cms.exam.domain.QuestionFilter;
import com.gsccs.cms.exam.model.Field;
import com.gsccs.cms.exam.model.KnowledgePoint;
import com.gsccs.cms.exam.model.Question;
import com.gsccs.cms.exam.model.QuestionImproveResult;
import com.gsccs.cms.exam.model.QuestionQueryResult;
import com.gsccs.cms.exam.model.QuestionStruts;
import com.gsccs.cms.exam.model.QuestionTag;
import com.gsccs.cms.exam.model.QuestionType;
import com.gsccs.cms.exam.model.Tag;
import com.gsccs.cms.exam.model.UserQuestionHistory;
import com.gsccs.cms.exam.util.xml.Object2Xml;
import com.gsccs.cms.exam.utils.Page;

/**
 * @author Ocelot
 * @date 2014年6月8日 下午8:21:13
 */
@Service("questionService")
public class QuestionServiceImpl implements QuestionService {

	@Autowired
	private QuestionMapper questionMapper;

	@Override
	public List<Field> getAllField(Page<Field> page) {
		return questionMapper.getAllField(page);
	}

	@Override
	public List<KnowledgePoint> getKnowledgePointByFieldId(int FieldId,
			Page<KnowledgePoint> page) {
		return questionMapper.getKnowledgePointByFieldId(FieldId, page);
	}

	@Override
	public List<Question> getQuestionList(Page<Question> pageModel,
			QuestionFilter qf) {
		return questionMapper.getQuestionList(qf, pageModel);
	}

	@Override
	public List<QuestionType> getQuestionTypeList() {
		return questionMapper.getQuestionTypeList();
	}

	@Override
	public Question getQuestionByQuestionId(int questionId) {
		return questionMapper.getQuestionById(questionId);
	}

	@Override
	public List<KnowledgePoint> getQuestionKnowledgePointListByQuestionId(
			int questionId) {
		return questionMapper
				.getQuestionKnowledgePointListByQuestionId(questionId);
	}

	@Override
	@Transactional
	public void addQuestion(Question question) {
		try {
			questionMapper.insertQuestion(question);
			for (Integer i : question.getPointList()) {
				questionMapper.addQuestionKnowledgePoint(question.getId(), i);
			}
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	@Override
	@Transactional
	public void deleteQuestionByQuestionId(int questionId) {
		// TODO Auto-generated method stub
		try {
			questionMapper.deleteQuestionPointByQuestionId(questionId);
			questionMapper.deleteQuestionByQuestionId(questionId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e.getMessage());
		}
	}

	@Override
	public HashMap<Integer, HashMap<Integer, List<QuestionStruts>>> getQuestionStrutsMap(
			List<Integer> idList) {
		// TODO Auto-generated method stub
		HashMap<Integer, HashMap<Integer, List<QuestionStruts>>> hm = new HashMap<Integer, HashMap<Integer, List<QuestionStruts>>>();
		List<QuestionStruts> questionList = questionMapper
				.getQuestionListByPointId(idList);
		for (QuestionStruts q : questionList) {
			HashMap<Integer, List<QuestionStruts>> hashmap = new HashMap<Integer, List<QuestionStruts>>();
			List<QuestionStruts> ql = new ArrayList<QuestionStruts>();
			if (hm.containsKey(q.getPointId()))
				hashmap = hm.get(q.getPointId());
			if (hashmap.containsKey(q.getQuestionTypeId()))
				ql = hashmap.get(q.getQuestionTypeId());
			ql.add(q);
			hashmap.put(q.getQuestionTypeId(), ql);
			hm.put(q.getPointId(), hashmap);
		}
		return hm;
	}

	@Override
	public KnowledgePoint getKnowledgePointByName(String pointName,
			String fieldName) {
		// TODO Auto-generated method stub
		return questionMapper.getKnowledgePointByName(pointName, fieldName);
	}

	@Override
	public void addUserQuestionHistory(UserQuestionHistory userQuestionHistory)
			throws Exception {
		// TODO Auto-generated method stub
		if (userQuestionHistory.getHistory() == null)
			throw new Exception("不能插入空的历史记录");

		String histStr = Object2Xml.toXml(userQuestionHistory.getHistory());
		userQuestionHistory.setHistoryStr(histStr);
		questionMapper.addUserQuestionHistory(userQuestionHistory);
	}

	@Override
	public UserQuestionHistory getUserQuestionHistoryByUserId(String userId) {
		// TODO Auto-generated method stub
		UserQuestionHistory uh = questionMapper
				.getUserQuestionHistoryByUserId(userId);
		if (uh != null)
			uh.setHistory(Object2Xml.toBean(uh.getHistoryStr(), Map.class));
		return uh;
	}

	@Override
	public void updateUserQuestionHistory(
			UserQuestionHistory userQuestionHistory) throws Exception {
		// TODO Auto-generated method stub
		if (userQuestionHistory.getHistory() == null)
			throw new Exception("不能插入空的历史记录");

		String histStr = Object2Xml.toXml(userQuestionHistory.getHistory());
		userQuestionHistory.setHistoryStr(histStr);
		questionMapper.updateUserQuestionHistory(userQuestionHistory);
	}

	@Override
	public List<QuestionQueryResult> getQuestionAnalysisListByPointIdAndTypeId(
			int typeId, int pointId) {
		return questionMapper.getQuestionAnalysisListByPointIdAndTypeId(typeId,
				pointId);
	}

	@Override
	public List<QuestionImproveResult> getQuestionImproveResultByQuestionPointIdList(
			List<Integer> questionPointIdList) {
		return questionMapper
				.getQuestionImproveResultByQuestionPointIdList(questionPointIdList);
	}

	@Override
	public List<QuestionQueryResult> getQuestionQueryResultListByFieldIdList(
			List<Integer> fieldIdList, List<Integer> typeIdList, int limit) {
		List<QuestionQueryResult> tmp = questionMapper
				.getQuestionAnalysisListByFieldIdList(fieldIdList, typeIdList);
		List<QuestionQueryResult> result = new ArrayList<QuestionQueryResult>();
		if (limit >= tmp.size())
			return tmp;
		Random random = new Random();
		Set<Integer> idSet = new HashSet<Integer>();
		while (idSet.size() < 20) {
			idSet.add(random.nextInt(tmp.size()));
		}
		Iterator<Integer> it = idSet.iterator();
		while (it.hasNext()) {
			result.add(tmp.get(it.next()));
		}
		return result;
	}

	@Transactional
	@Override
	public void updateQuestionPoint(Question question) {
		try {
			questionMapper.deleteQuestionPointByQuestionId(question.getId());
			for (int id : question.getPointList()) {
				questionMapper.addQuestionKnowledgePoint(question.getId(), id);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e.getClass().getName());
		}

	}

	@Override
	public void addField(Field field) {
		// TODO Auto-generated method stub
		questionMapper.addField(field);
	}

	@Override
	public void addKnowledgePoint(KnowledgePoint point) {
		// TODO Auto-generated method stub
		questionMapper.addKnowledgePoint(point);
	}

	@Override
	public void deleteFieldByIdList(List<Integer> idList) {
		// TODO Auto-generated method stub
		questionMapper.deleteFieldByIdList(idList);
	}

	@Override
	public void deleteKnowledgePointByIdList(List<Integer> idList) {
		// TODO Auto-generated method stub
		questionMapper.deleteKnowledgePointByIdList(idList);
	}
	
	
	@Override
	public Integer getMinFieldId() {
		// TODO Auto-generated method stub
		return questionMapper.getMinFieldId();
	}

	@Override
	public List<Tag> getTagByUserId(String userId, Page<Tag> page) {
		return questionMapper.getTagByUserId(userId, page);
	}

	@Override
	public void addTag(Tag tag) {
		// TODO Auto-generated method stub
		questionMapper.addTag(tag);
	}

	@Override
	public List<QuestionTag> getQuestionTagByQuestionIdAndUserId(int questionId,
			String userId, Page<QuestionTag> page) {
		// TODO Auto-generated method stub
		return questionMapper.getQuestionTagByQuestionIdAndUserId(questionId, userId, page);
	}

	@Override
	@Transactional
	public void addQuestionTag(int questionId, String userId, List<QuestionTag> questionTagList) {
		// TODO Auto-generated method stub
		try{
			questionMapper.deleteQuestionTag(questionId, userId, questionTagList);
			questionMapper.addQuestionTag(questionTagList);
			
		}catch(Exception e){
			throw new RuntimeException(e);
		}
		
	}

	/**
	 * 重载，整合了tag的功能
	 * @see com.gsccs.cms.exam.service.QuestionServiceImpl#updateQuestionPoint(Question question)
	 * @param question
	 * @param userId
	 * @param questionTagList
	 */
	@Override
	@Transactional
	public void updateQuestionPoint(Question question, String userId,
			List<QuestionTag> questionTagList) {
		try {
			questionMapper.deleteQuestionPointByQuestionId(question.getId());
			for (int id : question.getPointList()) {
				questionMapper.addQuestionKnowledgePoint(question.getId(), id);
			}
			
			if(questionTagList != null && questionTagList.size() != 0){
				questionMapper.deleteQuestionTag(question.getId(), userId, questionTagList);
				questionMapper.addQuestionTag(questionTagList);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e.getClass().getName());
		}
	}
}
