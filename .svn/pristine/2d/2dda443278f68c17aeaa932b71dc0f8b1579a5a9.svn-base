package com.gsccs.cms.member.service;

import java.util.List;

import com.gsccs.cms.member.model.Creditlog;
import com.gsccs.cms.member.model.CreditlogExample.Criteria;

/**
 * 积分日志相关服务
 * 
 * @or x.d zhang
 * @version 1.0
 * 
 */
public interface CreditlogService {

	/**
	 * 分页查询
	 */
	public List<Creditlog> find(Creditlog Creditlog, String order,
			int currPage, int pageSize);

	/**
	 * 查询
	 */
	public List<Creditlog> find(Creditlog Creditlog, String order);

	/**
	 * 统计
	 * 
	 * @param info
	 * @return
	 */
	public int count(Creditlog creditlog);

	/**
	 * 处理查询条件
	 * 
	 * @param info
	 * @param criteria
	 */
	public void proSearchParam(Creditlog Creditlog, Criteria criteria);

	/**
	 * 根据id查询
	 * 
	 * @param id
	 * @param cache
	 * @return
	 */
	public Creditlog findById(String id);

	/**
	 * 更新
	 * 
	 * @param question
	 */
	public void update(Creditlog Creditlog);

	/**
	 * 添加
	 * 
	 * @param question
	 * @return
	 */
	public String add(Creditlog Creditlog);

	/**
	 * 删除
	 * 
	 * @param id
	 */
	public void del(String id);

}
