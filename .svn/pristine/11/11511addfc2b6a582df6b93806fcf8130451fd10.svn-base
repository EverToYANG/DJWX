package com.gsccs.cms.member.service;

import java.util.List;

import com.gsccs.cms.member.model.Membergroup;
import com.gsccs.cms.member.model.MembergroupExample.Criteria;

/**
 * 
 * 会员组服务
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
public interface MembergroupService {

	/**
	 * 查询
	 */
	public List<Membergroup> find(Membergroup Membergroup, String order);

	/**
	 * 处理查询条件
	 * 
	 * @param info
	 * @param criteria
	 */
	public void proSearchParam(Membergroup membergroup, Criteria criteria);

	/**
	 * 根据id查询
	 * 
	 * @param id
	 * @param cache
	 * @return
	 */
	public Membergroup findById(String id);

	/**
	 * 更新
	 * 
	 * @param site
	 */
	public void update(Membergroup membergroup);

	/**
	 * 添加
	 * 
	 * @param site
	 * @return
	 */
	public String insert(Membergroup membergroup);

	/**
	 * 删除
	 * 
	 * @param id
	 */
	public void del(String id);

	/**
	 * 根据经验查询所处经验会员组
	 * 
	 * @param experience
	 * @return
	 */
	public Membergroup findByExperience(int experience);
}
