package com.gsccs.cms.auth.service.impl;

import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gsccs.cms.auth.dao.UnitUserMapper;
import com.gsccs.cms.auth.model.UnitUser;
import com.gsccs.cms.auth.model.UnitUserExample;
import com.gsccs.cms.auth.model.UnitUserExample.Criteria;
import com.gsccs.cms.auth.service.UnitUserService;



/**
 * 组织机构与用户关系相关服务
 * 
 * @author x.d zhang
 * @version 1.0
 */
@Service
public class UnitUserServiceImpl implements UnitUserService{

	@Resource
	private UnitUserMapper unitUserMapper;


	/**
	 * 判断一个用户与一个单位是否关联
	 * @param unit
	 * @param user
	 * @return
	 */
	public boolean haveUnitUser(String unit,String user){
		UnitUserExample example=new UnitUserExample();
		Criteria criteria=example.createCriteria();
		criteria.andUsersEqualTo(user);
		criteria.andUnitEqualTo(unit);
		return unitUserMapper.countByExample(example)>0;
	}
	/**
	 * 添加关联
	 * @param role
	 * @param user
	 * @return
	 */
	public int add(String unit,String user){
		UnitUser unitUser=new UnitUser();
		unitUser.setUnit(unit);
		unitUser.setUsers(user);
		unitUser.setId(UUID.randomUUID().toString());
		return unitUserMapper.insert(unitUser);
	}
	/**
	 * 按用户删除
	 */
	public void delByUser(String user) {
		UnitUserExample example=new UnitUserExample();
		Criteria criteria=example.createCriteria();
		criteria.andUsersEqualTo(user);
		unitUserMapper.deleteByExample(example);
	}
}
