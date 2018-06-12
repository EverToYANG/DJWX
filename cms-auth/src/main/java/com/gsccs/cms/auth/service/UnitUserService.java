package com.gsccs.cms.auth.service;



/**
 * 单位用户服务类
 * @author x.d zhang
 * 2013-4-16
 */
public interface UnitUserService{

	

	/**
	 * 判断一个用户与一个单位是否关联
	 * @param unit
	 * @param user
	 * @return
	 */
	public boolean haveUnitUser(String unit,String user);
	/**
	 * 添加关联
	 * @param role
	 * @param user
	 * @return
	 */
	public int add(String unit,String user);
	/**
	 * 按用户删除
	 * @param user
	 */
	public void delByUser(String user);
}
