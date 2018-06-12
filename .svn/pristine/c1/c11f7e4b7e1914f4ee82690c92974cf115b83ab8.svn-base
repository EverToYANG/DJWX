package com.gsccs.cms.course.service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gsccs.cms.course.dao.CourseFeedMapper;
import com.gsccs.cms.course.dao.CourseArticleMapper;
import com.gsccs.cms.course.dao.CourseMapper;
import com.gsccs.cms.course.dao.CourseUserMapper;
import com.gsccs.cms.course.dao.CourseVoteMapper;
import com.gsccs.cms.course.model.Course;
import com.gsccs.cms.course.model.CourseExample;
import com.gsccs.cms.course.model.CourseFeed;
import com.gsccs.cms.course.model.CourseFeedExample;
import com.gsccs.cms.course.model.CourseArticle;
import com.gsccs.cms.course.model.CourseArticleExample;
import com.gsccs.cms.course.model.CourseUser;
import com.gsccs.cms.course.model.CourseUserExample;
import com.gsccs.cms.course.model.CourseVote;
import com.gsccs.cms.member.dao.PartyMemberMapper;
import com.gsccs.cms.member.model.PartyMember;
import com.gsccs.cms.member.model.PartyMemberExample;
import com.gsccs.cms.weixin.service.WxAppService;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseMapper courseMapper;
	@Autowired
	private CourseArticleMapper courseInfoMapper;
	@Autowired
	private CourseVoteMapper courseVoteMapper;
	@Autowired
	private CourseFeedMapper courseFeedMapper;
	@Autowired
	private CourseUserMapper courseUserMapper;
	@Autowired
	private PartyMemberMapper partyMemberMapper;
	@Autowired
	private WxAppService appService;

	@Override
	public List<Course> find(Course param, String orderstr, int page,
			int pagesize) {
		CourseExample example = new CourseExample();
		CourseExample.Criteria c = example.createCriteria();
		proSearchParam(param, c);
		example.setCurrPage(page);
		example.setPageSize(pagesize);
		return courseMapper.selectPageByExample(example);
	}

	@Override
	public List<CourseArticle> findInfoList(Integer courseid) {
		CourseArticleExample example = new CourseArticleExample();
		CourseArticleExample.Criteria c = example.createCriteria();
		if (null != courseid) {
			c.andCourseidEqualTo(courseid);
		}else{
			c.andCourseidIsNotNull();
		}
		return courseInfoMapper.selectByExample(example);
	}

	@Override
	public List<CourseFeed> findFeedList(String deptid, Integer courseid) {
		CourseFeedExample example = new CourseFeedExample();
		CourseFeedExample.Criteria c = example.createCriteria();
		if (null != courseid) {
			c.andCourseidEqualTo(courseid);
		}

		if (StringUtils.isNotEmpty(deptid)) {
			c.andDeptidEqualTo(deptid);
		}
		c.andParidIsNull();
		return courseFeedMapper.selectByExample(example);
	}

	@Override
	public List<CourseFeed> findByParid(Long parid) {
		if (null == parid) {
			return null;
		}
		CourseFeedExample example = new CourseFeedExample();
		CourseFeedExample.Criteria c = example.createCriteria();
		c.andParidEqualTo(parid);
		return courseFeedMapper.selectByExample(example);
	}

	@Override
	public List<CourseVote> findVoteList(Integer courseid) {
		return null;
	}

	@Override
	public Course getCourse(Integer id) {
		return courseMapper.selectByPrimaryKey(id);
	}

	@Override
	public void addCourseFed(CourseFeed courseFed) {
		if (null != courseFed) {
			courseFed.setAddtime(new Date());
			courseFeedMapper.insert(courseFed);
		}
	}

	/**
	 * 处理查询条件
	 * 
	 * @param info
	 * @param criteria
	 */
	public void proSearchParam(Course param, CourseExample.Criteria criteria) {
		if (param != null) {
			if (param.getWxappid() != null) {
				criteria.andWxappidEqualTo(param.getWxappid());
			}
			if (StringUtils.isNotEmpty(param.getIsopen())) {
				criteria.andIsopenEqualTo(param.getIsopen());
			}
		}
	}

	@Override
	public void delCourseById(Integer courseid) {
		courseMapper.deleteByPrimaryKey(courseid);
	}

	@Override
	public Integer count(Course param) {
		CourseExample example = new CourseExample();
		CourseExample.Criteria c = example.createCriteria();
		proSearchParam(param, c);
		return courseMapper.countByExample(example);
	}

	@Override
	public Integer addCourse(Course param) {
		if (null != param) {
			courseMapper.insert(param);
			return param.getId();
		}
		return null;
	}

	@Override
	public void editCourse(Course param) {
		if (null != param) {
			courseMapper.updateByPrimaryKey(param);
		}
	}

	@Override
	public List<Course> findByUserid(String userid, String orderstr, int page,
			int pagesize) {
		if (StringUtils.isEmpty(userid)) {
			return null;
		}
		CourseExample example = new CourseExample();
		CourseExample.Criteria c = example.createCriteria();
		c.andSql("id in (select courseid from course_user where userid='"
				+ userid + "')");
		example.setCurrPage(page);
		example.setPageSize(pagesize);
		if (StringUtils.isEmpty(orderstr)) {
			example.setOrderByClause("addtime desc");
		}
		return courseMapper.selectPageByExample(example);
	}

	@Override
	public List<PartyMember> findByCourseid(Integer courseid) {
		if (null == courseid) {
			return null;
		}
		PartyMemberExample example = new PartyMemberExample();
		PartyMemberExample.Criteria c = example.createCriteria();
		c.andSql("m.id in (select userid from course_user where courseid='"
				+ courseid + "')");
		example.setDistinct(true);
		return partyMemberMapper.selectByExample(example);
	}

	@Override
	public Integer addUser(CourseUser courseUser) {
		if (null == courseUser || StringUtils.isEmpty(courseUser.getCourseid())
				|| StringUtils.isEmpty(courseUser.getUserid())) {
			return null;
		}
		CourseUserExample example = new CourseUserExample();
		CourseUserExample.Criteria c = example.createCriteria();
		c.andCourseidEqualTo(courseUser.getCourseid());
		c.andUseridEqualTo(courseUser.getUserid());
		List<CourseUser> courseUsers = courseUserMapper
				.selectByExample(example);
		if (null == courseUsers || courseUsers.size() <= 0) {
			return courseUserMapper.insert(courseUser);
		}
		return null;
	}

	@Override
	public Integer delUser(String id) {
		return courseUserMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<CourseFeed> find(CourseFeed param, String orderstr, int page,
			int pagesize) {
		CourseFeedExample example = new CourseFeedExample();
		CourseFeedExample.Criteria c = example.createCriteria();
		if (null != param) {
			if (StringUtils.isNotEmpty(param.getUserid())) {
				c.andUseridEqualTo(param.getUserid());
			}

			if (null != param.getCourseid()) {
				c.andCourseidEqualTo(param.getCourseid());
			}
		}
		return courseFeedMapper.selectByExample(example);
	}

	@Override
	public void addArticle(CourseArticle courseArticle) {
		if (null != courseArticle) {
			courseInfoMapper.insert(courseArticle);
		}
	}

	@Override
	public void delArticle(Integer id) {
		courseInfoMapper.deleteByPrimaryKey(id);
	}

	@Override
	public CourseArticle getArticle(Integer id) {
		return courseInfoMapper.selectByPrimaryKey(id);
	}
}
