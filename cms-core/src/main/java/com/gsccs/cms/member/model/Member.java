package com.gsccs.cms.member.model;

import java.util.Date;
import java.util.List;

import com.gsccs.cms.bass.utils.DateUtil;

public class Member {

	// 会员ID
	private String id;
	// 会员昵称
	private String name;
	// 党员名称
	private String realname;
	// 党支部
	private String unitname;

	private String wxappid;
	private String sex;
	private Date birthday;

	// 党员ID
	private String realid;
	private String phone;
	private String email;
	// 入党时间
	private Date addtime;
	private Date lasttime;

	private String intro;
	private Integer credit;
	private Integer experience;
	private String img;
	private String lasttimeStr;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getUnitname() {
		return unitname;
	}

	public void setUnitname(String unitname) {
		this.unitname = unitname;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getWxappid() {
		return wxappid;
	}

	public void setWxappid(String wxappid) {
		this.wxappid = wxappid;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex == null ? null : sex.trim();
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getRealid() {
		return realid;
	}

	public void setRealid(String realid) {
		this.realid = realid;
	}

	public Date getAddtime() {
		return addtime;
	}

	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro == null ? null : intro.trim();
	}

	public Integer getCredit() {
		return credit;
	}

	public void setCredit(Integer credit) {
		this.credit = credit;
	}

	public Integer getExperience() {
		return experience;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img == null ? null : img.trim();
	}

	public String getLasttimeStr() {
		if (lasttime != null) {
			lasttimeStr = DateUtil.format(lasttime, "yyyy-MM-dd HH:mm");
		}
		return lasttimeStr;
	}

	public void setLasttimeStr(String lasttimeStr) {
		this.lasttimeStr = lasttimeStr;
	}

	public Date getLasttime() {
		return lasttime;
	}

	public void setLasttime(Date lasttime) {
		this.lasttime = lasttime;
	}

}