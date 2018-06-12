package com.gsccs.cms.module.service;

import java.util.List;

import com.gsccs.cms.core.model.Channel;
import com.gsccs.cms.core.model.Content;
import com.gsccs.cms.module.model.Collect;
import com.gsccs.cms.module.model.CollectExample.Criteria;

public interface CollectService {

	/**
	 * 添加
	 * 
	 * @param collect
	 * @return
	 */
	public String insert(Collect collect);

	/**
	 * 删除
	 * 
	 * @param id
	 */
	public void del(String id);

	/**
	 * 分页查询
	 */
	public List<Collect> find(Collect collect, String order, int currPage,
			int pageSize);
	
	/**
	 * 分页查询
	 */
	public List<Content> findArticleList(Collect collect, String order, int currPage,
			int pageSize);
	
	/**
	 * 分页查询
	 */
	public List<Channel> findChannelList(Collect collect, String order, int currPage,
			int pageSize);
	
	/**
	 * 统计
	 * 
	 * @param info
	 * @return
	 */
	public int count(Collect collect);

	/**
	 * 处理查询条件
	 * 
	 * @param info
	 * @param criteria
	 */
	public void proSearchParam(Collect collect, Criteria criteria);
}
