package com.gsccs.cms.core.model;

import java.io.Serializable;

public class Channel implements Serializable {

	private Long id;
	private String hasChildren;
	public static String STATE_EFFECTIVE = "1";
	public static String STATE_INVALID = "0";
	private String navigation;
	private String navigationStr;
	public static String NAVIGATION_YES = "1";
	public static String NAVIGATION_NO = "0";
	private int indexnum;
	private int maxpage;
	// 静态页面目录
	private String name;
	private String templet;
	// 栏目图片
	private String img;

	private String sql;
	private Long parid;

	private String site;

	private String url;
	private String pageurl;

	private String state;
	private String stateStr;

	private Integer ordernum;

	private Integer clicknum;

	private String content;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setParid(Long parid) {
		this.parid = parid;
	}

	public Long getParid() {
		return parid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getTemplet() {
		return templet;
	}

	public void setTemplet(String templet) {
		this.templet = templet == null ? null : templet.trim();
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img == null ? null : img.trim();
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site == null ? null : site.trim();
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url == null ? null : url.trim();
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

	public Integer getClicknum() {
		return clicknum;
	}

	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getHasChildren() {
		return hasChildren;
	}

	public void setHasChildren(String hasChildren) {
		this.hasChildren = hasChildren;
	}

	public String getNavigation() {
		return navigation;
	}

	public void setNavigation(String navigation) {
		this.navigation = navigation;
	}

	public String getPageurl() {
		return pageurl;

	}

	public void setPageurl(String pageurl) {
		this.pageurl = pageurl;
	}

	public int getIndexnum() {
		return indexnum;
	}

	public void setIndexnum(int indexnum) {
		this.indexnum = indexnum;
	}

	public int getMaxpage() {
		return maxpage;
	}

	public void setMaxpage(int maxpage) {
		this.maxpage = maxpage;
	}

	public String getStateStr() {
		stateStr = "是";
		if (STATE_INVALID.equals(state)) {
			stateStr = "否";
		}
		return stateStr;
	}

	public void setStateStr(String stateStr) {
		this.stateStr = stateStr;
	}

	public String getNavigationStr() {
		navigationStr = "是";
		if (NAVIGATION_NO.equals(navigation)) {
			navigationStr = "否";
		}
		return navigationStr;
	}

	public void setNavigationStr(String navigationStr) {
		this.navigationStr = navigationStr;
	}

	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}
}