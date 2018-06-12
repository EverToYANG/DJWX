package com.gsccs.cms.controller.auth;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gsccs.cms.auth.model.Roles;
import com.gsccs.cms.auth.model.Users;
import com.gsccs.cms.auth.service.OperlogService;
import com.gsccs.cms.auth.service.RoleAuthService;
import com.gsccs.cms.auth.service.RoleService;
import com.gsccs.cms.auth.shiro.annotation.CurrentUser;
import com.gsccs.cms.auth.utils.AuthConst;
import com.gsccs.cms.bass.controller.BaseController;
import com.gsccs.cms.bass.exception.AuthException;
import com.gsccs.cms.bass.exception.SiteCheckException;
import com.gsccs.cms.bass.utils.Pager;
import com.gsccs.cms.weixin.service.WxAppService;

/**
 * 角色管理相关操作
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
@Controller
@RequestMapping("/sysmg")
public class RoleController extends BaseController {

	@Resource
	private RoleService roleService;
	@Resource
	private RoleAuthService roleAuthService;
	@Resource
	private WxAppService wxAppService;
	@Resource
	private OperlogService operlogService;

	/**
	 * 角色管理页面
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/role.do")
	public String role(Roles role,
			@RequestParam(defaultValue = "1") int currPage,
			@RequestParam(defaultValue = "10") int pageSize,
			@RequestParam(defaultValue = "") String order, ModelMap map,
			HttpServletResponse response) {

		List<Roles> roleList = roleService.find(role, order, currPage,
				pageSize, null);

		int totalCount = roleService.count(role);
		Pager pager = new Pager(request);
		pager.appendParam("name");
		pager.appendParam("pageSize", "" + pageSize);
		pager.appendParam("pageFuncId");
		pager.setCurrPage(currPage);
		pager.setPageSize(pageSize);
		pager.setTotalCount(totalCount);
		pager.setOutStrBootstrap("role.do");
		map.put("pageStr", pager.getOutStrBootstrap());
		map.put("list", roleList);
		map.put("order", order);
		return "sysmg/role";
	}

	/**
	 * 角色编辑页面
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/roleEdit.do")
	public String roleEdit(Roles role, ModelMap map,
			HttpServletResponse response) {
		if (role != null && role.getId() != null
				&& role.getId().trim().length() > 0) {
			role = roleService.findById(role.getId());
			map.put("role", role);
		}
		return "sysmg/roleEdit";
	}

	/**
	 * 角色编辑
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/roleEditDo.do")
	public String roleEditDo(Roles role, ModelMap map,
			HttpServletResponse response) {
		String oper = "添加";
		try {
			if (role != null && StringUtils.isNotEmpty(role.getId())) {
				oper = "修改";
				Roles oldrole = roleService.findById(role.getId());
				if (oldrole != null) {
					// 如果修改了名称则判断角色名称是否已存在
					if (!oldrole.getName().equals(role.getName())) {
						// 判断角色名称是否已存在
						if (roleService.haveRoleName(role.getName())) {
							map.put("msg", "此角色名称已存在!");
							map.put("isCloseWindow", true);
							return "admin/msg";
						}
					}
					// 更新
					roleService.update(role);
				}
			} else {
				// 添加
				// 判断角色名称是否已存在
				if (roleService.haveRoleName(role.getName())) {
					map.put("msg", "此角色名称已存在!");
					map.put("isCloseWindow", true);
					return "admin/msg";
				}
				// 添加
				roleService.insert(role);
			}
			oper += "角色 " + role.getName() + " 成功!";
		} catch (Exception e) {
			oper += "角色 " + role.getName() + " 失败:" + e.toString() + "!";
		}
		map.put("msg", oper);
		map.put("isCloseWindow", true);
		map.put("isRefresh", true);
		return "admin/msg";
	}

	/**
	 * 角色删除
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/roleDel.do")
	public String roleDel(@CurrentUser Users user, String pageFuncId,
			String ids, ModelMap map, HttpServletResponse response)
			throws AuthException, SiteCheckException {
		if (ids != null && ids.trim().length() > 0) {
			String[] idArr = ids.split(";");
			if (idArr != null && idArr.length > 0) {
				Roles role;
				for (int i = 0; i < idArr.length; i++) {
					if (idArr[i].trim().length() > 0) {
						role = roleService.findById(idArr[i]);
						if (role != null) {
							try {
								roleService.del(idArr[i]);
								operlogService.log(user.getLoginname(),
										"删除角色成功:" + role.getName(), request);
							} catch (Exception e) {
								operlogService.log(
										user.getLoginname(),
										"删除角色失败:" + role.getName() + " "
												+ e.getMessage(), request);
							}
						}
					}
				}
			}
		}
		map.put("msg", "操作成功");
		map.put("forwardUrl", "role.do?pageFuncId=" + pageFuncId);
		map.put("forwardSeconds", 3);
		return "admin/msg";
	}

	/**
	 * 角色授权页面
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/roleAuth.do")
	public String roleAuth(Roles role, ModelMap map,
			HttpServletResponse response){
		if (role != null && role.getId() != null
				&& role.getId().trim().length() > 0) {
			role = roleService.findById(role.getId());
			map.put("role", role);
			map.put("treeHtml",
					roleAuthService.createTree(request, role.getId()));
		}
		return "sysmg/roleAuth";
	}

	/**
	 * 角色授权
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/roleAuthDo.do")
	public String roleAuthDo(String roleid, String[] ids, String[] operids,
			ModelMap map, HttpServletResponse response) throws AuthException,
			SiteCheckException {
		String msg = "没有找到相应数据";
		if (StringUtils.isNotEmpty(roleid)) {
			Roles role = roleService.findById(roleid);
			if (role != null) {
				try {
					// 先清除原有权限
					roleAuthService.delRoleFunc(roleid);
					roleAuthService.delRoleOper(roleid);

					// 添加新菜单权限
					if (ids != null && ids.length > 0) {
						for (int i = 0; i < ids.length; i++) {
							roleAuthService.addRoleFunc(roleid, ids[i], "");
						}
					}

					// 添加新操作权限
					if (operids != null && operids.length > 0) {
						for (int i = 0; i < operids.length; i++) {
							roleAuthService.addRoleOper(roleid, operids[i]);
						}
					}
					msg = "角色授权成功:" + role.getName();
				} catch (Exception e) {
					msg = "角色授权失败:" + role.getName() + " " + e.getMessage();
				}
			}
		}
		map.put("msg", msg);
		map.put("isCloseWindow", true);
		return "admin/msg";
	}

	



	/**
	 * 角色选择
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/roleSelect.do")
	public String roleSelect(ModelMap map, HttpServletResponse response) {
		Subject subject = SecurityUtils.getSubject();
		Roles role = new Roles();
		role.setIsok("1");
		List<Roles> roleList = null;
		if (subject.hasRole(AuthConst.SYS_ADMIN)) {
			roleList = roleService.findAll(role, "", null);
		} else {
			roleList = roleService.findAll(role, "", getLoginUser());
		}
		map.put("roles", roleList);
		return "sysmg/roleSelect";
	}
	

}
