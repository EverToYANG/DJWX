package com.gsccs.cms.gis.service;

import java.util.List;

import com.gsccs.cms.gis.model.GisMap;
import com.gsccs.cms.gis.model.GisMapExample.Criteria;

/**
 * @author niu x j
 *
 * @date 2014年12月1日
 */
public interface GisMapService {
	
	/**
	 * 分页查询
	 */
	public List<GisMap> find(GisMap gisMap,String order,int currPage,int pageSize);
	
	/**
	 * 根据id查询
	 * @param id
	 * @return
	 */
	public GisMap findById(String id);
	/**
	 * 更新
	 * @param GisMap
	 */
	public void update(GisMap gisMap);
	/**
	 * 添加
	 * @param GisMap
	 */
	public String insert(GisMap gisMap);
	/**
	 * 删除
	 * @param id
	 */
	public void del(String id);
	
	/**
	 * 统计
	 * 
	 * @param GisMap
	 * @return
	 */
	public int count(GisMap gisMap);
	
	public List<GisMap> findGisMap(GisMap gisMap);
	
	
	public void proSearchParam(GisMap gisMap, Criteria criteria);
}
