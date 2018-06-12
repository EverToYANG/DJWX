package com.gsccs.cms.auth.service;

import javax.servlet.http.HttpServletRequest;

import com.gsccs.cms.auth.model.RoleFunc;
import com.gsccs.cms.auth.model.RoleOper;
import com.gsccs.cms.auth.model.Users;


/**
 * 关于菜单角色的相关服务
 * @author x.d zhang
 * 2013-4-8
 */
public interface RoleAuthService {

	/**
	 * 检查是否有此访问记录
	 * @param roleid
	 * @param funcid
	 * @return
	 */
	public boolean haveRoleFunc(String roleid,String funcid);
	/**
	 * 检查是否有此操作记录
	 * @param roleid
	 * @param operid
	 * @return
	 */
	public boolean haveRoleOper(String roleid,String operid);
	
	/**
	 * 查询访问权限
	 * @param roleid
	 * @param funcid
	 * @return
	 */
	public RoleFunc findRoleFunc(String roleid,String funcid);
	/**
	 * 查询操作权限
	 * @param roleid
	 * @param operid
	 * @return
	 */
	public RoleOper findRoleOper(String roleid,String operid);
	/**
	 * 添加访问权限
	 * @param roleid
	 * @param funcid
	 * @return
	 */
	public int addRoleFunc(String roleid,String funcid,String dataLevel);
	/**
	 * 添加操作权限
	 * @param roleid
	 * @param operid
	 * @return
	 */
	public int addRoleOper(String roleid,String operid);
	/**
	 * 删除访问权限
	 * @param roleid
	 * @param funcid
	 * @return
	 */
	public int delRoleFunc(String roleid,String funcid);
	/**
	 * 删除操作权限
	 * @param roleid
	 * @param operid
	 * @return
	 */
	public int delRoleOper(String roleid,String operid);
	/**
	 * 删除权限
	 * @param roleid
	 * @return
	 */
	public int delRoleFunc(String roleid);
	
	/**
	 * 删除权限
	 * @param roleid
	 * @return
	 */
	public int delRoleOper(String roleid);
	
	/**
	 * 更新访问权限
	 * @param roleFunc
	 * @return
	 */
	public int update(RoleFunc roleFunc);
	/**
	 * 更新操作权限
	 * @param roleOper
	 * @return
	 */
	public int update(RoleOper roleOper);
	
	/**
	 * 生成授权树
	 * @param roleid
	 * @return
	 */
	public String createTree(HttpServletRequest request,String roleid);
	
	/**
	 * 生成授权树
	 * @param roleid
	 * @return
	 */
	public String createTreeAuth(HttpServletRequest request,String roleid,String userId);
}
