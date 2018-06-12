package com.gsccs.weixin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gsccs.cms.weixin.model.WxApp;

import io.github.elkan1788.mpsdk4j.vo.api.Menu;

/**
 * 菜单API
 * 
 * @author 刘杰
 *
 * @date 2016年9月16日
 */
@Service
public class MenuApi extends WXAppConfig{

	//获取菜单
	public List<Menu> getMenu(WxApp wxApp){
		return getAPI(wxApp).getMenu();
	}
	
	//创建菜单
	public boolean createMenu(WxApp wxApp,Menu... menu){
		return getAPI(wxApp).createMenu(menu);
	}
	
	//删除菜单
	public boolean delMenu(WxApp wxApp){
		return getAPI(wxApp).delMenu();
	}

}

