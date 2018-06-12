package com.gsccs.cms.core.service.impl;

import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.gsccs.cms.core.dao.ContentImgMapper;
import com.gsccs.cms.core.model.ContentImg;
import com.gsccs.cms.core.model.ContentImgExample;
import com.gsccs.cms.core.model.ContentImgExample.Criteria;
import com.gsccs.cms.core.service.ContentImgService;

/**
 * 内容图片服务
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
@Service
public class ContentImgServiceImpl implements ContentImgService {

	@Resource
	private ContentImgMapper contentImgMapper;

	/**
	 * 查询
	 */
	public List<ContentImg> findByInfoid(String infoid) {
		ContentImgExample example = new ContentImgExample();
		Criteria criteria = example.createCriteria();
		ContentImg infoImg = new ContentImg();
		infoImg.setInfoid(infoid);
		proSearchParam(infoImg, criteria);
		return contentImgMapper.selectByExample(example);
	}

	/**
	 * 查询
	 */
	public List<ContentImg> find(ContentImg infoImg, String order) {
		ContentImgExample example = new ContentImgExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(infoImg, criteria);
		if (order != null && order.trim().length() > 0) {
			example.setOrderByClause(order);
		}
		return contentImgMapper.selectByExample(example);
	}

	/**
	 * 统计
	 * 
	 * @param GoodsImg
	 * @return
	 */
	public int count(ContentImg infoImg) {
		ContentImgExample example = new ContentImgExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(infoImg, criteria);
		return contentImgMapper.countByExample(example);
	}

	/**
	 * 处理查询条件
	 * 
	 * @param GoodsImg
	 * @param criteria
	 */
	public void proSearchParam(ContentImg infoImg, Criteria criteria) {
		if (infoImg != null) {
			if (StringUtils.isNotEmpty(infoImg.getInfoid())) {
				criteria.andInfoidEqualTo(infoImg.getInfoid());
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
	public ContentImg findById(String id) {
		return contentImgMapper.selectByPrimaryKey(id);
	}

	/**
	 * 更新
	 * 
	 * @param question
	 */
	public void update(ContentImg infoImg) {
		contentImgMapper.updateByPrimaryKeySelective(infoImg);
	}

	/**
	 * 添加
	 * 
	 * @param question
	 * @return
	 */
	public String add(ContentImg infoImg) {
		infoImg.setId(UUID.randomUUID().toString());
		contentImgMapper.insert(infoImg);
		return infoImg.getId();
	}

	/**
	 * 删除
	 * 
	 * @param id
	 */
	public void del(String id) {
		contentImgMapper.deleteByPrimaryKey(id);
	}

}
