package com.gsccs.cms.core.util;


/**
 * CMS 系统常量
 * @author x.d zhang
 *
 */
public class CmsConst {
	/**
	 * 系统超级管理员角色
	 */
	public static final String SYS_ADMIN="sysAdmin";
	/**
	 * 站点管理员角色
	 */
	public static final String SITE_ADMIN="siteAdmin";
	
	/**
	 * 角色状态
	 */
	public static final String ROLE_STATE_OK="1";
	public static final String ROLE_STATE_NO="0";
	
	/**
	 * 站点状态
	 */
	public static final String SITE_STATE_OK="1";
	public static final String SITE_STATE_NO="0";
	public static final String SITE_STATE_SUSPEND = "2";
	
	/**
	 * 站点信息是否需要审核
	 * 1 需要审核
	 * 0不需要审核
	 */
	public static final String SITE_AUDITSTATE_OK="1";
	public static final String SITE_AUDITSTATE_NO="0";
	
	
	
	/**
	 * info是否审核
	 * 1  已经审核
	 * 0 没有审核
	 */
	public static final String INFO_AUDITSTATE_OK="1";
	public static final String INFO_AUDITSTATE_NO="0";
	
	/**
	 * 站点物理路径配置Code
	 */
	public static final String SITE_ROOT_PATH_CODE="siteRoot";
	
	/**
	 * 模版物理路径配置Code
	 */
	public static final String TEMPL_ROOT_PATH_CODE="templRoot";
	
	/**
	 * 全文检索服务器
	 */
	public static final String SOLR_SERVER_PATH = "solrPath";
	
	/**
	 * web服务器模板配置路径
	 */
	public static final String NGINX_PATH_CODE="nginxPath";
	
	/**
	 * 档案局档案存放位置
	 */
	public static final String ARCHIVE_PATH="archivePath";
	
}
