package com.gsccs.cms.course.service;

import java.util.List;

import com.gsccs.cms.course.model.Course;
import com.gsccs.cms.course.model.CourseFeed;
import com.gsccs.cms.course.model.CourseArticle;
import com.gsccs.cms.course.model.CourseUser;
import com.gsccs.cms.course.model.CourseVote;
import com.gsccs.cms.member.model.PartyMember;


/*
 * 课程业务接口
 */
public interface CourseService {
	
	public Integer addCourse(Course param);
	public void editCourse(Course param);
	public List<Course> find(Course param,String orderstr,int page,int pagesize);
	
	public List<Course> findByUserid(String userid,String orderstr,int page,int pagesize);
	public List<PartyMember> findByCourseid(Integer courseid);
	
	
	public List<CourseArticle> findInfoList(Integer courseid);
	public List<CourseFeed> findFeedList(String corpid,Integer courseid);
	public List<CourseFeed> find(CourseFeed param,String orderstr,int page,int pagesize);
	public List<CourseFeed> findByParid(Long parid);
	public List<CourseVote> findVoteList(Integer courseid);
	public Course getCourse(Integer id);
	
	public void addCourseFed(CourseFeed courseFed);
	public void delCourseById(Integer courseid);
	
	public Integer count(Course param);
	
	public void addArticle(CourseArticle courseArticle);
	public CourseArticle getArticle(Integer id);
	public void delArticle(Integer id);
	
	public Integer addUser(CourseUser courseUser);
	public Integer delUser(String id);
	
	
}
