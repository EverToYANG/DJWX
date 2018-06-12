package com.gsccs.cms.member.service.impl;

import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.gsccs.cms.member.dao.PartyMemberMapper;
import com.gsccs.cms.member.model.PartyMember;
import com.gsccs.cms.member.model.PartyMemberExample;
import com.gsccs.cms.member.service.PartyUserService;

/**
 * 会员相关服务
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
@Service
public class PartyUserServiceImpl implements PartyUserService {

	@Resource
	private PartyMemberMapper partyMemberMapper;
	
	/**
	 * 分页查询
	 */
	public List<PartyMember> find(PartyMember member, String order, int currPage,
			int pageSize) {
		PartyMemberExample example = new PartyMemberExample();
		PartyMemberExample.Criteria criteria = example.createCriteria();
		proSearchParam(member, criteria);
		if (order != null && order.trim().length() > 0) {
			example.setOrderByClause(order);
		}
		example.setCurrPage(currPage);
		example.setPageSize(pageSize);
		return partyMemberMapper.selectPageByExample(example);
	}

	/**
	 * 查询
	 */
	public List<PartyMember> find(PartyMember member, String order) {
		PartyMemberExample example = new PartyMemberExample();
		PartyMemberExample.Criteria criteria = example.createCriteria();
		proSearchParam(member, criteria);
		if (order != null && order.trim().length() > 0) {
			example.setOrderByClause(order);
		}
		return partyMemberMapper.selectByExample(example);
	}

	/**
	 * 统计
	 * 
	 * @param info
	 * @return
	 */
	public int count(PartyMember member) {
		PartyMemberExample example = new PartyMemberExample();
		PartyMemberExample.Criteria criteria = example.createCriteria();
		proSearchParam(member, criteria);
		return partyMemberMapper.countByExample(example);
	}

	/**
	 * 处理查询条件
	 * 
	 * @param info
	 * @param criteria
	 */
	public void proSearchParam(PartyMember member, PartyMemberExample.Criteria criteria) {
		if (member != null) {
			if (member.getName() != null
					&& member.getName().trim().length() > 0) {
				criteria.andMNameLike("%" + member.getName().trim() + "%");
			}
			
			if (StringUtils.isNotEmpty(member.getPhone())) {
				criteria.andPhoneEqualTo(member.getPhone());
			}
			
			if (StringUtils.isNotEmpty(member.getIdcode())) {
				criteria.andIdcodeEqualTo(member.getIdcode());
			}
			
			if (StringUtils.isNotEmpty(member.getUnitid())) {
				criteria.andUnitidEqualTo(member.getUnitid());
			}
			if (StringUtils.isNotEmpty(member.getEdu())) {
				criteria.andEduEqualTo(member.getEdu());
			}
			if (member.getGroupid() != null
					&& member.getGroupid().trim().length() > 0) {
				criteria.andGroupidEqualTo(member.getGroupid().trim());
			}
			if (member.getCorpid() != null && member.getCorpid().length() > 0) {
				criteria.andSql(" unitid in(select id from party_unit where corpid='"+member.getCorpid()+"')");
			}
			if (member.getStatus() != null
					&& member.getStatus().trim().length() > 0) {
				criteria.andStatusEqualTo(member.getStatus().trim());
			}
		}
	}

	/**
	 * 根据id查询
	 * 
	 * @param id
	 * @return
	 */
	public PartyMember findById(String id) {
		return partyMemberMapper.selectByPrimaryKey(id);
	}

	/**
	 * 更新
	 * 
	 * @param question
	 */
	public void update(PartyMember member) {
		partyMemberMapper.updateByPrimaryKeySelective(member);
	}

	/**
	 * 添加
	 * 
	 * @param 
	 * @return
	 */
	public String add(PartyMember member) {
		if (null == member){
			return null;
		}
		member.setId(member.getIdcode());
		partyMemberMapper.insert(member);
		return member.getId();
	}

	/**
	 * 删除
	 * 
	 * @param id
	 */
	public void del(String id) {
		partyMemberMapper.deleteByPrimaryKey(id);
	}

	/**
	 * 判断会员是否存在
	 * 
	 * @param member
	 * @return
	 */
	public boolean have(PartyMember member) {
		PartyMemberExample example = new PartyMemberExample();
		PartyMemberExample.Criteria criteria = example.createCriteria();
		//criteria.andWxopenidEqualTo(member.getWxopenid().trim());
		return partyMemberMapper.countByExample(example) > 0;
	}

	
	/**
	 * 启用/禁用
	 * 
	 * @param id
	 * @param isok
	 */
	public void isok(String id, String isok) {
		PartyMember member = new PartyMember();
		member.setId(id);
		member.setStatus(isok);
		partyMemberMapper.updateByPrimaryKeySelective(member);
	}

	@Override
	public PartyMember findByIdcode(String idcode) {
		return partyMemberMapper.selectByIdcode(idcode);
	}

}
