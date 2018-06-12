package com.gsccs.cms.core.service;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.dom4j.DocumentException;

import com.gsccs.cms.core.model.Site;
import com.gsccs.cms.core.model.Templet;
import com.gsccs.cms.core.model.TempletSite;

import freemarker.template.TemplateException;

/**
 * 模板站点相关服务
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
public interface TempletSiteService {

	/**
	 * 分页查询
	 */
	public List<TempletSite> find(TempletSite tsite, String order,
			int currPage, int pageSize);

	/**
	 * 统计
	 * 
	 * @param templetid
	 * @return
	 */
	public int count(String templetid);

	/**
	 * 根据站点id查询模版
	 * 
	 * @param siteid
	 * @param parid
	 * @return
	 */
	public List<TempletSite> findBySite(String siteId);

	/**
	 * 根据id查询
	 * 
	 * @param id
	 * @return
	 */
	public TempletSite findById(String id);

	/**
	 * 更新
	 * 
	 * @param TempletSite
	 */
	public void update(TempletSite templetSite);

	/**
	 * 添加
	 * 
	 * @param TempletSite
	 */
	public String insert(TempletSite templetSite);

	/**
	 * 删除
	 * 
	 * @param templetId
	 * @throws TemplateException
	 * @throws IOException
	 */
	public void del(String id, HttpServletRequest request);

	/**
	 * 判断是否站点中是否已存在此模版
	 * 
	 * @param templetid
	 * @param siteId
	 * @return
	 */
	public boolean hasTemplate(String templetid, String siteId);

	/**
	 * 导入站点栏目数据
	 * 
	 * @throws DocumentException
	 */
	public void importSiteChannels(Templet templet, Site site);

	/**
	 * 递归方法导入站点栏目
	 */
	public void importSiteChannel(Map<String, TempletSite> channelMap,
			Map<String, String> importedMap, Site site);

	/**
	 * 从站点导入栏目数据
	 * 
	 * @throws DocumentException
	 */
	public void importSite(Templet templet, Site site,
			HttpServletRequest request);
	

	public List<String> findTemIdsBySite(String siteId);
	
	public List<TempletSite> findBySiteAndTemplet(String siteId,String templetId);
}
