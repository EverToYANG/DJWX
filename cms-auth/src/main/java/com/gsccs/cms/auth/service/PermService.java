package com.gsccs.cms.auth.service;

import java.util.List;







import com.gsccs.cms.auth.model.Oper;


/**
 * 关于操作按钮的相关服务
 * @author x.d zhang
 * 2013-4-8
 */
public interface PermService{

	/**
	 * 查询所有
	 * @param funcid
	 * @return
	 */
	public List<Oper> findAll();
	/**
	 * 查询用户所有操作
	 * @return
	 */
	public List<Oper> selectAllOper(String userid);
	/**
	 * 查询菜单下有效操作按钮
	 * @param funcid
	 * @return
	 */
	public List<Oper> findByFuncOk(String funcid);
	/**
	 * 查询菜单下有效操作按钮
	 * @param funcid
	 * 
	 * @return
	 */
	public List<Oper> findByFunc(String funcid);
	
	/**
	 * 查询当前用户该菜单下有效操作按钮
	 * @param funcid
	 * @param userId
	 * @return
	 */
	public List<Oper> findByFunc(String funcid,String userId);
	/**
	 * 查询操作按钮
	 * @param funcid
	 * @return
	 */
	public Oper findById(String id);
	/**
	 * 判断操作按钮名是否存在
	 * @param name
	 * @return
	 */
	public boolean haveName(String funcId,String name);
	/**
	 * 添加
	 * @param operbutton
	 */
	public void insert(Oper operbutton);
	/**
	 * 更新
	 * @param operbutton
	 */
	public void update(Oper operbutton);
	/**
	 * 删除
	 * @param id
	 */
	public void delete(String id);
}
