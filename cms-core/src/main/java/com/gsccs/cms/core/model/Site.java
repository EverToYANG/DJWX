package com.gsccs.cms.core.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 站点对象
 * 
 * @author x.d zhang
 * @version 3.0
 */
public class Site implements Serializable {

	private String id;
	private String haveSiteRole;
	private String name;
	private String sitedomain;
	private String hasChildren;
	private String sql;
	private String sourcepath;
	private String copyright;
	private String recordcode;
	private String parid;
	private String state;
	private String stateStr;
	private String url;

	// 站点信息是否需要审核
	private String auditState;
	private String auditStateStr;

	// 站点当前使用模版
	private String templet;
	// 站点模版名称
	private String templetName;

	private String logo;
	private Integer ordernum;
	private Integer clicknum;
	private String corpId;

	// 创建时间
	private Date addtime;
	private String addtimeStr;

	private String siteSizeStr = "0.00M";
	// Add by 20160821
	// 站点类型 1 PC站点 2 微官网
	private String sitetype;

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

	public String getSitedomain() {
		return sitedomain;
	}

	public void setSitedomain(String sitedomain) {
		this.sitedomain = sitedomain == null ? null : sitedomain.trim();
	}

	public String getSourcepath() {
		return sourcepath;
	}

	public void setSourcepath(String sourcepath) {
		this.sourcepath = sourcepath == null ? null : sourcepath.trim();
	}

	public String getCopyright() {
		return copyright;
	}

	public void setCopyright(String copyright) {
		this.copyright = copyright == null ? null : copyright.trim();
	}

	public String getRecordcode() {
		return recordcode;
	}

	public void setRecordcode(String recordcode) {
		this.recordcode = recordcode == null ? null : recordcode.trim();
	}

	public String getParid() {
		return parid;
	}

	public void setParid(String parid) {
		this.parid = parid == null ? null : parid.trim();
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state == null ? null : state.trim();
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url == null ? null : url.trim();
	}

	public String getTemplet() {
		return templet;
	}

	public void setTemplet(String templet) {
		this.templet = templet;
	}

	public String getTempletName() {
		return templetName;
	}

	public void setTempletName(String templetName) {
		this.templetName = templetName;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo == null ? null : logo.trim();
	}

	public Integer getOrdernum() {
		return ordernum;
	}

	public void setOrdernum(Integer ordernum) {
		this.ordernum = ordernum;
	}

	public Integer getClicknum() {
		return clicknum;
	}

	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}

	public String getHaveSiteRole() {
		return haveSiteRole;
	}

	public void setHaveSiteRole(String haveSiteRole) {
		this.haveSiteRole = haveSiteRole;
	}

	public String getHasChildren() {
		return hasChildren;
	}

	public void setHasChildren(String hasChildren) {
		this.hasChildren = hasChildren;
	}

	public String getStateStr() {
		stateStr = "是";
		if ("0".equals(state)) {
			stateStr = "否";
		}
		return stateStr;
	}

	public void setStateStr(String stateStr) {
		this.stateStr = stateStr;
	}

	public String getAuditState() {
		return auditState;
	}

	public void setAuditState(String auditState) {
		this.auditState = auditState;
	}

	public String getAuditStateStr() {
		auditStateStr = "是";
		if ("0".equals(auditState)) {
			auditStateStr = "否";
		}
		return auditStateStr;
	}

	public void setAuditStateStr(String auditStateStr) {
		this.auditStateStr = auditStateStr;
	}

	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}

	public String getCorpId() {
		return corpId;
	}

	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}

	public String getSiteSizeStr() {
		return siteSizeStr;
	}

	public void setSiteSizeStr(String siteSizeStr) {
		this.siteSizeStr = siteSizeStr;
	}

	public Date getAddtime() {
		return addtime;
	}

	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public String getAddtimeStr() {
		return addtimeStr;
	}

	public void setAddtimeStr(String addtimeStr) {
		this.addtimeStr = addtimeStr;
	}

	public String getSitetype() {
		return sitetype;
	}

	public void setSitetype(String sitetype) {
		this.sitetype = sitetype;
	}

}