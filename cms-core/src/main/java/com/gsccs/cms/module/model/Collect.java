package com.gsccs.cms.module.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Collect {

	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	private String id;

	private String memberid;
	private String siteid;
	private String channelid;
	private String articleid;
	private String objtype;
	private String objtypeStr;
	private Map<String, String> objtypes;

	private String sitename;
	private String channelname;
	private String articletitle;

	private Date addtime;
	private String addtimeStr;

	public String getId() {
		return id;
	}

	public String getMemberid() {
		return memberid;
	}

	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}

	public String getSiteid() {
		return siteid;
	}

	public void setSiteid(String siteid) {
		this.siteid = siteid;
	}

	public String getSitename() {
		return sitename;
	}

	public void setSitename(String sitename) {
		this.sitename = sitename;
	}

	public String getChannelid() {
		return channelid;
	}

	public void setChannelid(String channelid) {
		this.channelid = channelid;
	}

	public String getChannelname() {
		return channelname;
	}

	public void setChannelname(String channelname) {
		this.channelname = channelname;
	}

	public String getObjtype() {
		return objtype;
	}

	public void setObjtype(String objtype) {
		this.objtype = objtype;
	}

	public String getArticleid() {
		return articleid;
	}

	public void setArticleid(String articleid) {
		this.articleid = articleid;
	}

	public String getArticletitle() {
		return articletitle;
	}

	public void setArticletitle(String articletitle) {
		this.articletitle = articletitle;
	}

	public Date getAddtime() {
		return addtime;
	}

	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getAddtimeStr() {
		if (addtime != null) {
			addtimeStr = sdf.format(addtime);
		}
		return addtimeStr;
	}

	public void setAddtimeStr(String addtimeStr) {
		this.addtimeStr = addtimeStr;
	}
}