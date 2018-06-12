package com.gsccs.cms.module.service.impl;

import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.gsccs.cms.module.dao.ConsultMapper;
import com.gsccs.cms.module.model.Consult;
import com.gsccs.cms.module.model.ConsultExample;
import com.gsccs.cms.module.model.ConsultExample.Criteria;
import com.gsccs.cms.module.service.ConsultService;

/**
 * 留言本相关服务
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
@Service
public class ConsultServiceImpl implements ConsultService {

	@Resource
	private ConsultMapper consultMapper;

	/**
	 * 分页查询
	 */
	public List<Consult> find(Consult param, String order, int currPage,
			int pageSize, boolean cache) {
		ConsultExample example = new ConsultExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(param, criteria);
		if (order != null && order.trim().length() > 0) {
			example.setOrderByClause(order);
		}
		example.setCurrPage(currPage);
		example.setPageSize(pageSize);
		if (cache) {
			return consultMapper.selectPageByExampleCache(example);
		} else {
			return consultMapper.selectPageByExample(example);
		}
	}

	/**
	 * 统计
	 * 
	 * @param guestbook
	 * @return
	 */
	public int count(Consult Guestbook, boolean cache) {
		ConsultExample example = new ConsultExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(Guestbook, criteria);
		if (cache) {
			return consultMapper.countByExampleCache(example);
		} else {
			return consultMapper.countByExample(example);
		}
	}

	/**
	 * 处理查询条件
	 * 
	 * @param guestbook
	 * @param criteria
	 */
	public void proSearchParam(Consult param, Criteria criteria) {
		if (null == param) {
			criteria.andParidIsNull();
		}
		if (param != null) {
			if (StringUtils.isNotEmpty(param.getSiteid())) {
				criteria.andSiteidEqualTo(param.getSiteid());
			}
			if (StringUtils.isNotEmpty(param.getTitle())) {
				criteria.andTitleLike("%" + param.getTitle() + "%");
			}

			if (null != param.getIclassid()) {
				criteria.andIclassidEqualTo(param.getIclassid());
			}
			if (StringUtils.isNotEmpty(param.getName())) {
				criteria.andNameLike("%" + param.getName() + "%");
			}
			if (StringUtils.isNotEmpty(param.getState())) {
				criteria.andStateEqualTo(param.getState());
			}
			if (StringUtils.isNotEmpty(param.getMemberid())) {
				criteria.andMemberidEqualTo(param.getMemberid());
			}
			if (param.getStarttime() != null) {
				criteria.andAddtimeGreaterThanOrEqualTo(param.getStarttime());
			}
			if (param.getEndtime() != null) {
				criteria.andAddtimeLessThanOrEqualTo(param.getEndtime());
			}
			if (StringUtils.isNotEmpty(param.getSitename())) {
				criteria.andSitenameLike("%" + param.getSitename() + "%");
			}

			if (StringUtils.isNotEmpty(param.getType())) {
				criteria.andTypeEqualTo(param.getType());
			}
			if (StringUtils.isNotEmpty(param.getIsshow())) {
				criteria.andIsshowEqualTo(param.getIsshow());
			}
			if (StringUtils.isNotEmpty(param.getTel())) {
				criteria.andTelEqualTo(param.getTel());
			}

			if (null != param.getParid()) {
				criteria.andParidEqualTo(param.getParid());
			} else {
				criteria.andParidIsNull();
			}
		}
	}

	/**
	 * 根据id查询
	 * 
	 * @param id
	 * @param cache
	 * @return
	 */
	public Consult findById(Long id) {
		return consultMapper.selectByPrimaryKey(id);
	}

	/**
	 * 更新
	 * 
	 * @param question
	 */
	public void update(Consult param) {
		consultMapper.updateByPrimaryKeySelective(param);
	}

	/**
	 * 添加
	 * 
	 * @param question
	 * @return
	 */
	public Long add(Consult param) {
		if (null == param) {
			return null;
		}
		consultMapper.insert(param);
		return param.getId();
	}

	/**
	 * 删除
	 * 
	 * @param id
	 */
	public void del(Long id) {
		consultMapper.deleteByPrimaryKey(id);
	}

	/**
	 * 留言频率统计 年
	 * 
	 * @param guestbook
	 * @return
	 */
	public List<Consult> guestbookUpdateYear(Consult guestbook) {
		ConsultExample example = new ConsultExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(guestbook, criteria);
		return consultMapper.guestbookUpdateYear(example);
	}

	/**
	 * 留言频率统计 年
	 * 
	 * @param guestbook
	 * @return
	 */
	public List<Consult> guestbookUpdateYear(Consult guestbook, int currPage,
			int pageSize) {
		ConsultExample example = new ConsultExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(guestbook, criteria);
		example.setCurrPage(currPage);
		example.setPageSize(pageSize);
		return consultMapper.guestbookUpdateYearPage(example);
	}

	/**
	 * 留言频率统计 年
	 * 
	 * @param guestbook
	 * @return
	 */
	public int guestbookUpdateYearCount(Consult guestbook) {
		ConsultExample example = new ConsultExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(guestbook, criteria);
		return consultMapper.guestbookUpdateYearCount(example);
	}

	/**
	 * 留言频率合计 年
	 * 
	 * @param guestbook
	 * @return
	 */
	public int guestbookUpdateYearSum(Consult guestbook) {
		ConsultExample example = new ConsultExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(guestbook, criteria);
		return consultMapper.guestbookUpdateYearSum(example);
	}

	/**
	 * 留言频率统计 月
	 * 
	 * @param guestbook
	 * @return
	 */
	public List<Consult> guestbookUpdateMonth(Consult guestbook) {
		ConsultExample example = new ConsultExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(guestbook, criteria);
		return consultMapper.guestbookUpdateMonth(example);
	}

	/**
	 * 留言频率统计 月
	 * 
	 * @param guestbook
	 * @return
	 */
	public List<Consult> guestbookUpdateMonth(Consult guestbook, int currPage,
			int pageSize) {
		ConsultExample example = new ConsultExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(guestbook, criteria);
		example.setCurrPage(currPage);
		example.setPageSize(pageSize);
		return consultMapper.guestbookUpdateMonthPage(example);
	}

	/**
	 * 留言频率统计 月
	 * 
	 * @param guestbook
	 * @return
	 */
	public int guestbookUpdateMonthCount(Consult guestbook) {
		ConsultExample example = new ConsultExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(guestbook, criteria);
		return consultMapper.guestbookUpdateMonthCount(example);
	}

	/**
	 * 留言频率合计 月
	 * 
	 * @param guestbook
	 * @return
	 */
	public int guestbookUpdateMonthSum(Consult guestbook) {
		ConsultExample example = new ConsultExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(guestbook, criteria);
		return consultMapper.guestbookUpdateMonthSum(example);
	}

	/**
	 * 留言频率统计 日
	 * 
	 * @param guestbook
	 * @return
	 */
	public List<Consult> guestbookUpdateDay(Consult guestbook) {
		ConsultExample example = new ConsultExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(guestbook, criteria);
		return consultMapper.guestbookUpdateDay(example);
	}

	/**
	 * 留言频率统计 日
	 * 
	 * @param guestbook
	 * @return
	 */
	public List<Consult> guestbookUpdateDay(Consult guestbook, int currPage,
			int pageSize) {
		ConsultExample example = new ConsultExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(guestbook, criteria);
		example.setCurrPage(currPage);
		example.setPageSize(pageSize);
		return consultMapper.guestbookUpdateDayPage(example);
	}

	/**
	 * 留言频率统计 日
	 * 
	 * @param guestbook
	 * @return
	 */
	public int guestbookUpdateDayCount(Consult guestbook) {
		ConsultExample example = new ConsultExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(guestbook, criteria);
		return consultMapper.guestbookUpdateDayCount(example);
	}

	/**
	 * 留言频率合计 日
	 * 
	 * @param guestbook
	 * @return
	 */
	public int guestbookUpdateDaySum(Consult guestbook) {
		ConsultExample example = new ConsultExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(guestbook, criteria);
		return consultMapper.guestbookUpdateDaySum(example);
	}

	/**
	 * 留言频率合计 周
	 * 
	 * @param guestbook
	 * @return
	 */
	public int guestbookUpdateWeekSum(Consult guestbook) {
		ConsultExample example = new ConsultExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(guestbook, criteria);
		return consultMapper.guestbookUpdateWeekSum(example);
	}

	/**
	 * 留言频率统计 周
	 * 
	 * @param guestbook
	 * @return
	 */
	public List<Consult> guestbookUpdateWeek(Consult guestbook) {
		ConsultExample example = new ConsultExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(guestbook, criteria);
		return consultMapper.guestbookUpdateWeek(example);
	}

	/**
	 * 站点留言统计
	 * 
	 * @param info
	 * @return
	 */
	public List<Consult> sysSiteGuestbook(Consult guestbook, int currPage,
			int pageSize) {
		ConsultExample example = new ConsultExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(guestbook, criteria);
		example.setCurrPage(currPage);
		example.setPageSize(pageSize);
		return consultMapper.sysSiteGuestbookPage(example);
	}

	/**
	 * 站点留言统计
	 * 
	 * @param Consult
	 * @return
	 */
	public List<Consult> sysSiteGuestbook(Consult guestbook) {
		ConsultExample example = new ConsultExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(guestbook, criteria);
		return consultMapper.sysSiteGuestbook(example);
	}

	/**
	 * 站点留言统计
	 * 
	 * @param Consult
	 * @return
	 */
	public int sysSiteGuestbookCount(Consult guestbook) {
		ConsultExample example = new ConsultExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(guestbook, criteria);
		return consultMapper.sysSiteGuestbookCount(example);
	}

	/**
	 * 站点留言合计
	 * 
	 * @param Consult
	 * @return
	 */
	public int sysSiteGuestbookSum(Consult guestbook) {
		ConsultExample example = new ConsultExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(guestbook, criteria);
		return consultMapper.sysSiteGuestbookSum(example);
	}

	public ConsultMapper getGuestbookMapper() {
		return consultMapper;
	}

	public void setGuestbookMapper(ConsultMapper consultMapper) {
		this.consultMapper = consultMapper;
	}

	@Override
	public List<Consult> findByParid(Long parid, boolean cache) {
		ConsultExample example = new ConsultExample();
		Criteria criteria = example.createCriteria();
		Consult guestbook = new Consult();
		guestbook.setParid(parid);
		proSearchParam(guestbook, criteria);
		return consultMapper.selectByExample(example);
	}

	@Override
	public List<Consult> find(Consult guestbook) {
		ConsultExample example = new ConsultExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(guestbook, criteria);
		return consultMapper.selectByExample(example);
	}
}
