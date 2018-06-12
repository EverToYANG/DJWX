package com.gsccs.cms.core.service.impl;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.gsccs.cms.auth.model.Config;
import com.gsccs.cms.auth.service.ConfigService;
import com.gsccs.cms.auth.service.OperlogService;
import com.gsccs.cms.bass.utils.FreeMarkerUtil;
import com.gsccs.cms.core.dao.SiteMapper;
import com.gsccs.cms.core.model.Site;
import com.gsccs.cms.core.model.SiteExample;
import com.gsccs.cms.core.model.SiteExample.Criteria;
import com.gsccs.cms.core.service.HtmlquartzService;
import com.gsccs.cms.core.service.SiteService;
import com.gsccs.cms.core.util.CmsConst;

import freemarker.template.TemplateException;

/**
 * 站点相关服务
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
@Service("siteService")
public class SiteServiceImpl implements SiteService {

	@Resource
	private SiteMapper siteMapper;
	@Resource
	private ConfigService configService;
	@Resource
	private OperlogService operlogService;
	@Resource
	private HtmlquartzService htmlquartzService;

	/**
	 * 获取同级最大排序号
	 * 
	 * @param parid
	 * @return
	 */
	public int maxNum(String parid) {
		Site site = new Site();
		site.setParid(parid);
		if (StringUtils.isEmpty(parid)) {
			site.setParid("root");
		}
		List<Site> siteList = find(site, "ordernum desc", 1, 1);
		if (siteList != null && siteList.size() > 0) {
			site = siteList.get(0);
			if (site.getOrdernum() != null) {
				return site.getOrdernum() + 1;
			}
		}
		return 0;
	}

	/**
	 * 分页查询
	 */
	public List<Site> find(Site site, String order, int currPage, int pageSize) {
		SiteExample example = new SiteExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(site, criteria);
		if (order != null && order.trim().length() > 0) {
			example.setOrderByClause(order);
		}
		example.setCurrPage(currPage);
		example.setPageSize(pageSize);
		return siteMapper.selectPageByExample(example);
	}

	/**
	 * 分页查询
	 */
	public List<Site> findAll(Site site, String order) {
		SiteExample example = new SiteExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(site, criteria);
		if (order != null && order.trim().length() > 0) {
			example.setOrderByClause(order);
		}
		return siteMapper.selectByExample(example);
	}

	/**
	 * 统计
	 */
	public int count(Site site) {
		SiteExample example = new SiteExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(site, criteria);
		return siteMapper.countByExample(example);
	}

	/**
	 * 处理查询条件
	 * 
	 * @param info
	 * @param criteria
	 */
	public void proSearchParam(Site site, Criteria criteria) {
		if (site != null) {
			if (StringUtils.isNotEmpty(site.getParid())) {
				if ("root".equals(site.getParid())) {
					criteria.andSql(" (parid is null or parid='') ");
				} else {
					criteria.andParidEqualTo(site.getParid());
				}
			}
			if (StringUtils.isNotEmpty(site.getSql())) {
				criteria.andSql(site.getSql());
			}
			if (site.getName() != null && site.getName().trim().length() > 0) {
				criteria.andNameLike("%" + site.getName().trim() + "%");
			}

			if (StringUtils.isNotEmpty(site.getState())) {
				criteria.andStateEqualTo(site.getState());
			}

			if (StringUtils.isNotEmpty(site.getSitetype())) {
				criteria.andSitetypeEqualTo(site.getSitetype());
			}

		}
	}

	/**
	 * 下降
	 */
	public void down(Site site) {
		if (site != null) {
			// 查询同级别下面第一个的排序
			Site site2 = new Site();
			site2.setParid(site.getParid());
			if (StringUtils.isEmpty(site.getParid())) {
				site2.setParid("root");
			}
			site2.setSql(" id<>'" + site.getId() + "' and ordernum>="
					+ site.getOrdernum());
			List<Site> siteList = find(site2, " ordernum ", 1, 1);
			if (siteList != null && siteList.size() > 0) {
				Site nextsite = siteList.get(0);
				if (nextsite != null) {
					if (nextsite.getOrdernum().equals(site.getOrdernum())) {
						site.setOrdernum(nextsite.getOrdernum() + 1);
					} else {
						int nextNum = nextsite.getOrdernum();
						nextsite.setOrdernum(site.getOrdernum());
						site.setOrdernum(nextNum);
					}
					update(site);
					update(nextsite);
				}
			}
		}
	}

	/**
	 * 上升
	 */
	public void up(Site site) {
		if (site != null) {
			// 查询同级别上面第一个菜单的排序
			Site site2 = new Site();
			site2.setParid(site.getParid());
			if (StringUtils.isEmpty(site.getParid())) {
				site2.setParid("root");
			}
			site2.setSql(" id<>'" + site.getId() + "' and ordernum<="
					+ site.getOrdernum());
			List<Site> siteList = find(site2, " ordernum desc ", 1, 1);
			if (siteList != null && siteList.size() > 0) {
				Site nextsite = siteList.get(0);
				if (nextsite != null) {
					if (nextsite.getOrdernum().equals(site.getOrdernum())) {
						site.setOrdernum(nextsite.getOrdernum() - 1);
					} else {
						int nextNum = nextsite.getOrdernum();
						nextsite.setOrdernum(site.getOrdernum());
						site.setOrdernum(nextNum);
					}
					update(site);
					update(nextsite);
				}
			}
		}
	}

	/**
	 * 查询是否有子数据
	 * 
	 * @param parId
	 * @return
	 */
	public boolean hasChildren(String parId) {
		SiteExample example = new SiteExample();
		Criteria criteria = example.createCriteria();
		criteria.andParidEqualTo(parId);
		return siteMapper.countByExample(example) > 0;
	}

	/**
	 * 查询子站点
	 * 
	 * @param parid
	 * @return
	 */
	public List<Site> selectByParId(String parid) {
		SiteExample example = new SiteExample();
		Criteria criteria = example.createCriteria();
		criteria.andParidEqualTo(parid);
		example.setOrderByClause("ordernum");
		return siteMapper.selectByExample(example);
	}

	public List<Site> selectByParId(String parid, Site site, String order,
			int currPage, int pageSize) {
		SiteExample example = new SiteExample();
		Criteria criteria = example.createCriteria();
		criteria.andParidEqualTo(parid);
		if (site.getName() != null && site.getName().trim().length() > 0) {
			criteria.andNameLike("%" + site.getName().trim() + "%");
		}
		if (order != null && order.trim().length() > 0) {
			example.setOrderByClause(order);
		}
		example.setCurrPage(currPage);
		example.setPageSize(pageSize);
		return siteMapper.selectPageByExample(example);

	}

	/**
	 * 查询第一个子站点
	 * 
	 * @param parid
	 * @return
	 */
	public Site selectFirstByParId(String parid) {
		SiteExample example = new SiteExample();
		Criteria criteria = example.createCriteria();
		criteria.andParidEqualTo(parid);
		example.setOrderByClause("ordernum");
		example.setCurrPage(1);
		example.setPageSize(1);
		List<Site> list = siteMapper.selectPageByExample(example);
		if (list != null && list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	/**
	 * 查询角色可管理站点
	 * 
	 * @param parid
	 * @return
	 */
	public List<Site> selectByRoles(Site site, String roles) {
		if (roles != null && roles.trim().length() > 0) {
			SiteExample example = new SiteExample();
			Criteria criteria = example.createCriteria();
			if (site.getName() != null && site.getName().trim().length() > 0) {
				criteria.andNameLike("%" + site.getName().trim() + "%");
			}
			criteria.andSql(" id in (select siteid from cms_role_site where roleid in ("
					+ roles + " ))");
			example.setOrderByClause("ordernum");
			return siteMapper.selectByExample(example);
		}
		return null;
	}

	/**
	 * 查询角色可管理站点
	 * 
	 * @param parid
	 * @return
	 */
	public List<Site> selectByRoles(String roles) {
		if (roles != null && roles.trim().length() > 0) {
			SiteExample example = new SiteExample();
			Criteria criteria = example.createCriteria();
			criteria.andSql(" id in (select siteid from cms_role_site where roleid in ("
					+ roles + " ))");
			example.setOrderByClause("ordernum");
			return siteMapper.selectByExample(example);
		}
		return null;
	}

	/**
	 * 查询用户第一个可管理站点
	 * 
	 * @param parid
	 * @return
	 */
	public Site selectFirstByRoles(String roles) {
		if (roles != null && roles.trim().length() > 0) {
			SiteExample example = new SiteExample();
			Criteria criteria = example.createCriteria();
			criteria.andSql(" id in (select siteid from cms_role_site where roleid in ("
					+ roles + " ))");
			example.setOrderByClause("ordernum");
			example.setCurrPage(1);
			example.setPageSize(1);
			List<Site> list = siteMapper.selectPageByExample(example);
			if (list != null && list.size() > 0) {
				return list.get(0);
			}
		}
		return null;
	}

	/**
	 * 根据id查询
	 * 
	 * @param id
	 * @return
	 */
	public Site findById(String id) {
		return siteMapper.selectByPrimaryKey(id);
	}

	/**
	 * 根据id查询
	 * 
	 * @param id
	 * @return
	 */
	public Site findByDomain(String domain, boolean cache) {
		SiteExample example = new SiteExample();
		Criteria criteria = example.createCriteria();
		criteria.andSitedomainEqualTo(domain);
		example.setCurrPage(1);
		example.setPageSize(1);
		List<Site> list = null;
		if (cache) {
			list = siteMapper.selectPageByExampleCache(example);
		} else {
			list = siteMapper.selectPageByExample(example);
		}
		if (list != null && list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	/**
	 * 根据sourcepath查询
	 * 
	 * @param id
	 * @return
	 */
	public Site findBySourcepath(String sourcepath) {
		SiteExample example = new SiteExample();
		Criteria criteria = example.createCriteria();
		criteria.andSourcepathEqualTo(sourcepath);
		example.setCurrPage(1);
		example.setPageSize(1);
		List<Site> list = siteMapper.selectPageByExample(example);
		if (list != null && list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	/**
	 * 生成首页
	 * 
	 * @param id
	 * @throws TemplateException
	 * @throws IOException
	 * @throws TemplateException
	 * @throws IOException
	 */
	public void html(String id, ServletContext context, String contextPath,
			HttpServletRequest request, String operuser) throws IOException,
			TemplateException {
		// 查询站点
		Site site = findById(id);
		if (site != null && site.getTemplet() != null
				&& site.getTemplet().trim().length() > 0) {
			// 生成静态页面
			Map<String, Object> data = new HashMap<String, Object>();
			// 传递site参数
			data.put("site", site);
			data.put("contextPath", contextPath);
			data.put("contextPathNo", request.getContextPath());

			Config sitePathConfig = configService
					.findByCode(CmsConst.SITE_ROOT_PATH_CODE);
			String rootPath = sitePathConfig.getCode();
			String sitePath = rootPath + "/" + site.getSourcepath() + "/";
			String dirPath = rootPath + File.separator + site.getSourcepath()
					+ File.separator + "templet" + File.separator
					+ site.getTemplet().trim() + File.separator;
			// 2014-7-29修改 首页静态化，
			/*
			 * FreeMarkerUtil.createHTML(context, data,
			 * "templet/"+site.getTemplet().trim()+"/index.html",
			 * sitePath+"/index.html");
			 */
			// File dir = new File(sitePath);
			File dir = new File(dirPath);
			FreeMarkerUtil.createHTML(dir, data, "index.html", sitePath
					+ "/index.html");
			operlogService.log(operuser, "首页静态化:" + site.getName(), request);
		}
	}

	

	
	/**
	 * 查询是否有此目录
	 * 
	 * @param path
	 * @return
	 */
	public boolean haveSourcePath(String path) {
		SiteExample example = new SiteExample();
		Criteria criteria = example.createCriteria();
		criteria.andSourcepathEqualTo(path);
		return siteMapper.countByExample(example) > 0;
	}

	/**
	 * 更新
	 * 
	 * @param site
	 */
	public void update(Site site) {
		if (null==site){
			return;
		}
		siteMapper.updateByPrimaryKey(site);
	}

	/**
	 * 添加
	 * 
	 * @param site
	 * @return
	 */
	public String insert(Site site) {
		String id = null;
		if (null==site){
			return null;
		}
		id = site.getId();
		if(StringUtils.isEmpty(id)){
			id = UUID.randomUUID().toString();
		}
		
		Site dbSite = siteMapper.selectByPrimaryKey(site.getId());
		if (null == dbSite){ //数据库中存在对应的site
			site.setId(id);
			site.setAddtime(new Date());
			siteMapper.insert(site);
		}
		return id;
	}

	/**
	 * 删除
	 * 
	 * @param siteId
	 * @throws TemplateException
	 * @throws IOException
	 */
	public void del(String siteId, HttpServletRequest request) {
		delPar(siteId, request);
		siteMapper.deleteByPrimaryKey(siteId);
	}

	/**
	 * 递归删除
	 * 
	 * @param parId
	 */
	public void delPar(String parId, HttpServletRequest request) {
		SiteExample example = new SiteExample();
		Criteria criteria = example.createCriteria();
		criteria.andParidEqualTo(parId);
		List<Site> siteList = siteMapper.selectByExample(example);
		if (siteList != null && siteList.size() > 0) {
			for (int i = 0; i < siteList.size(); i++) {
				delPar(siteList.get(i).getId(), request);
			}
		}
		// 删除静态化调度任务
		/*
		 * try { delHtmlSiteJob(parId); } catch (SchedulerException e) {
		 * e.printStackTrace(); } catch (ParseException e) {
		 * e.printStackTrace(); }
		 */
		// 删除静态化调度数据
		htmlquartzService.delBySiteid(parId);
		siteMapper.deleteByPrimaryKey(parId);
	}

	/**
	 * 生成树
	 * 
	 * @param roleid
	 * @return
	 */
	public String createTree(HttpServletRequest request, String selectids) {
		StringBuffer html = new StringBuffer();
		// 查询
		Site site = new Site();
		List<Site> list = findAll(site, "ordernum");
		// 生成一级
		if (list != null && list.size() > 0) {
			boolean hasChildren = false;
			for (int i = 0; i < list.size(); i++) {
				if (StringUtils.isEmpty(list.get(i).getParid())) {
					hasChildren = false;
					html.append("<tr treeItemLevel='1'>");
					html.append("<td><input "
							+ (selectids.indexOf(list.get(i).getId()) > -1 ? "checked"
									: "") + " onclick='treeIdCheck(\""
							+ list.get(i).getId()
							+ "\")' type='checkbox' name='ids' site='"
							+ list.get(i).getName() + "' value='"
							+ list.get(i).getId() + "' id='"
							+ list.get(i).getId() + "'/></td>");
					html.append("<td>");

					if (hasChildren(list.get(i).getId())) {
						hasChildren = true;
						html.append("<img align='absmiddle' style='cursor:pointer' onClick='displayChildren(this);' isAjax='false' isOpen='true' id='"
								+ list.get(i).getId()
								+ "' src='"
								+ request.getContextPath()
								+ "/static/tree/image/minus.gif' />");
					} else {
						html.append("<img align='absmiddle' src='"
								+ request.getContextPath()
								+ "/static/tree/image/empty.gif' />");
					}
					html.append("<img align='absmiddle' border='0' src='"
							+ request.getContextPath()
							+ "/static/tree/image/folder.gif' />&nbsp;");
					html.append(list.get(i).getName());
					html.append("</td></tr>");
					if (hasChildren) {
						// 处理子级
						createTreeSon(request, list, list.get(i).getId(),
								selectids, html, 2, list.get(i).getId());
					}
				}
			}
		}
		return html.toString();
	}

	/**
	 * 生成授权树
	 * 
	 * @param roleid
	 * @return
	 */
	public String createTreeSon(HttpServletRequest request, List<Site> list,
			String pid, String selectids, StringBuffer html, int treeItemLevel,
			String pidpath) {
		// 生成子级
		if (list != null && list.size() > 0) {
			boolean hasChildren = false;
			for (int i = 0; i < list.size(); i++) {
				if (pid.equals((list.get(i).getParid()))) {
					hasChildren = false;
					html.append("<tr treeItemLevel='" + treeItemLevel + "'>");
					html.append("<td><input "
							+ (selectids.indexOf(list.get(i).getId()) > -1 ? "checked"
									: "") + " onclick='treeIdCheck(\""
							+ pidpath + "_" + list.get(i).getId()
							+ "\")'  type='checkbox' name='ids' site='"
							+ list.get(i).getName() + "' value='"
							+ list.get(i).getId() + "' id='"
							+ list.get(i).getId() + "'/></td>");
					html.append("<td>");
					for (int j = 1; j < treeItemLevel; j++) {
						html.append("<img align='absmiddle' src='"
								+ request.getContextPath()
								+ "/static/tree/image/empty.gif' />");
					}
					if (hasChildren(list.get(i).getId())) {
						hasChildren = true;
						html.append("<img align='absmiddle' style='cursor:pointer' onClick='displayChildren(this);' isAjax='false' isOpen='true' id='"
								+ list.get(i).getId()
								+ "' src='"
								+ request.getContextPath()
								+ "/static/tree/image/minus.gif' />");
					} else {
						html.append("<img align='absmiddle' src='"
								+ request.getContextPath()
								+ "/static/tree/image/empty.gif' />");
					}
					html.append("<img align='absmiddle' border='0' src='"
							+ request.getContextPath()
							+ "/static/tree/image/folder.gif' />&nbsp;");
					html.append(list.get(i).getName());
					html.append("</td></tr>");
					if (hasChildren) {
						// 处理子级
						createTreeSon(request, list, list.get(i).getId(),
								selectids, html, treeItemLevel + 1, pidpath
										+ "_" + list.get(i).getId());
					}
				}
			}
		}
		return html.toString();
	}
}
