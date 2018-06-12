package com.gsccs.cms.core.model;

import java.util.Date;

public class Htmlquartz {
    
    private String id;

    
    private String siteid;

    
    private String channelid;

    
    private String type;
    public static String TYPE_EXETIME="0";//定时执行
    public static String TYPE_INTERVAL="1";//间隔重复执行

    
    private Integer exetimehour;

    
    private Integer exetimemin;
    private Date lastexetime;
    private Date nextexetime;
    private String sql;

    
    private String intervaltype;
    public static String INTERVALTYPE_HOUR="0";
    public static String INTERVALTYPE_MIN="1";
    private Integer intervalhour;

    
    private Integer intervalmin;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_htmlQuartz.id
     *
     * @return the value of cms_htmlQuartz.id
     *
     * @mbggenerated Wed Jan 23 21:55:47 CST 2013
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_htmlQuartz.id
     *
     * @param id the value for cms_htmlQuartz.id
     *
     * @mbggenerated Wed Jan 23 21:55:47 CST 2013
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_htmlQuartz.siteid
     *
     * @return the value of cms_htmlQuartz.siteid
     *
     * @mbggenerated Wed Jan 23 21:55:47 CST 2013
     */
    public String getSiteid() {
        return siteid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_htmlQuartz.siteid
     *
     * @param siteid the value for cms_htmlQuartz.siteid
     *
     * @mbggenerated Wed Jan 23 21:55:47 CST 2013
     */
    public void setSiteid(String siteid) {
        this.siteid = siteid == null ? null : siteid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_htmlQuartz.channelid
     *
     * @return the value of cms_htmlQuartz.channelid
     *
     * @mbggenerated Wed Jan 23 21:55:47 CST 2013
     */
    public String getChannelid() {
        return channelid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_htmlQuartz.channelid
     *
     * @param channelid the value for cms_htmlQuartz.channelid
     *
     * @mbggenerated Wed Jan 23 21:55:47 CST 2013
     */
    public void setChannelid(String channelid) {
        this.channelid = channelid == null ? null : channelid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_htmlQuartz.type
     *
     * @return the value of cms_htmlQuartz.type
     *
     * @mbggenerated Wed Jan 23 21:55:47 CST 2013
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_htmlQuartz.type
     *
     * @param type the value for cms_htmlQuartz.type
     *
     * @mbggenerated Wed Jan 23 21:55:47 CST 2013
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_htmlQuartz.exetimehour
     *
     * @return the value of cms_htmlQuartz.exetimehour
     *
     * @mbggenerated Wed Jan 23 21:55:47 CST 2013
     */
    public Integer getExetimehour() {
        return exetimehour;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_htmlQuartz.exetimehour
     *
     * @param exetimehour the value for cms_htmlQuartz.exetimehour
     *
     * @mbggenerated Wed Jan 23 21:55:47 CST 2013
     */
    public void setExetimehour(Integer exetimehour) {
        this.exetimehour = exetimehour;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_htmlQuartz.exetimemin
     *
     * @return the value of cms_htmlQuartz.exetimemin
     *
     * @mbggenerated Wed Jan 23 21:55:47 CST 2013
     */
    public Integer getExetimemin() {
        return exetimemin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_htmlQuartz.exetimemin
     *
     * @param exetimemin the value for cms_htmlQuartz.exetimemin
     *
     * @mbggenerated Wed Jan 23 21:55:47 CST 2013
     */
    public void setExetimemin(Integer exetimemin) {
        this.exetimemin = exetimemin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_htmlQuartz.intervalhour
     *
     * @return the value of cms_htmlQuartz.intervalhour
     *
     * @mbggenerated Wed Jan 23 21:55:47 CST 2013
     */
    public Integer getIntervalhour() {
        return intervalhour;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_htmlQuartz.intervalhour
     *
     * @param intervalhour the value for cms_htmlQuartz.intervalhour
     *
     * @mbggenerated Wed Jan 23 21:55:47 CST 2013
     */
    public void setIntervalhour(Integer intervalhour) {
        this.intervalhour = intervalhour;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_htmlQuartz.intervalmin
     *
     * @return the value of cms_htmlQuartz.intervalmin
     *
     * @mbggenerated Wed Jan 23 21:55:47 CST 2013
     */
    public Integer getIntervalmin() {
        return intervalmin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_htmlQuartz.intervalmin
     *
     * @param intervalmin the value for cms_htmlQuartz.intervalmin
     *
     * @mbggenerated Wed Jan 23 21:55:47 CST 2013
     */
    public void setIntervalmin(Integer intervalmin) {
        this.intervalmin = intervalmin;
    }

	public String getIntervaltype() {
		return intervaltype;
	}

	public void setIntervaltype(String intervaltype) {
		this.intervaltype = intervaltype;
	}

	public Date getLastexetime() {
		return lastexetime;
	}

	public void setLastexetime(Date lastexetime) {
		this.lastexetime = lastexetime;
	}

	public Date getNextexetime() {
		return nextexetime;
	}

	public void setNextexetime(Date nextexetime) {
		this.nextexetime = nextexetime;
	}

	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}
}