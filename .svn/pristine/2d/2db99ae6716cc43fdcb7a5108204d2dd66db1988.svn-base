package com.gsccs.cms.controller.auth;

import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gsccs.cms.auth.model.Func;
import com.gsccs.cms.auth.model.Users;
import com.gsccs.cms.auth.service.FuncService;
import com.gsccs.cms.auth.service.OperlogService;
import com.gsccs.cms.auth.shiro.annotation.CurrentUser;
import com.gsccs.cms.bass.controller.BaseController;
import com.gsccs.cms.bass.exception.AuthException;
import com.gsccs.cms.bass.exception.SiteCheckException;

/**
 * 菜单管理相关操作
 * 
 * @author x.d zhang
 * @version 1.0
 */
@Controller
@RequestMapping("/sysmg")
public class FuncController extends BaseController {

	@Resource
	private FuncService funcService;
	@Resource
	private OperlogService operlogService;

	/**
	 * 菜单管理页面
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/func.do")
	public String func(ModelMap map, HttpServletResponse response) {
		// 查询一级菜单
		List<Func> list = funcService.selectRoot();
		if (list != null && list.size() > 0) {
			for (int i = 0; i < list.size(); i++) {
				if (funcService.haveSon(list.get(i).getId())) {
					list.get(i).setHasChildren("true");
				}
			}
		}
		map.put("funcs", list);
		return "sysmg/func";
	}

	/**
	 * 菜单管理页面
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/funcSon.do")
	public String funcSon(String pid, String plevel, ModelMap map,
			HttpServletResponse response) {
		if (StringUtils.isNotEmpty(pid) && StringUtils.isNotEmpty(plevel)) {
			// 提取子菜单
			List<Func> list = funcService.selectByParid(pid);
			if (list != null && list.size() > 0) {
				for (int i = 0; i < list.size(); i++) {
					if (funcService.haveSon(list.get(i).getId())) {
						list.get(i).setHasChildren("true");
					}
				}
			}
			map.put("funcs", list);
			try {
				map.put("level", Integer.parseInt(plevel) + 1);
			} catch (Exception e) {
			}
		}
		return "sysmg/funcSon";
	}

	/**
	 * 菜单编辑页面
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/funcEdit.do")
	public String funcEdit(String pid, String id, ModelMap map,
			HttpServletResponse response){
		if (StringUtils.isNotEmpty(id)) {
			// 编辑页面
			map.put("func", funcService.selectById(id));
		} else {
			// 添加页面
			Func func = new Func();
			func.setParid(pid);
			map.put("func", func);
		}
		return "sysmg/funcEdit";
	}

	/**
	 * 菜单编辑
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/funcEditDo.do")
	public String funcEditDo(Func func, ModelMap map,
			HttpServletResponse response) {
		String msg = "";
		try {
			if (func.getOrdernum() == null) {
				func.setOrdernum(funcService.maxNum(func.getParid()));
			}
			if (func.getId() != null && func.getId().trim().length() > 0) {
				msg = "修改";
				funcService.update(func);
			} else {
				msg = "添加";
				func.setId(UUID.randomUUID().toString());
				funcService.insert(func);
			}
		} catch (Exception e) {
			msg += "菜单 " + func.getName() + " 失败:" + e.toString();
		}
		map.put("isCloseWindow", true);
		msg += "菜单 " + func.getName() + " 成功";
		operlogService.log(getLoginUser().getName(), msg, request);
		map.put("isRefresh", true);
		map.put("msg", msg);
		return "admin/msg";
	}

	/**
	 * 菜单排序
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/funcOrder.do")
	public String funcOrder(String id, String type, ModelMap map,
			HttpServletResponse response) {
		if (StringUtils.isNotEmpty(id)) {
			Func func = funcService.selectById(id);
			if (func != null) {
				String msg = "";
				try {
					if ("up".equals(type)) {
						msg += "上升";
						funcService.up(func);
					} else if ("down".equals(type)) {
						msg += "下降";
						funcService.down(func);
					}
				} catch (Exception e) {
					msg += "菜单 " + func.getName() + " 失败:" + e.toString();
				}
				msg += "菜单 " + func.getName() + " 成功";
				operlogService.log(getLoginName(), msg, request);
			}
		}
		return func(map, response);
	}

	/**
	 * 菜单删除
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/funcDel.do")
	public String funcDel(String pageFuncId, String ids,
			HttpServletRequest request, ModelMap map,
			HttpServletResponse response) {
		if (ids != null && ids.trim().length() > 0) {
			String[] idArr = ids.split(";");
			if (idArr != null && idArr.length > 0) {
				Func func;
				for (int i = 0; i < idArr.length; i++) {
					if (idArr[i].trim().length() > 0) {
						func = funcService.selectById(idArr[i]);
						if (func != null) {
							try {
								funcService.delete(idArr[i]);
								operlogService.log(getLoginName(), "删除菜单成功:"
										+ func.getName(), request);
							} catch (Exception e) {
								operlogService.log(
										getLoginName(),
										"删除菜单失败:" + func.getName() + " "
												+ e.getMessage(), request);
							}
						}
					}
				}
			}
		}
		map.put("msg", "操作成功");
		map.put("forwardUrl", "func.do?pageFuncId=" + pageFuncId);
		map.put("forwardSeconds", 3);
		return "admin/msg";
	}

	/**
	 * 菜单转移页面
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/funcTree.do")
	public String funcTree(String id, HttpServletRequest request, ModelMap map,
			HttpServletResponse response) {
		// 查询一级菜单
		List<Func> list = funcService.selectRoot();
		if (list != null && list.size() > 0) {
			for (int i = 0; i < list.size(); i++) {
				if (funcService.haveSon(list.get(i).getId())) {
					list.get(i).setHasChildren("true");
				}
			}
		}
		map.put("funcs", list);
		return "sysmg/funcTree";
	}

	/**
	 * 菜单子
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/funcSonTree.do")
	public String funcSonTree(String pid, String plevel, ModelMap map,
			HttpServletResponse response){
		if (StringUtils.isNotEmpty(pid) && StringUtils.isNotEmpty(plevel)) {
			// 提取子菜单
			List<Func> list = funcService.selectByParid(pid);
			if (list != null && list.size() > 0) {
				for (int i = 0; i < list.size(); i++) {
					if (funcService.haveSon(list.get(i).getId())) {
						list.get(i).setHasChildren("true");
					}
				}
			}
			map.put("funcs", list);
			try {
				map.put("level", Integer.parseInt(plevel) + 1);
			} catch (Exception e) {
			}
		}
		return "sysmg/funcSonTree";
	}

	/**
	 * 菜单转移处理
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/funcPar.do")
	public String funcPar(String id, String pid, HttpServletRequest request,
			ModelMap map, HttpServletResponse response) {
		String msg = "";
		if (StringUtils.isNotEmpty(id)) {
			Func func = funcService.selectById(id);
			if (StringUtils.isNotEmpty(pid)) {
				Func parFunc = funcService.selectById(pid);
				if (parFunc != null) {
					msg = "改变菜单 " + func.getName() + " 的所属菜单为 "
							+ parFunc.getName() + " ";
				}
			} else {
				msg = "改变菜单 " + func.getName() + " 的所属菜单为 根菜单 ";
			}
			if (func != null) {
				try {
					func.setParid(pid);
					funcService.updatePar(func);
					msg += "成功!";
				} catch (Exception e) {
					msg += "失败:" + e.toString();
				}
				operlogService.log(getLoginName(), msg, request);
			}
		}
		map.put("isCloseWindow", true);
		map.put("isRefresh", true);
		operlogService.log(getLoginName(), msg, request);
		map.put("msg", msg);
		return "admin/msg";
	}

}
