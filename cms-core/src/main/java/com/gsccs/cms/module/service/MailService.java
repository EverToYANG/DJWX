package com.gsccs.cms.module.service;

import java.util.List;

import com.gsccs.cms.module.model.Mail;
import com.gsccs.cms.module.model.MailExample.Criteria;

public interface MailService{

	

	/**
	 * 添加
	 * @param mail
	 * @return
	 */
	public String insert(Mail mail);

	/**
	 * 分页查询
	 */
	public List<Mail> find(Mail mail,String order,int currPage,int pageSize,boolean cache);
	/**
	 * 根据id查询
	 * @param id
	 * @return
	 */
	public Mail findById(String id);
	/**
	 * 根据querycode查询
	 * @param id
	 * @return
	 */
	public Mail findByQuerycode(String querycode,boolean cache);
	/**
	 * 统计
	 * @param info
	 * @return
	 */
	public int count(Mail mail,boolean cache);
	/**
	 * 处理查询条件
	 * @param info
	 * @param criteria
	 */
	public void proSearchParam(Mail mail,Criteria criteria);
	/**
	 * 更新
	 * @param templet
	 */
	public void update(Mail mail);
	/**
	 * 删除 
	 * @param id
	 */
	public void del(String id);
}
