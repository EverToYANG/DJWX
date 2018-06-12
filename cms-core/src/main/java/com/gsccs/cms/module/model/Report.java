package com.gsccs.cms.module.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Report implements Serializable {

	private String id;
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	private String addtimeStr;
	private String retimeStr;

	private String name;

	private String unit;

	private String filename;

	private String filenum;

	private String linkman;

	private String issuer;

	private String tel;

	private Date addtime;

	private String attch;

	private String querycode;

	private String ip;

	private String state;
	private String stateStr;

	private String recontent;

	private Date retime;

	private String proflow;

	private String userid;

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column cms_report.id
	 * 
	 * @return the value of cms_report.id
	 * 
	 * @mbggenerated Fri Mar 15 13:41:07 CST 2013
	 */
	public String getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column cms_report.id
	 * 
	 * @param id
	 *            the value for cms_report.id
	 * 
	 * @mbggenerated Fri Mar 15 13:41:07 CST 2013
	 */
	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column cms_report.name
	 * 
	 * @return the value of cms_report.name
	 * 
	 * @mbggenerated Fri Mar 15 13:41:07 CST 2013
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column cms_report.name
	 * 
	 * @param name
	 *            the value for cms_report.name
	 * 
	 * @mbggenerated Fri Mar 15 13:41:07 CST 2013
	 */
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column cms_report.unit
	 * 
	 * @return the value of cms_report.unit
	 * 
	 * @mbggenerated Fri Mar 15 13:41:07 CST 2013
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column cms_report.unit
	 * 
	 * @param unit
	 *            the value for cms_report.unit
	 * 
	 * @mbggenerated Fri Mar 15 13:41:07 CST 2013
	 */
	public void setUnit(String unit) {
		this.unit = unit == null ? null : unit.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column cms_report.filename
	 * 
	 * @return the value of cms_report.filename
	 * 
	 * @mbggenerated Fri Mar 15 13:41:07 CST 2013
	 */
	public String getFilename() {
		return filename;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column cms_report.filename
	 * 
	 * @param filename
	 *            the value for cms_report.filename
	 * 
	 * @mbggenerated Fri Mar 15 13:41:07 CST 2013
	 */
	public void setFilename(String filename) {
		this.filename = filename == null ? null : filename.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column cms_report.filenum
	 * 
	 * @return the value of cms_report.filenum
	 * 
	 * @mbggenerated Fri Mar 15 13:41:07 CST 2013
	 */
	public String getFilenum() {
		return filenum;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column cms_report.filenum
	 * 
	 * @param filenum
	 *            the value for cms_report.filenum
	 * 
	 * @mbggenerated Fri Mar 15 13:41:07 CST 2013
	 */
	public void setFilenum(String filenum) {
		this.filenum = filenum == null ? null : filenum.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column cms_report.linkman
	 * 
	 * @return the value of cms_report.linkman
	 * 
	 * @mbggenerated Fri Mar 15 13:41:07 CST 2013
	 */
	public String getLinkman() {
		return linkman;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column cms_report.linkman
	 * 
	 * @param linkman
	 *            the value for cms_report.linkman
	 * 
	 * @mbggenerated Fri Mar 15 13:41:07 CST 2013
	 */
	public void setLinkman(String linkman) {
		this.linkman = linkman == null ? null : linkman.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column cms_report.issuer
	 * 
	 * @return the value of cms_report.issuer
	 * 
	 * @mbggenerated Fri Mar 15 13:41:07 CST 2013
	 */
	public String getIssuer() {
		return issuer;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column cms_report.issuer
	 * 
	 * @param issuer
	 *            the value for cms_report.issuer
	 * 
	 * @mbggenerated Fri Mar 15 13:41:07 CST 2013
	 */
	public void setIssuer(String issuer) {
		this.issuer = issuer == null ? null : issuer.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column cms_report.tel
	 * 
	 * @return the value of cms_report.tel
	 * 
	 * @mbggenerated Fri Mar 15 13:41:07 CST 2013
	 */
	public String getTel() {
		return tel;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column cms_report.tel
	 * 
	 * @param tel
	 *            the value for cms_report.tel
	 * 
	 * @mbggenerated Fri Mar 15 13:41:07 CST 2013
	 */
	public void setTel(String tel) {
		this.tel = tel == null ? null : tel.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column cms_report.addtime
	 * 
	 * @return the value of cms_report.addtime
	 * 
	 * @mbggenerated Fri Mar 15 13:41:07 CST 2013
	 */
	public Date getAddtime() {
		return addtime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column cms_report.addtime
	 * 
	 * @param addtime
	 *            the value for cms_report.addtime
	 * 
	 * @mbggenerated Fri Mar 15 13:41:07 CST 2013
	 */
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column cms_report.attch
	 * 
	 * @return the value of cms_report.attch
	 * 
	 * @mbggenerated Fri Mar 15 13:41:07 CST 2013
	 */
	public String getAttch() {
		return attch;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column cms_report.attch
	 * 
	 * @param attch
	 *            the value for cms_report.attch
	 * 
	 * @mbggenerated Fri Mar 15 13:41:07 CST 2013
	 */
	public void setAttch(String attch) {
		this.attch = attch == null ? null : attch.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column cms_report.querycode
	 * 
	 * @return the value of cms_report.querycode
	 * 
	 * @mbggenerated Fri Mar 15 13:41:07 CST 2013
	 */
	public String getQuerycode() {
		return querycode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column cms_report.querycode
	 * 
	 * @param querycode
	 *            the value for cms_report.querycode
	 * 
	 * @mbggenerated Fri Mar 15 13:41:07 CST 2013
	 */
	public void setQuerycode(String querycode) {
		this.querycode = querycode == null ? null : querycode.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column cms_report.ip
	 * 
	 * @return the value of cms_report.ip
	 * 
	 * @mbggenerated Fri Mar 15 13:41:07 CST 2013
	 */
	public String getIp() {
		return ip;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column cms_report.ip
	 * 
	 * @param ip
	 *            the value for cms_report.ip
	 * 
	 * @mbggenerated Fri Mar 15 13:41:07 CST 2013
	 */
	public void setIp(String ip) {
		this.ip = ip == null ? null : ip.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column cms_report.state
	 * 
	 * @return the value of cms_report.state
	 * 
	 * @mbggenerated Fri Mar 15 13:41:07 CST 2013
	 */
	public String getState() {
		return state;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column cms_report.state
	 * 
	 * @param state
	 *            the value for cms_report.state
	 * 
	 * @mbggenerated Fri Mar 15 13:41:07 CST 2013
	 */
	public void setState(String state) {
		this.state = state == null ? null : state.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column cms_report.recontent
	 * 
	 * @return the value of cms_report.recontent
	 * 
	 * @mbggenerated Fri Mar 15 13:41:07 CST 2013
	 */
	public String getRecontent() {
		return recontent;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column cms_report.recontent
	 * 
	 * @param recontent
	 *            the value for cms_report.recontent
	 * 
	 * @mbggenerated Fri Mar 15 13:41:07 CST 2013
	 */
	public void setRecontent(String recontent) {
		this.recontent = recontent == null ? null : recontent.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column cms_report.retime
	 * 
	 * @return the value of cms_report.retime
	 * 
	 * @mbggenerated Fri Mar 15 13:41:07 CST 2013
	 */
	public Date getRetime() {
		return retime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column cms_report.retime
	 * 
	 * @param retime
	 *            the value for cms_report.retime
	 * 
	 * @mbggenerated Fri Mar 15 13:41:07 CST 2013
	 */
	public void setRetime(Date retime) {
		this.retime = retime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column cms_report.proflow
	 * 
	 * @return the value of cms_report.proflow
	 * 
	 * @mbggenerated Fri Mar 15 13:41:07 CST 2013
	 */
	public String getProflow() {
		return proflow;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column cms_report.proflow
	 * 
	 * @param proflow
	 *            the value for cms_report.proflow
	 * 
	 * @mbggenerated Fri Mar 15 13:41:07 CST 2013
	 */
	public void setProflow(String proflow) {
		this.proflow = proflow == null ? null : proflow.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column cms_report.userid
	 * 
	 * @return the value of cms_report.userid
	 * 
	 * @mbggenerated Fri Mar 15 13:41:07 CST 2013
	 */
	public String getUserid() {
		return userid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column cms_report.userid
	 * 
	 * @param userid
	 *            the value for cms_report.userid
	 * 
	 * @mbggenerated Fri Mar 15 13:41:07 CST 2013
	 */
	public void setUserid(String userid) {
		this.userid = userid == null ? null : userid.trim();
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

	public String getRetimeStr() {
		if (retime != null) {
			retimeStr = sdf.format(retime);
		}
		return retimeStr;
	}

	public void setRetimeStr(String retimeStr) {
		this.retimeStr = retimeStr;
	}

	public String getStateStr() {
		if ("1".equals(state)) {
			stateStr = "已办结";
		} else {
			stateStr = "办理中";
		}
		return stateStr;
	}

	public void setStateStr(String stateStr) {
		this.stateStr = stateStr;
	}
}