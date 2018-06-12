package com.gsccs.cms.core.service;



import com.gsccs.cms.core.model.RoleSite;

/**
 * 角色站点相关服务
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
public interface RoleSiteService {

	/**
	 * 根据站点和角色判断是否有权限
	 * @param siteid
	 * @param roleid
	 */
	public boolean have(String siteid,String roleid);
	/**
	 * 根据站点和角色查询
	 * @param siteid
	 * @param roleid
	 */
	public RoleSite findBySiteRole(String siteid,String roleid);
	/**
	 * 根据站点和角色查询
	 * @param siteid
	 * @param roleid
	 */
	public RoleSite findBySiteRoles(String siteid,String roleids);
	/**
	 * 根据站点和角色删除
	 * @param siteid
	 * @param roleid
	 */
	public void del(String siteid,String roleid);
	/**
	 * 根据站点和角色保存
	 * @param siteid
	 * @param roleid
	 */
	public void save(String siteid,String roleid,String siteadmin);
	
}
