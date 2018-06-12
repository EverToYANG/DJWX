package com.gsccs.cms.core.service;

import java.util.List;

import com.gsccs.cms.core.model.Link;
import com.gsccs.cms.core.model.LinkExample.Criteria;

/**
 * 友情链接服务
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
public interface LinkService {

	/**
	 * 更新
	 * 
	 * @param templet
	 */
	public void update(Link link);

	/**
	 * 添加
	 * 
	 * @param link
	 * @return
	 */
	public String add(Link link);

	/**
	 * 根据id查询
	 * 
	 * @param id
	 * @return
	 */
	public Link findById(String id);

	/**
	 * 检验是否已存在页面标识
	 * 
	 * @param siteid
	 * @param type
	 * @param isClass
	 * @return
	 */
	public boolean hasPagemark(String siteid, String type, boolean isClass,
			String pagemark);

	/**
	 * 分页查询
	 */
	public List<Link> find(Link link, String order, int currPage, int pageSize);

	/**
	 * 分页查询
	 */
	public List<Link> findAll(Link link, String order);

	/**
	 * 统计
	 * 
	 * @param info
	 * @return
	 */
	public int count(Link link);

	/**
	 * 处理查询条件
	 * 
	 * @param info
	 * @param criteria
	 */
	public void proSearchParam(Link link, Criteria criteria);

	/**
	 * 删除分类
	 * 
	 * @param id
	 */
	public void delClass(String id);

	/**
	 * 删除
	 * 
	 * @param id
	 */
	public void del(String id);
}
