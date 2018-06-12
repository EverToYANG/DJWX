package com.gsccs.cms.module.service.impl;

import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gsccs.cms.core.dao.ReportMapper;
import com.gsccs.cms.module.model.Report;
import com.gsccs.cms.module.model.ReportExample;
import com.gsccs.cms.module.model.ReportExample.Criteria;
import com.gsccs.cms.module.service.ReportService;

/**
 * 信息公开相关操作
 * 
 * @author x.d zhang
 * @version 1.0
 */
@Service("reportService")
public class ReportServiceImpl implements ReportService {

	@Resource
	private ReportMapper reportMapper;

	/**
	 * 添加
	 * 
	 * @param report
	 * @return
	 */
	public String insert(Report report) {
		report.setId(UUID.randomUUID().toString());
		reportMapper.insert(report);
		return report.getId();
	}

	/**
	 * 分页查询
	 */
	public List<Report> find(Report report, String order, int currPage,
			int pageSize, boolean cache) {
		ReportExample example = new ReportExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(report, criteria);
		if (order != null && order.trim().length() > 0) {
			example.setOrderByClause(order);
		}
		example.setCurrPage(currPage);
		example.setPageSize(pageSize);
		if (cache) {
			return reportMapper.selectPageByExampleCache(example);
		} else {
			return reportMapper.selectPageByExample(example);
		}
	}

	/**
	 * 根据id查询
	 * 
	 * @param id
	 * @return
	 */
	public Report findById(String id) {
		return reportMapper.selectByPrimaryKey(id);
	}

	/**
	 * 根据querycode查询
	 * 
	 * @param id
	 * @return
	 */
	public Report findByQuerycode(String querycode, boolean cache) {
		if (cache) {
			return reportMapper.selectByQuerycodeCache(querycode);
		} else {
			return reportMapper.selectByQuerycode(querycode);
		}
	}

	/**
	 * 统计
	 * 
	 * @param info
	 * @return
	 */
	public int count(Report report, boolean cache) {
		ReportExample example = new ReportExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(report, criteria);
		if (cache) {
			return reportMapper.countByExampleCache(example);
		} else {
			return reportMapper.countByExample(example);
		}
	}

	/**
	 * 处理查询条件
	 * 
	 * @param info
	 * @param criteria
	 */
	public void proSearchParam(Report report, Criteria criteria) {
		if (report != null) {
			if (report.getQuerycode() != null
					&& report.getQuerycode().trim().length() > 0) {
				criteria.andQuerycodeLike("%" + report.getQuerycode().trim()
						+ "%");
			}
			if (report.getName() != null
					&& report.getName().trim().length() > 0) {
				criteria.andNameLike("%" + report.getName().trim() + "%");
			}
			if (report.getLinkman() != null
					&& report.getLinkman().trim().length() > 0) {
				criteria.andLinkmanLike("%" + report.getLinkman().trim() + "%");
			}
			if (report.getIssuer() != null
					&& report.getIssuer().trim().length() > 0) {
				criteria.andIssuerLike("%" + report.getIssuer().trim() + "%");
			}
			if (report.getUserid() != null
					&& report.getUserid().trim().length() > 0) {
				criteria.andUseridEqualTo(report.getUserid().trim());
			}
			if (report.getState() != null
					&& report.getState().trim().length() > 0) {
				if ("1".equals(report.getState())) {
					criteria.andStateEqualTo("1");
				} else if ("0".equals(report.getState())) {
					criteria.andSql(" (state is null or state='0') ");
				}
			}

		}
	}

	/**
	 * 更新
	 * 
	 * @param templet
	 */
	public void update(Report report) {
		reportMapper.updateByPrimaryKeySelective(report);
	}

	/**
	 * 删除
	 * 
	 * @param id
	 */
	public void del(String id) {
		reportMapper.deleteByPrimaryKey(id);
	}

	public ReportMapper getReportMapper() {
		return reportMapper;
	}

	public void setReportMapper(ReportMapper reportMapper) {
		this.reportMapper = reportMapper;
	}
}
