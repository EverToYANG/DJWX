package com.gsccs.cms.module.service;

import java.util.List;

import com.gsccs.cms.module.model.Itemclass;

/**
 * 事项分类
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
public interface ItemclassService {

	/**
	 * 添加
	 * 
	 * @param Itemclass
	 * @return
	 */
	public void insert(Itemclass param);

	/**
	 * 分页查询
	 */
	public List<Itemclass> find(Itemclass param, String order,
			int currPage, int pageSize, boolean cache);
	
	/**
	 * 查询
	 */
	public List<Itemclass> find(Itemclass param);

	/**
	 * 根据id查询
	 * 
	 * @param id
	 * @return
	 */
	public Itemclass findById(Integer id);

	/**
	 * 统计
	 * 
	 * @param info
	 * @return
	 */
	public int count(Itemclass param, boolean cache);

	/**
	 * 更新
	 * 
	 * @param templet
	 */
	public void update(Itemclass param);

	/**
	 * 删除
	 * 
	 * @param id
	 */
	public void del(String id);

}
