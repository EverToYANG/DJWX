package com.gsccs.cms.member.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;

import com.gsccs.cms.bass.utils.IDCardUtils;

public class PartyMember {

	// 会员ID
	private String id;
	private String name;
	// 入党时间
	private Date jointime;
	private String idcode;
	private String phone;
	private String email;
	private String isok;
	private String isokStr;

	private String intro;
	// 分组ID
	private String groupid;
	private String corpid;
	private String unitid;
	private String status;
	private String img;

	private String birthday;
	private String sex;
	// 教育程度
	private String edu;
	// 分组名称
	private String groupname;
	// 党组织名称
	private String unitname;

	private String jointimestr;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getGroupid() {
		return groupid;
	}

	public void setGroupid(String groupid) {
		this.groupid = groupid == null ? null : groupid.trim();
	}

	public String getEdu() {
		return edu;
	}

	public void setEdu(String edu) {
		this.edu = edu;
	}

	public String getSex() {
		if (StringUtils.isNotEmpty(idcode)) {
			sex = IDCardUtils.getSex(idcode);
		}
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex == null ? null : sex.trim();
	}

	public String getIdcode() {
		return idcode;
	}

	public void setIdcode(String idcode) {
		this.idcode = idcode;
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

	public String getUnitid() {
		return unitid;
	}

	public void setUnitid(String unitid) {
		this.unitid = unitid;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img == null ? null : img.trim();
	}

	public String getBirthday() {
		if (StringUtils.isNotEmpty(idcode)) {
			birthday = IDCardUtils.getBirthday(idcode);
		}
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getGroupname() {
		return groupname;
	}

	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}

	public String getIsokStr() {
		if ("1".equals(isok)) {
			isokStr = "是";
		} else {
			isokStr = "否";
		}
		return isokStr;
	}

	public void setIsokStr(String isokStr) {
		this.isokStr = isokStr;
	}

	public String getCorpid() {
		return corpid;
	}

	public void setCorpid(String corpid) {
		this.corpid = corpid;
	}

	public Date getJointime() {
		return jointime;
	}

	public void setJointime(Date jointime) {
		this.jointime = jointime;
	}

	public String getUnitname() {
		return unitname;
	}

	public void setUnitname(String unitname) {
		this.unitname = unitname;
	}

	public String getJointimestr() {
		if (null != jointime) {
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			jointimestr = df.format(jointime);
		}
		return jointimestr;
	}

	public void setJointimestr(String jointimestr) {
		this.jointimestr = jointimestr;
	}

}