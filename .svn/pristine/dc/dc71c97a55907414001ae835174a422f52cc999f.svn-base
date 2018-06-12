package com.gsccs.cms.auth.service;

import java.util.List;






import com.gsccs.cms.auth.model.Msg;
import com.gsccs.cms.auth.model.MsgExample.Criteria;

public interface MsgService {

	/**
	 * 分页查询
	 */
	public List<Msg> find(Msg Msg,String order,int currPage,int pageSize);
	/**
	 * 统计
	 * @param info
	 * @return
	 */
	public int count(Msg msg);

	/**
	 * 处理查询条件
	 * @param info
	 * @param criteria
	 */
	public void proSearchParam(Msg msg,Criteria criteria);
	/**
	 * 根据id查询
	 * @param id
	 * @param cache
	 * @return
	 */
	public Msg findById(String id);
	/**
	 * 更新
	 * @param question
	 */
	public void update(Msg msg);
	/**
	 * 添加
	 * @param question
	 * @return
	 */
	public String add(Msg msg);
	/**
	 * 删除 
	 * @param id
	 */
	public void del(String id);
}
