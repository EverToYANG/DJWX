package com.gsccs.cms.controller.exam;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gsccs.cms.bass.utils.Pager;
import com.gsccs.cms.exam.domain.Message;
import com.gsccs.cms.exam.domain.QuestionFilter;
import com.gsccs.cms.exam.model.Field;
import com.gsccs.cms.exam.model.KnowledgePoint;
import com.gsccs.cms.exam.model.Question;
import com.gsccs.cms.exam.model.QuestionQueryResult;
import com.gsccs.cms.exam.model.QuestionTag;
import com.gsccs.cms.exam.service.ExamService;
import com.gsccs.cms.exam.service.QuestionService;
import com.gsccs.cms.exam.util.xml.Object2Xml;
import com.gsccs.cms.exam.utils.Page;
import com.gsccs.cms.exam.utils.QuestionAdapter;

@Controller
@RequestMapping("/question")
public class QuestionController {

	@Autowired
	private QuestionService questionService;
	@Autowired
	private ExamService examService;

	/**
	 * 试题列表
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/list.do", method = RequestMethod.GET)
	public String questionList(Model model,
			@RequestParam(defaultValue = "1") int currPage,
			@RequestParam(defaultValue = "10") int pageSize,
			@RequestParam(defaultValue = " ") String order,
			@RequestParam(defaultValue = "0") int fieldId,
			@RequestParam(defaultValue = "0") int knowledge,
			@RequestParam(defaultValue = "0") int questionType,
			@RequestParam(defaultValue = " ") String searchParam, ModelMap map,
			HttpServletRequest request, HttpServletResponse response) {

		Subject subject = SecurityUtils.getSubject();
		String userid = (String) subject.getPrincipal();

		Page<Question> pageModel = new Page<Question>();
		pageModel.setPageNo(currPage);
		pageModel.setPageSize(pageSize);

		QuestionFilter qf = new QuestionFilter();
		qf.setFieldId(fieldId);
		qf.setKnowledge(knowledge);
		qf.setQuestionType(questionType);
		if (searchParam.equals("0"))
			searchParam = "-1";
		qf.setSearchParam(searchParam);
		List<Question> questionList = questionService.getQuestionList(
				pageModel, qf);
		List<Field> fieldList = questionService.getAllField(null);

		Pager pager = new Pager(request);
		pager.appendParam("name");
		pager.appendParam("pageSize", "" + pageSize);
		pager.appendParam("pageFuncId");
		pager.setCurrPage(currPage);
		pager.setPageSize(pageSize);
		pager.setTotalCount(10);
		pager.setOutStrBootstrap("exam/paper.do");
		map.put("pageStr", pager.getOutStrBootstrap());
		map.put("list", questionList);
		map.put("order", order);

		model.addAttribute("fieldList", fieldList);
		model.addAttribute("knowledgeList",
				questionService.getKnowledgePointByFieldId(0, null));
		model.addAttribute("questionTypeList",
				questionService.getQuestionTypeList());

		return "course/question_list";
	}

	/**
	 * 添加试题页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String questionAddPage(Model model) {
		List<Field> fieldList = questionService.getAllField(null);
		model.addAttribute("fieldList", fieldList);
		return "course/question_add";
	}


	@RequestMapping(value = "/addDo", method = RequestMethod.POST)
	public @ResponseBody
	Message addQuestion(@RequestBody Question question) {

		Subject subject = SecurityUtils.getSubject();
		String userid = (String) subject.getPrincipal();
		Message message = new Message();
		question.setContent(Object2Xml.toXml(question.getQuestionContent()));
		question.setCreate_time(new Date());
		question.setCreator(userid);
		try {
			questionService.addQuestion(question);
		} catch (Exception e) {
			message.setResult("error");
			message.setMessageInfo(e.getClass().getName());
			e.printStackTrace();
		}
		return message;
	}

	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public String questionModifyPage(Integer id, Model model) {
		List<Field> fieldList = questionService.getAllField(null);
		model.addAttribute("fieldList", fieldList);
		Question question = questionService.getQuestionByQuestionId(id);
		List<KnowledgePoint> pointList = questionService
				.getQuestionKnowledgePointListByQuestionId(id);
		model.addAttribute("pointList", pointList);
		model.addAttribute("question", question);
		return "course/question_add";
	}

	/**
	 * 试题预览
	 * 
	 * @param model
	 * @param questionId
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/view/{questionId}", method = RequestMethod.GET)
	public String questionPreviewPage(Model model,
			@PathVariable Integer questionId, HttpServletRequest request) {
		String strUrl = "http://" + request.getServerName() // 服务器地址
				+ ":" + request.getServerPort() + "/";
		Question question = questionService.getQuestionByQuestionId(questionId);
		List<Integer> idList = new ArrayList<Integer>();
		idList.add(questionId);
		List<QuestionQueryResult> questionQueryList = examService
				.getQuestionDescribeListByIdList(idList);
		HashMap<Integer, QuestionQueryResult> questionMap = new HashMap<Integer, QuestionQueryResult>();
		for (QuestionQueryResult qqr : questionQueryList) {
			if (questionMap.containsKey(qqr.getQuestionId())) {
				QuestionQueryResult a = questionMap.get(qqr.getQuestionId());
				questionMap.put(qqr.getQuestionId(), a);
			} else {
				questionMap.put(qqr.getQuestionId(), qqr);
			}
		}
		QuestionAdapter adapter = new QuestionAdapter(question, null,
				questionMap.get(questionId), strUrl);
		String strHtml = adapter.getStringFromXML(true, false, true);
		model.addAttribute("strHtml", strHtml);
		model.addAttribute("question", question);
		return "course/question_view";
	}

	@RequestMapping(value = "/qsdelete/{fieldId}-{knowledge}-{questionType}-{searchParam}-{page}/{questionId}", method = RequestMethod.GET)
	public String deleteQuestionList(Model model,
			@PathVariable("fieldId") int fieldId,
			@PathVariable("knowledge") int knowledge,
			@PathVariable("questionType") int questionType,
			@PathVariable("searchParam") String searchParam,
			@PathVariable("page") int page,
			@PathVariable("questionId") int questionId) {
		questionService.deleteQuestionByQuestionId(questionId);
		return "admin/questionfilter-" + fieldId + "-" + knowledge + "-"
				+ questionType + "-" + searchParam + "-" + page + ".html";
	}

	@RequestMapping(value = "/qsdelete/{questionId}", method = RequestMethod.GET)
	public @ResponseBody
	Message deleteQuestion(Model model,
			@PathVariable("questionId") int questionId) {
		Message message = new Message();
		try {
			questionService.deleteQuestionByQuestionId(questionId);
		} catch (Exception ex) {
			message.setResult("error");
		}
		return message;
	}

	/**
	 * 批量添加试题
	 * 
	 * @param model
	 * @param idList
	 * @return
	 */
	@RequestMapping(value = "/qsget-question-detail4add", method = RequestMethod.POST)
	public @ResponseBody
	List<QuestionQueryResult> getQuestion5add(Model model,
			HttpServletRequest request, @RequestBody List<Integer> idList) {
		String strUrl = "http://" + request.getServerName() // 服务器地址
				+ ":" + request.getServerPort() + "/";

		Set<Integer> set = new TreeSet<Integer>();
		for (int id : idList) {
			set.add(id);
		}
		idList.clear();
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			idList.add(it.next());
		}
		List<QuestionQueryResult> returnList = examService
				.getQuestionDescribeListByIdList(idList);

		for (QuestionQueryResult question : returnList) {
			QuestionAdapter adapter = new QuestionAdapter(question, strUrl);
			question.setContent(adapter.getStringFromXML());
		}
		return returnList;
	}

	/**
	 * 修改试题分类
	 * 
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/update/{questionId}/{pointId}", method = RequestMethod.POST)
	public @ResponseBody
	Message updateQuestion(@PathVariable int questionId,
			@PathVariable int pointId,
			@RequestBody List<QuestionTag> questionTagList) {

		Message message = new Message();
		Subject subject = SecurityUtils.getSubject();
		String userid = (String) subject.getPrincipal();
		Question question = new Question();
		question.setId(questionId);
		List<Integer> pointIdList = new ArrayList<Integer>();
		pointIdList.add(pointId);
		question.setPointList(pointIdList);
		try {
			questionService.updateQuestionPoint(question, userid,
					questionTagList);
		} catch (Exception e) {
			message.setResult(e.getClass().getName());
		}

		return message;
	}

}
