package com.gsccs.cms.core.model;

import java.io.Serializable;

public class RoleSite implements Serializable {

	private String id;

	private String roleid;

	private String siteid;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRoleid() {
		return roleid;
	}

	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}

	public String getSiteid() {
		return siteid;
	}

	public void setSiteid(String siteid) {
		this.siteid = siteid;
	}

}