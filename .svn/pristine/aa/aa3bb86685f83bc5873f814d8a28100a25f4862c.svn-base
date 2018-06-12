package com.gsccs.cms.course.service;

import java.util.List;

import com.gsccs.cms.course.model.Courselog;
import com.gsccs.cms.course.model.CourselogExample.Criteria;

/**
 * 日志相关服务
 * 
 * @or x.d zhang
 * @version 1.0
 * 
 */
public interface LearnlogService {

	/**
	 * 分页查询
	 */
	public List<Courselog> find(Courselog Learnlog, String order, int currPage,
			int pageSize);

	/**
	 * 查询
	 */
	public List<Courselog> find(Courselog Learnlog, String order);

	/**
	 * 统计
	 * 
	 * @param info
	 * @return
	 */
	public int count(Courselog creditlog);

	/**
	 * 处理查询条件
	 * 
	 * @param info
	 * @param criteria
	 */
	public void proSearchParam(Courselog Learnlog, Criteria criteria);

	/**
	 * 根据id查询
	 * 
	 * @param id
	 * @param cache
	 * @return
	 */
	public Courselog findById(String id);

	/**
	 * 更新
	 * 
	 * @param question
	 */
	public void update(Courselog Learnlog);

	/**
	 * 添加
	 * 
	 * @param question
	 * @return
	 */
	public String add(Courselog Learnlog);

	/**
	 * 删除
	 * 
	 * @param id
	 */
	public void del(String id);

}
