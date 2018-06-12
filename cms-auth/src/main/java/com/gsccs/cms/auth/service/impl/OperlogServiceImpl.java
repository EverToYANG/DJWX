package com.gsccs.cms.auth.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.gsccs.cms.auth.dao.OperlogsMapper;
import com.gsccs.cms.auth.model.Operlogs;
import com.gsccs.cms.auth.model.OperlogsExample;
import com.gsccs.cms.auth.model.OperlogsExample.Criteria;
import com.gsccs.cms.auth.service.OperlogService;
import com.gsccs.cms.bass.utils.HtmlCode;

/**
 * 操作日志相关服务
 * 
 * @author x.d zhang
 * @version 1.0
 */
@Service
public class OperlogServiceImpl implements OperlogService{

	@Resource
	private OperlogsMapper operlogsMapper;
	
	public void log(String loginname,String content,HttpServletRequest request){
		try {
			if (content!=null && content.trim().length()>0) {
				Operlogs log=new Operlogs();
				log.setId(UUID.randomUUID().toString());
				log.setContent(HtmlCode.replaceHtml(content));
				log.setIp(request.getRemoteAddr());
				log.setLoginname(loginname);
				log.setOpertime(new Date());
				
				operlogsMapper.insert(log);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 分页查询
	 */
	public List<Operlogs> find(Operlogs Operlogs,String order,int currPage,int pageSize){
		OperlogsExample example=new OperlogsExample();
		Criteria criteria=example.createCriteria();
		proSearchParam(Operlogs, criteria);
		if (order!=null && order.trim().length()>0) {
			example.setOrderByClause(order);
		}
		example.setCurrPage(currPage);
		example.setPageSize(pageSize);
		return operlogsMapper.selectPageByExample(example);
	}
	

	/**
	 * 查询
	 */
	public List<Operlogs> find(Operlogs Operlogs,String order,boolean cache){
		OperlogsExample example=new OperlogsExample();
		Criteria criteria=example.createCriteria();
		proSearchParam(Operlogs, criteria);
		if (order!=null && order.trim().length()>0) {
			example.setOrderByClause(order);
		}
		return operlogsMapper.selectByExample(example);
	}
	/**
	 * 统计
	 * @param info
	 * @return
	 */
	public int count(Operlogs Operlogs){
		OperlogsExample example=new OperlogsExample();
		Criteria criteria=example.createCriteria();
		proSearchParam(Operlogs, criteria);
		return operlogsMapper.countByExample(example);
	}
	/**
	 * 处理查询条件
	 * @param info
	 * @param criteria
	 */
	public void proSearchParam(Operlogs operlog,Criteria criteria){
		if (operlog!=null ) {
			if (operlog.getLoginname()!=null && operlog.getLoginname().trim().length()>0) {
				criteria.andLoginnameEqualTo(operlog.getLoginname().trim());
			}
			if (operlog.getLoginnamelike()!=null && operlog.getLoginnamelike().trim().length()>0) {
				criteria.andLoginnameLike("%"+operlog.getLoginnamelike().trim()+"%");
			}
			if (operlog.getContent()!=null && operlog.getContent().trim().length()>0) {
				criteria.andContentLike("%"+operlog.getContent().trim()+"%");
			}
			if (operlog.getIp()!=null && operlog.getIp().trim().length()>0) {
				criteria.andIpLike("%"+operlog.getIp().trim()+"%");
			}
		}
	}
}
