package com.gsccs.cms.member.service.impl;

import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gsccs.cms.member.dao.MembergroupMapper;
import com.gsccs.cms.member.model.Membergroup;
import com.gsccs.cms.member.model.MembergroupExample;
import com.gsccs.cms.member.model.MembergroupExample.Criteria;
import com.gsccs.cms.member.service.MembergroupService;
/**
 * 会员组服务
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
@Service
public class MembergroupServiceImpl implements MembergroupService{

	@Resource
	private MembergroupMapper membergroupMapper;

	/**
	 * 查询
	 */
	public List<Membergroup> find(Membergroup Membergroup,String order){
		MembergroupExample example=new MembergroupExample();
		Criteria criteria=example.createCriteria();
		proSearchParam(Membergroup, criteria);
		if (order!=null && order.trim().length()>0) {
			example.setOrderByClause(order);
		}
		return membergroupMapper.selectByExample(example);
	}
	/**
	 * 处理查询条件
	 * @param info
	 * @param criteria
	 */
	public void proSearchParam(Membergroup membergroup,Criteria criteria){
		if (membergroup!=null ) {
			if (membergroup.getType()!=null) {
				criteria.andTypeEqualTo(membergroup.getType());
			}
		}
	}


	/**
	 * 根据id查询
	 * @param id
	 * @param cache
	 * @return
	 */
	public Membergroup findById(String id){
		return membergroupMapper.selectByPrimaryKey(id);
	}
	/**
	 * 更新
	 * @param site
	 */
	public void update(Membergroup membergroup){
		membergroupMapper.updateByPrimaryKey(membergroup);
	}
	/**
	 * 添加
	 * @param site
	 * @return
	 */
	public String insert(Membergroup membergroup){
		membergroup.setId(UUID.randomUUID().toString());
		membergroupMapper.insert(membergroup);
		return membergroup.getId();
	}
	/**
	 * 删除 
	 * @param id
	 */
	public void del(String id){
		membergroupMapper.deleteByPrimaryKey(id);
	}
	/**
	 * 根据经验查询所处经验会员组
	 * @param experience
	 * @return
	 */
	public Membergroup findByExperience(int experience){
		MembergroupExample example=new MembergroupExample();
		Criteria criteria=example.createCriteria();
		criteria.andBeginexperienceLessThanOrEqualTo(experience);
		criteria.andTypeEqualTo(0);
		example.setOrderByClause(" beginexperience DESC ");
		example.setCurrPage(1);
		example.setPageSize(1);
		List<Membergroup> list = membergroupMapper.selectPageByExample(example);
		if (list!=null && list.size()>0) {
			return list.get(0);
		}
		return null;
	}
	public MembergroupMapper getMembergroupMapper() {
		return membergroupMapper;
	}

	public void setMembergroupMapper(MembergroupMapper membergroupMapper) {
		this.membergroupMapper = membergroupMapper;
	}
}
