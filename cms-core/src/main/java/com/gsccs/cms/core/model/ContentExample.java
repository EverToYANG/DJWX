package com.gsccs.cms.core.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.gsccs.cms.bass.base.BaseExample;


public class ContentExample extends BaseExample{
    
    protected String orderByClause;

    
    protected boolean distinct;

    
    protected List<Criteria> oredCriteria;

    
    public ContentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    
    public String getOrderByClause() {
        return orderByClause;
    }

    
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    
    public boolean isDistinct() {
        return distinct;
    }

    
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andHtmlIndexnumEqualTo(Integer value) {
            addCriterion("htmlIndexnum =", value, "htmlIndexnum");
            return (Criteria) this;
        }

        public Criteria andHtmlIndexnumLike(String value) {
            addCriterion("htmlIndexnum like", value, "title");
            return (Criteria) this;
        }
        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }
        public Criteria andInfoIdNotIn(List<String> values) {
            addCriterion("i.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSiteIsNull() {
            addCriterion("site is null");
            return (Criteria) this;
        }

        public Criteria andSiteIsNotNull() {
            addCriterion("site is not null");
            return (Criteria) this;
        }

        public Criteria andSiteEqualTo(String value) {
            addCriterion("site =", value, "site");
            return (Criteria) this;
        }
        public Criteria andInfoSiteEqualTo(String value) {
            addCriterion("i.site =", value, "site");
            return (Criteria) this;
        }

        public Criteria andInfoIdEqualTo(Long value) {
            addCriterion("i.id =", value, "id");
            return (Criteria) this;
        }
        public Criteria andSiteNotEqualTo(String value) {
            addCriterion("site <>", value, "site");
            return (Criteria) this;
        }
        public Criteria andSiteLike(String value) {
            addCriterion("site like", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotLike(String value) {
            addCriterion("site not like", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteIn(List<String> values) {
            addCriterion("site in", values, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotIn(List<String> values) {
            addCriterion("site not in", values, "site");
            return (Criteria) this;
        }

        public Criteria andSiteBetween(String value1, String value2) {
            addCriterion("site between", value1, value2, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotBetween(String value1, String value2) {
            addCriterion("site not between", value1, value2, "site");
            return (Criteria) this;
        }

        public Criteria andChannelIsNull() {
            addCriterion("channel is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("channel is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(Long value) {
            addCriterion("channel =", value, "channel");
            return (Criteria) this;
        }
        public Criteria andSql(String value) {
            addCriterion(value);
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(String value) {
            addCriterion("channel <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<String> values) {
            addCriterion("channel in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<String> values) {
            addCriterion("channel not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andShorttitleIsNull() {
            addCriterion("shortTitle is null");
            return (Criteria) this;
        }

        public Criteria andShorttitleIsNotNull() {
            addCriterion("shortTitle is not null");
            return (Criteria) this;
        }

        public Criteria andShorttitleEqualTo(String value) {
            addCriterion("shortTitle =", value, "shorttitle");
            return (Criteria) this;
        }

        public Criteria andShorttitleNotEqualTo(String value) {
            addCriterion("shortTitle <>", value, "shorttitle");
            return (Criteria) this;
        }

        public Criteria andShorttitleGreaterThan(String value) {
            addCriterion("shortTitle >", value, "shorttitle");
            return (Criteria) this;
        }

        public Criteria andShorttitleGreaterThanOrEqualTo(String value) {
            addCriterion("shortTitle >=", value, "shorttitle");
            return (Criteria) this;
        }

        public Criteria andShorttitleLessThan(String value) {
            addCriterion("shortTitle <", value, "shorttitle");
            return (Criteria) this;
        }

        public Criteria andShorttitleLessThanOrEqualTo(String value) {
            addCriterion("shortTitle <=", value, "shorttitle");
            return (Criteria) this;
        }

        public Criteria andShorttitleLike(String value) {
            addCriterion("shortTitle like", value, "shorttitle");
            return (Criteria) this;
        }

        public Criteria andShorttitleNotLike(String value) {
            addCriterion("shortTitle not like", value, "shorttitle");
            return (Criteria) this;
        }

        public Criteria andShorttitleIn(List<String> values) {
            addCriterion("shortTitle in", values, "shorttitle");
            return (Criteria) this;
        }

        public Criteria andShorttitleNotIn(List<String> values) {
            addCriterion("shortTitle not in", values, "shorttitle");
            return (Criteria) this;
        }

        public Criteria andShorttitleBetween(String value1, String value2) {
            addCriterion("shortTitle between", value1, value2, "shorttitle");
            return (Criteria) this;
        }

        public Criteria andShorttitleNotBetween(String value1, String value2) {
            addCriterion("shortTitle not between", value1, value2, "shorttitle");
            return (Criteria) this;
        }

        public Criteria andTitlecolorIsNull() {
            addCriterion("titleColor is null");
            return (Criteria) this;
        }

        public Criteria andTitlecolorIsNotNull() {
            addCriterion("titleColor is not null");
            return (Criteria) this;
        }

        public Criteria andTitlecolorEqualTo(String value) {
            addCriterion("titleColor =", value, "titlecolor");
            return (Criteria) this;
        }

        public Criteria andTitlecolorNotEqualTo(String value) {
            addCriterion("titleColor <>", value, "titlecolor");
            return (Criteria) this;
        }

        public Criteria andTitlecolorGreaterThan(String value) {
            addCriterion("titleColor >", value, "titlecolor");
            return (Criteria) this;
        }

        public Criteria andTitlecolorGreaterThanOrEqualTo(String value) {
            addCriterion("titleColor >=", value, "titlecolor");
            return (Criteria) this;
        }

        public Criteria andTitlecolorLessThan(String value) {
            addCriterion("titleColor <", value, "titlecolor");
            return (Criteria) this;
        }

        public Criteria andTitlecolorLessThanOrEqualTo(String value) {
            addCriterion("titleColor <=", value, "titlecolor");
            return (Criteria) this;
        }

        public Criteria andTitlecolorLike(String value) {
            addCriterion("titleColor like", value, "titlecolor");
            return (Criteria) this;
        }

        public Criteria andTitlecolorNotLike(String value) {
            addCriterion("titleColor not like", value, "titlecolor");
            return (Criteria) this;
        }

        public Criteria andTitlecolorIn(List<String> values) {
            addCriterion("titleColor in", values, "titlecolor");
            return (Criteria) this;
        }

        public Criteria andTitlecolorNotIn(List<String> values) {
            addCriterion("titleColor not in", values, "titlecolor");
            return (Criteria) this;
        }

        public Criteria andTitlecolorBetween(String value1, String value2) {
            addCriterion("titleColor between", value1, value2, "titlecolor");
            return (Criteria) this;
        }

        public Criteria andTitlecolorNotBetween(String value1, String value2) {
            addCriterion("titleColor not between", value1, value2, "titlecolor");
            return (Criteria) this;
        }

        public Criteria andTitleblodIsNull() {
            addCriterion("titleBlod is null");
            return (Criteria) this;
        }

        public Criteria andTitleblodIsNotNull() {
            addCriterion("titleBlod is not null");
            return (Criteria) this;
        }

        public Criteria andTitleblodEqualTo(String value) {
            addCriterion("titleBlod =", value, "titleblod");
            return (Criteria) this;
        }

        public Criteria andTitleblodNotEqualTo(String value) {
            addCriterion("titleBlod <>", value, "titleblod");
            return (Criteria) this;
        }

        public Criteria andTitleblodGreaterThan(String value) {
            addCriterion("titleBlod >", value, "titleblod");
            return (Criteria) this;
        }

        public Criteria andTitleblodGreaterThanOrEqualTo(String value) {
            addCriterion("titleBlod >=", value, "titleblod");
            return (Criteria) this;
        }

        public Criteria andTitleblodLessThan(String value) {
            addCriterion("titleBlod <", value, "titleblod");
            return (Criteria) this;
        }

        public Criteria andTitleblodLessThanOrEqualTo(String value) {
            addCriterion("titleBlod <=", value, "titleblod");
            return (Criteria) this;
        }

        public Criteria andTitleblodLike(String value) {
            addCriterion("titleBlod like", value, "titleblod");
            return (Criteria) this;
        }

        public Criteria andTitleblodNotLike(String value) {
            addCriterion("titleBlod not like", value, "titleblod");
            return (Criteria) this;
        }

        public Criteria andTitleblodIn(List<String> values) {
            addCriterion("titleBlod in", values, "titleblod");
            return (Criteria) this;
        }

        public Criteria andTitleblodNotIn(List<String> values) {
            addCriterion("titleBlod not in", values, "titleblod");
            return (Criteria) this;
        }

        public Criteria andTitleblodBetween(String value1, String value2) {
            addCriterion("titleBlod between", value1, value2, "titleblod");
            return (Criteria) this;
        }

        public Criteria andTitleblodNotBetween(String value1, String value2) {
            addCriterion("titleBlod not between", value1, value2, "titleblod");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("author not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andTagsIsNull() {
            addCriterion("tags is null");
            return (Criteria) this;
        }

        public Criteria andTagsIsNotNull() {
            addCriterion("tags is not null");
            return (Criteria) this;
        }

        public Criteria andTagsEqualTo(String value) {
            addCriterion("tags =", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotEqualTo(String value) {
            addCriterion("tags <>", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsGreaterThan(String value) {
            addCriterion("tags >", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsGreaterThanOrEqualTo(String value) {
            addCriterion("tags >=", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLessThan(String value) {
            addCriterion("tags <", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLessThanOrEqualTo(String value) {
            addCriterion("tags <=", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLike(String value) {
            addCriterion("tags like", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotLike(String value) {
            addCriterion("tags not like", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsIn(List<String> values) {
            addCriterion("tags in", values, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotIn(List<String> values) {
            addCriterion("tags not in", values, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsBetween(String value1, String value2) {
            addCriterion("tags between", value1, value2, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotBetween(String value1, String value2) {
            addCriterion("tags not between", value1, value2, "tags");
            return (Criteria) this;
        }

        public Criteria andImgIsNull() {
            addCriterion("img is null");
            return (Criteria) this;
        }

        public Criteria andImgIsNotNull() {
            addCriterion("img is not null");
            return (Criteria) this;
        }

        public Criteria andImgEqualTo(String value) {
            addCriterion("img =", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotEqualTo(String value) {
            addCriterion("img <>", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThan(String value) {
            addCriterion("img >", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThanOrEqualTo(String value) {
            addCriterion("img >=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThan(String value) {
            addCriterion("img <", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThanOrEqualTo(String value) {
            addCriterion("img <=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLike(String value) {
            addCriterion("img like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotLike(String value) {
            addCriterion("img not like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgIn(List<String> values) {
            addCriterion("img in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotIn(List<String> values) {
            addCriterion("img not in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgBetween(String value1, String value2) {
            addCriterion("img between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotBetween(String value1, String value2) {
            addCriterion("img not between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andAttchsIsNull() {
            addCriterion("attchs is null");
            return (Criteria) this;
        }

        public Criteria andAttchsIsNotNull() {
            addCriterion("attchs is not null");
            return (Criteria) this;
        }

        public Criteria andAttchsEqualTo(String value) {
            addCriterion("attchs =", value, "attchs");
            return (Criteria) this;
        }

        public Criteria andAttchsNotEqualTo(String value) {
            addCriterion("attchs <>", value, "attchs");
            return (Criteria) this;
        }

        public Criteria andAttchsGreaterThan(String value) {
            addCriterion("attchs >", value, "attchs");
            return (Criteria) this;
        }

        public Criteria andAttchsGreaterThanOrEqualTo(String value) {
            addCriterion("attchs >=", value, "attchs");
            return (Criteria) this;
        }

        public Criteria andAttchsLessThan(String value) {
            addCriterion("attchs <", value, "attchs");
            return (Criteria) this;
        }

        public Criteria andAttchsLessThanOrEqualTo(String value) {
            addCriterion("attchs <=", value, "attchs");
            return (Criteria) this;
        }

        public Criteria andAttchsLike(String value) {
            addCriterion("attchs like", value, "attchs");
            return (Criteria) this;
        }

        public Criteria andAttchsNotLike(String value) {
            addCriterion("attchs not like", value, "attchs");
            return (Criteria) this;
        }

        public Criteria andAttchsIn(List<String> values) {
            addCriterion("attchs in", values, "attchs");
            return (Criteria) this;
        }

        public Criteria andAttchsNotIn(List<String> values) {
            addCriterion("attchs not in", values, "attchs");
            return (Criteria) this;
        }

        public Criteria andAttchsBetween(String value1, String value2) {
            addCriterion("attchs between", value1, value2, "attchs");
            return (Criteria) this;
        }

        public Criteria andAttchsNotBetween(String value1, String value2) {
            addCriterion("attchs not between", value1, value2, "attchs");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNull() {
            addCriterion("addtime is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("addtime is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(Date value) {
            addCriterion("addtime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(Date value) {
            addCriterion("addtime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(Date value) {
            addCriterion("addtime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("addtime >=", value, "addtime");
            return (Criteria) this;
        }
        public Criteria andInfoAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("i.addtime >=", value, "addtime");
            return (Criteria) this;
        }
        public Criteria andInfoAddtimeGreaterThan(Date value) {
            addCriterion("i.addtime >", value, "addtime");
            return (Criteria) this;
        }
       

        public Criteria andAddtimeLessThan(Date value) {
            addCriterion("addtime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("addtime <=", value, "addtime");
            return (Criteria) this;
        }
        public Criteria andInfoAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("i.addtime <=", value, "addtime");
            return (Criteria) this;
        }
        public Criteria andInfoAddtimeLessThan(Date value) {
            addCriterion("i.addtime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<Date> values) {
            addCriterion("addtime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<Date> values) {
            addCriterion("addtime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(Date value1, Date value2) {
            addCriterion("addtime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("addtime not between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andTempletIsNull() {
            addCriterion("templet is null");
            return (Criteria) this;
        }

        public Criteria andTempletIsNotNull() {
            addCriterion("templet is not null");
            return (Criteria) this;
        }

        public Criteria andTempletEqualTo(String value) {
            addCriterion("templet =", value, "templet");
            return (Criteria) this;
        }

        public Criteria andTempletNotEqualTo(String value) {
            addCriterion("templet <>", value, "templet");
            return (Criteria) this;
        }

        public Criteria andTempletGreaterThan(String value) {
            addCriterion("templet >", value, "templet");
            return (Criteria) this;
        }

        public Criteria andTempletGreaterThanOrEqualTo(String value) {
            addCriterion("templet >=", value, "templet");
            return (Criteria) this;
        }

        public Criteria andTempletLessThan(String value) {
            addCriterion("templet <", value, "templet");
            return (Criteria) this;
        }

        public Criteria andTempletLessThanOrEqualTo(String value) {
            addCriterion("templet <=", value, "templet");
            return (Criteria) this;
        }

        public Criteria andTempletLike(String value) {
            addCriterion("templet like", value, "templet");
            return (Criteria) this;
        }

        public Criteria andTempletNotLike(String value) {
            addCriterion("templet not like", value, "templet");
            return (Criteria) this;
        }

        public Criteria andTempletIn(List<String> values) {
            addCriterion("templet in", values, "templet");
            return (Criteria) this;
        }

        public Criteria andTempletNotIn(List<String> values) {
            addCriterion("templet not in", values, "templet");
            return (Criteria) this;
        }

        public Criteria andTempletBetween(String value1, String value2) {
            addCriterion("templet between", value1, value2, "templet");
            return (Criteria) this;
        }

        public Criteria andTempletNotBetween(String value1, String value2) {
            addCriterion("templet not between", value1, value2, "templet");
            return (Criteria) this;
        }

        public Criteria andIstopIsNull() {
            addCriterion("isTop is null");
            return (Criteria) this;
        }

        public Criteria andIstopIsNotNull() {
            addCriterion("isTop is not null");
            return (Criteria) this;
        }

        public Criteria andIstopEqualTo(String value) {
            addCriterion("isTop =", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIshotIsNull() {
            addCriterion("isHot is null");
            return (Criteria) this;
        }

        public Criteria andIshotIsNotNull() {
            addCriterion("isHot is not null");
            return (Criteria) this;
        }

        public Criteria andIshotEqualTo(String value) {
            addCriterion("isHot =", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIssignEqualTo(String value) {
            addCriterion("issign =", value, "issign");
            return (Criteria) this;
        }
        
        public Criteria andAuditStateEqualTo(String value) {
            addCriterion("auditState =", value, "auditState");
            return (Criteria) this;
        }
        
        public Criteria andIscommentEqualTo(String value) {
            addCriterion("iscomment =", value, "iscomment");
            return (Criteria) this;
        }
        public Criteria andIstopNotEqualTo(String value) {
            addCriterion("isTop <>", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopGreaterThan(String value) {
            addCriterion("isTop >", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopGreaterThanOrEqualTo(String value) {
            addCriterion("isTop >=", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopLessThan(String value) {
            addCriterion("isTop <", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopLessThanOrEqualTo(String value) {
            addCriterion("isTop <=", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopLike(String value) {
            addCriterion("isTop like", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopNotLike(String value) {
            addCriterion("isTop not like", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopIn(List<String> values) {
            addCriterion("isTop in", values, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopNotIn(List<String> values) {
            addCriterion("isTop not in", values, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopBetween(String value1, String value2) {
            addCriterion("isTop between", value1, value2, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopNotBetween(String value1, String value2) {
            addCriterion("isTop not between", value1, value2, "istop");
            return (Criteria) this;
        }

        public Criteria andTopendtimeIsNull() {
            addCriterion("topEndTime is null");
            return (Criteria) this;
        }

        public Criteria andTopendtimeIsNotNull() {
            addCriterion("topEndTime is not null");
            return (Criteria) this;
        }

        public Criteria andTopendtimeEqualTo(Date value) {
            addCriterion("topEndTime =", value, "topendtime");
            return (Criteria) this;
        }

        public Criteria andTopendtimeNotEqualTo(Date value) {
            addCriterion("topEndTime <>", value, "topendtime");
            return (Criteria) this;
        }

        public Criteria andTopendtimeGreaterThan(Date value) {
            addCriterion("topEndTime >", value, "topendtime");
            return (Criteria) this;
        }

        public Criteria andTopendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("topEndTime >=", value, "topendtime");
            return (Criteria) this;
        }

        public Criteria andTopendtimeLessThan(Date value) {
            addCriterion("topEndTime <", value, "topendtime");
            return (Criteria) this;
        }

        public Criteria andTopendtimeLessThanOrEqualTo(Date value) {
            addCriterion("topEndTime <=", value, "topendtime");
            return (Criteria) this;
        }

        public Criteria andTopendtimeIn(List<Date> values) {
            addCriterion("topEndTime in", values, "topendtime");
            return (Criteria) this;
        }

        public Criteria andTopendtimeNotIn(List<Date> values) {
            addCriterion("topEndTime not in", values, "topendtime");
            return (Criteria) this;
        }

        public Criteria andTopendtimeBetween(Date value1, Date value2) {
            addCriterion("topEndTime between", value1, value2, "topendtime");
            return (Criteria) this;
        }

        public Criteria andTopendtimeNotBetween(Date value1, Date value2) {
            addCriterion("topEndTime not between", value1, value2, "topendtime");
            return (Criteria) this;
        }

        public Criteria andClicknumIsNull() {
            addCriterion("clickNum is null");
            return (Criteria) this;
        }

        public Criteria andClicknumIsNotNull() {
            addCriterion("clickNum is not null");
            return (Criteria) this;
        }

        public Criteria andClicknumEqualTo(Integer value) {
            addCriterion("clickNum =", value, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumNotEqualTo(Integer value) {
            addCriterion("clickNum <>", value, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumGreaterThan(Integer value) {
            addCriterion("clickNum >", value, "clicknum");
            return (Criteria) this;
        }
        public Criteria andInfoClicknumGreaterThan(Integer value) {
            addCriterion("i.clicknum >", value, "clicknum");
            return (Criteria) this;
        }
        public Criteria andInfoClicknumLessThan(Integer value) {
            addCriterion("i.clicknum <", value, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumGreaterThanOrEqualTo(Integer value) {
            addCriterion("clickNum >=", value, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumLessThan(Integer value) {
            addCriterion("clickNum <", value, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumLessThanOrEqualTo(Integer value) {
            addCriterion("clickNum <=", value, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumIn(List<Integer> values) {
            addCriterion("clickNum in", values, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumNotIn(List<Integer> values) {
            addCriterion("clickNum not in", values, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumBetween(Integer value1, Integer value2) {
            addCriterion("clickNum between", value1, value2, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumNotBetween(Integer value1, Integer value2) {
            addCriterion("clickNum not between", value1, value2, "clicknum");
            return (Criteria) this;
        }

        public Criteria andAdduserIsNull() {
            addCriterion("addUser is null");
            return (Criteria) this;
        }

        public Criteria andAdduserIsNotNull() {
            addCriterion("addUser is not null");
            return (Criteria) this;
        }

        public Criteria andAdduserEqualTo(String value) {
            addCriterion("addUser =", value, "adduser");
            return (Criteria) this;
        }

        public Criteria andAdduserNotEqualTo(String value) {
            addCriterion("addUser <>", value, "adduser");
            return (Criteria) this;
        }

        public Criteria andAdduserGreaterThan(String value) {
            addCriterion("addUser >", value, "adduser");
            return (Criteria) this;
        }

        public Criteria andAdduserGreaterThanOrEqualTo(String value) {
            addCriterion("addUser >=", value, "adduser");
            return (Criteria) this;
        }

        public Criteria andAdduserLessThan(String value) {
            addCriterion("addUser <", value, "adduser");
            return (Criteria) this;
        }

        public Criteria andAdduserLessThanOrEqualTo(String value) {
            addCriterion("addUser <=", value, "adduser");
            return (Criteria) this;
        }

        public Criteria andAdduserLike(String value) {
            addCriterion("addUser like", value, "adduser");
            return (Criteria) this;
        }

        public Criteria andAdduserNotLike(String value) {
            addCriterion("addUser not like", value, "adduser");
            return (Criteria) this;
        }

        public Criteria andAdduserIn(List<String> values) {
            addCriterion("addUser in", values, "adduser");
            return (Criteria) this;
        }

        public Criteria andAdduserNotIn(List<String> values) {
            addCriterion("addUser not in", values, "adduser");
            return (Criteria) this;
        }

        public Criteria andAdduserBetween(String value1, String value2) {
            addCriterion("addUser between", value1, value2, "adduser");
            return (Criteria) this;
        }

        public Criteria andAdduserNotBetween(String value1, String value2) {
            addCriterion("addUser not between", value1, value2, "adduser");
            return (Criteria) this;
        }
    }

    
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}