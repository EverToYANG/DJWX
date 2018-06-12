package com.gsccs.cms.core.service;

import java.util.List;

import com.gsccs.cms.core.model.Sensitive;
import com.gsccs.cms.core.model.SensitiveExample.Criteria;

/**
 * 敏感词相关服务
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
public interface SensitiveService {

	/**
	 * 替换处理
	 * 
	 * @param content
	 * @return
	 */
	public String replace(String content);

	/**
	 * 分页查询
	 */
	public List<Sensitive> find(Sensitive sensitive, String order,
			int currPage, int pageSize);

	/**
	 * 查询
	 */
	public List<Sensitive> find(Sensitive Sensitive, String order, boolean cache);

	/**
	 * 统计
	 * 
	 * @param info
	 * @return
	 */
	public int count(Sensitive Sensitive);

	/**
	 * 处理查询条件
	 * 
	 * @param info
	 * @param criteria
	 */
	public void proSearchParam(Sensitive sensitive, Criteria criteria);

	/**
	 * 根据id查询
	 * 
	 * @param id
	 * @param cache
	 * @return
	 */
	public Sensitive findById(String id);

	/**
	 * 更新
	 * 
	 * @param question
	 */
	public void update(Sensitive sensitive);

	/**
	 * 添加
	 * 
	 * @param question
	 * @return
	 */
	public String add(Sensitive sensitive);

	/**
	 * 删除
	 * 
	 * @param id
	 */
	public void del(String id);
}
