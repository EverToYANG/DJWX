package com.gsccs.cms.core.service;

import java.util.List;

import com.gsccs.cms.core.model.Job;
import com.gsccs.cms.core.model.JobExample.Criteria;

/**
 * 定时任务服务
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
public interface JobService {

	/**
	 * 分页查询
	 */
	public List<Job> find(Job job,String order,int currPage,int pageSize,boolean cache);
	/**
	 * 统计
	 * @param info
	 * @return
	 */
	public int count(Job job,boolean cache);

	/**
	 * 处理查询条件
	 * @param info
	 * @param criteria
	 */
	public void proSearchParam(Job job,Criteria criteria);

	/**
	 * 根据id查询
	 * @param id
	 * @param cache
	 * @return
	 */
	public Job findById(String id,boolean cache);
	/**
	 * 更新
	 * @param question
	 */
	public void update(Job Job);
	/**
	 * 添加
	 * @param question
	 * @return
	 */
	public String add(Job job);
	/**
	 * 删除 
	 * @param id
	 */
	public void del(String id);

}
