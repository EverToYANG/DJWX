package com.gsccs.cms.core.model;

import java.util.ArrayList;
import java.util.List;

import com.gsccs.cms.bass.base.BaseExample;

public class TempletChannelExample extends BaseExample{
    
    protected String orderByClause;

    
    protected boolean distinct;

    
    protected List<Criteria> oredCriteria;

    
    public TempletChannelExample() {
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

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
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

        public Criteria andContenttempletIsNull() {
            addCriterion("contentTemplet is null");
            return (Criteria) this;
        }

        public Criteria andContenttempletIsNotNull() {
            addCriterion("contentTemplet is not null");
            return (Criteria) this;
        }

        public Criteria andContenttempletEqualTo(String value) {
            addCriterion("contentTemplet =", value, "contenttemplet");
            return (Criteria) this;
        }

        public Criteria andContenttempletNotEqualTo(String value) {
            addCriterion("contentTemplet <>", value, "contenttemplet");
            return (Criteria) this;
        }

        public Criteria andContenttempletGreaterThan(String value) {
            addCriterion("contentTemplet >", value, "contenttemplet");
            return (Criteria) this;
        }

        public Criteria andContenttempletGreaterThanOrEqualTo(String value) {
            addCriterion("contentTemplet >=", value, "contenttemplet");
            return (Criteria) this;
        }

        public Criteria andContenttempletLessThan(String value) {
            addCriterion("contentTemplet <", value, "contenttemplet");
            return (Criteria) this;
        }

        public Criteria andContenttempletLessThanOrEqualTo(String value) {
            addCriterion("contentTemplet <=", value, "contenttemplet");
            return (Criteria) this;
        }

        public Criteria andContenttempletLike(String value) {
            addCriterion("contentTemplet like", value, "contenttemplet");
            return (Criteria) this;
        }

        public Criteria andContenttempletNotLike(String value) {
            addCriterion("contentTemplet not like", value, "contenttemplet");
            return (Criteria) this;
        }

        public Criteria andContenttempletIn(List<String> values) {
            addCriterion("contentTemplet in", values, "contenttemplet");
            return (Criteria) this;
        }

        public Criteria andContenttempletNotIn(List<String> values) {
            addCriterion("contentTemplet not in", values, "contenttemplet");
            return (Criteria) this;
        }

        public Criteria andContenttempletBetween(String value1, String value2) {
            addCriterion("contentTemplet between", value1, value2, "contenttemplet");
            return (Criteria) this;
        }

        public Criteria andContenttempletNotBetween(String value1, String value2) {
            addCriterion("contentTemplet not between", value1, value2, "contenttemplet");
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

        public Criteria andParidIsNull() {
            addCriterion("parId is null");
            return (Criteria) this;
        }

        public Criteria andParidIsNotNull() {
            addCriterion("parId is not null");
            return (Criteria) this;
        }

        public Criteria andParidEqualTo(String value) {
            addCriterion("parId =", value, "parid");
            return (Criteria) this;
        }

        public Criteria andParidNotEqualTo(String value) {
            addCriterion("parId <>", value, "parid");
            return (Criteria) this;
        }

        public Criteria andParidGreaterThan(String value) {
            addCriterion("parId >", value, "parid");
            return (Criteria) this;
        }

        public Criteria andParidGreaterThanOrEqualTo(String value) {
            addCriterion("parId >=", value, "parid");
            return (Criteria) this;
        }

        public Criteria andParidLessThan(String value) {
            addCriterion("parId <", value, "parid");
            return (Criteria) this;
        }

        public Criteria andParidLessThanOrEqualTo(String value) {
            addCriterion("parId <=", value, "parid");
            return (Criteria) this;
        }

        public Criteria andParidLike(String value) {
            addCriterion("parId like", value, "parid");
            return (Criteria) this;
        }

        public Criteria andParidNotLike(String value) {
            addCriterion("parId not like", value, "parid");
            return (Criteria) this;
        }

        public Criteria andParidIn(List<String> values) {
            addCriterion("parId in", values, "parid");
            return (Criteria) this;
        }

        public Criteria andParidNotIn(List<String> values) {
            addCriterion("parId not in", values, "parid");
            return (Criteria) this;
        }

        public Criteria andParidBetween(String value1, String value2) {
            addCriterion("parId between", value1, value2, "parid");
            return (Criteria) this;
        }

        public Criteria andParidNotBetween(String value1, String value2) {
            addCriterion("parId not between", value1, value2, "parid");
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

        public Criteria andSiteNotEqualTo(String value) {
            addCriterion("site <>", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteGreaterThan(String value) {
            addCriterion("site >", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteGreaterThanOrEqualTo(String value) {
            addCriterion("site >=", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLessThan(String value) {
            addCriterion("site <", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLessThanOrEqualTo(String value) {
            addCriterion("site <=", value, "site");
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

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andOrdernumIsNull() {
            addCriterion("orderNum is null");
            return (Criteria) this;
        }

        public Criteria andOrdernumIsNotNull() {
            addCriterion("orderNum is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernumEqualTo(Integer value) {
            addCriterion("orderNum =", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotEqualTo(Integer value) {
            addCriterion("orderNum <>", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumGreaterThan(Integer value) {
            addCriterion("orderNum >", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderNum >=", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumLessThan(Integer value) {
            addCriterion("orderNum <", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumLessThanOrEqualTo(Integer value) {
            addCriterion("orderNum <=", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumIn(List<Integer> values) {
            addCriterion("orderNum in", values, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotIn(List<Integer> values) {
            addCriterion("orderNum not in", values, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumBetween(Integer value1, Integer value2) {
            addCriterion("orderNum between", value1, value2, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotBetween(Integer value1, Integer value2) {
            addCriterion("orderNum not between", value1, value2, "ordernum");
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

        public Criteria andNavigationIsNull() {
            addCriterion("navigation is null");
            return (Criteria) this;
        }

        public Criteria andNavigationIsNotNull() {
            addCriterion("navigation is not null");
            return (Criteria) this;
        }

        public Criteria andNavigationEqualTo(String value) {
            addCriterion("navigation =", value, "navigation");
            return (Criteria) this;
        }

        public Criteria andNavigationNotEqualTo(String value) {
            addCriterion("navigation <>", value, "navigation");
            return (Criteria) this;
        }

        public Criteria andNavigationGreaterThan(String value) {
            addCriterion("navigation >", value, "navigation");
            return (Criteria) this;
        }

        public Criteria andNavigationGreaterThanOrEqualTo(String value) {
            addCriterion("navigation >=", value, "navigation");
            return (Criteria) this;
        }

        public Criteria andNavigationLessThan(String value) {
            addCriterion("navigation <", value, "navigation");
            return (Criteria) this;
        }

        public Criteria andNavigationLessThanOrEqualTo(String value) {
            addCriterion("navigation <=", value, "navigation");
            return (Criteria) this;
        }

        public Criteria andNavigationLike(String value) {
            addCriterion("navigation like", value, "navigation");
            return (Criteria) this;
        }

        public Criteria andNavigationNotLike(String value) {
            addCriterion("navigation not like", value, "navigation");
            return (Criteria) this;
        }

        public Criteria andNavigationIn(List<String> values) {
            addCriterion("navigation in", values, "navigation");
            return (Criteria) this;
        }

        public Criteria andNavigationNotIn(List<String> values) {
            addCriterion("navigation not in", values, "navigation");
            return (Criteria) this;
        }

        public Criteria andNavigationBetween(String value1, String value2) {
            addCriterion("navigation between", value1, value2, "navigation");
            return (Criteria) this;
        }

        public Criteria andNavigationNotBetween(String value1, String value2) {
            addCriterion("navigation not between", value1, value2, "navigation");
            return (Criteria) this;
        }

        public Criteria andPagemarkIsNull() {
            addCriterion("pagemark is null");
            return (Criteria) this;
        }

        public Criteria andPagemarkIsNotNull() {
            addCriterion("pagemark is not null");
            return (Criteria) this;
        }

        public Criteria andPagemarkEqualTo(String value) {
            addCriterion("pagemark =", value, "pagemark");
            return (Criteria) this;
        }

        public Criteria andPagemarkNotEqualTo(String value) {
            addCriterion("pagemark <>", value, "pagemark");
            return (Criteria) this;
        }

        public Criteria andPagemarkGreaterThan(String value) {
            addCriterion("pagemark >", value, "pagemark");
            return (Criteria) this;
        }

        public Criteria andPagemarkGreaterThanOrEqualTo(String value) {
            addCriterion("pagemark >=", value, "pagemark");
            return (Criteria) this;
        }

        public Criteria andPagemarkLessThan(String value) {
            addCriterion("pagemark <", value, "pagemark");
            return (Criteria) this;
        }

        public Criteria andPagemarkLessThanOrEqualTo(String value) {
            addCriterion("pagemark <=", value, "pagemark");
            return (Criteria) this;
        }

        public Criteria andPagemarkLike(String value) {
            addCriterion("pagemark like", value, "pagemark");
            return (Criteria) this;
        }

        public Criteria andPagemarkNotLike(String value) {
            addCriterion("pagemark not like", value, "pagemark");
            return (Criteria) this;
        }

        public Criteria andPagemarkIn(List<String> values) {
            addCriterion("pagemark in", values, "pagemark");
            return (Criteria) this;
        }

        public Criteria andPagemarkNotIn(List<String> values) {
            addCriterion("pagemark not in", values, "pagemark");
            return (Criteria) this;
        }

        public Criteria andPagemarkBetween(String value1, String value2) {
            addCriterion("pagemark between", value1, value2, "pagemark");
            return (Criteria) this;
        }

        public Criteria andPagemarkNotBetween(String value1, String value2) {
            addCriterion("pagemark not between", value1, value2, "pagemark");
            return (Criteria) this;
        }

        public Criteria andHtmlchannelIsNull() {
            addCriterion("htmlChannel is null");
            return (Criteria) this;
        }

        public Criteria andHtmlchannelIsNotNull() {
            addCriterion("htmlChannel is not null");
            return (Criteria) this;
        }

        public Criteria andHtmlchannelEqualTo(String value) {
            addCriterion("htmlChannel =", value, "htmlchannel");
            return (Criteria) this;
        }

        public Criteria andHtmlchannelNotEqualTo(String value) {
            addCriterion("htmlChannel <>", value, "htmlchannel");
            return (Criteria) this;
        }

        public Criteria andHtmlchannelGreaterThan(String value) {
            addCriterion("htmlChannel >", value, "htmlchannel");
            return (Criteria) this;
        }

        public Criteria andHtmlchannelGreaterThanOrEqualTo(String value) {
            addCriterion("htmlChannel >=", value, "htmlchannel");
            return (Criteria) this;
        }

        public Criteria andHtmlchannelLessThan(String value) {
            addCriterion("htmlChannel <", value, "htmlchannel");
            return (Criteria) this;
        }

        public Criteria andHtmlchannelLessThanOrEqualTo(String value) {
            addCriterion("htmlChannel <=", value, "htmlchannel");
            return (Criteria) this;
        }

        public Criteria andHtmlchannelLike(String value) {
            addCriterion("htmlChannel like", value, "htmlchannel");
            return (Criteria) this;
        }

        public Criteria andHtmlchannelNotLike(String value) {
            addCriterion("htmlChannel not like", value, "htmlchannel");
            return (Criteria) this;
        }

        public Criteria andHtmlchannelIn(List<String> values) {
            addCriterion("htmlChannel in", values, "htmlchannel");
            return (Criteria) this;
        }

        public Criteria andHtmlchannelNotIn(List<String> values) {
            addCriterion("htmlChannel not in", values, "htmlchannel");
            return (Criteria) this;
        }

        public Criteria andHtmlchannelBetween(String value1, String value2) {
            addCriterion("htmlChannel between", value1, value2, "htmlchannel");
            return (Criteria) this;
        }

        public Criteria andHtmlchannelNotBetween(String value1, String value2) {
            addCriterion("htmlChannel not between", value1, value2, "htmlchannel");
            return (Criteria) this;
        }

        public Criteria andHtmlchanneloldIsNull() {
            addCriterion("htmlChannelOld is null");
            return (Criteria) this;
        }

        public Criteria andHtmlchanneloldIsNotNull() {
            addCriterion("htmlChannelOld is not null");
            return (Criteria) this;
        }

        public Criteria andHtmlchanneloldEqualTo(String value) {
            addCriterion("htmlChannelOld =", value, "htmlchannelold");
            return (Criteria) this;
        }

        public Criteria andHtmlchanneloldNotEqualTo(String value) {
            addCriterion("htmlChannelOld <>", value, "htmlchannelold");
            return (Criteria) this;
        }

        public Criteria andHtmlchanneloldGreaterThan(String value) {
            addCriterion("htmlChannelOld >", value, "htmlchannelold");
            return (Criteria) this;
        }

        public Criteria andHtmlchanneloldGreaterThanOrEqualTo(String value) {
            addCriterion("htmlChannelOld >=", value, "htmlchannelold");
            return (Criteria) this;
        }

        public Criteria andHtmlchanneloldLessThan(String value) {
            addCriterion("htmlChannelOld <", value, "htmlchannelold");
            return (Criteria) this;
        }

        public Criteria andHtmlchanneloldLessThanOrEqualTo(String value) {
            addCriterion("htmlChannelOld <=", value, "htmlchannelold");
            return (Criteria) this;
        }

        public Criteria andHtmlchanneloldLike(String value) {
            addCriterion("htmlChannelOld like", value, "htmlchannelold");
            return (Criteria) this;
        }

        public Criteria andHtmlchanneloldNotLike(String value) {
            addCriterion("htmlChannelOld not like", value, "htmlchannelold");
            return (Criteria) this;
        }

        public Criteria andHtmlchanneloldIn(List<String> values) {
            addCriterion("htmlChannelOld in", values, "htmlchannelold");
            return (Criteria) this;
        }

        public Criteria andHtmlchanneloldNotIn(List<String> values) {
            addCriterion("htmlChannelOld not in", values, "htmlchannelold");
            return (Criteria) this;
        }

        public Criteria andHtmlchanneloldBetween(String value1, String value2) {
            addCriterion("htmlChannelOld between", value1, value2, "htmlchannelold");
            return (Criteria) this;
        }

        public Criteria andHtmlchanneloldNotBetween(String value1, String value2) {
            addCriterion("htmlChannelOld not between", value1, value2, "htmlchannelold");
            return (Criteria) this;
        }

        public Criteria andHtmlparchannelIsNull() {
            addCriterion("htmlParchannel is null");
            return (Criteria) this;
        }

        public Criteria andHtmlparchannelIsNotNull() {
            addCriterion("htmlParchannel is not null");
            return (Criteria) this;
        }

        public Criteria andHtmlparchannelEqualTo(String value) {
            addCriterion("htmlParchannel =", value, "htmlparchannel");
            return (Criteria) this;
        }

        public Criteria andHtmlparchannelNotEqualTo(String value) {
            addCriterion("htmlParchannel <>", value, "htmlparchannel");
            return (Criteria) this;
        }

        public Criteria andHtmlparchannelGreaterThan(String value) {
            addCriterion("htmlParchannel >", value, "htmlparchannel");
            return (Criteria) this;
        }

        public Criteria andHtmlparchannelGreaterThanOrEqualTo(String value) {
            addCriterion("htmlParchannel >=", value, "htmlparchannel");
            return (Criteria) this;
        }

        public Criteria andHtmlparchannelLessThan(String value) {
            addCriterion("htmlParchannel <", value, "htmlparchannel");
            return (Criteria) this;
        }

        public Criteria andHtmlparchannelLessThanOrEqualTo(String value) {
            addCriterion("htmlParchannel <=", value, "htmlparchannel");
            return (Criteria) this;
        }

        public Criteria andHtmlparchannelLike(String value) {
            addCriterion("htmlParchannel like", value, "htmlparchannel");
            return (Criteria) this;
        }

        public Criteria andHtmlparchannelNotLike(String value) {
            addCriterion("htmlParchannel not like", value, "htmlparchannel");
            return (Criteria) this;
        }

        public Criteria andHtmlparchannelIn(List<String> values) {
            addCriterion("htmlParchannel in", values, "htmlparchannel");
            return (Criteria) this;
        }

        public Criteria andHtmlparchannelNotIn(List<String> values) {
            addCriterion("htmlParchannel not in", values, "htmlparchannel");
            return (Criteria) this;
        }

        public Criteria andHtmlparchannelBetween(String value1, String value2) {
            addCriterion("htmlParchannel between", value1, value2, "htmlparchannel");
            return (Criteria) this;
        }

        public Criteria andHtmlparchannelNotBetween(String value1, String value2) {
            addCriterion("htmlParchannel not between", value1, value2, "htmlparchannel");
            return (Criteria) this;
        }

        public Criteria andHtmlsiteIsNull() {
            addCriterion("htmlSite is null");
            return (Criteria) this;
        }

        public Criteria andHtmlsiteIsNotNull() {
            addCriterion("htmlSite is not null");
            return (Criteria) this;
        }

        public Criteria andHtmlsiteEqualTo(String value) {
            addCriterion("htmlSite =", value, "htmlsite");
            return (Criteria) this;
        }

        public Criteria andHtmlsiteNotEqualTo(String value) {
            addCriterion("htmlSite <>", value, "htmlsite");
            return (Criteria) this;
        }

        public Criteria andHtmlsiteGreaterThan(String value) {
            addCriterion("htmlSite >", value, "htmlsite");
            return (Criteria) this;
        }

        public Criteria andHtmlsiteGreaterThanOrEqualTo(String value) {
            addCriterion("htmlSite >=", value, "htmlsite");
            return (Criteria) this;
        }

        public Criteria andHtmlsiteLessThan(String value) {
            addCriterion("htmlSite <", value, "htmlsite");
            return (Criteria) this;
        }

        public Criteria andHtmlsiteLessThanOrEqualTo(String value) {
            addCriterion("htmlSite <=", value, "htmlsite");
            return (Criteria) this;
        }

        public Criteria andHtmlsiteLike(String value) {
            addCriterion("htmlSite like", value, "htmlsite");
            return (Criteria) this;
        }

        public Criteria andHtmlsiteNotLike(String value) {
            addCriterion("htmlSite not like", value, "htmlsite");
            return (Criteria) this;
        }

        public Criteria andHtmlsiteIn(List<String> values) {
            addCriterion("htmlSite in", values, "htmlsite");
            return (Criteria) this;
        }

        public Criteria andHtmlsiteNotIn(List<String> values) {
            addCriterion("htmlSite not in", values, "htmlsite");
            return (Criteria) this;
        }

        public Criteria andHtmlsiteBetween(String value1, String value2) {
            addCriterion("htmlSite between", value1, value2, "htmlsite");
            return (Criteria) this;
        }

        public Criteria andHtmlsiteNotBetween(String value1, String value2) {
            addCriterion("htmlSite not between", value1, value2, "htmlsite");
            return (Criteria) this;
        }

        public Criteria andTempletidIsNull() {
            addCriterion("templetid is null");
            return (Criteria) this;
        }

        public Criteria andTempletidIsNotNull() {
            addCriterion("templetid is not null");
            return (Criteria) this;
        }

        public Criteria andTempletidEqualTo(String value) {
            addCriterion("templetid =", value, "templetid");
            return (Criteria) this;
        }
        public Criteria andSql(String value) {
            addCriterion(value);
            return (Criteria) this;
        }


        public Criteria andTempletidNotEqualTo(String value) {
            addCriterion("templetid <>", value, "templetid");
            return (Criteria) this;
        }

        public Criteria andTempletidGreaterThan(String value) {
            addCriterion("templetid >", value, "templetid");
            return (Criteria) this;
        }

        public Criteria andTempletidGreaterThanOrEqualTo(String value) {
            addCriterion("templetid >=", value, "templetid");
            return (Criteria) this;
        }

        public Criteria andTempletidLessThan(String value) {
            addCriterion("templetid <", value, "templetid");
            return (Criteria) this;
        }

        public Criteria andTempletidLessThanOrEqualTo(String value) {
            addCriterion("templetid <=", value, "templetid");
            return (Criteria) this;
        }

        public Criteria andTempletidLike(String value) {
            addCriterion("templetid like", value, "templetid");
            return (Criteria) this;
        }

        public Criteria andTempletidNotLike(String value) {
            addCriterion("templetid not like", value, "templetid");
            return (Criteria) this;
        }

        public Criteria andTempletidIn(List<String> values) {
            addCriterion("templetid in", values, "templetid");
            return (Criteria) this;
        }

        public Criteria andTempletidNotIn(List<String> values) {
            addCriterion("templetid not in", values, "templetid");
            return (Criteria) this;
        }

        public Criteria andTempletidBetween(String value1, String value2) {
            addCriterion("templetid between", value1, value2, "templetid");
            return (Criteria) this;
        }

        public Criteria andTempletidNotBetween(String value1, String value2) {
            addCriterion("templetid not between", value1, value2, "templetid");
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