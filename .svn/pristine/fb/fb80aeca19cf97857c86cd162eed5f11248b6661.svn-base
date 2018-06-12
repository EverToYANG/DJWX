package com.gsccs.cms.controller.core;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gsccs.cms.bass.controller.CmsBaseController;
import com.gsccs.cms.bass.exception.AuthException;
import com.gsccs.cms.bass.exception.SiteCheckException;
import com.gsccs.cms.bass.utils.Pager;
import com.gsccs.cms.core.model.Sensitive;
import com.gsccs.cms.core.service.SensitiveService;

/**
 * 敏感词相关操作
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */

@Controller
@RequestMapping("/cms")
public class SensitiveController extends CmsBaseController {

	@Resource
	private SensitiveService sensitiveService;

	/**
	 * 管理页面
	 * 
	 * @param map
	 * @return
	 */
	// @FuncAuth(codes="sensitive")
	@RequestMapping("/sensitive.do")
	public String sensitive(Sensitive sensitive,
			@RequestParam(defaultValue = "1") int currPage,
			@RequestParam(defaultValue = "10") int pageSize,
			@RequestParam(defaultValue = "") String order, ModelMap map,
			HttpServletRequest request, HttpServletResponse response)
			throws AuthException, SiteCheckException {
		List<Sensitive> sensitiveList = sensitiveService.find(sensitive, order,
				currPage, pageSize);
		int totalCount = sensitiveService.count(sensitive);
		Pager pager = new Pager(request);
		pager.appendParam("sensitiveword");
		pager.appendParam("replaceto");
		pager.appendParam("pageSize", "" + pageSize);
		pager.appendParam("pageFuncId");
		pager.setCurrPage(currPage);
		pager.setPageSize(pageSize);
		pager.setTotalCount(totalCount);
		pager.setOutStrBootstrap("sensitive.do");
		map.put("pageStr", pager.getOutStrBootstrap());
		map.put("list", sensitiveList);
		map.put("order", order);
		return "cms/sensitive";
	}

	/**
	 * 敏感词编辑页面
	 * 
	 * @param map
	 * @return
	 */
	// @FuncAuth(codes="sensitive")
	@RequestMapping("/sensitiveEdit.do")
	public String sensitiveEdit(Sensitive sensitive, ModelMap map,
			HttpServletRequest request, HttpServletResponse response)
			throws AuthException, SiteCheckException {
		if (sensitive != null && sensitive.getId() != null
				&& sensitive.getId().trim().length() > 0) {
			sensitive = sensitiveService.findById(sensitive.getId());
			map.put("sensitive", sensitive);
		}
		return "cms/sensitiveEdit";
	}

	/**
	 * 敏感词编辑
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/sensitiveEditDo.do")
	public String sensitiveEditDo(Sensitive sensitive, ModelMap map,
			HttpServletRequest request, HttpServletResponse response)
			throws AuthException, SiteCheckException {
		String oper = "添加";
		try {
			if (sensitive != null && StringUtils.isNotEmpty(sensitive.getId())) {
				oper = "修改";
				sensitiveService.update(sensitive);
			} else {
				// 添加
				sensitiveService.add(sensitive);
			}
			oper += "敏感词 " + sensitive.getSensitiveword() + " 成功!";
		} catch (Exception e) {
			oper += "敏感词 " + sensitive.getSensitiveword() + " 失败:"
					+ e.toString() + "!";
		}
		operlogService.log(getLoginName(), oper, request);
		map.put("msg", oper);
		map.put("isCloseWindow", true);
		map.put("isRefresh", true);
		return "admin/msg";
	}

	/**
	 * 删除
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/sensitiveDel.do")
	public String sensitiveDel(String pageFuncId, String ids,
			HttpServletRequest request, ModelMap map,
			HttpServletResponse response) throws AuthException,
			SiteCheckException {
		if (ids != null && ids.trim().length() > 0) {
			String[] idArr = ids.split(";");
			if (idArr != null && idArr.length > 0) {
				Sensitive sensitive;
				for (int i = 0; i < idArr.length; i++) {
					if (idArr[i].trim().length() > 0) {
						sensitive = sensitiveService.findById(idArr[i]);
						if (sensitive != null) {
							try {
								sensitiveService.del(idArr[i]);
								operlogService
										.log(getLoginName(), "删除敏感词成功:"
												+ sensitive.getSensitiveword(),
												request);
							} catch (Exception e) {
								operlogService.log(getLoginName(), "删除敏感词失败:"
										+ sensitive.getSensitiveword() + " "
										+ e.getMessage(), request);
							}
						}
					}
				}
			}
		}
		map.put("msg", "操作成功");
		map.put("forwardUrl", "sensitive.do?pageFuncId=" + pageFuncId);
		map.put("forwardSeconds", 3);
		return "admin/msg";
	}
}
