package com.gsccs.cms.auth.service.impl;

import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gsccs.cms.auth.dao.RoleUserMapper;
import com.gsccs.cms.auth.model.RoleUser;
import com.gsccs.cms.auth.model.RoleUserExample;
import com.gsccs.cms.auth.model.RoleUserExample.Criteria;
import com.gsccs.cms.auth.service.RoleUserService;

/**
 * 用户角色关系相关服务
 * 
 * @author x.d zhang
 * @version 1.0
 */
@Service
public class RoleUserServiceImpl implements RoleUserService{

	@Resource
	private RoleUserMapper roleUserMapper;
	
	/**
	 * 判断是用户是否有角色权限
	 * @return
	 */
	public boolean haveRoleUser(String role,String user){
		RoleUserExample example=new RoleUserExample();
		Criteria criteria=example.createCriteria();
		criteria.andUsersEqualTo(user);
		criteria.andRolesEqualTo(role);
		return roleUserMapper.countByExample(example)>0;
	}
	

	/**
	 * 添加关联
	 * @param role
	 * @param user
	 * @return
	 */
	public int add(String role,String user){
		RoleUser roleUser=new RoleUser();
		roleUser.setRoles(role);
		roleUser.setUsers(user);
		roleUser.setId(UUID.randomUUID().toString());
		int id= roleUserMapper.insert(roleUser);
		return id;
	}
	/**
	 * 删除关联
	 * @param role
	 * @param user
	 * @return
	 */
	public void del(String role,String user){
		RoleUserExample example=new RoleUserExample();
		Criteria criteria=example.createCriteria();
		criteria.andUsersEqualTo(user);
		criteria.andRolesEqualTo(role);
		roleUserMapper.deleteByExample(example);
	}
	/**
	 * 删除关联
	 * @param role
	 * @param user
	 * @return
	 */
	public void delByUser(String user) {
		RoleUserExample example=new RoleUserExample();
		Criteria criteria=example.createCriteria();
		criteria.andUsersEqualTo(user);
		roleUserMapper.deleteByExample(example);
	}
}
