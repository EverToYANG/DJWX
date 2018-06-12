package com.gsccs.cms.auth.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.gsccs.cms.auth.model.Unit;

public interface UnitService {

	/**
	 * 查询是否有子数据
	 * 
	 * @param parId
	 * @return
	 */
	public boolean hasChildren(Long parId);

	/**
	 * 根据id查询
	 * 
	 * @param id
	 * @return
	 */
	public Unit findById(Long id);

	/**
	 * 根据用户查询用户所属有效单位
	 * 
	 * @param user
	 * @return
	 */
	public List<Unit> findByUser(String user);

	/**
	 * 查询所有单位，顶级单位和下级单位
	 * 
	 * @param parid
	 *            上级单位id
	 * @return list
	 */
	public List<Unit> selectUnit(Long parid);

	/**
	 * 根据查询
	 * 
	 * @param isok
	 * @return
	 */
	public List<Unit> findByUser(String isok, String user);

	/**
	 * 调用unit_del存储过程
	 * 
	 * @param roleId
	 */
	public void callUnitDelPro(Long unitId);

	/**
	 * 调用unit_update存储过程
	 * 
	 * @param roleId
	 */
	public void callUnitUpdatePro(Long unitId);

	/**
	 * 根据父id查询
	 * 
	 * @param parid
	 * @return
	 */
	public List<Unit> findByPar(Long parid, String isok, String ismail,
			boolean cache);

	/**
	 * 添加
	 * 
	 * @param unit
	 */
	public void insert(Unit unit);

	/**
	 * 编辑
	 * 
	 * @param unit
	 */
	public void update(Unit unit);

	/**
	 * 分页查询
	 */
	public List<Unit> find(Unit unit, String order, int currPage, int pageSize);

	/**
	 * 递归删除
	 * 
	 * @param id
	 */
	public void delete(Long id);

	/**
	 * 上升
	 * 
	 * @param unit
	 */
	public void up(Unit unit);

	/**
	 * 下降
	 * 
	 * @param unit
	 */
	public void down(Unit unit);

	/**
	 * 查询所有
	 * 
	 * @param unit
	 * @return
	 */
	public List<Unit> findAll(Unit unit, String order);
	
	/**
	 * 根据微信应用ID查询组织机构
	 * 
	 * @param unit
	 * @return
	 */
	public List<Unit> findByCorpid(String wxappid);

	/**
	 * 生成树
	 * 
	 * @param roleid
	 * @return
	 */
	public String createTree(HttpServletRequest request, String selectids);
}
