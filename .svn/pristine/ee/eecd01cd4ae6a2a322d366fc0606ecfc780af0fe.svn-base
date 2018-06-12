package com.gsccs.cms.module.service;

import java.util.List;

import com.gsccs.cms.module.model.Resume;
import com.gsccs.cms.module.model.ResumeExample.Criteria;

/**
 * 简历相关服务
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
public interface ResumeService {

	/**
	 * 分页查询
	 */
	public List<Resume> find(Resume resume, String order, int currPage,
			int pageSize);

	/**
	 * 统计
	 * 
	 * @param resume
	 * @return
	 */
	public int count(Resume resume);

	/**
	 * 处理查询条件
	 * 
	 * @param resume
	 * @param criteria
	 */
	public void proSearchParam(Resume resume, Criteria criteria);

	/**
	 * 根据id查询
	 * 
	 * @param id
	 * @param cache
	 * @return
	 */
	public Resume findById(String id);

	/**
	 * 更新
	 * 
	 * @param question
	 */
	public void update(Resume resume);

	/**
	 * 添加
	 * 
	 * @param question
	 * @return
	 */
	public String add(Resume resume);

	/**
	 * 删除
	 * 
	 * @param id
	 */
	public void del(String id);

}
