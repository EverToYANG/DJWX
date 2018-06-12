package com.gsccs.cms.exam.service;

import java.util.HashMap;
import java.util.List;

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
import com.gsccs.cms.exam.utils.Page;

/**
 * @author Ocelot
 * @date 2014年6月8日 下午5:52:44
 */
public interface QuestionService {

	/**
	 * 获取题目类型
	 * 
	 * @return
	 */
	List<Field> getAllField(Page<Field> page);

	List<KnowledgePoint> getKnowledgePointByFieldId(int FieldId,Page<KnowledgePoint> page);

	List<Question> getQuestionList(Page<Question> pageModel, QuestionFilter qf);

	List<QuestionType> getQuestionTypeList();

	Question getQuestionByQuestionId(int questionId);

	/**
	 * 获取题目的知识点，知识点名由专业名fieldname和知识点pointname名拼接
	 * 
	 * @param questionId
	 * @return
	 */
	List<KnowledgePoint> getQuestionKnowledgePointListByQuestionId(
			int questionId);

	/**
	 * 添加试题，同时添加试题知识点对应关系
	 * 
	 * @param question
	 */
	public void addQuestion(Question question);

	public void deleteQuestionByQuestionId(int questionId);

	public HashMap<Integer, HashMap<Integer, List<QuestionStruts>>> getQuestionStrutsMap(
			List<Integer> idList);

	public KnowledgePoint getKnowledgePointByName(String pointName,
			String fieldName);

	/**
	 * 添加学员练习试题的记录
	 * 
	 * @param userQuestionHistory
	 */
	public void addUserQuestionHistory(UserQuestionHistory userQuestionHistory)
			throws Exception;

	/**
	 * 获取学员练习试题的记录
	 * 
	 * @param userId
	 * @return
	 */
	public UserQuestionHistory getUserQuestionHistoryByUserId(String userId);

	/**
	 * 更新学员练习试题记录
	 * 
	 * @param userQuestionHistory
	 */
	public void updateUserQuestionHistory(
			UserQuestionHistory userQuestionHistory) throws Exception;

	public List<QuestionQueryResult> getQuestionAnalysisListByPointIdAndTypeId(
			int typeId, int pointId);

	/**
	 * 强化练习获取分类信息
	 * 
	 * @return
	 */
	public List<QuestionImproveResult> getQuestionImproveResultByQuestionPointIdList(
			List<Integer> questionPointIdList);
	
	public List<QuestionQueryResult> getQuestionQueryResultListByFieldIdList(
			List<Integer> fieldIdList,List<Integer> typeIdList,int limit);
	
	public void updateQuestionPoint(Question question);
	
	/**
	 * 添加题库
	 * @param field
	 */
	public void addField(Field field);
	
	/**
	 * 添加知识点
	 * @param point
	 */
	public void addKnowledgePoint(KnowledgePoint point);
	
	/**
	 * 删除题库
	 * @param idList
	 */
	public void deleteFieldByIdList(List<Integer> idList);
	
	/**
	 * 删除知识点
	 * @param idList
	 */
	public void deleteKnowledgePointByIdList( List<Integer> idList);
	
	
	/**
	 * 获取一个最小的，具有point的fieldid，用于首页取默认field
	 * @return
	 */
	public Integer getMinFieldId();
	
	/**
     * 获取tag列表，包含所有公有的或者自己私有的
     *
     * @param userId
     * @param page
     * @return
     */
    public List<Tag> getTagByUserId(String userId, Page<Tag> page);

    /**
     * 增加一个标签
     *
     * @param tag
     */
    public void addTag(Tag tag);
    
    /**
	 * 获取试题的tag，只包含公有tag和自己的私有tag
	 * @param questionId
	 * @param userId
	 * @param page
	 * @return
	 */
	public List<QuestionTag> getQuestionTagByQuestionIdAndUserId(
			int questionId, String userId, Page<QuestionTag> page);
	
	/**
	 * 给题目打标签
	 * @param questionId
	 * @param userId
	 */
	public void addQuestionTag(int questionId, String userId, List<QuestionTag> questionTagList);
	
	/**
	 * 重载，整合了tag的功能
	 * @see com.gsccs.cms.exam.service.QuestionService#updateQuestionPoint(Question question)
	 * @param question
	 * @param userId
	 * @param questionTagList
	 */
	public void updateQuestionPoint(Question question,String userId, List<QuestionTag> questionTagList);
}
