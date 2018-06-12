package com.gsccs.cms.core.service.impl;

import java.util.List;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gsccs.cms.core.dao.SensitiveMapper;
import com.gsccs.cms.core.model.Sensitive;
import com.gsccs.cms.core.model.SensitiveExample;
import com.gsccs.cms.core.model.SensitiveExample.Criteria;
import com.gsccs.cms.core.service.SensitiveService;

/**
 * 敏感词相关服务
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
@Service
public class SensitiveServiceImpl implements SensitiveService {

	@Resource
	private SensitiveMapper sensitiveMapper;

	/**
	 * 替换处理
	 * 
	 * @param content
	 * @return
	 */
	public String replace(String content) {
		List<Sensitive> list = find(null, "", true);
		if (list != null && list.size() > 0) {
			for (int i = 0; i < list.size(); i++) {
				if (StringUtils.isNotEmpty(content)) {
					content = content.replace(list.get(i).getSensitiveword(),
							list.get(i).getReplaceto());
				}
			}
		}
		return content;
	}

	/**
	 * 分页查询
	 */
	public List<Sensitive> find(Sensitive sensitive, String order,
			int currPage, int pageSize) {
		SensitiveExample example = new SensitiveExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(sensitive, criteria);
		if (order != null && order.trim().length() > 0) {
			example.setOrderByClause(order);
		}
		example.setCurrPage(currPage);
		example.setPageSize(pageSize);
		return sensitiveMapper.selectPageByExample(example);
	}

	/**
	 * 查询
	 */
	public List<Sensitive> find(Sensitive Sensitive, String order, boolean cache) {
		SensitiveExample example = new SensitiveExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(Sensitive, criteria);
		if (order != null && order.trim().length() > 0) {
			example.setOrderByClause(order);
		}
		if (cache) {
			return sensitiveMapper.selectByExampleCache(example);
		}
		return sensitiveMapper.selectByExample(example);
	}

	/**
	 * 统计
	 * 
	 * @param info
	 * @return
	 */
	public int count(Sensitive Sensitive) {
		SensitiveExample example = new SensitiveExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(Sensitive, criteria);
		return sensitiveMapper.countByExample(example);
	}

	/**
	 * 处理查询条件
	 * 
	 * @param info
	 * @param criteria
	 */
	public void proSearchParam(Sensitive sensitive, Criteria criteria) {
		if (sensitive != null) {
			if (sensitive.getSensitiveword() != null
					&& sensitive.getSensitiveword().trim().length() > 0) {
				criteria.andSensitivewordLike("%"
						+ sensitive.getSensitiveword().trim() + "%");
			}
			if (sensitive.getReplaceto() != null
					&& sensitive.getReplaceto().trim().length() > 0) {
				criteria.andReplacetoLike("%" + sensitive.getReplaceto().trim()
						+ "%");
			}
		}
	}

	/**
	 * 根据id查询
	 * 
	 * @param id
	 * @param cache
	 * @return
	 */
	public Sensitive findById(String id) {
		return sensitiveMapper.selectByPrimaryKey(id);
	}

	/**
	 * 更新
	 * 
	 * @param question
	 */
	public void update(Sensitive sensitive) {
		sensitiveMapper.updateByPrimaryKeySelective(sensitive);
	}

	/**
	 * 添加
	 * 
	 * @param question
	 * @return
	 */
	public String add(Sensitive sensitive) {
		sensitive.setId(UUID.randomUUID().toString());
		sensitiveMapper.insert(sensitive);
		return sensitive.getId();
	}

	/**
	 * 删除
	 * 
	 * @param id
	 */
	public void del(String id) {
		sensitiveMapper.deleteByPrimaryKey(id);
	}

	public SensitiveMapper getSensitiveMapper() {
		return sensitiveMapper;
	}

	public void setSensitiveMapper(SensitiveMapper sensitiveMapper) {
		this.sensitiveMapper = sensitiveMapper;
	}
}
