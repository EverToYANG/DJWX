package com.gsccs.cms.member.model;

import java.io.Serializable;
import java.util.Date;

import com.gsccs.cms.bass.utils.DateUtil;

public class Creditlog implements Serializable{
    
    private String id;
    private String memberid;
    private String membername;
    private String creditruleid;
    private String creditrule;
    private Integer type;
    private String typeStr;
    
    private Integer credit;
    private Integer experience;
    
    private Date credittime;
    private Date credittimeToday;//查询条件
    private Date credittimeGreater;//查询条件
    private String credittimeStr;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_creditlog.id
     *
     * @return the value of cms_creditlog.id
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_creditlog.id
     *
     * @param id the value for cms_creditlog.id
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_creditlog.memberid
     *
     * @return the value of cms_creditlog.memberid
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    public String getMemberid() {
        return memberid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_creditlog.memberid
     *
     * @param memberid the value for cms_creditlog.memberid
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    public void setMemberid(String memberid) {
        this.memberid = memberid == null ? null : memberid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_creditlog.creditruleid
     *
     * @return the value of cms_creditlog.creditruleid
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    public String getCreditruleid() {
        return creditruleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_creditlog.creditruleid
     *
     * @param creditruleid the value for cms_creditlog.creditruleid
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    public void setCreditruleid(String creditruleid) {
        this.creditruleid = creditruleid == null ? null : creditruleid.trim();
    }


    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_creditlog.credit
     *
     * @return the value of cms_creditlog.credit
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    public Integer getCredit() {
        return credit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_creditlog.credit
     *
     * @param credit the value for cms_creditlog.credit
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_creditlog.experience
     *
     * @return the value of cms_creditlog.experience
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    public Integer getExperience() {
        return experience;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_creditlog.experience
     *
     * @param experience the value for cms_creditlog.experience
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_creditlog.credittime
     *
     * @return the value of cms_creditlog.credittime
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    public Date getCredittime() {
        return credittime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_creditlog.credittime
     *
     * @param credittime the value for cms_creditlog.credittime
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    public void setCredittime(Date credittime) {
        this.credittime = credittime;
    }

	public Date getCredittimeToday() {
		return credittimeToday;
	}

	public void setCredittimeToday(Date credittimeToday) {
		this.credittimeToday = credittimeToday;
	}

	public Date getCredittimeGreater() {
		return credittimeGreater;
	}

	public void setCredittimeGreater(Date credittimeGreater) {
		this.credittimeGreater = credittimeGreater;
	}

	public String getCredittimeStr() {
		if (credittime!=null) {
			credittimeStr=DateUtil.format(credittime, "yyyy-MM-dd HH:mm");
		}
		return credittimeStr;
	}

	public void setCredittimeStr(String credittimeStr) {
		this.credittimeStr = credittimeStr;
	}

	public String getTypeStr() {
		if (1==type) {
			typeStr="奖励";
		}else {
			typeStr="惩罚";
		}
		return typeStr;
	}

	public void setTypeStr(String typeStr) {
		this.typeStr = typeStr;
	}

	public String getCreditrule() {
		return creditrule;
	}

	public void setCreditrule(String creditrule) {
		this.creditrule = creditrule;
	}

	public String getMembername() {
		return membername;
	}

	public void setMembername(String membername) {
		this.membername = membername;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}
}