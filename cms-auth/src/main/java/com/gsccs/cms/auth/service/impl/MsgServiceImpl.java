package com.gsccs.cms.auth.service.impl;

import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.gsccs.cms.auth.dao.MsgMapper;
import com.gsccs.cms.auth.model.Msg;
import com.gsccs.cms.auth.model.MsgExample;
import com.gsccs.cms.auth.model.MsgExample.Criteria;
import com.gsccs.cms.auth.service.MsgService;

@Service
public class MsgServiceImpl implements MsgService{

	@Resource
	private MsgMapper msgMapper;
	

	/**
	 * 分页查询
	 */
	public List<Msg> find(Msg Msg,String order,int currPage,int pageSize){
		MsgExample example=new MsgExample();
		Criteria criteria=example.createCriteria();
		proSearchParam(Msg, criteria);
		if (order!=null && order.trim().length()>0) {
			example.setOrderByClause(order);
		}
		example.setCurrPage(currPage);
		example.setPageSize(pageSize);
		return msgMapper.selectPageByExample(example);
	}
	/**
	 * 统计
	 * @param info
	 * @return
	 */
	public int count(Msg msg){
		MsgExample example=new MsgExample();
		Criteria criteria=example.createCriteria();
		proSearchParam(msg, criteria);
		return msgMapper.countByExample(example);
	}

	/**
	 * 处理查询条件
	 * @param info
	 * @param criteria
	 */
	public void proSearchParam(Msg msg,Criteria criteria){
		if (msg!=null ) {
			if (StringUtils.isNotEmpty(msg.getMemberid())) {
				criteria.andMemberidEqualTo(msg.getMemberid());
			}
			if (StringUtils.isNotEmpty(msg.getMembername())) {
				criteria.andSql("(membername like '%"+msg.getMembername().trim()+"%' or username like '%"+msg.getMembername().trim()+"%' )");
			}
			if (StringUtils.isNotEmpty(msg.getTomemberid())) {
				criteria.andTomemberidEqualTo(msg.getTomemberid());
			}
			if (StringUtils.isNotEmpty(msg.getTomembername())) {
				criteria.andSql("(tomembername like '%"+msg.getMembername().trim()+"%' or tousername like '%"+msg.getMembername().trim()+"%' )");
			}
			if (StringUtils.isNotEmpty(msg.getTitle())) {
				criteria.andTitleLike("%"+msg.getTitle()+"%");
			}
			if (StringUtils.isNotEmpty(msg.getContent())) {
				criteria.andContentLike("%"+msg.getContent()+"%");
			}
			if (StringUtils.isNotEmpty(msg.getIsread())) {
				criteria.andIsreadEqualTo(msg.getIsread());
			}
			if (StringUtils.isNotEmpty(msg.getIssys())) {
				criteria.andIssysEqualTo(msg.getIssys());
			}
		}
	}

	/**
	 * 根据id查询
	 * @param id
	 * @param cache
	 * @return
	 */
	public Msg findById(String id){
		return msgMapper.selectByPrimaryKey(id);
	}
	/**
	 * 更新
	 * @param question
	 */
	public void update(Msg msg){
		msgMapper.updateByPrimaryKeySelective(msg);
	}
	/**
	 * 添加
	 * @param question
	 * @return
	 */
	public String add(Msg msg){
		msg.setId(UUID.randomUUID().toString());
		msgMapper.insert(msg);
		return msg.getId();
	}
	/**
	 * 删除 
	 * @param id
	 */
	public void del(String id){
		msgMapper.deleteByPrimaryKey(id);
	}
}
