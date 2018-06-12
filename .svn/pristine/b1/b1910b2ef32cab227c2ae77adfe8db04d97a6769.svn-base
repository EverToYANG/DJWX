package com.gsccs.cms.core.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.gsccs.cms.core.model.Channel;

import freemarker.template.TemplateException;


/**
 * 栏目相关服务
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
public interface ChannelService {
	
	public static String hasNextPage="<!--INFO_NEXT_PAGE-->";

	/**
	 * 下降
	 */
	public void down(Channel channel);
	/**
	 * 上升
	 */
	public void up(Channel channel);
	/**
	 * 分页查询
	 */
	public List<Channel> find(Channel channel,String order,int currPage,int pageSize);
	
	/**
	 * 查询是否有子数据
	 * @param parId
	 * @return
	 */
	public boolean hasChildren(Long parId);
	/**
	 * 根据站点id,索引号查询
	 * @param siteid
	 * @param pagemark
	 * @return
	 */
	public Channel findBySiteIndexnum(String siteid,Integer indexnum);
	/**
	 * 根据站点和父id查询
	 * @param siteid
	 * @param parid
	 * @return
	 */
	public List<Channel> findByParWithBLOBs(String siteid,Long parid);
	/**
	 * 根据站点和父id查询
	 * @param siteid
	 * @param parid
	 * @return
	 */
	public List<Channel> findByPar(String siteid,Long parid);
	/**
	 * 根据站点和父id查询
	 * @param siteid
	 * @param parid
	 * @return
	 */
	public List<Channel> findByPar(String siteid,Long parid,String state,String navigation);
	/**
	 * 根据站点和父id查询
	 * @param siteid
	 * @param parid
	 * @return
	 */
	public List<Channel> findByParWithBLOBs(String siteid,Long parid,String state,String navigation);
	/**
	 * 根据站点查询
	 * @param siteid
	 * @param parid
	 * @return
	 */
	public List<Channel> findBySite(String siteid,String state,String navigation);

	/**
	 * 根据id查询
	 * @param id
	 * @return
	 */
	public Channel findById(Long id);
	/**
	 * 更新
	 * @param channel
	 */
	public void update(Channel channel);
	/**
	 * 添加
	 * @param channel
	 */
	public Long insert(Channel channel);

	/**
	 * 删除
	 * @param id
	 */
	public void del(Long id);
	/**
	 * 递归删除
	 * @param parId
	 */
	public void delPar(Long parId);
	
	/**
	 * 查询所有子栏目
	 * @param siteid
	 * @param parid
	 * @param state
	 * @param navigation
	 * @return
	 */
	public List<Channel> findSon(String siteid,Long parid,String state,String navigation);
	/**
	 * 查询所有子栏目（递归）
	 * @param siteid
	 * @param parid
	 * @param state
	 * @param navigation
	 * @return
	 */
	public List<Channel> findSonPro(List<Channel> list,String siteid,Long parid,String state,String navigation);
	
}
