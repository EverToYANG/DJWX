package com.gsccs.cms.member.service;

import java.util.List;

import com.gsccs.cms.member.model.Memberauth;
import com.gsccs.cms.member.model.MemberauthExample.Criteria;

/**
 * 会员权限服务
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
public interface MemberauthService {


	/**
	 * 分页查询
	 */
	public List<Memberauth> find(Memberauth memberauth,String order,int currPage,int pageSize);
	/**
	 * 查询
	 */
	public List<Memberauth> find(Memberauth memberauth,String order);
	/**
	 * 统计
	 * @param info
	 * @return
	 */
	public int count(Memberauth memberauth);

	/**
	 * 处理查询条件
	 * @param info
	 * @param criteria
	 */
	public void proSearchParam(Memberauth Memberauth,Criteria criteria);

	/**
	 * 根据id查询
	 * @param id
	 * @param cache
	 * @return
	 */
	public Memberauth findById(String id);
	/**
	 * 更新
	 * @param question
	 */
	public void update(Memberauth memberauth);
	/**
	 * 添加
	 * @param question
	 * @return
	 */
	public String add(Memberauth memberauth);
	/**
	 * 删除 
	 * @param id
	 */
	public void del(String id);
}
