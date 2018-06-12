package com.gsccs.cms.module.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.gsccs.cms.bass.utils.DateUtil;

public class Comment {

	private String id;

	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	private static SimpleDateFormat sdffull = new SimpleDateFormat(
			"yyyy-MM-dd HH:mm:ss");
	private Date starttime;
	private Date endtime;
	private String starttimeStr;
	private String endtimeStr;
	private int countnum;
	private String datename;
	private String sitename;
	private String commentstate;
	private String siteid;

	private String memberid;
	private String membername;

	private String isanonymous;
	private String isanonymousStr;

	private String objid;

	private String objtype;
	private String objtypeStr;
	private Map<String, String> objtypes;

	private String ip;

	private Date addtime;
	private String addtimeStr;

	private String state;
	private String stateStr;

	private String content;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getSiteid() {
		return siteid;
	}

	public void setSiteid(String siteid) {
		this.siteid = siteid == null ? null : siteid.trim();
	}

	public String getMemberid() {
		return memberid;
	}

	public void setMemberid(String memberid) {
		this.memberid = memberid == null ? null : memberid.trim();
	}

	public String getMembername() {
		return membername;
	}

	public void setMembername(String membername) {
		this.membername = membername == null ? null : membername.trim();
	}

	public String getIsanonymous() {
		return isanonymous;
	}

	public void setIsanonymous(String isanonymous) {
		this.isanonymous = isanonymous == null ? null : isanonymous.trim();
	}

	public String getObjid() {
		return objid;
	}

	public void setObjid(String objid) {
		this.objid = objid == null ? null : objid.trim();
	}

	public String getObjtype() {
		return objtype;
	}

	public void setObjtype(String objtype) {
		this.objtype = objtype == null ? null : objtype.trim();
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip == null ? null : ip.trim();
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
		this.state = state == null ? null : state.trim();
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content == null ? null : content.trim();
	}

	public Map<String, String> getObjtypes() {
		objtypes = new HashMap<String, String>();
		objtypes.put("info", "信息");
		return objtypes;
	}

	public void setObjtypes(Map<String, String> objtypes) {
		this.objtypes = objtypes;
	}

	public String getObjtypeStr() {
		Map<String, String> objtypes = getObjtypes();
		if (objtypes != null && getObjtype() != null) {
			if (objtypes.containsKey(objtype.trim())) {
				objtypeStr = objtypes.get(objtype.trim());
			}
		}
		return objtypeStr;
	}

	public void setObjtypeStr(String objtypeStr) {
		this.objtypeStr = objtypeStr;
	}

	public String getIsanonymousStr() {
		isanonymousStr = "否";
		if ("1".equals(isanonymous)) {
			isanonymousStr = "是";
		}
		return isanonymousStr;
	}

	public void setIsanonymousStr(String isanonymousStr) {
		this.isanonymousStr = isanonymousStr;
	}

	public String getStateStr() {
		stateStr = "未审核";
		if ("1".equals(state)) {
			stateStr = "已审核";
		}
		return stateStr;
	}

	public void setStateStr(String stateStr) {
		this.stateStr = stateStr;
	}

	public String getAddtimeStr() {
		if (addtime != null) {
			addtimeStr = DateUtil.format(addtime, "yyyy-MM-dd HH:mm");
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

	public String getCommentstate() {
		return commentstate;
	}

	public void setCommentstate(String commentstate) {
		this.commentstate = commentstate;
	}
}