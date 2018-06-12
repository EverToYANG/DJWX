package com.gsccs.cms.module.service.impl;

import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.gsccs.cms.module.dao.ResumeMapper;
import com.gsccs.cms.module.model.Resume;
import com.gsccs.cms.module.model.ResumeExample;
import com.gsccs.cms.module.model.ResumeExample.Criteria;
import com.gsccs.cms.module.service.ResumeService;

/**
 * 简历相关服务操作
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
@Service("resumeService")
public class ResumeServiceImpl implements ResumeService {

	@Resource
	private ResumeMapper resumeMapper;

	/**
	 * 分页查询
	 */
	public List<Resume> find(Resume resume, String order, int currPage,
			int pageSize) {
		ResumeExample example = new ResumeExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(resume, criteria);
		if (order != null && order.trim().length() > 0) {
			example.setOrderByClause(order);
		}
		example.setCurrPage(currPage);
		example.setPageSize(pageSize);
		return resumeMapper.selectPageByExample(example);
	}

	/**
	 * 统计
	 * 
	 * @param resume
	 * @return
	 */
	public int count(Resume resume) {
		ResumeExample example = new ResumeExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(resume, criteria);
		return resumeMapper.countByExample(example);
	}

	/**
	 * 处理查询条件
	 * 
	 * @param resume
	 * @param criteria
	 */
	public void proSearchParam(Resume resume, Criteria criteria) {
		if (resume != null) {
			if (StringUtils.isNotEmpty(resume.getSiteid())) {
				criteria.andSiteidEqualTo(resume.getSiteid());
			}
			if (StringUtils.isNotEmpty(resume.getJob())) {
				criteria.andJobLike("%" + resume.getJob() + "%");
			}
			if (StringUtils.isNotEmpty(resume.getMembername())) {
				criteria.andMembernameLike("%" + resume.getMembername() + "%");
			}
			if (StringUtils.isNotEmpty(resume.getReusername())) {
				criteria.andReusernameLike("%" + resume.getReusername() + "%");
			}
			if (StringUtils.isNotEmpty(resume.getName())) {
				criteria.andNameLike("%" + resume.getName() + "%");
			}
			if (StringUtils.isNotEmpty(resume.getMemberid())) {
				criteria.andMemberidEqualTo(resume.getMemberid());
			}
			if (StringUtils.isNotEmpty(resume.getState())) {
				criteria.andStateEqualTo(resume.getState());
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
	public Resume findById(String id) {
		return resumeMapper.selectByPrimaryKey(id);
	}

	/**
	 * 更新
	 * 
	 * @param question
	 */
	public void update(Resume resume) {
		resumeMapper.updateByPrimaryKeySelective(resume);
	}

	/**
	 * 添加
	 * 
	 * @param question
	 * @return
	 */
	public String add(Resume resume) {
		resume.setId(UUID.randomUUID().toString());
		resumeMapper.insert(resume);
		return resume.getId();
	}

	/**
	 * 删除
	 * 
	 * @param id
	 */
	public void del(String id) {
		resumeMapper.deleteByPrimaryKey(id);
	}

	public ResumeMapper getResumeMapper() {
		return resumeMapper;
	}

	public void setResumeMapper(ResumeMapper resumeMapper) {
		this.resumeMapper = resumeMapper;
	}
}
