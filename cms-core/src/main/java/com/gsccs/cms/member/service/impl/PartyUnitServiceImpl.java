package com.gsccs.cms.member.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.gsccs.cms.member.dao.PartyUnitMapper;
import com.gsccs.cms.member.model.PartyUnit;
import com.gsccs.cms.member.model.PartyUnitExample;
import com.gsccs.cms.member.model.PartyUnitExample.Criteria;
import com.gsccs.cms.member.service.PartyUnitService;

/**
 * 党支部服务
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
@Service
public class PartyUnitServiceImpl implements PartyUnitService {

	@Resource
	private PartyUnitMapper partyUnitMapper;

	/**
	 * 查询会员组下授权
	 * 
	 * @param groupid
	 * @return
	 */
	public List<PartyUnit> findByCorpid(String corpid) {
		if(StringUtils.isEmpty(corpid)){
			return null;
		}
		PartyUnitExample example = new PartyUnitExample();
		Criteria criteria = example.createCriteria();
		criteria.andCorpidEqualTo(corpid);
		return partyUnitMapper.selectByExample(example);
	}

	/**
	 * 删除会员组下授权
	 * 
	 * @param groupid
	 * @return
	 */
	public void delByGroup(String groupid) {
		PartyUnitExample example = new PartyUnitExample();
		Criteria criteria = example.createCriteria();
		criteria.andCorpidEqualTo(groupid);
		partyUnitMapper.deleteByExample(example);
	}

	/**
	 * 添加
	 * 
	 * @param question
	 * @return
	 */
	public Long add(PartyUnit partyUnit) {
		if (null != partyUnit) {
			partyUnitMapper.insert(partyUnit);
			return partyUnit.getId();
		}
		return null;
	}

	@Override
	public List<PartyUnit> find(PartyUnit param, String order, int currPage,
			int pageSize) {
		PartyUnitExample example = new PartyUnitExample();
		PartyUnitExample.Criteria c = example.createCriteria();
		proSearchParam(param, c);
		if (order != null && order.trim().length() > 0) {
			example.setOrderByClause(order);
		}
		example.setCurrPage(currPage);
		example.setPageSize(pageSize);
		return partyUnitMapper.selectPageByExample(example);
	}

	@Override
	public int count(PartyUnit param) {
		PartyUnitExample example = new PartyUnitExample();
		PartyUnitExample.Criteria c = example.createCriteria();
		proSearchParam(param, c);
		return partyUnitMapper.countByExample(example);
	}

	/**
	 * 处理查询条件
	 * 
	 * @param info
	 * @param criteria
	 */
	public void proSearchParam(PartyUnit param,
			PartyUnitExample.Criteria criteria) {
		if (param != null) {
			if (param.getCorpid() != null
					&& param.getCorpid().trim().length() > 0) {
				criteria.andCorpidEqualTo(param.getCorpid().trim());
			}
			if (param.getName() != null && param.getName().trim().length() > 0) {
				criteria.andNameLike("%" + param.getName().trim() + "%");
			}
		}
	}

	@Override
	public PartyUnit findById(Long id) {
		return partyUnitMapper.selectByPrimaryKey(id);
	}

	@Override
	public void insert(PartyUnit unit) {
		if (null != unit) {
			partyUnitMapper.insert(unit);
		}
	}

	@Override
	public void update(PartyUnit unit) {
		if (null != unit) {
			partyUnitMapper.updateByPrimaryKeySelective(unit);
		}
	}

	@Override
	public void del(Long id) {
		partyUnitMapper.deleteByPrimaryKey(id);
	}

}
