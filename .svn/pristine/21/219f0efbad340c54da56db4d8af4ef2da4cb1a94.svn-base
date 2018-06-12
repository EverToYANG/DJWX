package com.gsccs.cms.controller.weixin;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import me.chanjar.weixin.common.bean.WxMenu.WxMenuButton;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpConfigStorage;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.api.impl.WxMpServiceImpl;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gsccs.cms.auth.model.Unit;
import com.gsccs.cms.auth.utils.AuthConst;
import com.gsccs.cms.bass.controller.CmsBaseController;
import com.gsccs.cms.weixin.model.WxMenu;
import com.gsccs.cms.weixin.service.WxAppService;
import com.gsccs.cms.weixin.service.WxMenuService;

/**
 * @author 刘杰
 * 
 * @date 2016年9月22日
 */
@Controller
@RequestMapping("/wxmenu")
public class WxMenuController extends CmsBaseController {

	@Resource
	private WxMenuService wxMenuService;
	@Resource
	private WxAppService wxAppService;
	@Resource
	WxMpConfigStorage wxMpConfigStorage;

	// 获取列表
	@RequestMapping("/list.do")
	public String getMenuList(ModelMap map, HttpServletRequest request,
			HttpServletResponse response) {
		if (getWxApp()==null) {
			map.put("msg", "当前无指定的AppID,请联系管理员分配权限");
			return "admin/msg";
		} 
		
		// 获取所有一级栏目
		List<WxMenu> wxOneMenus = wxMenuService.find(getWxApp().getId(),
				"order_num");
		// 拼成数据结构为(WxMenu,List<WxMenu>)的List
		List<WxMenus> wxMenusList = new ArrayList<>();
		for (WxMenu wxMenu : wxOneMenus) {
			WxMenus wxMenus = new WxMenus();
			BeanUtils.copyProperties(wxMenu, wxMenus);
			List<WxMenu> subMenu = wxMenuService.find(getWxApp().getId(),
					wxMenu.getId(), "order_num");
			wxMenus.setSubMenu(subMenu);
			wxMenusList.add(wxMenus);
		}
		map.put("list", wxMenusList);
		return "weixin/menu_list";
	}

	// 编辑
	@RequestMapping("/menuEdit.do")
	public String edit(String id, String type, String parId, String title,
			String url, ModelMap map, HttpServletRequest request,
			HttpServletResponse response) {
		WxMenu model = new WxMenu();
		if ("addSon" == type) {
			model.setParId(id);
		} else {
			model.setParId(parId);
			if (StringUtils.isEmpty(id)) {

			} else {
				model = wxMenuService.findById(id);
			}
		}
		map.put("model", model);
		return "weixin/menu_edit";
	}

	// 保存
	@RequestMapping("/menuSave.do")
	public String save(ModelMap map, WxMenu model, HttpServletRequest request,
			HttpServletResponse response) {
		if (getWxApp()==null) {
			map.put("msg", "当前无指定的AppID,请联系管理员分配权限");
			return "admin/msg";
		} 
		if (StringUtils.isEmpty(model.getId())) {
			model.setId(UUID.randomUUID().toString());
			model.setAppId(getWxApp().getId());
			wxMenuService.add(model);
		} else {
			model.setAppId(getWxApp().getId());
			wxMenuService.update(model);
		}
		msg = "恭喜您，操作成功！";
		map.put("msg", msg);
		map.put("isCloseWindow", true);
		map.put("isRefresh", true);
		return "admin/msg";
	}

	// 删除
	@RequestMapping("/menuDel.do")
	public String del(String id, ModelMap map, HttpServletRequest request,
			HttpServletResponse response) {
		if (StringUtils.isNotEmpty(id)) {
			wxMenuService.del(id);
			msg = "恭喜您，操作成功！";
		} else {
			msg = "删除失败！";
		}
		map.put("msg", msg);
		map.put("forwardUrl", "mpMenu.do");
		map.put("forwardSeconds", 3);
		return "admin/msg";
	}

	// 获取子菜单
	@RequestMapping("/menuSon.do")
	public String getMenuSon(String id, ModelMap map,
			HttpServletRequest request, HttpServletResponse response) {
		if (StringUtils.isNotEmpty(id)) {
			List<WxMenu> wxMenus = wxMenuService.find(
					id, "order_num");
			map.put("list", wxMenus);
		}
		return "weixin/menu_son";
	}

	/**
	 * 微信菜单项发布
	 * 
	 * @return
	 */
	@RequestMapping(value = "/menuSend.do", method = RequestMethod.GET)
	public String deployMenu(ModelMap map) {
		if (getWxApp()==null) {
			map.put("msg", "当前无指定的AppID,请联系管理员分配权限");
			return "admin/msg";
		} 
		List<WxMenuButton> buttons = new ArrayList<WxMenuButton>();
		List<WxMenu> menuList = wxMenuService.find(getWxApp().getId(), "order_num");
		if (null != menuList && menuList.size() > 0) {
			for (WxMenu t : menuList) {
				WxMenuButton but = new WxMenuButton();
				List<WxMenuButton> subbuttons = new ArrayList<WxMenuButton>();
				List<WxMenu> submenuList = wxMenuService.find(getWxApp().getId(), t.getId(),
						null);
				for (WxMenu st : submenuList) {
					WxMenuButton subbut = new WxMenuButton();
					subbut.setKey(st.getKey());
					subbut.setName(st.getName());
					subbut.setType(st.getType());
					subbut.setUrl(st.getUrl());
					subbuttons.add(subbut);
				}
				but.setKey(t.getKey());
				but.setName(t.getName());
				but.setType(t.getType());
				but.setUrl(t.getUrl());
				but.setSubButtons(subbuttons);
				buttons.add(but);
			}
			me.chanjar.weixin.common.bean.WxMenu wxmenu = new me.chanjar.weixin.common.bean.WxMenu();
			wxmenu.setButtons(buttons);

			try {
				System.out.println(getWxApp().getId());
				wxMpConfigStorage.init(getWxApp().getId());
				WxMpService wxMpService = new WxMpServiceImpl();
				wxMpService.setWxMpConfigStorage(wxMpConfigStorage);
				wxMpService.getAccessToken(true);
				wxMpService.getMenuService().menuCreate(wxmenu);
				msg = "菜单发布成功";
			} catch (WxErrorException e) {
				e.printStackTrace();
				msg = "菜单发布失败:" + e.getMessage();
			}
		}

		map.put("msg", msg);
		map.put("isCloseWindow", true);
		map.put("isRefresh", true);
		return "admin/msg";
	}

}
