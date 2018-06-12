package com.gsccs.cms.core.service.impl;

import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.gsccs.cms.core.dao.HtmlquartzMapper;
import com.gsccs.cms.core.model.Htmlquartz;
import com.gsccs.cms.core.model.HtmlquartzExample;
import com.gsccs.cms.core.model.HtmlquartzExample.Criteria;
import com.gsccs.cms.core.service.HtmlquartzService;

/**
 * 静态化调度服务类
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
@Service("htmlquartzService")
public class HtmlquartzServiceImpl implements HtmlquartzService {

	@Resource
	private HtmlquartzMapper htmlquartzMapper;

	/**
	 * 更新
	 * 
	 * @param site
	 */
	public void update(Htmlquartz htmlquartz) {
		htmlquartzMapper.updateByPrimaryKey(htmlquartz);
	}

	/**
	 * 添加
	 * 
	 * @param site
	 * @return
	 */
	public String insert(Htmlquartz htmlquartz) {
		htmlquartz.setId(UUID.randomUUID().toString());
		htmlquartzMapper.insert(htmlquartz);
		return htmlquartz.getId();
	}

	/**
	 * 根据id查询
	 * 
	 * @param id
	 * @return
	 */
	public Htmlquartz findById(String id) {
		return htmlquartzMapper.selectByPrimaryKey(id);
	}

	/**
	 * 根据siteid查询
	 * 
	 * @param id
	 * @return
	 */
	public Htmlquartz findBySiteid(String siteid) {
		HtmlquartzExample example = new HtmlquartzExample();
		Criteria criteria = example.createCriteria();
		criteria.andSiteidEqualTo(siteid);
		List<Htmlquartz> list = htmlquartzMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	/**
	 * 根据siteid删除
	 * 
	 * @param id
	 * @return
	 */
	public void delBySiteid(String siteid) {
		HtmlquartzExample example = new HtmlquartzExample();
		Criteria criteria = example.createCriteria();
		criteria.andSiteidEqualTo(siteid);
		htmlquartzMapper.deleteByExample(example);
	}

	/**
	 * 根据channelid查询
	 * 
	 * @param id
	 * @return
	 */
	public Htmlquartz findByChannelid(String channelid) {
		HtmlquartzExample example = new HtmlquartzExample();
		Criteria criteria = example.createCriteria();
		criteria.andChannelidEqualTo(channelid);
		List<Htmlquartz> list = htmlquartzMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	/**
	 * 根据channelid删除
	 * 
	 * @param id
	 * @return
	 */
	public void delByChannelid(String channelid) {
		HtmlquartzExample example = new HtmlquartzExample();
		Criteria criteria = example.createCriteria();
		criteria.andChannelidEqualTo(channelid);
		htmlquartzMapper.deleteByExample(example);
	}

	/**
	 * 根据categoryid删除
	 * 
	 * @param id
	 * @return
	 */
	public void delByCategoryid(String categoryid) {
		HtmlquartzExample example = new HtmlquartzExample();
		Criteria criteria = example.createCriteria();
		criteria.andChannelidEqualTo(categoryid);
		htmlquartzMapper.deleteByExample(example);
	}

	/**
	 * 查询所有有效调度
	 * 
	 * @return
	 */
	public List<Htmlquartz> findAll() {
		HtmlquartzExample example = new HtmlquartzExample();
		Criteria criteria = example.createCriteria();
		criteria.andTypeNotEqualTo("");
		return htmlquartzMapper.selectByExample(example);
	}

	/**
	 * 查询所有有效调度
	 * 
	 * @return
	 */
	public List<Htmlquartz> findAll(Htmlquartz htmlquartz) {
		HtmlquartzExample example = new HtmlquartzExample();
		Criteria criteria = example.createCriteria();
		criteria.andTypeNotEqualTo("");
		if (StringUtils.isNotEmpty(htmlquartz.getSql())) {
			criteria.andSql(htmlquartz.getSql());
		}
		return htmlquartzMapper.selectByExample(example);
	}

}
