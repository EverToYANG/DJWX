package com.gsccs.weixin.service;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;

import com.gsccs.cms.weixin.model.WxApp;

import io.github.elkan1788.mpsdk4j.vo.api.Groups;

/**
 * 分组管理API
 * 
 * @author 刘杰
 *
 * @date 2016年9月18日
 */
@Service
public class GroupsApi extends WXAppConfig {
	
	// 创建用户分组
	public int createGroup(WxApp wxApp,String name){
		return getAPI(wxApp).createGroup(name);
	}

	// 查询所有分组
	public List<Groups> getGroups(WxApp wxApp){
		return getAPI(wxApp).getGroups();
	}

	// 查询用户所在分组
	public int getGroup(WxApp wxApp,String openId){
		return getAPI(wxApp).getGroup(openId);
	}

	// 修改分组名称
	public boolean renGroups(WxApp wxApp,int id, String name){
		return getAPI(wxApp).renGroups(id, name);
	}

	// 移动用户所在分组
	public boolean move2Group(WxApp wxApp,String openId, int groupId){
		return getAPI(wxApp).move2Group(openId, groupId);
	}

	// 批量移动用户分组
	public boolean batchMove2Group(WxApp wxApp,Collection<String> openIds, int groupId){
		return getAPI(wxApp).batchMove2Group(openIds, groupId);
	}

	// 删除分组
	public boolean delGroup(WxApp wxApp,int id){
		return getAPI(wxApp).delGroup(id);
	}

}
