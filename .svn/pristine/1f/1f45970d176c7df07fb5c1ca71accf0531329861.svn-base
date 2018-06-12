package com.gsccs.cms.core.service;

import java.util.List;

import com.gsccs.cms.core.model.Templet;
import com.gsccs.cms.core.model.TempletExample.Criteria;

/**
 * 
 * 模板服务
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
public interface TempletService {

	/**
	 * 上升
	 * 
	 * @param templet
	 */
	public void up(Templet templet);

	/**
	 * 下降
	 * 
	 * @param templet
	 */
	public void down(Templet templet);

	/**
	 * 获取同级最大排序号
	 * 
	 * @param parid
	 * @return
	 */
	public int maxNum();

	/**
	 * 分页查询
	 * 
	 * @param info
	 * @param order
	 * @param currPage
	 * @param pageSize
	 * @param loginAdmin
	 * @return
	 */
	public List<Templet> find(Templet templet, String order, int currPage,
			int pageSize);

	/**
	 * 查询
	 * 
	 * @param info
	 * @param order
	 * @param currPage
	 * @param pageSize
	 * @param loginAdmin
	 * @return
	 */
	public List<Templet> findAll(Templet templet, String order);
	

	/**
	 * 统计
	 * 
	 * @param info
	 * @return
	 */
	public int count(Templet templet);

	/**
	 * 处理查询条件
	 * 
	 * @param info
	 * @param criteria
	 */
	public void proSearchParam(Templet templet, Criteria criteria);
	
	
	
	public void proSearchParam(List<String> sList ,Templet templet, Criteria criteria);

	/**
	 * 根据id查询
	 * 
	 * @param id
	 * @return
	 */
	public Templet findById(String id);

	/**
	 * 更新
	 * 
	 * @param templet
	 */
	public void update(Templet templet);

	/**
	 * 添加
	 * 
	 * @param templet
	 * @return
	 */
	public String add(Templet templet);
	
	/**
	 * 站点模板分页查询
	 * @param templet
	 * @param order
	 * @param currPage
	 * @param pageSize
	 * @return
	 */
	public List<Templet> findPageTemSite(Templet templet,String order,int currPage,int pageSize);
	
	public List<Templet> findBysiteId(List<String> sList,Templet templet, String order, int currPage,
			int pageSize);
	public List<Templet> findBysiteId(List<String> sList,Templet templet);
	
	public List<Templet> findAllBysiteId(List<String> sList,Templet templet, String order);
	
	public List<Templet> findAllBysiteNotId(List<String> sList,Templet templet, String order, int currPage,
			int pageSize);;
}
