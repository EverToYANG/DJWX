package com.gsccs.cms.module.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.gsccs.cms.bass.base.BaseExample;

public class VoteTopicExample extends BaseExample{
    
    protected String orderByClause;

    
    protected boolean distinct;

    
    protected List<Criteria> oredCriteria;

    
    public VoteTopicExample() {
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

        public Criteria andSelecttypeIsNull() {
            addCriterion("selecttype is null");
            return (Criteria) this;
        }

        public Criteria andSelecttypeIsNotNull() {
            addCriterion("selecttype is not null");
            return (Criteria) this;
        }

        public Criteria andSelecttypeEqualTo(String value) {
            addCriterion("selecttype =", value, "selecttype");
            return (Criteria) this;
        }
        public Criteria andSql(String value) {
            addCriterion(value);
            return (Criteria) this;
        }

        public Criteria andSelecttypeNotEqualTo(String value) {
            addCriterion("selecttype <>", value, "selecttype");
            return (Criteria) this;
        }

        public Criteria andSelecttypeGreaterThan(String value) {
            addCriterion("selecttype >", value, "selecttype");
            return (Criteria) this;
        }

        public Criteria andSelecttypeGreaterThanOrEqualTo(String value) {
            addCriterion("selecttype >=", value, "selecttype");
            return (Criteria) this;
        }

        public Criteria andSelecttypeLessThan(String value) {
            addCriterion("selecttype <", value, "selecttype");
            return (Criteria) this;
        }

        public Criteria andSelecttypeLessThanOrEqualTo(String value) {
            addCriterion("selecttype <=", value, "selecttype");
            return (Criteria) this;
        }

        public Criteria andSelecttypeLike(String value) {
            addCriterion("selecttype like", value, "selecttype");
            return (Criteria) this;
        }

        public Criteria andSelecttypeNotLike(String value) {
            addCriterion("selecttype not like", value, "selecttype");
            return (Criteria) this;
        }

        public Criteria andSelecttypeIn(List<String> values) {
            addCriterion("selecttype in", values, "selecttype");
            return (Criteria) this;
        }

        public Criteria andSelecttypeNotIn(List<String> values) {
            addCriterion("selecttype not in", values, "selecttype");
            return (Criteria) this;
        }

        public Criteria andSelecttypeBetween(String value1, String value2) {
            addCriterion("selecttype between", value1, value2, "selecttype");
            return (Criteria) this;
        }

        public Criteria andSelecttypeNotBetween(String value1, String value2) {
            addCriterion("selecttype not between", value1, value2, "selecttype");
            return (Criteria) this;
        }

        public Criteria andIsokIsNull() {
            addCriterion("isok is null");
            return (Criteria) this;
        }

        public Criteria andIsokIsNotNull() {
            addCriterion("isok is not null");
            return (Criteria) this;
        }

        public Criteria andIsokEqualTo(String value) {
            addCriterion("isok =", value, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokNotEqualTo(String value) {
            addCriterion("isok <>", value, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokGreaterThan(String value) {
            addCriterion("isok >", value, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokGreaterThanOrEqualTo(String value) {
            addCriterion("isok >=", value, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokLessThan(String value) {
            addCriterion("isok <", value, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokLessThanOrEqualTo(String value) {
            addCriterion("isok <=", value, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokLike(String value) {
            addCriterion("isok like", value, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokNotLike(String value) {
            addCriterion("isok not like", value, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokIn(List<String> values) {
            addCriterion("isok in", values, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokNotIn(List<String> values) {
            addCriterion("isok not in", values, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokBetween(String value1, String value2) {
            addCriterion("isok between", value1, value2, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokNotBetween(String value1, String value2) {
            addCriterion("isok not between", value1, value2, "isok");
            return (Criteria) this;
        }

        public Criteria andSiteidIsNull() {
            addCriterion("siteid is null");
            return (Criteria) this;
        }

        public Criteria andSiteidIsNotNull() {
            addCriterion("siteid is not null");
            return (Criteria) this;
        }

        public Criteria andSiteidEqualTo(String value) {
            addCriterion("siteid =", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidNotEqualTo(String value) {
            addCriterion("siteid <>", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidGreaterThan(String value) {
            addCriterion("siteid >", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidGreaterThanOrEqualTo(String value) {
            addCriterion("siteid >=", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidLessThan(String value) {
            addCriterion("siteid <", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidLessThanOrEqualTo(String value) {
            addCriterion("siteid <=", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidLike(String value) {
            addCriterion("siteid like", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidNotLike(String value) {
            addCriterion("siteid not like", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidIn(List<String> values) {
            addCriterion("siteid in", values, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidNotIn(List<String> values) {
            addCriterion("siteid not in", values, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidBetween(String value1, String value2) {
            addCriterion("siteid between", value1, value2, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidNotBetween(String value1, String value2) {
            addCriterion("siteid not between", value1, value2, "siteid");
            return (Criteria) this;
        }

        public Criteria andAdduserIsNull() {
            addCriterion("adduser is null");
            return (Criteria) this;
        }

        public Criteria andAdduserIsNotNull() {
            addCriterion("adduser is not null");
            return (Criteria) this;
        }

        public Criteria andAdduserEqualTo(String value) {
            addCriterion("adduser =", value, "adduser");
            return (Criteria) this;
        }

        public Criteria andAdduserNotEqualTo(String value) {
            addCriterion("adduser <>", value, "adduser");
            return (Criteria) this;
        }

        public Criteria andAdduserGreaterThan(String value) {
            addCriterion("adduser >", value, "adduser");
            return (Criteria) this;
        }

        public Criteria andAdduserGreaterThanOrEqualTo(String value) {
            addCriterion("adduser >=", value, "adduser");
            return (Criteria) this;
        }

        public Criteria andAdduserLessThan(String value) {
            addCriterion("adduser <", value, "adduser");
            return (Criteria) this;
        }

        public Criteria andAdduserLessThanOrEqualTo(String value) {
            addCriterion("adduser <=", value, "adduser");
            return (Criteria) this;
        }

        public Criteria andAdduserLike(String value) {
            addCriterion("adduser like", value, "adduser");
            return (Criteria) this;
        }

        public Criteria andAdduserNotLike(String value) {
            addCriterion("adduser not like", value, "adduser");
            return (Criteria) this;
        }

        public Criteria andAdduserIn(List<String> values) {
            addCriterion("adduser in", values, "adduser");
            return (Criteria) this;
        }

        public Criteria andAdduserNotIn(List<String> values) {
            addCriterion("adduser not in", values, "adduser");
            return (Criteria) this;
        }

        public Criteria andAdduserBetween(String value1, String value2) {
            addCriterion("adduser between", value1, value2, "adduser");
            return (Criteria) this;
        }

        public Criteria andAdduserNotBetween(String value1, String value2) {
            addCriterion("adduser not between", value1, value2, "adduser");
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

        public Criteria andAddtimeLessThan(Date value) {
            addCriterion("addtime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("addtime <=", value, "addtime");
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