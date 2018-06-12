package com.gsccs.cms.course.model;


/**
 * 课程测试
 * 
 * @author x.d zhang
 * 
 */
public class CourseVote {

	private String id;
	private String courseid;
	private String infoid;
	private Integer ordernum;

	public String getCourseid() {
		return courseid;
	}

	public void setCourseid(String courseid) {
		this.courseid = courseid;
	}

	public String getInfoid() {
		return infoid;
	}

	public void setInfoid(String infoid) {
		this.infoid = infoid;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getOrdernum() {
		return ordernum;
	}

	public void setOrdernum(Integer ordernum) {
		this.ordernum = ordernum;
	}

}
