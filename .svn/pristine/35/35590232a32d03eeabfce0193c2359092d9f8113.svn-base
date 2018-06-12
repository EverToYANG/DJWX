package com.gsccs.cms.module.model;

import java.io.Serializable;
import java.util.Date;


public class VoteTopic implements Serializable {

	private String id;
	private int selectnum;
	private String name;
	private String detail;
	private String selecttype;
	private String selecttypeStr;
	private String isok;
	private String siteid;
	private String adduser;
	private Date addtime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSelecttype() {
		return selecttype;
	}

	public void setSelecttype(String selecttype) {
		this.selecttype = selecttype;
	}

	public String getIsok() {
		return isok;
	}

	public void setIsok(String isok) {
		this.isok = isok;
	}

	public String getSiteid() {
		return siteid;
	}

	public void setSiteid(String siteid) {
		this.siteid = siteid;
	}

	public String getAdduser() {
		return adduser;
	}

	public void setAdduser(String adduser) {
		this.adduser = adduser;
	}

	public Date getAddtime() {
		return addtime;
	}

	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public int getSelectnum() {
		if (selectnum == 0) {
			selectnum = 1;
		}
		return selectnum;
	}

	public void setSelectnum(int selectnum) {
		this.selectnum = selectnum;
	}

	public String getSelecttypeStr() {
		if ("1".equals(selecttype)) {
			selecttypeStr = "checkbox";
		} else {
			selecttypeStr = "radio";
		}
		return selecttypeStr;
	}

	public void setSelecttypeStr(String selecttypeStr) {
		this.selecttypeStr = selecttypeStr;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
}