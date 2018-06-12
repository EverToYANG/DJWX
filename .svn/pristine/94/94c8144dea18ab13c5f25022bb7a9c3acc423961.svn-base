package com.gsccs.cms.auth.model;

import java.io.Serializable;

public class Unit implements Serializable {

	private Long id;
	private String hasChildren;
	private String name;

	private Long parid;
	private String sql;
	private String isok;
	private String isokStr;

	private String ismail;
	private Integer ordernum;
	private Integer leval;
	private String corpid;
	private String corptitle;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setParid(Long parid) {
		this.parid = parid;
	}

	public Long getParid() {
		return parid;
	}

	public String getCorpid() {
		return corpid;
	}

	public void setCorpid(String corpid) {
		this.corpid = corpid;
	}

	public String getHasChildren() {
		return hasChildren;
	}

	public void setHasChildren(String hasChildren) {
		this.hasChildren = hasChildren;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIsok() {
		return isok;
	}

	public void setIsok(String isok) {
		this.isok = isok;
	}

	public Integer getOrdernum() {
		return ordernum;
	}

	public void setOrdernum(Integer ordernum) {
		this.ordernum = ordernum;
	}

	public Integer getLeval() {
		return leval;
	}

	public void setLeval(Integer leval) {
		this.leval = leval;
	}

	public String getIsokStr() {
		isokStr = "否";
		if ("1".equals(isok)) {
			isokStr = "是";
		}
		return isokStr;
	}

	public void setIsokStr(String isokStr) {
		this.isokStr = isokStr;
	}

	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}

	public String getIsmail() {
		return ismail;
	}

	public void setIsmail(String ismail) {
		this.ismail = ismail;
	}

	public String getCorptitle() {
		return corptitle;
	}

	public void setCorptitle(String corptitle) {
		this.corptitle = corptitle;
	}

}