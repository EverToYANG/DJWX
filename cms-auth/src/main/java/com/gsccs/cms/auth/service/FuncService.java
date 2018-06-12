package com.gsccs.cms.auth.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.gsccs.cms.auth.model.Func;
import com.gsccs.cms.auth.model.Msg;
import com.gsccs.cms.auth.model.MsgExample;
import com.gsccs.cms.auth.model.MsgExample.Criteria;

/**
 * 功能菜单相关服务
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
public interface FuncService {
	/**
	 * 判断是否有子菜单
	 * 
	 * @param parId
	 * @return
	 */
	public boolean haveSon(String parId);

	/**
	 * 查询根菜单
	 * 
	 * @return
	 */
	public List<Func> selectRoot();

	/**
	 * 查询所有
	 * 
	 * @return
	 */
	public List<Func> selectAll(String isok);

	/**
	 * 查询所有有权限的
	 * 
	 * @return
	 */
	public List<Func> selectAllAuth(String userid);

	/**
	 * 根据用户查询根菜单
	 * 
	 * @return
	 */
	public List<Func> selectRootAuth(String userid);

	/**
	 * 查询根菜单
	 * 
	 * @return
	 */
	public List<Func> selectByParid(String par);

	/**
	 * 根据查询根菜单
	 * 
	 * @return
	 */
	public List<Func> selectByParidAuth(String par, String userid);

	/**
	 * 根据id查询菜单
	 * 
	 * @return
	 */
	public Func selectById(String id);

	/**
	 * 更新
	 * 
	 * @param func
	 */
	public void update(Func func);

	/**
	 * 更新所属菜单
	 * 
	 * @param func
	 */
	public void updatePar(Func func);

	/**
	 * 添加
	 * 
	 * @param func
	 */
	public void insert(Func func);

	/**
	 * 递归删除
	 * 
	 * @param id
	 */
	public void delete(String id);

	/**
	 * 根据菜单id获取所有父级菜单
	 * 
	 * @param funcId
	 * @param funcList
	 * @return
	 */
	public List<Func> getPars(String funcId, List<Func> funcList);

	
	/**
	 * 根据菜单id获取所有父级菜单(从session中提取数据)
	 * 
	 * @param funcId
	 * @param funcList
	 * @return
	 */
	public List<Func> getPars(HttpSession session, String funcId,
			List<Func> funcList);

	/**
	 * 根据菜单id获取所有子级菜单
	 * 
	 * @param funcId
	 * @param funcList
	 * @return
	 */
	public List<Func> getSons(String funcId, List<Func> funcList, Integer level);

	/**
	 * 上升
	 * 
	 * @param func
	 */
	public void up(Func func);

	/**
	 * 下降
	 * 
	 * @param func
	 */
	public void down(Func func);

	/**
	 * 分页查询
	 */
	public List<Func> find(Func func, String order, int currPage, int pageSize);

	/**
	 * 获取同级最大排序号
	 * 
	 * @param parid
	 * @return
	 */
	public int maxNum(String parid);

	/**
	 * 生成左侧菜单树
	 * 
	 * @param roleid
	 * @return
	 */
	public String createTree(HttpServletRequest request, String parid,
			List<Func> list);

	/**
	 * 生成左侧菜单树
	 * 
	 * @return
	 */
	public List<Func> createTree(String parid, List<Func> list);
}
