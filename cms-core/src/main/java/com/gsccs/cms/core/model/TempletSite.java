package com.gsccs.cms.core.model;

public class TempletSite {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_templet_site.id
     *
     * @mbggenerated Tue Jul 01 22:39:39 CST 2014
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_templet_site.templetid
     *
     * @mbggenerated Tue Jul 01 22:39:39 CST 2014
     */
    private String templetid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_templet_site.siteid
     *
     * @mbggenerated Tue Jul 01 22:39:39 CST 2014
     */
    private String siteid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_templet_site.id
     *
     * @return the value of cms_templet_site.id
     *
     * @mbggenerated Tue Jul 01 22:39:39 CST 2014
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_templet_site.id
     *
     * @param id the value for cms_templet_site.id
     *
     * @mbggenerated Tue Jul 01 22:39:39 CST 2014
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_templet_site.templetid
     *
     * @return the value of cms_templet_site.templetid
     *
     * @mbggenerated Tue Jul 01 22:39:39 CST 2014
     */
    public String getTempletid() {
        return templetid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_templet_site.templetid
     *
     * @param templetid the value for cms_templet_site.templetid
     *
     * @mbggenerated Tue Jul 01 22:39:39 CST 2014
     */
    public void setTempletid(String templetid) {
        this.templetid = templetid == null ? null : templetid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_templet_site.siteid
     *
     * @return the value of cms_templet_site.siteid
     *
     * @mbggenerated Tue Jul 01 22:39:39 CST 2014
     */
    public String getSiteid() {
        return siteid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_templet_site.siteid
     *
     * @param siteid the value for cms_templet_site.siteid
     *
     * @mbggenerated Tue Jul 01 22:39:39 CST 2014
     */
    public void setSiteid(String siteid) {
        this.siteid = siteid == null ? null : siteid.trim();
    }
}