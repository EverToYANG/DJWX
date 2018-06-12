package com.gsccs.cms.core.service;

import java.util.List;

import com.gsccs.cms.core.model.Htmlquartz;

/**
 * 静态化调度服务类
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
public interface HtmlquartzService {


	/**
	 * 更新
	 * @param site
	 */
	public void update(Htmlquartz htmlquartz);
	/**
	 * 添加
	 * @param site
	 * @return
	 */
	public String insert(Htmlquartz htmlquartz);
	/**
	 * 根据id查询
	 * @param id
	 * @return
	 */
	public Htmlquartz findById(String id);
	/**
	 * 根据siteid查询
	 * @param id
	 * @return
	 */
	public Htmlquartz findBySiteid(String siteid);
	/**
	 * 根据siteid删除
	 * @param id
	 * @return
	 */
	public void delBySiteid(String siteid);
	/**
	 * 根据channelid查询
	 * @param id
	 * @return
	 */
	public Htmlquartz findByChannelid(String channelid);
	/**
	 * 根据channelid删除
	 * @param id
	 * @return
	 */
	public void delByChannelid(String channelid);
	
	/**
	 * 根据categoryid删除
	 * @param id
	 * @return
	 */
	public void  delByCategoryid(String categoryid);
	
	/**
	 * 查询所有有效调度
	 * @return
	 */
	public List<Htmlquartz> findAll();
	/**
	 * 查询所有有效调度
	 * @return
	 */
	public List<Htmlquartz> findAll(Htmlquartz htmlquartz);
}
