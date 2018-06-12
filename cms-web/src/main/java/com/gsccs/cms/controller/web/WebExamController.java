package com.gsccs.cms.controller.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.management.Query;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.gsccs.cms.bass.controller.CmsBaseController;
import com.gsccs.cms.bass.utils.ResponseUtil;
import com.gsccs.cms.course.model.Course;
import com.gsccs.cms.course.model.CourseFeed;
import com.gsccs.cms.course.model.CourseArticle;
import com.gsccs.cms.course.model.CourseVote;
import com.gsccs.cms.course.service.CourseService;
import com.gsccs.cms.exam.model.Question;
import com.gsccs.cms.exam.model.QuestionQueryResult;
import com.gsccs.cms.exam.service.ExamService;
import com.gsccs.cms.exam.service.QuestionService;
import com.gsccs.cms.exam.utils.QuestionAdapter;
import com.gsccs.cms.member.model.Member;
import com.gsccs.cms.member.service.MemberService;
import com.gsccs.cms.module.service.VoteService;

/**
 * 党课考试
 * 
 * @author x.d zhang
 * @version 1.0
 */
@Controller("WebExamController")
@RequestMapping("/web/{appid}")
public class WebExamController{

	@Resource
	private ExamService examService;
	@Resource
	private QuestionService questionService;
	@Resource
	private MemberService memberService;

	/**
	 * 题目页面
	 * 
	 * @return
	 */
	@RequestMapping(value = "/q-{id}.html", method = RequestMethod.GET)
	public String questionView(@PathVariable String appid,
			@PathVariable Integer id,
			Model model, 
			HttpServletRequest request) {
		String strUrl = "http://" + request.getServerName() // 服务器地址
				+ ":" + request.getServerPort() + "/";
		Question question = questionService.getQuestionByQuestionId(id);
		List<Integer> idList = new ArrayList<Integer>();
		idList.add(id);
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
				questionMap.get(id), strUrl);
		String strHtml = adapter.getStringFromXML(true, false, true);
		model.addAttribute("strHtml", strHtml);
		model.addAttribute("question", question);
		return "web/exam_question";
	}

}
