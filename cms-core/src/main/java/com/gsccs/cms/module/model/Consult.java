package com.gsccs.cms.module.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 在线咨询
 * 
 * @author x.d zhang
 * 
 */
public class Consult implements Serializable {

	private Long id;
	private Long parid;
	private Date starttime;
	private Date endtime;
	private String starttimeStr;
	private String endtimeStr;
	private int countnum;
	private String datename;
	private String sitename;

	private String siteid;
	private String ip;

	private String memberid;
	private String membername;
	private String name;
	private String sex;
	private String sexStr;

	private String email;

	private String qq;

	private String tel;

	private String title;

	private String content;

	private Date addtime;
	private String addtimeStr;

	private String state;
	private String stateStr;

	private String isshow;

	private String albums;

	private Integer iclassid;

	private String type;

	// 回复列表
	private List<Consult> replyList;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	private static SimpleDateFormat sdffull = new SimpleDateFormat(
			"yyyy-MM-dd HH:mm:ss");

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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getIsshow() {
		return isshow;
	}

	public void setIsshow(String isshow) {
		this.isshow = isshow;
	}

	public String getAlbums() {
		return albums;
	}

	public void setAlbums(String albums) {
		this.albums = albums;
	}

	public Integer getIclassid() {
		return iclassid;
	}

	public void setIclassid(Integer iclassid) {
		this.iclassid = iclassid;
	}

	public String getStateStr() {
		if ("1".equals(state)) {
			stateStr = "已处理";
		} else {
			stateStr = "正在处理";
		}
		return stateStr;
	}

	public void setStateStr(String stateStr) {
		this.stateStr = stateStr;
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

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getAddtimeStr() {
		if (addtime != null) {
			addtimeStr = sdf.format(addtime);
		}
		return addtimeStr;
	}

	public void setAddtimeStr(String addtimeStr) {
		this.addtimeStr = addtimeStr;
	}

	public Date getStarttime() {
		return starttime;
	}

	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}

	public Date getEndtime() {
		return endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	public String getStarttimeStr() {
		if (starttime != null) {
			starttimeStr = sdffull.format(starttime);
		}
		return starttimeStr;
	}

	public void setStarttimeStr(String starttimeStr) {
		this.starttimeStr = starttimeStr;
	}

	public String getEndtimeStr() {
		if (endtime != null) {
			endtimeStr = sdffull.format(endtime);
		}
		return endtimeStr;
	}

	public void setEndtimeStr(String endtimeStr) {
		this.endtimeStr = endtimeStr;
	}

	public int getCountnum() {
		return countnum;
	}

	public void setCountnum(int countnum) {
		this.countnum = countnum;
	}

	public String getDatename() {
		return datename;
	}

	public void setDatename(String datename) {
		this.datename = datename;
	}

	public String getSitename() {
		return sitename;
	}

	public void setSitename(String sitename) {
		this.sitename = sitename;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Consult> getReplyList() {
		return replyList;
	}

	public void setReplyList(List<Consult> replyList) {
		this.replyList = replyList;
	}

}