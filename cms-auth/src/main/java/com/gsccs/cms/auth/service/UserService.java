package com.gsccs.cms.auth.service;

import java.util.List;

import javax.servlet.http.HttpSession;







import com.gsccs.cms.auth.model.Users;


/**
 * 用户服务
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
public interface UserService {

	/**
	 * 是否有此用户
	 * @param user
	 * @return
	 */
	public int have(Users user);
	
	/**
	 * 根据登录名查询用户对象
	 * @param loginName
	 * @return
	 */
	public Users findByLoginName(String loginName);
	/**
	 * 查询所有用户
	 * @return
	 */
	public List<Users> findAll();
	/**
	 * 根据参数查询
	 * @return
	 */
	public List<Users> find(Users user,boolean cache);
	/**
	 * 根据id查询
	 * @param id
	 * @return
	 */
	public Users findById(String id);
	
	/**
	 * 保存
	 * @param users
	 */
	public void save(Users users);
	/**
	 * 保存
	 * @param users
	 */
	public void update(Users users);
	/**
	 * 状态
	 * @param users
	 */
	public void updateState(String userid,String state);
	/**
	 * 检查登录信息是否正确
	 * @param user
	 * @return
	 */
	public String checkLogin(Users user);
	
	/**
	 * 检查登录信息是否正确
	 * @param loginname
	 * @param pwd
	 * @return
	 */
	public Users checkLogin(String loginName,String password);

	/**
	 * 分页查询
	 */
	public List<Users> find(Users user,String order,int currPage,int pageSize);/**
	 * 统计
	 * @param info
	 * @return
	 */
	public int count(Users user);
	/**
	 * 重置密码
	 * @param user
	 */
	public void updatePwd(Users user);
	/**
	 * 删除
	 * @param id
	 */
	public void delete(String id);
}
