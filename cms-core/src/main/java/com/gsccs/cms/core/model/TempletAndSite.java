package com.gsccs.cms.core.model;

import java.io.Serializable;

/**
 * 网站模版对象
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
public class TempletAndSite implements Serializable {

	private String id;
	public static String STATE_Y = "1";// 有效
	public static String STATE_N = "0";// 无效
	public static String STATE_DEL = "3";// 删除

	private String name;
	private String sql;

	private String state;
	private String stateStr;
	private String noDel;
	private Integer ordernum;
	private String usesites;
	private String usesitenames;
	private String adduser;
	// 模版预览效果图
	private String img;
	// 模版描述
	private String description;
	// 是否免费
	private String isFree;
	// 模版价格
	private Double price;
	
	private String siteId;
	
	
	public String getSiteId() {
		return siteId;
	}

	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}

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

	
	public String getState() {
		return state;
	}

	
	public void setState(String state) {
		this.state = state == null ? null : state.trim();
	}

	
	public Integer getOrdernum() {
		return ordernum;
	}

	
	public void setOrdernum(Integer ordernum) {
		this.ordernum = ordernum;
	}

	
	public String getUsesites() {
		return usesites;
	}

	
	public void setUsesites(String usesites) {
		this.usesites = usesites == null ? null : usesites.trim();
	}

	
	public String getUsesitenames() {
		return usesitenames;
	}

	
	public void setUsesitenames(String usesitenames) {
		this.usesitenames = usesitenames == null ? null : usesitenames.trim();
	}

	
	public String getAdduser() {
		return adduser;
	}

	
	public void setAdduser(String adduser) {
		this.adduser = adduser == null ? null : adduser.trim();
	}

	public String getStateStr() {
		if (STATE_DEL.equals(state)) {
			return "已删除";
		} else if (STATE_N.equals(state)) {
			return "否";
		} else if (STATE_Y.equals(state)) {
			return "是";
		}
		return stateStr;
	}

	public void setStateStr(String stateStr) {
		this.stateStr = stateStr;
	}

	public String getNoDel() {
		return noDel;
	}

	public void setNoDel(String noDel) {
		this.noDel = noDel;
	}

	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}


	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIsFree() {
		return isFree;
	}

	public void setIsFree(String isFree) {
		this.isFree = isFree;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	
}