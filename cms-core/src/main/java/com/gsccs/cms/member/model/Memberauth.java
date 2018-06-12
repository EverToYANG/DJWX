package com.gsccs.cms.member.model;

public class Memberauth {

	private String id;
	private String code;
	private String name;
	private Integer ordernum;
	private boolean have;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getOrdernum() {
		return ordernum;
	}

	public void setOrdernum(Integer ordernum) {
		this.ordernum = ordernum;
	}

	public boolean getHave() {
		return have;
	}

	public void setHave(boolean have) {
		this.have = have;
	}

}