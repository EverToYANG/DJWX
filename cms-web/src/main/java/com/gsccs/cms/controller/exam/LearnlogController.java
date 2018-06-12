package com.gsccs.cms.controller.exam;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gsccs.cms.auth.utils.AuthConst;
import com.gsccs.cms.bass.controller.CmsBaseController;
import com.gsccs.cms.bass.utils.Pager;
import com.gsccs.cms.course.model.Courselog;
import com.gsccs.cms.course.service.LearnlogService;
import com.gsccs.cms.member.model.Creditlog;
import com.gsccs.cms.member.model.Creditrule;
import com.gsccs.cms.member.service.CreditlogService;
import com.gsccs.cms.member.service.CreditruleService;

/**
 * 
 * 学习记录相关操作
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
@Controller
@RequestMapping("/learn")
public class LearnlogController extends CmsBaseController {

	@Resource
	private LearnlogService learnlogService;

	/**
	 * 管理页面
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/list.do")
	public String list(Courselog param,
			@RequestParam(defaultValue = "1") int currPage,
			@RequestParam(defaultValue = "10") int pageSize,
			@RequestParam(defaultValue = "logtime desc") String order,
			ModelMap map, HttpServletRequest request,
			HttpServletResponse response){

		Subject subject = SecurityUtils.getSubject();
		if (!subject.hasRole(AuthConst.SYS_ADMIN)) {
			param.setCorpid(getWxApp().getId());
		}
		List<Courselog> creditlogList = learnlogService.find(param, order,
				currPage, pageSize);
		int totalCount = learnlogService.count(param);
		Pager pager = new Pager(request);
		pager.appendParam("membername");
		pager.appendParam("pageSize", "" + pageSize);
		pager.appendParam("pageFuncId");
		pager.setCurrPage(currPage);
		pager.setPageSize(pageSize);
		pager.setTotalCount(totalCount);
		pager.setOutStrBootstrap("list.do");
		map.put("pageStr", pager.getOutStrBootstrap());
		map.put("list", creditlogList);
		map.put("order", order);
		return "course/learn_list";
	}

}
