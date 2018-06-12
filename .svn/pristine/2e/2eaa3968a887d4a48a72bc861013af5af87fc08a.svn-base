package com.gsccs.cms.core.service;

import java.util.List;

import com.gsccs.cms.core.model.ContentSign;

/**
 * 信息签收服务
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
public interface ContentSignService {

	/**
	 * 用户签收信息改变
	 * 
	 * @param infoid
	 * @param signusers
	 */
	public void infoedit(String infoid, String[] signusers);

	/**
	 * 根据用户id和信息id统计
	 * 
	 * @param infoid
	 * @param userid
	 * @return
	 */
	public int countByInfoUser(String infoid, String userid);

	/**
	 * 保存
	 * 
	 * @param infoSign
	 * @return
	 */
	public String save(ContentSign infoSign);

	/**
	 * 根据信息id查询
	 * 
	 * @param infoid
	 * @return
	 */
	public List<ContentSign> findByInfo(String infoid);

	/**
	 * 根据信息id查询签收情况
	 * 
	 * @param infoid
	 * @return
	 */
	public List<ContentSign> findSignByInfo(String infoid);

	/**
	 * 判断指定信息是否有指定签收用户
	 * 
	 * @param userid
	 * @param infoid
	 * @return
	 */
	public ContentSign findByUserInfo(String userid, String infoid);

	/**
	 * 编辑
	 * 
	 * @param infoid
	 * @param userid
	 * @param request
	 */
	public void update(ContentSign infoSign);
}
