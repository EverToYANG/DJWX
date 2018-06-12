package com.gsccs.cms.auth.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.gsccs.cms.auth.model.Operlogs;
/**
 * 
 * 操作日志服务 </p>
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
public interface OperlogService {

	/**
	 * 记录日志
	 * @param loginname
	 * @param content
	 * @param request
	 */
	public void log(String loginname,String content,HttpServletRequest request);
	/**
	 * 分页查询
	 */
	public List<Operlogs> find(Operlogs Operlogs,String order,int currPage,int pageSize);

	/**
	 * 查询
	 */
	public List<Operlogs> find(Operlogs Operlogs,String order,boolean cache);
	/**
	 * 统计
	 * @param info
	 * @return
	 */
	public int count(Operlogs Operlogs);
}
