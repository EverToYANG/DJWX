package com.gsccs.cms.controller.auth;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gsccs.cms.auth.model.Operlogs;
import com.gsccs.cms.auth.model.Users;
import com.gsccs.cms.auth.service.OperlogService;
import com.gsccs.cms.auth.shiro.annotation.CurrentUser;
import com.gsccs.cms.bass.controller.BaseController;
import com.gsccs.cms.bass.exception.AuthException;
import com.gsccs.cms.bass.exception.SiteCheckException;
import com.gsccs.cms.bass.utils.Pager;

/**
 * 操作日志管理相关操作
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
@Controller
@RequestMapping("/sysmg")
public class OperlogController extends BaseController {

	@Resource
	private OperlogService operlogService;

	/**
	 * 操作日志管理页面
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/operlog.do")
	public String operlog(@CurrentUser Users user,Operlogs operlog,
			@RequestParam(defaultValue = "1") int currPage,
			@RequestParam(defaultValue = "10") int pageSize,
			@RequestParam(defaultValue = " opertime desc ") String order,
			ModelMap map, HttpServletRequest request,
			HttpServletResponse response) throws AuthException,
			SiteCheckException {
		List<Operlogs> operlogList = operlogService.find(operlog, order,
				currPage, pageSize);
		int totalCount = operlogService.count(operlog);
		Pager pager = new Pager(request);
		pager.appendParam("loginnamelike");
		pager.appendParam("content");
		pager.appendParam("ip");
		pager.appendParam("pageSize", "" + pageSize);
		pager.appendParam("pageFuncId");
		pager.setCurrPage(currPage);
		pager.setPageSize(pageSize);
		pager.setTotalCount(totalCount);
		pager.setOutStrBootstrap("operlog.do");
		map.put("pageStr", pager.getOutStrBootstrap());
		map.put("list", operlogList);
		map.put("order", order);
		return "sysmg/operlog";
	}
}
