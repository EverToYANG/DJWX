package com.gsccs.cms.gis.service.impl;

import java.util.List;

import javax.annotation.Resource;







import org.springframework.stereotype.Service;

import com.gsccs.cms.gis.dao.GisMapMapper;
import com.gsccs.cms.gis.model.GisMap;
import com.gsccs.cms.gis.model.GisMapExample;
import com.gsccs.cms.gis.model.GisMapExample.Criteria;
import com.gsccs.cms.gis.service.GisMapService;

/**
 * @author niu x j
 *
 * @date 2014年12月1日
 */
@Service("gisMapService")
public class GisMapServiceImpl implements GisMapService {
	
	@Resource
	private GisMapMapper gisMapMapper;

	/* (non-Javadoc)
	 * @see com.gsccs.gis.service.MapService#find(com.gsccs.gis.model.GisMap, java.lang.String, int, int)
	 */
	@Override
	public List<GisMap> find(GisMap gisMap, String order, int currPage,
			int pageSize) {
		GisMapExample example = new GisMapExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(gisMap, criteria);
		if (order != null && order.trim().length() > 0) {
			example.setOrderByClause(order);
		}
		example.setCurrPage(currPage);
		example.setPageSize(pageSize);
		return gisMapMapper.selectPageByExample(example);
	}

	/**
	 * 处理查询条件
	 * @param gisMap
	 * @param criteria
	 */
	public void proSearchParam(GisMap gisMap, Criteria criteria) {
		if(gisMap != null){
			if(gisMap.getSiteid() !=null && gisMap.getSiteid().trim().length() > 0){
				criteria.andSiteidEqualTo(gisMap.getSiteid());
			}
			if(gisMap.getTitle() !=null && gisMap.getTitle().trim().length() >0){
				criteria.andTitleLike("%"+gisMap.getTitle().trim()+"%");
			}
			if(gisMap.getContent() !=null && gisMap.getContent().trim().length() > 0){
				criteria.andContentLike("%"+gisMap.getContent().trim()+"%");
			}
		}
		
	}

	/* (non-Javadoc)
	 * @see com.gsccs.gis.service.MapService#findById(java.lang.String)
	 */
	@Override
	public GisMap findById(String id) {
		return gisMapMapper.selectByPrimaryKey(id);
	}

	/* (non-Javadoc)
	 * @see com.gsccs.gis.service.MapService#update(com.gsccs.gis.model.GisMap)
	 */
	@Override
	public void update(GisMap gisMap) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.gsccs.gis.service.MapService#insert(com.gsccs.gis.model.GisMap)
	 */
	@Override
	public String insert(GisMap gisMap) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.gsccs.gis.service.MapService#del(java.lang.String)
	 */
	@Override
	public void del(String id) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.gsccs.gis.service.GisMapService#count(com.gsccs.gis.model.GisMap)
	 */
	@Override
	public int count(GisMap gisMap) {
		GisMapExample example = new GisMapExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(gisMap, criteria);
		return gisMapMapper.countByExample(example);
	}

	/* (non-Javadoc)
	 * @see com.gsccs.gis.service.GisMapService#find(com.gsccs.gis.model.GisMap)
	 */
	@Override
	public List<GisMap> findGisMap(GisMap gisMap) {
		GisMapExample example = new GisMapExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(gisMap, criteria);
		return gisMapMapper.selectByExample(example);
	}

}
