package com.gsccs.cms.module.service.impl;

import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.gsccs.cms.core.model.Channel;
import com.gsccs.cms.core.model.Content;
import com.gsccs.cms.module.dao.CollectMapper;
import com.gsccs.cms.module.model.Collect;
import com.gsccs.cms.module.model.CollectExample;
import com.gsccs.cms.module.model.CollectExample.Criteria;
import com.gsccs.cms.module.service.CollectService;

/**
 * 信息收藏服务操作
 * 
 * @author x.d zhang
 * @version 3.0
 */
@Service
public class CollectServiceImpl implements CollectService {

	@Resource
	private CollectMapper collectMapper;

	/**
	 * 添加
	 * 
	 * @param store
	 * @return
	 */
	public String insert(Collect store) {
		if (store != null) {
			store.setId(UUID.randomUUID().toString());
			collectMapper.insert(store);
			return store.getId();
		}
		return "";
	}

	/**
	 * 删除
	 * 
	 * @param id
	 */
	public void del(String id) {
		collectMapper.deleteByPrimaryKey(id);
	}

	/**
	 * 分页查询
	 */
	public List<Collect> find(Collect param, String order, int currPage,
			int pageSize) {
		CollectExample example = new CollectExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(param, criteria);
		if (order != null && order.trim().length() > 0) {
			example.setOrderByClause(order);
		}else{
			example.setOrderByClause("addtime desc");
		}
		example.setCurrPage(currPage);
		example.setPageSize(pageSize);
		return collectMapper.selectPageByExample(example);
	}

	/**
	 * 统计
	 * 
	 * @param info
	 * @return
	 */
	public int count(Collect store) {
		CollectExample example = new CollectExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(store, criteria);
		return collectMapper.countByExample(example);
	}

	/**
	 * 处理查询条件
	 * 
	 * @param info
	 * @param criteria
	 */
	public void proSearchParam(Collect param, Criteria criteria) {
		if (param != null) {
			if (StringUtils.isNotEmpty(param.getMemberid())) {
				criteria.andMemberidEqualTo(param.getMemberid());
			}
			if (StringUtils.isNotEmpty(param.getArticleid())) {
				criteria.andArticleidEqualTo(param.getArticleid());
			}
			if (StringUtils.isNotEmpty(param.getObjtype())) {
				criteria.andObjtypeEqualTo(param.getObjtype());
			}
			if (StringUtils.isNotEmpty(param.getSiteid())) {
				criteria.andSiteidEqualTo(param.getSiteid());
			}
			if (StringUtils.isNotEmpty(param.getChannelid())) {
				criteria.andChannelidEqualTo(param.getChannelid());
			}
		}
	}

	@Override
	public List<Content> findArticleList(Collect collect, String order,
			int currPage, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Channel> findChannelList(Collect collect, String order,
			int currPage, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

}
