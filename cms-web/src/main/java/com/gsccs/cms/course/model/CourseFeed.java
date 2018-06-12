package com.gsccs.cms.course.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 课程反馈
 * 
 * @author x.d zhang
 * 
 */
public class CourseFeed {

	private Long id;
	private Integer courseid;
	private Long parid;
	private String userid;
	private String name;
	private String content;
	private Date addtime;
	private String albums;
	private Integer ordernum;
	private String unitid;
	private String addtimestr;

	// 回复列表
	private List<CourseFeed> replyList;

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getAddtime() {
		return addtime;
	}

	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAlbums() {
		return albums;
	}

	public void setAlbums(String albums) {
		this.albums = albums;
	}

	public Integer getCourseid() {
		return courseid;
	}

	public void setCourseid(Integer courseid) {
		this.courseid = courseid;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getParid() {
		return parid;
	}

	public void setParid(Long parid) {
		this.parid = parid;
	}

	public Integer getOrdernum() {
		return ordernum;
	}

	public void setOrdernum(Integer ordernum) {
		this.ordernum = ordernum;
	}

	public String getAddtimestr() {
		if (null != addtime) {
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			addtimestr = df.format(addtime);
		}
		return addtimestr;
	}

	public void setAddtimestr(String addtimestr) {
		this.addtimestr = addtimestr;
	}

	public String getUnitid() {
		return unitid;
	}

	public void setUnitid(String unitid) {
		this.unitid = unitid;
	}

	public List<CourseFeed> getReplyList() {
		return replyList;
	}

	public void setReplyList(List<CourseFeed> replyList) {
		this.replyList = replyList;
	}

}
