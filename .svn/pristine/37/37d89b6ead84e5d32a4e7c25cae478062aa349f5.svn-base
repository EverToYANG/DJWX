package com.gsccs.cms.core.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.gsccs.cms.auth.service.ConfigService;
import com.gsccs.cms.auth.service.OperlogService;
import com.gsccs.cms.core.dao.ChannelMapper;
import com.gsccs.cms.core.model.Channel;
import com.gsccs.cms.core.model.ChannelExample;
import com.gsccs.cms.core.model.ChannelExample.Criteria;
import com.gsccs.cms.core.service.ChannelService;
import com.gsccs.cms.core.service.SiteService;

import freemarker.template.TemplateException;

/**
 * 栏目相关服务
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
@Service("channelService")
public class ChannelServiceImpl implements ChannelService {

	@Resource
	private ChannelMapper channelMapper;
	@Resource
	private SiteService siteService;
	@Resource
	private OperlogService operlogService;
	@Resource
	private ConfigService configService;

	/**
	 * 下降
	 */
	public void down(Channel channel) {
		if (channel != null) {
			// 查询同级别下面第一个的排序
			Channel channel2 = new Channel();
			channel2.setSite(channel.getSite());
			channel2.setParid(channel.getParid());
			if (null==channel.getParid()) {
				channel2.setParid(0l);
			}
			channel2.setSql(" id<>'" + channel.getId() + "' and ordernum>="
					+ channel.getOrdernum());
			List<Channel> channelList = find(channel2, " ordernum ", 1, 1);
			if (channelList != null && channelList.size() > 0) {
				Channel nextchannel = channelList.get(0);
				if (nextchannel != null) {
					if (nextchannel.getOrdernum().equals(channel.getOrdernum())) {
						channel.setOrdernum(nextchannel.getOrdernum() + 1);
					} else {
						int nextNum = nextchannel.getOrdernum();
						nextchannel.setOrdernum(channel.getOrdernum());
						channel.setOrdernum(nextNum);
					}
					update(channel);
					update(nextchannel);
				}
			}
		}
	}

	/**
	 * 上升
	 */
	public void up(Channel channel) {
		if (channel != null) {
			// 查询同级别上面第一个菜单的排序
			Channel channel2 = new Channel();
			channel2.setSite(channel.getSite());
			channel2.setParid(channel.getParid());
			if (null==channel.getParid()) {
				channel2.setParid(0l);
			}
			channel2.setSql(" id<>'" + channel.getId() + "' and ordernum<="
					+ channel.getOrdernum());
			List<Channel> channelList = find(channel2, " ordernum desc ", 1, 1);
			if (channelList != null && channelList.size() > 0) {
				Channel nextchannel = channelList.get(0);
				if (nextchannel != null) {
					if (nextchannel.getOrdernum().equals(channel.getOrdernum())) {
						channel.setOrdernum(nextchannel.getOrdernum() - 1);
					} else {
						int nextNum = nextchannel.getOrdernum();
						nextchannel.setOrdernum(channel.getOrdernum());
						channel.setOrdernum(nextNum);
					}
					update(channel);
					update(nextchannel);
				}
			}
		}
	}


	/**
	 * 分页查询
	 */
	public List<Channel> find(Channel channel, String order, int currPage,
			int pageSize) {
		ChannelExample example = new ChannelExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(channel, criteria);
		if (order != null && order.trim().length() > 0) {
			example.setOrderByClause(order);
		}
		example.setCurrPage(currPage);
		example.setPageSize(pageSize);
		return channelMapper.selectPageByExample(example);
	}

	/**
	 * 处理查询条件
	 * 
	 * @param info
	 * @param criteria
	 */
	public void proSearchParam(Channel channel, Criteria criteria) {
		if (channel != null) {
			if (null != channel.getParid()) {
				if (channel.getParid().longValue()==0) {
					criteria.andSql(" (parid is null or parid=0) ");
				} else {
					criteria.andParidEqualTo(channel.getParid());
				}
			}
			if (StringUtils.isNotEmpty(channel.getSql())) {
				criteria.andSql(channel.getSql());
			}
			if (StringUtils.isNotEmpty(channel.getSite())) {
				List<String> siteids = new ArrayList();
				siteids.add("0");
				siteids.add(channel.getSite());
				criteria.andSiteIn(siteids);
			}
		}
	}

	/**
	 * 查询是否有子数据
	 * 
	 * @param parId
	 * @return
	 */
	public boolean hasChildren(Long parId) {
		ChannelExample example = new ChannelExample();
		Criteria criteria = example.createCriteria();
		criteria.andParidEqualTo(parId);
		return channelMapper.countByExample(example) > 0;
	}


	/**
	 * 根据站点id,索引号查询
	 * 
	 * @param siteid
	 * @param pagemark
	 * @return
	 */
	public Channel findBySiteIndexnum(String siteid, Integer indexnum) {
		ChannelExample example = new ChannelExample();
		Criteria criteria = example.createCriteria();
		criteria.andSql(" index=" + indexnum + " ");
		List<Channel> channelList = channelMapper
				.selectByExampleWithBLOBs(example);
		if (channelList != null && channelList.size() > 0) {
			return channelList.get(0);
		}
		return null;
	}

	/**
	 * 根据站点和父id查询
	 * 
	 * @param siteid
	 * @param parid
	 * @return
	 */
	public List<Channel> findByParWithBLOBs(String siteid, Long parid) {
		return findByParWithBLOBs(siteid, parid, null, null);
	}

	/**
	 * 根据站点和父id查询
	 * 
	 * @param siteid
	 * @param parid
	 * @return
	 */
	public List<Channel> findByPar(String siteid, Long parid) {
		return findByPar(siteid, parid, null, null);
	}

	/**
	 * 根据站点和父id查询
	 * 
	 * @param siteid
	 * @param parid
	 * @return
	 */
	public List<Channel> findByPar(String siteid, Long parid, String state,
			String navigation) {
		ChannelExample example = new ChannelExample();
		Criteria criteria = example.createCriteria();
		if (siteid != null && siteid.trim().length() > 0) {
			List<String> siteids = new ArrayList();
			siteids.add("0");
			siteids.add(siteid.trim());
			criteria.andSiteIn(siteids);
		}
		if (parid != null) {
			criteria.andParidEqualTo(parid);
		}else{
			criteria.andSql(" (parid is null or parid =0) ");
		}
		
		if (state != null && state.trim().length() > 0) {
			criteria.andStateEqualTo(state.trim());
		}
		if (navigation != null && navigation.trim().length() > 0) {
			criteria.andNavigationEqualTo(navigation.trim());
		}
		example.setOrderByClause(" orderNum ");
		return channelMapper.selectByExample(example);
	}

	/**
	 * 根据站点和父id查询
	 * 
	 * @param siteid
	 * @param parid
	 * @return
	 */
	public List<Channel> findByParWithBLOBs(String siteid, Long parid,
			String state, String navigation) {
		ChannelExample example = new ChannelExample();
		Criteria criteria = example.createCriteria();
		if (siteid != null && siteid.trim().length() > 0) {
			List<String> siteids = new ArrayList();
			siteids.add("0");
			siteids.add(siteid.trim());
			criteria.andSiteIn(siteids);
		}
		if (parid != null) {
			criteria.andParidEqualTo(parid);
		}else{
			criteria.andSql(" (parid is null or parid =0) ");
		}
		if (state != null && state.trim().length() > 0) {
			criteria.andStateEqualTo(state.trim());
		}
		if (navigation != null && navigation.trim().length() > 0) {
			criteria.andNavigationEqualTo(navigation.trim());
		}
		example.setOrderByClause(" orderNum ");
		return channelMapper.selectByExampleWithBLOBs(example);
	}

	/**
	 * 根据站点查询
	 * 
	 * @param siteid
	 * @param parid
	 * @return
	 */
	public List<Channel> findBySite(String siteid, String state,
			String navigation) {
		ChannelExample example = new ChannelExample();
		Criteria criteria = example.createCriteria();
		if (siteid != null && siteid.trim().length() > 0) {
			List<String> siteids = new ArrayList();
			siteids.add("0");
			siteids.add(siteid.trim());
			criteria.andSiteIn(siteids);
		}
		if (state != null && state.trim().length() > 0) {
			criteria.andStateEqualTo(state.trim());
		}
		if (navigation != null && navigation.trim().length() > 0) {
			criteria.andNavigationEqualTo(navigation.trim());
		}
		example.setOrderByClause(" orderNum ");
		return channelMapper.selectByExample(example);
	}

	/**
	 * 根据id查询
	 * 
	 * @param id
	 * @return
	 */
	public Channel findById(Long id) {
		return channelMapper.selectByPrimaryKey(id);
	}

	/**
	 * 更新
	 * 
	 * @param channel
	 */
	public void update(Channel channel) {
		channelMapper.updateByPrimaryKeyWithBLOBs(channel);
	}

	
	/**
	 * 添加
	 * 
	 * @param channel
	 */
	public Long insert(Channel channel) {
		if (null != channel){
			Long parid = channel.getParid()==null?0:channel.getParid();
			channel.setParid(parid);
			channelMapper.insert(channel);
			return channel.getId();
		}
		return null;
	}

	
	/**
	 * 删除
	 * 
	 * @param siteId
	 * @throws IOException
	 */
	public void del(Long id) {
		Channel channel = findById(id);
		if (channel != null) {
			delPar(id);
			channelMapper.deleteByPrimaryKey(id);
		}
	}

	/**
	 * 递归删除
	 * 
	 * @param parId
	 * @throws TemplateException
	 * @throws IOException
	 */
	public void delPar(Long parId) {
		ChannelExample example = new ChannelExample();
		Criteria criteria = example.createCriteria();
		criteria.andParidEqualTo(parId);
		List<Channel> channelList = channelMapper.selectByExample(example);
		if (channelList != null && channelList.size() > 0) {
			for (int i = 0; i < channelList.size(); i++) {
				delPar(channelList.get(i).getId());
			}
		}
		channelMapper.deleteByPrimaryKey(parId);
	}
	

	/**
	 * 查询所有子栏目
	 * 
	 * @param siteid
	 * @param parid
	 * @param state
	 * @param navigation
	 * @return
	 */
	public List<Channel> findSon(String siteid, Long parid, String state,
			String navigation) {
		List<Channel> list = new ArrayList<Channel>();
		return findSonPro(list, siteid, parid, state, navigation);
	}

	/**
	 * 查询所有子栏目（递归）
	 * 
	 * @param siteid
	 * @param parid
	 * @param state
	 * @param navigation
	 * @return
	 */
	public List<Channel> findSonPro(List<Channel> list, String siteid,
			Long parid, String state, String navigation) {
		List<Channel> sonlist = findByPar(siteid, parid, state, navigation);
		if (sonlist != null && sonlist.size() > 0) {
			for (int i = 0; i < sonlist.size(); i++) {
				list.add(sonlist.get(i));// 添加到总集合中
				// 处理子栏目
				findSonPro(list, siteid, sonlist.get(i).getId(), state,
						navigation);
			}
		}
		return list;
	}
	
}
