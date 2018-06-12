package com.gsccs.cms.member.service;

import java.util.List;

import com.gsccs.cms.member.model.Creditrule;
import com.gsccs.cms.member.model.Member;
import com.gsccs.cms.member.model.CreditruleExample.Criteria;

/**
 * 积分规则相关服务
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
public interface CreditruleService {
	/**
	 * 分页查询
	 */
	public List<Creditrule> find(Creditrule Creditrule, String order,
			int currPage, int pageSize);

	/**
	 * 查询
	 */
	public List<Creditrule> find(Creditrule Creditrule, String order,
			boolean cache);

	/**
	 * 统计
	 * 
	 * @param info
	 * @return
	 */
	public int count(Creditrule Creditrule);

	/**
	 * 处理查询条件
	 * 
	 * @param info
	 * @param criteria
	 */
	public void proSearchParam(Creditrule Creditrule, Criteria criteria);

	/**
	 * 根据id查询
	 * 
	 * @param id
	 * @param cache
	 * @return
	 */
	public Creditrule findById(String id);

	/**
	 * 更新
	 * 
	 * @param question
	 */
	public void update(Creditrule Creditrule);

	/**
	 * 添加
	 * 
	 * @param question
	 * @return
	 */
	public String add(Creditrule Creditrule);

	/**
	 * 删除
	 * 
	 * @param id
	 */
	public void del(String id);

	/**
	 * 积分经验处理
	 * 
	 * @param member
	 * @param rulecode
	 */
	public Member credit(Member member, String rulecode);

	/**
	 * 查询指定编码规则
	 * 
	 * @param rulecode
	 * @return
	 */
	public Creditrule findByCode(String rulecode);
}
