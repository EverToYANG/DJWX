package com.gsccs.cms.weixin.service;

import java.util.List;

import com.gsccs.cms.weixin.model.WxMenu;

public interface WxMenuService {

	/**
	 * 查询
	 */
	public List<WxMenu> find(String appid, String order);

	/**
	 * 查询
	 */
	public List<WxMenu> find(String appid, String parId, String order);

	/**
	 * 根据id查询
	 * 
	 * @param id
	 * @param cache
	 * @return
	 */
	public WxMenu findById(String id);

	/**
	 * 更新
	 * 
	 * @param WxMenu
	 */
	public void update(WxMenu brands);

	/**
	 * 添加
	 * 
	 * @param brands
	 * @return
	 */
	public int add(WxMenu brands);

	/**
	 * 删除
	 * 
	 * @param id
	 */
	public void del(String id);
}
