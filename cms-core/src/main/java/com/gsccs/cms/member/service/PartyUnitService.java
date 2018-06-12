package com.gsccs.cms.member.service;

import java.util.List;

import com.gsccs.cms.auth.model.Unit;
import com.gsccs.cms.member.model.PartyUnit;

/**
 * 党支部服务
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
public interface PartyUnitService {
	
	
	/**
	 * 分页查询
	 */
	public List<PartyUnit> find(PartyUnit param, String order, int currPage, int pageSize);
	
	/**
	 * 统计
	 * 
	 * @param info
	 * @return
	 */
	public int count(PartyUnit param);


	/**
	 * 根据id查询
	 * 
	 * @param id
	 * @return
	 */
	public PartyUnit findById(Long id);
	
	/**
	 * 添加
	 * 
	 * @param unit
	 */
	public void insert(PartyUnit unit);

	/**
	 * 编辑
	 * 
	 * @param unit
	 */
	public void update(PartyUnit unit);

	
	/**
	 * 查询党支部
	 * 
	 * @param groupid
	 * @return
	 */
	public List<PartyUnit> findByCorpid(String corpid);

	/**
	 * 添加
	 * 
	 * @param question
	 * @return
	 */
	public Long add(PartyUnit partyUnit);
	
	
	public void del(Long id);

}
