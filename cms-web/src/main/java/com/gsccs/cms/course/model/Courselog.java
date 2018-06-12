package com.gsccs.cms.course.model;

import java.io.Serializable;
import java.util.Date;

import com.gsccs.cms.bass.utils.DateUtil;

public class Courselog implements Serializable {

	private String id;
	private String memberid;
	private String membername;
	private Integer courseid;
	private String coursename;
	private Date logtime;
	private String logtimeStr;
	private String corpid;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMemberid() {
		return memberid;
	}

	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}

	public Integer getCourseid() {
		return courseid;
	}

	public void setCourseid(Integer courseid) {
		this.courseid = courseid;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public Date getLogtime() {
		return logtime;
	}

	public void setLogtime(Date logtime) {
		this.logtime = logtime;
	}

	public String getLogtimeStr() {
		if (logtime != null) {
			logtimeStr = DateUtil.format(logtime, "yyyy-MM-dd HH:mm");
		}
		return logtimeStr;
	}

	public void setLogtimeStr(String logtimeStr) {
		this.logtimeStr = logtimeStr;
	}

	public String getMembername() {
		return membername;
	}

	public void setMembername(String membername) {
		this.membername = membername;
	}

	public String getCorpid() {
		return corpid;
	}

	public void setCorpid(String corpid) {
		this.corpid = corpid;
	}

}