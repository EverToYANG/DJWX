package com.gsccs.cms.core.service;

import java.util.List;

import com.gsccs.cms.core.model.ContentImg;
import com.gsccs.cms.core.model.ContentImgExample.Criteria;

/**
 * 内容图片接口
 * 
 * @author x.d zhang
 * @version 1.0
 */
public interface ContentImgService {

	/**
	 * 查询
	 */
	public List<ContentImg> findByInfoid(String infoid);

	/**
	 * 查询
	 */
	public List<ContentImg> find(ContentImg infoImg, String order);

	/**
	 * 统计
	 * 
	 * @param GoodsImg
	 * @return
	 */
	public int count(ContentImg infoImg);

	/**
	 * 处理查询条件
	 * 
	 * @param GoodsImg
	 * @param criteria
	 */
	public void proSearchParam(ContentImg infoImg, Criteria criteria);

	/**
	 * 根据id查询
	 * 
	 * @param id
	 * @param cache
	 * @return
	 */
	public ContentImg findById(String id);

	/**
	 * 更新
	 * 
	 * @param question
	 */
	public void update(ContentImg infoImg);

	/**
	 * 添加
	 * 
	 * @param question
	 * @return
	 */
	public String add(ContentImg infoImg);

	/**
	 * 删除
	 * 
	 * @param id
	 */
	public void del(String id);

}
