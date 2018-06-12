package com.gsccs.cms.controller.member;

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
import com.gsccs.cms.member.model.PartyMember;
import com.gsccs.cms.member.model.PartyUnit;
import com.gsccs.cms.member.service.PartyUnitService;

/**
 * 党支部管理相关操作
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
@Controller
@RequestMapping("/partyu")
public class PartyUnitController extends CmsBaseController {

	@Resource
	private PartyUnitService partyUnitService;

	/**
	 * 会员权限管理页面
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/list.do")
	public String memberauth(PartyUnit param,
			@RequestParam(defaultValue = "1") int currPage,
			@RequestParam(defaultValue = "10") int pageSize,
			@RequestParam(defaultValue = "") String order, ModelMap map,
			HttpServletResponse response) {
		Subject subject = SecurityUtils.getSubject();
		if (!subject.hasRole(AuthConst.SYS_ADMIN)) {
			
		} 
		param.setCorpid(getWxApp()==null?null:getWxApp().getId());
		List<PartyUnit> partyUnitList = partyUnitService.find(param, order,
				currPage, pageSize);
		int totalCount = partyUnitService.count(param);
		Pager pager = new Pager(request);
		pager.appendParam("name");
		pager.appendParam("code");
		pager.appendParam("order" + order);
		pager.appendParam("pageSize" + pageSize);
		pager.appendParam("pageFuncId");
		pager.setCurrPage(currPage);
		pager.setPageSize(pageSize);
		pager.setTotalCount(totalCount);

		pager.setOutStrBootstrap("list.do");
		map.put("pageStr", pager.getOutStrBootstrap());
		map.put("list", partyUnitList);
		map.put("order", order);
		return "member/partyu_list";
	}

	/**
	 * 单位编辑页面
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/form.do")
	public String unitEdit(Long id, ModelMap map,
			HttpServletResponse response) {
		if (null == getWxApp()) {
			map.put("msg", "无权限操作，请用公众号管理员帐号登录");
			map.put("isCloseWindow", true);
			map.put("isRefresh", true);
			return "admin/msg";
		}
		if (null != id) {
			// 编辑页面
			map.put("unit", partyUnitService.findById(id));
		} else {
			// 添加页面
			PartyUnit unit = new PartyUnit();
			map.put("unit", unit);
		}
		return "member/partyu_form";
	}

	/**
	 * 单位编辑
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/saveDo.do")
	public String unitEditDo(PartyUnit unit, ModelMap map,
			HttpServletResponse response) {
		String msg = "";
		try {
			if (null == getWxApp()) {
				map.put("msg", "无权限操作，请用公众号管理员帐号登录");
				map.put("isCloseWindow", true);
				map.put("isRefresh", true);
				return "admin/msg";
			}
			if (unit.getId() != null) {
				msg = "修改";
				partyUnitService.update(unit);
			} else {
				msg = "添加";
				unit.setCorpid(getWxApp().getId());
				partyUnitService.insert(unit);
			}
		} catch (Exception e) {
			msg += "党支部 " + unit.getName() + " 失败:" + e.toString();
		}
		map.put("isCloseWindow", true);
		map.put("isRefresh", true);
		msg += "党支部" + unit.getName() + " 成功";
		map.put("msg", msg);
		return "admin/msg";
	}
	
	
	/**
	 * 删除
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/del.do")
	public String del(String pageFuncId, String ids,
			HttpServletRequest request, ModelMap map,
			HttpServletResponse response) {
		if (ids != null && ids.trim().length() > 0) {
			String[] idArr = ids.split(";");
			if (idArr != null && idArr.length > 0) {
				for (int i = 0; i < idArr.length; i++) {
					if (idArr[i].trim().length() > 0) {
						try {
							partyUnitService.del(Long.valueOf(idArr[i]));
						} catch (Exception e) {
							
						}
					}
				}
			}
		}
		map.put("msg", "操作成功");
		map.put("forwardUrl", "partyu/list.do?pageFuncId=" + pageFuncId);
		map.put("forwardSeconds", 3);
		return "admin/msg";
	}

}
