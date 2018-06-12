package com.gsccs.cms.controller.exam;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gsccs.cms.auth.service.UserService;
import com.gsccs.cms.exam.domain.AnswerSheetItem;
import com.gsccs.cms.exam.domain.ExamFinishParam;
import com.gsccs.cms.exam.domain.Message;
import com.gsccs.cms.exam.model.ExamHistory;
import com.gsccs.cms.exam.model.ExamPaper;
import com.gsccs.cms.exam.model.PracticePaper;
import com.gsccs.cms.exam.model.QuestionQueryResult;
import com.gsccs.cms.exam.service.ExamService;
import com.gsccs.cms.exam.service.PracticeService;
import com.gsccs.cms.exam.service.QuestionService;
import com.gsccs.cms.exam.util.xml.Object2Xml;
import com.gsccs.cms.exam.utils.Page;
import com.gsccs.cms.exam.utils.PagingUtil;
import com.gsccs.cms.exam.utils.QuestionAdapter;

@Controller
public class ExamController {

	@Autowired
	private ExamService examService;
	@Autowired
	private UserService userService;
	@Autowired
	private PracticeService practiceService;
	@Autowired
	private QuestionService questionService;
	private static Logger log = Logger.getLogger(ExamController.class);
	private static final String SUCCESS_MESSAGE = "success";
	private static final String FAILED_MESSAGE = "failed";

	public class ReportResult {
		public int sum;
		public int rightTimes;
		public int wrongTimes;

		public int getSum() {
			return sum;
		}

		public int getRightTimes() {
			return rightTimes;
		}

		public int getWrongTimes() {
			return wrongTimes;
		}
	};

	@RequestMapping(value = "/student/practice-test", method = RequestMethod.GET)
	public String practiceStartNew(Model model, HttpServletRequest request,
			@RequestParam(value = "kp", required = false) String knowledgepoint) {

		String strUrl = "http://" + request.getServerName() // 服务器地址
				+ ":" + request.getServerPort() + "/";
		Subject subject = SecurityUtils.getSubject();
		String userid = (String) subject.getPrincipal();
		
		List<Integer> fieldIdList = new ArrayList<Integer>();
		//fieldIdList.add(userInfo.getFieldId());
		List<Integer> typeIdList = new ArrayList<Integer>();
		typeIdList.add(1);
		typeIdList.add(2);
		typeIdList.add(3);
		typeIdList.add(4);
		List<QuestionQueryResult> qqrList = questionService
				.getQuestionQueryResultListByFieldIdList(fieldIdList,
						typeIdList, 20);

		String fieldName = "";
		try {
			fieldName = qqrList.get(0).getPointName().split(">")[1];
		} catch (Exception e) {
			log.info(e.getMessage());
		}

		int amount = qqrList.size();
		StringBuilder sb = new StringBuilder();
		for (QuestionQueryResult qqr : qqrList) {
			QuestionAdapter adapter = new QuestionAdapter(qqr, strUrl);
			sb.append(adapter.getStringFromXML());
		}

		model.addAttribute("questionStr", sb.toString());
		model.addAttribute("amount", amount);
		model.addAttribute("fieldName", "随机练习");
		return "student/practice-improve";
	}

	@RequestMapping(value = "student/practice-random", method = RequestMethod.GET)
	public String practice(Model model, HttpServletRequest request) {

		return "student/practice-testing";
	}

	@RequestMapping(value = "student/practice-finished", method = RequestMethod.POST)
	public @ResponseBody
	Message practiceFinished(@RequestBody ExamFinishParam efp,
			HttpServletRequest request) {
		Subject subject = SecurityUtils.getSubject();
		String userid = (String) subject.getPrincipal();

		HashMap<Integer, AnswerSheetItem> hm = efp.getAs();
		Iterator<Integer> it = hm.keySet().iterator();
		List<Integer> idList = new ArrayList<Integer>();
		while (it.hasNext()) {
			int key = it.next();
			idList.add(key);
			AnswerSheetItem as = hm.get(key);
			System.out.println(key + "=" + as.getPoint());
		}
		PracticePaper practicePaper = new PracticePaper();
		practicePaper.setAnswer_sheet(Object2Xml.toXml(hm));
		practicePaper.setName("我的练习");
		List<QuestionQueryResult> questionList = examService
				.getQuestionDescribeListByIdList(idList);

		practicePaper.setContent(Object2Xml.toXml(questionList));
		practicePaper.setUserId(userid);
		practiceService.insertPracticePaper(practicePaper);
		Message message = new Message();
		return message;
	}

	@RequestMapping(value = "student/practice-finished-page", method = RequestMethod.GET)
	public String practiceFinishedPage(Model model) {
		return "student/practice-finish";
	}

	@RequestMapping(value = "student/exam-report", method = RequestMethod.GET)
	public String examFinishedReportPage(Model model, HttpServletRequest request) {
		String strUrl = "http://" + request.getServerName() // 服务器地址
				+ ":" + request.getServerPort() + "/";

		Subject subject = SecurityUtils.getSubject();
		String userid = (String) subject.getPrincipal();

		PracticePaper practicePaper = practiceService
				.getPracticePaperByUserID(userid);

		List<QuestionQueryResult> questionList = Object2Xml.toBean(
				practicePaper.getContent(), ArrayList.class);
		List<Integer> idList = new ArrayList<Integer>();
		HashMap<Integer, AnswerSheetItem> hm = Object2Xml.toBean(
				practicePaper.getAnswer_sheet(), HashMap.class);

		List<String> htmlStr = new ArrayList<String>();
		HashMap<Integer, QuestionQueryResult> questionMap = new HashMap<Integer, QuestionQueryResult>();
		for (QuestionQueryResult qqr : questionList) {
			idList.add(qqr.getQuestionId());

			QuestionAdapter adapter = new QuestionAdapter(hm.get(qqr
					.getQuestionId()), qqr, strUrl);
			htmlStr.add(adapter.getReportStringFromXML());
		}

		model.addAttribute("htmlStr", htmlStr);

		return "student/exam-finish-report";
	}

	@RequestMapping(value = "student/finish-exam", method = RequestMethod.GET)
	public String examFinishedPage(Model model) {
		Subject subject = SecurityUtils.getSubject();
		String userid = (String) subject.getPrincipal();

		PracticePaper practicePaper = practiceService
				.getPracticePaperByUserID(userid);

		List<QuestionQueryResult> questionList = Object2Xml.toBean(
				practicePaper.getContent(), ArrayList.class);
		List<Integer> idList = new ArrayList<Integer>();
		for (QuestionQueryResult q : questionList) {
			idList.add(q.getQuestionId());
		}
		HashMap<Integer, AnswerSheetItem> hm = Object2Xml.toBean(
				practicePaper.getAnswer_sheet(), HashMap.class);

		int total = questionList.size();
		int wrong = 0;
		int right = 0;

		HashMap<String, ReportResult> reportResultList = new HashMap<String, ReportResult>();
		List<QuestionQueryResult> questionQueryList = examService
				.getQuestionDescribeListByIdList(idList);
		HashMap<Integer, Boolean> answer = new HashMap<Integer, Boolean>();
		for (QuestionQueryResult q : questionQueryList) {
			String pointName = q.getPointName().split(">")[1];
			if (q.getQuestionTypeId() != 1 && q.getQuestionTypeId() != 2
					&& q.getQuestionTypeId() != 3)
				continue;
			if (hm.get(q.getQuestionId()) != null) {
				if (q.getAnswer().equals(hm.get(q.getQuestionId()).getAnswer())) {
					answer.put(q.getQuestionId(), true);
					right++;
					if (reportResultList.containsKey(pointName)) {
						ReportResult r = reportResultList.get(pointName);
						r.sum++;
						r.rightTimes++;
						reportResultList.put(pointName, r);
					} else {
						ReportResult r = new ReportResult();
						r.sum = 1;
						r.rightTimes = 1;
						reportResultList.put(pointName, r);
					}
				} else {
					answer.put(q.getQuestionId(), false);
					wrong++;
					if (reportResultList.containsKey(pointName)) {
						ReportResult r = reportResultList.get(pointName);
						r.sum++;
						r.wrongTimes++;
						reportResultList.put(pointName, r);
					} else {
						ReportResult r = new ReportResult();
						r.sum = 1;
						r.wrongTimes = 1;
						reportResultList.put(pointName, r);
					}
				}
				hm.remove(q.getQuestionId());
			}
		}

		model.addAttribute("total", total);
		model.addAttribute("wrong", wrong);
		model.addAttribute("right", right);
		model.addAttribute("reportResultList", reportResultList);
		model.addAttribute("create_time", practicePaper.getCreate_time());
		model.addAttribute("answer", answer);
		model.addAttribute("idList", idList);
		return "student/exam-finished";
	}

	/**
	 * 准备模拟考试
	 * 
	 * @param model
	 * @param exam_history_id
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/student/examing/{examPaperId}", method = RequestMethod.GET)
	public String examing(Model model, HttpServletRequest request,
			@PathVariable("examPaperId") int examPaperId) {

		Subject subject = SecurityUtils.getSubject();
		String userid = (String) subject.getPrincipal();
		String strUrl = "http://" + request.getServerName() // 服务器地址
				+ ":" + request.getServerPort() + "/";
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		int duration = 0;
		ExamHistory examHistory = examService
				.getUserExamHistoryByUserIdAndExamPaperId(userid,
						examPaperId);
		ExamPaper examPaper = examService.getExamPaperById(examPaperId);
		String content = "";
		if (examHistory != null) {
			content = examHistory.getContent();

			/*
			 * duration = examHistory.getDuration(); Date now = new Date();
			 * 
			 * long startT = examHistory.getCreateTime().getTime(); long endT =
			 * 0; try { endT = df.parse(df.format(now)).getTime(); } catch
			 * (ParseException e) { // TODO Auto-generated catch block
			 * e.printStackTrace(); } long minutsPass = (endT - startT) / 1000;
			 * 
			 * duration = (int) (minutsPass >= (long)duration ? 0 : duration -
			 * minutsPass);
			 * 
			 * if(duration == 0) return "home";
			 */
		} else {

			content = examPaper.getContent();
			examHistory = new ExamHistory();
			examHistory.setContent(content);
			examHistory.setExamPaperId(examPaperId);
			examHistory.setUserId(userid);
			examHistory.setDuration(examPaper.getDuration());
			examService.addUserExamHistory(examHistory);

		}
		duration = examPaper.getDuration();
		@SuppressWarnings("unchecked")
		List<QuestionQueryResult> questionList = Object2Xml.toBean(content,
				List.class);

		StringBuilder sb = new StringBuilder();
		for (QuestionQueryResult question : questionList) {
			QuestionAdapter adapter = new QuestionAdapter(question, strUrl);
			sb.append(adapter.getUserExamPaper());
		}

		model.addAttribute("examHistoryId", examHistory.getHistId());
		model.addAttribute("examPaperId", examPaperId);
		model.addAttribute("duration", duration * 60);
		model.addAttribute("htmlStr", sb.toString());
		return "student/examing";
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/student/exam-submit", method = RequestMethod.POST)
	public @ResponseBody
	Message finishExam(@RequestBody ExamFinishParam efp) {

		Message message = new Message();
		try {
			ExamHistory examHistory = examService
					.getUserExamHistoryByHistId(efp.getExam_history_id());
			List<QuestionQueryResult> questionList = Object2Xml.toBean(
					examHistory.getContent(), List.class);
			float pointGet = 0f;
			for (QuestionQueryResult qqr : questionList) {
				if (qqr.getAnswer().equals(
						efp.getAs().get(qqr.getQuestionId()).getAnswer()))
					pointGet += qqr.getQuestionPoint();
			}
			// 计算得分
			examHistory.setPointGet(pointGet);
			examHistory.setAnswerSheet(Object2Xml.toXml(efp.getAs()));
			examHistory.setSubmitTime(new Date());
			examHistory.setDuration(efp.getDuration());
			examService.updateExamHistory(examHistory);
		} catch (Exception e) {
			e.printStackTrace();
			message.setResult(e.getClass().getName());
		}

		return message;
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/student/exam-report/{examPaperId}", method = RequestMethod.GET)
	public String examFinishPage(Model model,
			@PathVariable("examPaperId") int examPaperId,
			HttpServletRequest request) {
		String strUrl = "http://" + request.getServerName() // 服务器地址
				+ ":" + request.getServerPort() + "/";

		Subject subject = SecurityUtils.getSubject();
		String userid = (String) subject.getPrincipal();

		ExamHistory examHistory = examService
				.getUserExamHistoryByUserIdAndExamPaperId(userid,
						examPaperId);

		List<QuestionQueryResult> questionList = Object2Xml.toBean(
				examHistory.getContent(), ArrayList.class);
		HashMap<Integer, AnswerSheetItem> hm = Object2Xml.toBean(
				examHistory.getAnswerSheet(), HashMap.class);

		StringBuilder sb = new StringBuilder();
		for (QuestionQueryResult q : questionList) {
			QuestionAdapter adapter = new QuestionAdapter(hm.get(q
					.getQuestionId()), q, strUrl);
			sb.append(adapter.getReportStringFromXML());
		}
		model.addAttribute("htmlStr", sb.toString());
		model.addAttribute("examPaperId", examPaperId);
		return "student/paper-exam-finish-report";
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "student/finish-exam/{examPaperId}", method = RequestMethod.GET)
	public String paperExamFinishedPage(Model model,
			@PathVariable("examPaperId") int examPaperId) {
		Subject subject = SecurityUtils.getSubject();
		String userid = (String) subject.getPrincipal();

		ExamHistory examHistory = examService
				.getUserExamHistoryByUserIdAndExamPaperId(userid,
						examPaperId);
		HashMap<Integer, AnswerSheetItem> hm = Object2Xml.toBean(
				examHistory.getAnswerSheet(), HashMap.class);

		int total = hm.size();
		int wrong = 0;
		int right = 0;

		HashMap<String, ReportResult> reportResultList = new HashMap<String, ReportResult>();
		List<QuestionQueryResult> questionQueryList = Object2Xml.toBean(
				examHistory.getContent(), List.class);
		List<Integer> idList = new ArrayList<Integer>();
		HashMap<Integer, Boolean> answer = new HashMap<Integer, Boolean>();
		for (QuestionQueryResult q : questionQueryList) {
			String pointName = q.getPointName().split(">")[1];
			idList.add(q.getQuestionId());
			if (q.getQuestionTypeId() != 1 && q.getQuestionTypeId() != 2
					&& q.getQuestionTypeId() != 3)
				continue;
			if (hm.get(q.getQuestionId()) != null) {
				if (q.getAnswer().equals(hm.get(q.getQuestionId()).getAnswer())) {
					answer.put(q.getQuestionId(), true);
					right++;
					if (reportResultList.containsKey(pointName)) {
						ReportResult r = reportResultList.get(pointName);
						r.sum++;
						r.rightTimes++;
						reportResultList.put(pointName, r);
					} else {
						ReportResult r = new ReportResult();
						r.sum = 1;
						r.rightTimes = 1;
						reportResultList.put(pointName, r);
					}
				} else {
					answer.put(q.getQuestionId(), false);
					wrong++;
					if (reportResultList.containsKey(pointName)) {
						ReportResult r = reportResultList.get(pointName);
						r.sum++;
						r.wrongTimes++;
						reportResultList.put(pointName, r);
					} else {
						ReportResult r = new ReportResult();
						r.sum = 1;
						r.wrongTimes = 1;
						reportResultList.put(pointName, r);
					}
				}
				hm.remove(q.getQuestionId());
			}
		}

		model.addAttribute("total", total);
		model.addAttribute("wrong", wrong);
		model.addAttribute("right", right);
		model.addAttribute("reportResultList", reportResultList);
		model.addAttribute("create_time", examHistory.getCreateTime());
		model.addAttribute("answer", answer);
		model.addAttribute("idList", idList);
		model.addAttribute("examPaperId", examPaperId);
		return "student/paper-exam-finished";
	}

	@RequestMapping(value = "student/exam-history", method = RequestMethod.GET)
	public String userExamHistPage(Model model, HttpServletRequest request) {

		int index = 1;
		if (request.getParameter("page") != null)
			index = Integer.parseInt(request.getParameter("page"));
		Subject subject = SecurityUtils.getSubject();
		String userid = (String) subject.getPrincipal();
		Page<ExamHistory> pageModel = new Page<ExamHistory>();
		// pageModel.setPageSize(1);
		pageModel.setPageNo(index);
		List<ExamHistory> hisList = examService.getUserExamHistoryListByUserId(
				userid, pageModel);
		model.addAttribute("hisList", hisList);
		String pageStr = PagingUtil.getPagelink(index,
				pageModel.getTotalPage(), "", "student/exam-his");
		model.addAttribute("pageStr", pageStr);
		return "student/exam-history";
	}
}
