package com.gsccs.cms.auth.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.gsccs.cms.auth.dao.UsersMapper;
import com.gsccs.cms.auth.model.Users;
import com.gsccs.cms.auth.model.UsersExample;
import com.gsccs.cms.auth.model.UsersExample.Criteria;
import com.gsccs.cms.auth.service.UserService;
import com.gsccs.cms.bass.utils.MD5;

/**
 * 用户服务
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UsersMapper usersMapper;

	/**
	 * 是否有此用户
	 * 
	 * @param user
	 * @return
	 */
	public int have(Users user) {
		return usersMapper.have(user);
	}

	/**
	 * 根据登录名查询用户对象
	 * 
	 * @param loginName
	 * @return
	 */
	public Users findByLoginName(String loginName) {
		if (null==loginName){
			return null;
		}
		UsersExample example = new UsersExample();
		Criteria criteria = example.createCriteria();
		criteria.andLoginnameEqualTo(loginName);
		List<Users> users = usersMapper.selectByExample(example);
		if (users != null && users.size() > 0) {
			return users.get(0);
		}
		return null;
	}

	/**
	 * 查询所有用户
	 * 
	 * @return
	 */
	public List<Users> findAll() {
		UsersExample example = new UsersExample();
		example.setOrderByClause(" loginName ");
		return usersMapper.selectByExample(example);
	}

	/**
	 * 根据参数查询
	 * 
	 * @return
	 */
	public List<Users> find(Users user, boolean cache) {
		UsersExample example = new UsersExample();
		Criteria criteria = example.createCriteria();
		if (user.getIsmail() != null && user.getIsmail().trim().length() > 0) {
			criteria.andIsmailEqualTo(user.getIsmail().trim());
		}
		//example.setOrderByClause(" loginName ");
		if (cache) {
			return usersMapper.selectByExampleCache(example);
		} else {
			return usersMapper.selectByExample(example);
		}
	}

	/**
	 * 根据id查询
	 * 
	 * @param id
	 * @return
	 */
	public Users findById(String id) {
		return usersMapper.selectByPrimaryKey(id);
	}

	/**
	 * 保存
	 * 
	 * @param users
	 */
	public void save(Users users) {
		usersMapper.insert(users);
	}

	/**
	 * 保存
	 * 
	 * @param users
	 */
	public void update(Users users) {
		usersMapper.updateByPrimaryKey(users);
	}

	/**
	 * 删除
	 * 
	 * @param id
	 */
	public void delete(String id) {
		usersMapper.deleteByPrimaryKey(id);
	}

	/**
	 * 状态
	 * 
	 * @param users
	 */
	public void updateState(String userid, String state) {
		usersMapper.updateById(userid, state);
	}

	/**
	 * 重置密码
	 * 
	 * @param user
	 */
	public void updatePwd(Users user) {
		usersMapper.resetPwd(user);
	}

	/**
	 * 检查登录信息是否正确
	 * 
	 * @param loginname
	 * @param pwd
	 * @return
	 */
	public String checkLogin(Users user) {
		UsersExample usersExample = new UsersExample();
		Criteria criteria = usersExample.createCriteria();
		criteria.andLoginnameEqualTo(user.getLoginname());
		criteria.andPwdEqualTo(MD5.MD5(user.getPwd()));
		List<Users> list = usersMapper.selectByExample(usersExample);
		String msg = "";
		if (list != null && list.size() > 0) {
			user = (Users) list.get(0);
			// 是否为无效
			if ("1".equals(user.getIsok())) {
				// 修改上次登录时间
				user.setLastlogintime(user.getLastestlogintime());
				user.setLastestlogintime(new Date());
				usersMapper.updateLastLoginTime(user);
			} else {
				msg = "此用户已禁用!";
			}
		} else {
			msg = "用户名或密码错误!";
		}
		return msg;
	}

	/**
	 * 检查登录信息是否正确
	 * 
	 * @param loginname
	 * @param pwd
	 * @return
	 */
	public Users checkLogin(String loginName, String password) {
		Users user = null;
		UsersExample usersExample = new UsersExample();
		Criteria criteria = usersExample.createCriteria();
		criteria.andLoginnameEqualTo(loginName);
		criteria.andPwdEqualTo(MD5.MD5(password));
		List<Users> list = usersMapper.selectByExample(usersExample);
		if (list != null && list.size() > 0) {
			user = (Users) list.get(0);
		}
		return user;
	}

	/**
	 * 分页查询
	 */
	public List<Users> find(Users user, String order, int currPage, int pageSize) {
		UsersExample example = new UsersExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(user, criteria);
		if (order != null && order.trim().length() > 0) {
			example.setOrderByClause(order);
		}
		example.setCurrPage(currPage);
		example.setPageSize(pageSize);
		return usersMapper.selectPageByExample(example);
	}

	/**
	 * 统计
	 * 
	 * @param info
	 * @return
	 */
	public int count(Users user) {
		UsersExample example = new UsersExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(user, criteria);
		return usersMapper.countByExample(example);
	}

	/**
	 * 处理查询条件
	 * 
	 * @param info
	 * @param criteria
	 */
	public void proSearchParam(Users user, Criteria criteria) {
		if (user != null) {
			if (StringUtils.isNotEmpty(user.getSql())) {
				criteria.andSql(user.getSql());
			}
			if (user != null && user.getName() != null
					&& user.getName().trim().length() > 0) {
				criteria.andNameLike("%" + user.getName().trim() + "%");
			}
			if (user != null && user.getUnitNames() != null
					&& user.getUnitNames().trim().length() > 0) {
				criteria.andUnitNamesLike("%" + user.getUnitNames().trim()
						+ "%");
			}
			if (user != null && user.getRoleNames() != null
					&& user.getRoleNames().trim().length() > 0) {
				criteria.andRoleNamesLike("%" + user.getRoleNames().trim()
						+ "%");
			}
			if (user != null && user.getLoginname() != null
					&& user.getLoginname().trim().length() > 0) {
				criteria.andLoginnameLike("%" + user.getLoginname().trim()
						+ "%");
			}
		}
	}
}
