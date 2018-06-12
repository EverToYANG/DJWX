package com.gsccs.cms.core.service.impl;

import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.gsccs.cms.core.dao.RoleSiteMapper;
import com.gsccs.cms.core.model.RoleSite;
import com.gsccs.cms.core.model.RoleSiteExample;
import com.gsccs.cms.core.model.RoleSiteExample.Criteria;
import com.gsccs.cms.core.service.RoleSiteService;

/**
 * 角色站点管理服务
 * 
 * @version 1.0
 * @author x.d zhang
 * 
 */
@Service("roleSiteService")
public class RoleSiteServiceImpl implements RoleSiteService {

	@Resource
	private RoleSiteMapper roleSiteMapper;

	/**
	 * 根据站点和角色判断是否有权限
	 * 
	 * @param siteid
	 * @param roleid
	 */
	public boolean have(String siteid, String roleid) {
		RoleSiteExample example = new RoleSiteExample();
		Criteria criteria = example.createCriteria();
		criteria.andSiteidEqualTo(siteid);
		criteria.andRoleidEqualTo(roleid);
		return roleSiteMapper.countByExample(example) > 0;
	}

	/**
	 * 根据站点和角色查询
	 * 
	 * @param siteid
	 * @param roleid
	 */
	public RoleSite findBySiteRole(String siteid, String roleid) {
		RoleSiteExample example = new RoleSiteExample();
		Criteria criteria = example.createCriteria();
		criteria.andSiteidEqualTo(siteid);
		criteria.andRoleidEqualTo(roleid);
		List<RoleSite> list = roleSiteMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	/**
	 * 根据站点和角色查询
	 * 
	 * @param siteid
	 * @param roleid
	 */
	public RoleSite findBySiteRoles(String siteid, String roleids) {
		RoleSiteExample example = new RoleSiteExample();
		Criteria criteria = example.createCriteria();
		criteria.andSiteidEqualTo(siteid);
		if (StringUtils.isNotEmpty(roleids)){
			criteria.andSql(" roleid in (" + roleids + ") ");
		}
		List<RoleSite> list = roleSiteMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	/**
	 * 根据站点和角色删除
	 * 
	 * @param siteid
	 * @param roleid
	 */
	public void del(String siteid, String roleid) {
		RoleSiteExample example = new RoleSiteExample();
		Criteria criteria = example.createCriteria();
		criteria.andSiteidEqualTo(siteid);
		criteria.andRoleidEqualTo(roleid);
		roleSiteMapper.deleteByExample(example);
	}

	/**
	 * 根据站点和角色保存
	 * 
	 * @param siteid
	 * @param roleid
	 */
	public void save(String siteid, String roleid, String siteadmin) {
		RoleSite roleSite = new RoleSite();
		roleSite.setId(UUID.randomUUID().toString());
		roleSite.setSiteid(siteid);
		roleSite.setRoleid(roleid);
		roleSiteMapper.insert(roleSite);
	}

	public RoleSiteMapper getRoleSiteMapper() {
		return roleSiteMapper;
	}

	public void setRoleSiteMapper(RoleSiteMapper roleSiteMapper) {
		this.roleSiteMapper = roleSiteMapper;
	}
}
