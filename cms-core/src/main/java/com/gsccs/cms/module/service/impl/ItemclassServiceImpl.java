package com.gsccs.cms.module.service.impl;

import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gsccs.cms.module.dao.ItemclassMapper;
import com.gsccs.cms.module.model.Itemclass;
import com.gsccs.cms.module.model.ItemclassExample;
import com.gsccs.cms.module.model.ItemclassExample.Criteria;
import com.gsccs.cms.module.service.ItemclassService;

/**
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
@Service
public class ItemclassServiceImpl implements ItemclassService {

	@Resource
	private ItemclassMapper itemclassMapper;

	/**
	 * 添加
	 * 
	 * @param Itemclass
	 * @return
	 */
	public void insert(Itemclass param) {
		itemclassMapper.insert(param);
	}

	/**
	 * 分页查询
	 */
	public List<Itemclass> find(Itemclass param, String order,
			int currPage, int pageSize, boolean cache) {
		ItemclassExample example = new ItemclassExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(param, criteria);
		if (order != null && order.trim().length() > 0) {
			example.setOrderByClause(order);
		}
		example.setCurrPage(currPage);
		example.setPageSize(pageSize);
		if (cache) {
			return itemclassMapper.selectPageByExampleCache(example);
		} else {
			return itemclassMapper.selectPageByExample(example);
		}
	}

	/**
	 * 根据id查询
	 * 
	 * @param id
	 * @return
	 */
	public Itemclass findById(Integer id) {
		return itemclassMapper.selectByPrimaryKey(id);
	}

	/**
	 * 统计
	 * 
	 * @param info
	 * @return
	 */
	public int count(Itemclass param, boolean cache) {
		ItemclassExample example = new ItemclassExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(param, criteria);
		if (cache) {
			return itemclassMapper.countByExampleCache(example);
		} else {
			return itemclassMapper.countByExample(example);
		}
	}

	/**
	 * 处理查询条件
	 * 
	 * @param info
	 * @param criteria
	 */
	public void proSearchParam(Itemclass param, Criteria criteria) {
		if (param != null) {
			
			if (param.getTitle() != null && param.getTitle().trim().length() > 0) {
				criteria.andTitleLike("%" + param.getTitle().trim() + "%");
			}
			
			if (param.getCorpid() != null
					&& param.getCorpid().trim().length() > 0) {
				criteria.andCorpidEqualTo(param.getCorpid().trim());
			}
			
			if (param.getState() != null && param.getState().trim().length() > 0) {
				
			}

		}
	}

	/**
	 * 更新
	 * 
	 * @param templet
	 */
	public void update(Itemclass param) {
		itemclassMapper.updateByPrimaryKeySelective(param);
	}

	/**
	 * 删除
	 * 
	 * @param id
	 */
	public void del(String id) {
		itemclassMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<Itemclass> find(Itemclass param) {
		ItemclassExample example = new ItemclassExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(param, criteria);
		example.setOrderByClause("ordernum");
		return itemclassMapper.selectByExample(example);
	}

}
