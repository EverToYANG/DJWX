package com.gsccs.cms.weixin.service;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gsccs.cms.weixin.dao.WxAppMapper;
import com.gsccs.cms.weixin.model.WxApp;
import com.gsccs.cms.weixin.model.WxAppExample;
import com.gsccs.cms.weixin.model.WxAppExample.Criteria;

@Service(value = "wxAppService")
public class WxAppServiceImpl implements WxAppService {

	@Autowired
	private WxAppMapper wxAppMapper;

	@Override
	public List<WxApp> find(WxApp param, String order, int currPage,
			int pageSize, boolean iscache) {
		WxAppExample example = new WxAppExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(param, criteria);
		example.setCurrPage(currPage);
		example.setPageSize(pageSize);
		return wxAppMapper.selectPageByExample(example);
	}

	@Override
	public int count(WxApp brands) {
		WxAppExample example = new WxAppExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(brands, criteria);
		return wxAppMapper.countByExample(example);
	}

	@Override
	public List<WxApp> find(WxApp param, String order) {
		WxAppExample example = new WxAppExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(param, criteria);
		return wxAppMapper.selectByExample(example);
	}

	@Override
	public WxApp findById(String id) {
		return wxAppMapper.selectByPrimaryKey(id);
	}

	@Override
	public void update(WxApp wxApp) {
		wxAppMapper.updateByPrimaryKey(wxApp);
	}

	@Override
	public void add(WxApp param) {
		if (null == param) {
			return;
		}
		wxAppMapper.insert(param);
	}

	@Override
	public void del(String id) {
		wxAppMapper.deleteByPrimaryKey(id);
	}

	/**
	 * 处理查询条件
	 * 
	 * @param info
	 * @param criteria
	 */
	public void proSearchParam(WxApp param, WxAppExample.Criteria criteria) {
		if (param != null) {
			if (param.getId() != null) {
				criteria.andIdEqualTo(param.getId());
			}

			if (StringUtils.isNotEmpty(param.getTitle())) {
				criteria.andTitleLike("%" + param.getTitle() + "%");
			}

			if (StringUtils.isNotEmpty(param.getStatus())) {
				criteria.andStatusEqualTo(param.getStatus());
			}
		}
	}

}
