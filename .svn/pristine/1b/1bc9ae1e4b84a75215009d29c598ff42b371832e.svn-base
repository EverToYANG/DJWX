package com.gsccs.cms.core.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.dom4j.DocumentException;

import com.gsccs.cms.core.model.Site;
import com.gsccs.cms.core.model.Templet;
import com.gsccs.cms.core.model.TempletLink;
import com.gsccs.cms.core.model.TempletLinkExample.Criteria;

/**
 * 模板链接相关服务
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
public interface TempletLinkService {

	/**
	 * 统计
	 * @param templetid
	 * @return
	 */
	public int count(String templetid);
	/**
	 * 删除分类
	 * @param id
	 */
	public void delClass(String id);
	/**
	 * 更新
	 * @param templet
	 */
	public void update(TempletLink templetLink);
	/**
	 * 添加
	 * @param link
	 * @return
	 */
	public String add(TempletLink templetLink);
	/**
	 * 检验是否已存在页面标识
	 * @param siteid
	 * @param type
	 * @param isClass
	 * @return
	 */
	public boolean hasPagemark(String templet,String type,boolean isClass,String pagemark);
	/**
	 * 根据id查询
	 * @param id
	 * @return
	 */
	public TempletLink findById(String id);
	/**
	 * 查询
	 */
	public List<TempletLink> findAll(TempletLink templetLink,String order);

	/**
	 * 处理查询条件
	 * @param info
	 * @param criteria
	 */
	public void proSearchParam(TempletLink templetLink,Criteria criteria);
	/**
	 * 生成指定模板的链接分类初始化数据xml文件
	 * @param templetid
	 */
	public void createXML(Templet templet,HttpServletRequest request);
	/**
	 * 导入链接分类数据
	 * @throws DocumentException 
	 */
	public void importLinks(Templet templet,HttpServletRequest request) throws DocumentException;
	/**
	 * 导入站点链接分类数据
	 */
	public void importSiteLinks(Templet templet,Site site);

	/**
	 * 导入站点链接分类数据
	 */
	public void importSite(Templet templet,Site site);
}
