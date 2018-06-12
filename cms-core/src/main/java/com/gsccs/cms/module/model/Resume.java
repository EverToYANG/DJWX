package com.gsccs.cms.module.model;

import java.util.Date;

import com.gsccs.cms.bass.utils.DateUtil;

public class Resume {

	private String id;
	private String state;
	private String stateStr;
	private String siteid;
	private String memberid;
	private String membername;
	private String name;
	private String sex;
	private String sexStr;
	private Date birthday;
	private String birthdayStr;
	private String email;
	private String qq;

	private String tel;

	private String address;

	private String img;

	private String attch;

	private String job;

	private String content;

	private Date addtime;
	private String addtimeStr;

	private String recontent;

	private Date retime;

	private String reuserid;

	private String reusername;

	private String ip;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSiteid() {
		return siteid;
	}

	public void setSiteid(String siteid) {
		this.siteid = siteid;
	}

	public String getMemberid() {
		return memberid;
	}

	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}

	public String getMembername() {
		return membername;
	}

	public void setMembername(String membername) {
		this.membername = membername;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getAttch() {
		return attch;
	}

	public void setAttch(String attch) {
		this.attch = attch;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getAddtime() {
		return addtime;
	}

	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public String getRecontent() {
		return recontent;
	}

	public void setRecontent(String recontent) {
		this.recontent = recontent;
	}

	public Date getRetime() {
		return retime;
	}

	public void setRetime(Date retime) {
		this.retime = retime;
	}

	public String getReuserid() {
		return reuserid;
	}

	public void setReuserid(String reuserid) {
		this.reuserid = reuserid;
	}

	public String getReusername() {
		return reusername;
	}

	public void setReusername(String reusername) {
		this.reusername = reusername;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStateStr() {
		stateStr = "未回复";
		if ("1".equals(state)) {
			stateStr = "已回复";
		}
		return stateStr;
	}

	public void setStateStr(String stateStr) {
		this.stateStr = stateStr;
	}

	public String getBirthdayStr() {
		birthdayStr = DateUtil.format(birthday, "yyyy-MM-dd");
		return birthdayStr;
	}

	public void setBirthdayStr(String birthdayStr) {
		this.birthdayStr = birthdayStr;
	}

	public String getSexStr() {
		sexStr = "女";
		if ("1".equals(sex)) {
			sexStr = "男";
		}
		return sexStr;
	}

	public void setSexStr(String sexStr) {
		this.sexStr = sexStr;
	}

	public String getAddtimeStr() {
		if (addtime != null) {
			addtimeStr = DateUtil.format(addtime, "yyyy-MM-dd");
		}
		return addtimeStr;
	}

	public void setAddtimeStr(String addtimeStr) {
		this.addtimeStr = addtimeStr;
	}
}