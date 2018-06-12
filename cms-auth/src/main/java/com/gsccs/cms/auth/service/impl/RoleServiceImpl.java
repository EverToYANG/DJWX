package com.gsccs.cms.auth.service.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.gsccs.cms.auth.dao.RolesMapper;
import com.gsccs.cms.auth.model.Roles;
import com.gsccs.cms.auth.model.RolesExample;
import com.gsccs.cms.auth.model.Users;
import com.gsccs.cms.auth.model.RolesExample.Criteria;
import com.gsccs.cms.auth.service.RoleService;

/**
 * 
 * 角色服务
 * 
 * @author x.d zhang
 * @version 1.0
 */
@Service
public class RoleServiceImpl implements RoleService {

	@Resource
	private RolesMapper rolesMapper;
	@Resource
	private SqlSessionFactoryBean sqlSessionFactoryBean;

	/**
	 * 判断角色名称是否已存在
	 * 
	 * @param roleName
	 * @return
	 */
	public boolean haveRoleName(String roleName) {
		RolesExample rolesExample = new RolesExample();
		Criteria criteria = rolesExample.createCriteria();
		criteria.andNameEqualTo(roleName);
		if (rolesMapper.countByExample(rolesExample) > 0) {
			return true;
		}
		return false;
	}

	/**
	 * 添加
	 * 
	 * @param roles
	 */
	public void insert(Roles roles) {
		if (null != roles){
			if (StringUtils.isEmpty(roles.getId())){
				roles.setId(UUID.randomUUID().toString());
			}
			rolesMapper.insert(roles);
		}
	}

	/**
	 * 更新
	 * 
	 * @param role
	 */
	public void update(Roles role) {
		rolesMapper.updateByPrimaryKey(role);
		callRoleUpdatePro(role.getId());
	}

	/**
	 * 分页查询
	 * 
	 * @param role
	 * @param order
	 * @param currPage
	 * @param pageSize
	 * @return
	 */
	public List<Roles> find(Roles role, String order, int currPage,
			int pageSize, Users loginAdmin) {
		RolesExample example = new RolesExample();
		Criteria criteria = example.createCriteria();
		if (role != null) {
			if (role.getName() != null && role.getName().trim().length() > 0) {
				criteria.andNameLike("%" + role.getName().trim() + "%");
			}
			if (role.getIsok() != null && role.getIsok().trim().length() > 0) {
				criteria.andIsokEqualTo(role.getIsok());
			}
		}
		if (loginAdmin != null) {
			criteria.andSql(" (id in (select roles from sys_role_user where users='"
					+ loginAdmin.getId()
					+ "') or "
					+ "id in (select id from sys_roles where adduser='"
					+ loginAdmin.getLoginname() + "'))");
		}
		if (order != null && order.trim().length() > 0) {
			example.setOrderByClause(order);
		}
		example.setCurrPage(currPage);
		example.setPageSize(pageSize);
		return rolesMapper.selectPageByExample(example);
	}

	/**
	 * 查询所有
	 * 
	 * @param role
	 * @param order
	 * @param loginAdmin
	 * @return
	 */
	public List<Roles> findAll(Roles role, String order, Users loginAdmin) {
		RolesExample example = new RolesExample();
		Criteria criteria = example.createCriteria();
		if (role != null) {
			if (role.getName() != null && role.getName().trim().length() > 0) {
				criteria.andNameLike("%" + role.getName().trim() + "%");
			}
			if (role.getIsok() != null && role.getIsok().trim().length() > 0) {
				criteria.andIsokEqualTo(role.getIsok());
			}
		}
		if (loginAdmin != null) {
			criteria.andSql(" (id in (select roles from sys_role_user where users='"
					+ loginAdmin.getId()
					+ "') or "
					+ "id in (select id from sys_roles where adduser='"
					+ loginAdmin.getLoginname() + "'))");
		}
		if (order != null && order.trim().length() > 0) {
			example.setOrderByClause(order);
		}
		return rolesMapper.selectByExample(example);
	}

	/**
	 * 按id查询
	 * 
	 * @param id
	 * @return
	 */
	public Roles findById(String id) {
		return rolesMapper.selectByPrimaryKey(id);
	}

	/**
	 * 统计
	 * 
	 * @param role
	 * @return
	 */
	public int count(Roles role) {
		RolesExample example = new RolesExample();
		Criteria criteria = example.createCriteria();
		if (role != null) {
			if (role.getName() != null && role.getName().trim().length() > 0) {
				criteria.andNameLike("%" + role.getName().trim() + "%");
			}
		}
		return rolesMapper.countByExample(example);
	}

	/**
	 * 删除
	 * 
	 * @param id
	 */
	public void del(String id) {
		callRoleDelPro(id);
		rolesMapper.deleteByPrimaryKey(id);
	}

	/**
	 * 调用role_del存储过程
	 * 
	 * @param roleId
	 */
	public void callRoleDelPro(String roleId) {
		try {
			Connection con = sqlSessionFactoryBean.getObject().openSession()
					.getConnection();
			CallableStatement cstmt = con.prepareCall("{call role_del(?)}");
			cstmt.setString(1, roleId);
			cstmt.execute();
		} catch (Exception e) {
			if (e.getMessage().indexOf("No data") < 0) {
				System.out.println("调用role_del存储过程时出错");
				e.printStackTrace();
			}
		}
	}

	/**
	 * 调用role_update存储过程
	 * 
	 * @param roleId
	 */
	public void callRoleUpdatePro(String roleId) {
		try {
			Connection con = sqlSessionFactoryBean.getObject().openSession()
					.getConnection();
			CallableStatement cstmt = con.prepareCall("{call role_update(?)}");
			cstmt.setString(1, roleId);
			cstmt.execute();
		} catch (Exception e) {
			if (e.getMessage().indexOf("No data") < 0) {
				System.out.println("调用role_update存储过程时出错");
				e.printStackTrace();
			}
		}
	}

	/**
	 * 查询用户所属角色
	 * 
	 * @return
	 */
	public List<Roles> findByUser(String userid) {
		RolesExample example = new RolesExample();
		Criteria criteria = example.createCriteria();
		criteria.andSql(" (id in (select roles from sys_role_user where users='"
				+ userid + "'))");
		return rolesMapper.selectByExample(example);
	}
}
