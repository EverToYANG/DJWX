package com.gsccs.cms.core.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.gsccs.cms.core.dao.TempletSiteMapper;
import com.gsccs.cms.core.model.Site;
import com.gsccs.cms.core.model.Templet;
import com.gsccs.cms.core.model.TempletSite;
import com.gsccs.cms.core.model.TempletSiteExample;
import com.gsccs.cms.core.service.TempletSiteService;


@Service
public class TempletSiteServiceImpl implements TempletSiteService {
	
	@Resource
	private TempletSiteMapper templetSiteMapper;

	@Override
	public List<TempletSite> find(TempletSite tsite, String order,
			int currPage, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count(String templetid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<TempletSite> findBySite(String siteId) {
       // List<TempletSite>
		return templetSiteMapper.selectBySiteId(siteId);
	}

	@Override
	public TempletSite findById(String id) {
		// TODO Auto-generated method stub
		return templetSiteMapper.selectByPrimaryKey(id);
	}

	@Override
	public void update(TempletSite templetSite) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String insert(TempletSite templetSite) {
		templetSite.setId(UUID.randomUUID().toString());
		templetSiteMapper.insert(templetSite);
		return templetSite.getId();
	}

	@Override
	public void del(String id, HttpServletRequest request) {
		templetSiteMapper.deleteByPrimaryKey(id);
	}

	@Override
	public boolean hasTemplate(String templetid, String siteId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void importSiteChannels(Templet templet, Site site) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void importSiteChannel(Map<String, TempletSite> channelMap,
			Map<String, String> importedMap, Site site) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void importSite(Templet templet, Site site,
			HttpServletRequest request) {
		// TODO Auto-generated method stub
		
	}
	

	/**
	 * 查询
	 * @param info
	 * @param order
	 * @param currPage
	 * @param pageSize
	 * @param loginAdmin
	 * @return
	 */
	public List<TempletSite> findAll(){
		TempletSiteExample example=new TempletSiteExample();
		return templetSiteMapper.selectByExample(example);
	}


	public List<String> findTemIdsBySite(String siteId) {
		List<TempletSite>  tsList =templetSiteMapper.selectBySiteId(siteId);
		List<String> sList =new ArrayList<String>();
		if(tsList.size() > 0){
			for (TempletSite ts : tsList) {
				sList.add(ts.getTempletid());
			}
		}
		return sList;
	}

	@Override
	public List<TempletSite> findBySiteAndTemplet(String siteId,
			String templetId) {
		return templetSiteMapper.selectBySiteIdAndTempletId(siteId,templetId);
	}

}
