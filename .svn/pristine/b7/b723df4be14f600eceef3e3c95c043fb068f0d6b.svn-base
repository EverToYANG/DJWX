package com.gsccs.cms.core.model;

import java.io.Serializable;
import java.util.Date;

import com.gsccs.cms.bass.utils.DateUtil;

public class ContentSign implements Serializable {

	private String id;
	private String loginname;
	private String name;

	private String userid;

	private String infoid;

	private Date signtime;
	private String signtimeStr;

	private String ip;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid == null ? null : userid.trim();
	}

	public String getInfoid() {
		return infoid;
	}

	public void setInfoid(String infoid) {
		this.infoid = infoid == null ? null : infoid.trim();
	}

	public Date getSigntime() {
		return signtime;
	}

	public void setSigntime(Date signtime) {
		this.signtime = signtime;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip == null ? null : ip.trim();
	}

	public String getLoginname() {
		return loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSigntimeStr() {
		if (signtime != null) {
			signtimeStr = DateUtil.format(signtime, "yyyy-MM-dd");
		}
		return signtimeStr;
	}

	public void setSigntimeStr(String signtimeStr) {
		this.signtimeStr = signtimeStr;
	}
}