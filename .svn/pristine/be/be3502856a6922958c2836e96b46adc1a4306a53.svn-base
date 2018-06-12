package com.gsccs.cms.module.service;

import java.util.List;

import com.gsccs.cms.module.model.Report;
import com.gsccs.cms.module.model.ReportExample.Criteria;

/**
 * 信息公开相关服务
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
public interface ReportService{
	/**
	 * 添加
	 * @param report
	 * @return
	 */
	public String insert(Report report);
	/**
	 * 分页查询
	 */
	public List<Report> find(Report report,String order,int currPage,int pageSize,boolean cache);
	/**
	 * 根据id查询
	 * @param id
	 * @return
	 */
	public Report findById(String id);
	/**
	 * 根据querycode查询
	 * @param id
	 * @return
	 */
	public Report findByQuerycode(String querycode,boolean cache);
	/**
	 * 统计
	 * @param info
	 * @return
	 */
	public int count(Report report,boolean cache);
	/**
	 * 处理查询条件
	 * @param info
	 * @param criteria
	 */
	public void proSearchParam(Report report,Criteria criteria);
	/**
	 * 更新
	 * @param templet
	 */
	public void update(Report report);
	/**
	 * 删除 
	 * @param id
	 */
	public void del(String id);
}
