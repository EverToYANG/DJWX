package com.gsccs.cms.core.service.impl;

import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.gsccs.cms.core.dao.TempletMapper;
import com.gsccs.cms.core.model.Templet;
import com.gsccs.cms.core.model.TempletExample;
import com.gsccs.cms.core.model.TempletExample.Criteria;
import com.gsccs.cms.core.service.TempletService;


/**
 * 模板服务
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
@Service
public class TempletServiceImpl implements TempletService{

	@Resource
	private TempletMapper templetMapper;
	

	/**
	 * 获取同级最大排序号
	 * @param parid
	 * @return
	 */
	public int maxNum(){
		List<Templet> list=find(null, "ordernum desc", 1, 1);
		if (list!=null && list.size()>0) {
			Templet templet=list.get(0);
			if (templet.getOrdernum()!=null) {
				return list.get(0).getOrdernum()+1;
			}
		}
		return 0;
	}
	/**
	 * 分页查询
	 * @param info
	 * @param order
	 * @param currPage
	 * @param pageSize
	 * @param loginAdmin
	 * @return
	 */
	public List<Templet> find(Templet templet,String order,int currPage,int pageSize){
		TempletExample example=new TempletExample();
		Criteria criteria=example.createCriteria();
		proSearchParam(templet, criteria);
		if (order!=null && order.trim().length()>0) {
			example.setOrderByClause(order);
		}
		example.setCurrPage(currPage);
		example.setPageSize(pageSize);
		return templetMapper.selectPageByExample(example);
	}
	
	
	/**
	 * 站点模板分页查询
	 * @param info
	 * @param order
	 * @param currPage
	 * @param pageSize
	 * @param loginAdmin
	 * @return
	 */
	public List<Templet> findPageTemSite(Templet templet,String order,int currPage,int pageSize){
		TempletExample example=new TempletExample();
		Criteria criteria=example.createCriteria();
		proSearchParam(templet, criteria);
		if (order!=null && order.trim().length()>0) {
			example.setOrderByClause(order);
		}
		example.setCurrPage(currPage);
		example.setPageSize(pageSize);
		return templetMapper.selectPageSiteTemplet(example);
	}
	
	
	/**
	 * 查询
	 * @param info
	 * @param order
	 * @param currPage
	 * @param pageSize
	 * @param loginAdmin
	 * @return
	 */
	public List<Templet> findAll(Templet templet,String order){
		TempletExample example=new TempletExample();
		Criteria criteria=example.createCriteria();
		proSearchParam(templet, criteria);
		if (order!=null && order.trim().length()>0) {
			example.setOrderByClause(order);
		}
		return templetMapper.selectByExample(example);
	}
	
	/**
	 * 根据站点Id进行分页查询
	 * @param templetSitelist
	 * @param templet
	 * @param order
	 * @param currPage
	 * @param pageSize
	 * @return
	 */
	public List<Templet> findBysiteId(List<String> sList,Templet templet,String order,int currPage,int pageSize){
		TempletExample example=new TempletExample();
		Criteria criteria=example.createCriteria();
		
		//proSearchTmpletId(sList,criteria);
		
		proSearchParam(sList ,templet, criteria);
		if (order!=null && order.trim().length()>0) {
			example.setOrderByClause(order);
		}
		example.setCurrPage(currPage);
		example.setPageSize(pageSize);
		return templetMapper.selectPageByExample(example);
	}

	
	public List<Templet> findBysiteId(List<String> sList,Templet templet){
		TempletExample example=new TempletExample();
		Criteria criteria=example.createCriteria();
		
		//proSearchTmpletId(sList,criteria);
		
		proSearchParam(sList ,templet, criteria);
		
		return templetMapper.selectByExample(example);
	}

	
	/**
	 * 根据站点Id进行分页查询
	 * @param templetSitelist
	 * @param templet
	 * @param order
	 * @param currPage
	 * @param pageSize
	 * @return
	 */
	public List<Templet> findAllBysiteNotId(List<String> sList,Templet templet,String order,int currPage,int pageSize){
		TempletExample example=new TempletExample();
		Criteria criteria=example.createCriteria();
		
		//proSearchTmpletId(sList,criteria);
		
		proSearchParamNotIn(sList ,templet, criteria);
		if (order!=null && order.trim().length()>0) {
			example.setOrderByClause(order);
		}
		example.setCurrPage(currPage);
		example.setPageSize(pageSize);
		return templetMapper.selectPageByExample(example);
	}

	
	/**
	 * 根据站点Id进行分页查询
	 * @param templetSitelist
	 * @param templet
	 * @param order
	 * @param currPage
	 * @param pageSize
	 * @return
	 */
	public List<Templet> findAllBysiteId(List<String> sList,Templet templet,String order){
		TempletExample example=new TempletExample();
		Criteria criteria=example.createCriteria();
		
		//proSearchTmpletId(sList,criteria);
		
		proSearchParam(sList ,templet, criteria);
		if (order!=null && order.trim().length()>0) {
			example.setOrderByClause(order);
		}
		return templetMapper.selectByExample(example);
	}

	
	
	/**
	 * 判断在templetId 存在下查询
	 * niu. x j
	 * @param templetSitelist
	 * @param criteria
	 */
	public void proSearchTmpletId(List<String> list,Criteria criteria){
		if(list.size() > 0){
			criteria.andIdIn(list);
		}
	}
	
	
	
	/**
	 * 统计
	 * @param info
	 * @return
	 */
	public int count(Templet templet){
		TempletExample example=new TempletExample();
		Criteria criteria=example.createCriteria();
		proSearchParam(templet, criteria);
		return templetMapper.countByExample(example);
	}
	/**
	 * 处理查询条件
	 * @param info
	 * @param criteria
	 */
	public void proSearchParam(Templet templet,Criteria criteria){
		if (templet!=null ) {
			if (templet.getName()!=null && templet.getName().trim().length()>0) {
				criteria.andNameLike("%"+templet.getName()+"%");
			}
			if (templet.getNoDel()!=null && templet.getNoDel().trim().length()>0) {
				criteria.andStateNotEqualTo(Templet.STATE_DEL);
			}
			if (templet.getAdduser()!=null && templet.getAdduser().trim().length()>0) {
				criteria.andAdduserEqualTo(templet.getAdduser());
			}
			if (StringUtils.isNotEmpty(templet.getSql())) {
				criteria.andSql(templet.getSql());
			}
			if (templet.getUsesites()!=null && templet.getUsesites().trim().length()>0) {
				if ("newSite".equals(templet.getUsesites())) {
					criteria.andSql(" usesites='' ");
				}else {
					criteria.andSql(" (usesites like '%"+templet.getUsesites()+";%' or usesites='') ");
				}
			}
		}
	}
	
	
	/**
	 * 处理查询条件
	 * @param info
	 * @param criteria
	 */
	public void proSearchParam(List<String> sList,Templet templet,Criteria criteria){
	    criteria = criteria.andIdIn(sList);
		if (templet!=null ) {
			if (templet.getName()!=null && templet.getName().trim().length()>0) {
				criteria = criteria.andNameLike("%"+templet.getName()+"%");
			}
			if (templet.getNoDel()!=null && templet.getNoDel().trim().length()>0) {
				criteria = criteria.andStateNotEqualTo(Templet.STATE_DEL);
			}
		}
	}
	
	
	/**
	 * 处理查询条件
	 * @param info
	 * @param criteria
	 */
	public void proSearchParamNotIn(List<String> sList,Templet templet,Criteria criteria){
	    criteria = criteria.andIdNotIn(sList);
		if (templet!=null ) {
			if (templet.getName()!=null && templet.getName().trim().length()>0) {
				criteria = criteria.andNameLike("%"+templet.getName()+"%");
			}
			if (templet.getNoDel()!=null && templet.getNoDel().trim().length()>0) {
				criteria = criteria.andStateNotEqualTo(Templet.STATE_DEL);
			}
		}
	}
	/**
	 * 根据id查询
	 * @param id
	 * @return
	 */
	public Templet findById(String id){
		return templetMapper.selectByPrimaryKey(id);
	}
	/**
	 * 更新
	 * @param templet
	 */
	public void update(Templet templet){
		templetMapper.updateByPrimaryKey(templet);
	}
	/**
	 * 添加
	 * @param templet
	 * @return
	 */
	public String add(Templet templet){
		templet.setId(UUID.randomUUID().toString());
		templetMapper.insert(templet);
		return templet.getId();
	}
	/**
	 * 下降
	 */
	public void down(Templet templet) {
		if (templet!=null) {
			//查询同级别下面第一个的排序
			Templet templet2=new Templet();
			templet2.setSql(" id<>'"+templet.getId()+"' and ordernum>="+templet.getOrdernum());
			List<Templet> templetList=find(templet2, " ordernum ", 1, 1);
			if (templetList!=null && templetList.size()>0) {
				Templet nexttemplet=templetList.get(0);
				if (nexttemplet!=null) {
					if (nexttemplet.getOrdernum().equals(templet.getOrdernum())) {
						templet.setOrdernum(nexttemplet.getOrdernum()+1);
					}else {
						int nextNum=nexttemplet.getOrdernum();
						nexttemplet.setOrdernum(templet.getOrdernum());
						templet.setOrdernum(nextNum);
					}
					update(templet);
					update(nexttemplet);
				}
			}
		}
	}
	/**
	 * 上升
	 */
	public void up(Templet templet) {
		if (templet!=null) {
			//查询同级别上面第一个菜单的排序
			Templet templet2=new Templet();
			templet2.setSql(" id<>'"+templet.getId()+"' and ordernum<="+templet.getOrdernum());
			List<Templet> templetList=find(templet2, " ordernum desc ", 1, 1);
			if (templetList!=null && templetList.size()>0) {
				Templet nexttemplet=templetList.get(0);
				if (nexttemplet!=null) {
					if (nexttemplet.getOrdernum().equals(templet.getOrdernum())) {
						templet.setOrdernum(nexttemplet.getOrdernum()-1);
					}else {
						int nextNum=nexttemplet.getOrdernum();
						nexttemplet.setOrdernum(templet.getOrdernum());
						templet.setOrdernum(nextNum);
					}
					update(templet);
					update(nexttemplet);
				}
			}
		}
	}
	
	
	

	public TempletMapper getTempletMapper() {
		return templetMapper;
	}

	public void setTempletMapper(TempletMapper templetMapper) {
		this.templetMapper = templetMapper;
	}
}
