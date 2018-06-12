package com.gsccs.cms.course.service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gsccs.cms.course.dao.CourselogMapper;
import com.gsccs.cms.course.model.Courselog;
import com.gsccs.cms.course.model.CourselogExample;
import com.gsccs.cms.course.model.CourselogExample.Criteria;

/**
 * 日志相关服务
 * 
 * @author x.d zhang
 * @version 1.0
 */
@Service
public class LearnlogServiceImpl implements LearnlogService {

	@Resource
	private CourselogMapper learnlogMapper;

	/**
	 * 分页查询
	 */
	public List<Courselog> find(Courselog Learnlog, String order, int currPage,
			int pageSize) {
		CourselogExample example = new CourselogExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(Learnlog, criteria);
		if (order != null && order.trim().length() > 0) {
			example.setOrderByClause(order);
		}
		example.setCurrPage(currPage);
		example.setPageSize(pageSize);
		return learnlogMapper.selectPageByExample(example);
	}

	/**
	 * 查询
	 */
	public List<Courselog> find(Courselog Learnlog, String order) {
		CourselogExample example = new CourselogExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(Learnlog, criteria);
		if (order != null && order.trim().length() > 0) {
			example.setOrderByClause(order);
		}
		return learnlogMapper.selectByExample(example);
	}

	/**
	 * 统计
	 * 
	 * @param info
	 * @return
	 */
	public int count(Courselog creditlog) {
		CourselogExample example = new CourselogExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(creditlog, criteria);
		return learnlogMapper.countByExample(example);
	}

	/**
	 * 处理查询条件
	 * 
	 * @param info
	 * @param criteria
	 */
	public void proSearchParam(Courselog Learnlog, Criteria criteria) {
		if (Learnlog != null) {
			if (Learnlog.getCourseid() != null) {
				criteria.andCourseidEqualTo(Learnlog.getCourseid());
			}
			if (Learnlog.getMemberid() != null
					&& Learnlog.getMemberid().trim().length() > 0) {
				criteria.andMemberidEqualTo(Learnlog.getMemberid().trim());
			}
			if (Learnlog.getCorpid() != null
					&& Learnlog.getCorpid().trim().length() > 0) {
				criteria.andCorpidEqualTo(Learnlog.getCorpid());
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
	public Courselog findById(String id) {
		return learnlogMapper.selectByPrimaryKey(id);
	}

	/**
	 * 更新
	 * 
	 * @param question
	 */
	public void update(Courselog Learnlog) {
		learnlogMapper.updateByPrimaryKeySelective(Learnlog);
	}

	/**
	 * 添加
	 * 
	 * @param Learnlog
	 * @return
	 */
	public String add(Courselog Learnlog) {
		Learnlog.setId(UUID.randomUUID().toString());
		Learnlog.setLogtime(new Date());
		learnlogMapper.insert(Learnlog);
		return Learnlog.getId();
	}

	/**
	 * 删除
	 * 
	 * @param id
	 */
	public void del(String id) {
		learnlogMapper.deleteByPrimaryKey(id);
	}

	public CourselogMapper getLearnlogMapper() {
		return learnlogMapper;
	}

	public void setLearnlogMapper(CourselogMapper learnlogMapper) {
		this.learnlogMapper = learnlogMapper;
	}
}
