package com.gsccs.cms.core.model;

import java.util.ArrayList;
import java.util.List;

public class HtmlquartzExample {
    
    protected String orderByClause;

    
    protected boolean distinct;

    
    protected List<Criteria> oredCriteria;

    
    public HtmlquartzExample() {
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

        public Criteria andChannelidIsNull() {
            addCriterion("channelid is null");
            return (Criteria) this;
        }

        public Criteria andChannelidIsNotNull() {
            addCriterion("channelid is not null");
            return (Criteria) this;
        }

        public Criteria andChannelidEqualTo(String value) {
            addCriterion("channelid =", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidNotEqualTo(String value) {
            addCriterion("channelid <>", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidGreaterThan(String value) {
            addCriterion("channelid >", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidGreaterThanOrEqualTo(String value) {
            addCriterion("channelid >=", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidLessThan(String value) {
            addCriterion("channelid <", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidLessThanOrEqualTo(String value) {
            addCriterion("channelid <=", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidLike(String value) {
            addCriterion("channelid like", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidNotLike(String value) {
            addCriterion("channelid not like", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidIn(List<String> values) {
            addCriterion("channelid in", values, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidNotIn(List<String> values) {
            addCriterion("channelid not in", values, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidBetween(String value1, String value2) {
            addCriterion("channelid between", value1, value2, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidNotBetween(String value1, String value2) {
            addCriterion("channelid not between", value1, value2, "channelid");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }
        public Criteria andSql(String value) {
            addCriterion(value);
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andExetimehourIsNull() {
            addCriterion("exetimehour is null");
            return (Criteria) this;
        }

        public Criteria andExetimehourIsNotNull() {
            addCriterion("exetimehour is not null");
            return (Criteria) this;
        }

        public Criteria andExetimehourEqualTo(Integer value) {
            addCriterion("exetimehour =", value, "exetimehour");
            return (Criteria) this;
        }

        public Criteria andExetimehourNotEqualTo(Integer value) {
            addCriterion("exetimehour <>", value, "exetimehour");
            return (Criteria) this;
        }

        public Criteria andExetimehourGreaterThan(Integer value) {
            addCriterion("exetimehour >", value, "exetimehour");
            return (Criteria) this;
        }

        public Criteria andExetimehourGreaterThanOrEqualTo(Integer value) {
            addCriterion("exetimehour >=", value, "exetimehour");
            return (Criteria) this;
        }

        public Criteria andExetimehourLessThan(Integer value) {
            addCriterion("exetimehour <", value, "exetimehour");
            return (Criteria) this;
        }

        public Criteria andExetimehourLessThanOrEqualTo(Integer value) {
            addCriterion("exetimehour <=", value, "exetimehour");
            return (Criteria) this;
        }

        public Criteria andExetimehourIn(List<Integer> values) {
            addCriterion("exetimehour in", values, "exetimehour");
            return (Criteria) this;
        }

        public Criteria andExetimehourNotIn(List<Integer> values) {
            addCriterion("exetimehour not in", values, "exetimehour");
            return (Criteria) this;
        }

        public Criteria andExetimehourBetween(Integer value1, Integer value2) {
            addCriterion("exetimehour between", value1, value2, "exetimehour");
            return (Criteria) this;
        }

        public Criteria andExetimehourNotBetween(Integer value1, Integer value2) {
            addCriterion("exetimehour not between", value1, value2, "exetimehour");
            return (Criteria) this;
        }

        public Criteria andExetimeminIsNull() {
            addCriterion("exetimemin is null");
            return (Criteria) this;
        }

        public Criteria andExetimeminIsNotNull() {
            addCriterion("exetimemin is not null");
            return (Criteria) this;
        }

        public Criteria andExetimeminEqualTo(Integer value) {
            addCriterion("exetimemin =", value, "exetimemin");
            return (Criteria) this;
        }

        public Criteria andExetimeminNotEqualTo(Integer value) {
            addCriterion("exetimemin <>", value, "exetimemin");
            return (Criteria) this;
        }

        public Criteria andExetimeminGreaterThan(Integer value) {
            addCriterion("exetimemin >", value, "exetimemin");
            return (Criteria) this;
        }

        public Criteria andExetimeminGreaterThanOrEqualTo(Integer value) {
            addCriterion("exetimemin >=", value, "exetimemin");
            return (Criteria) this;
        }

        public Criteria andExetimeminLessThan(Integer value) {
            addCriterion("exetimemin <", value, "exetimemin");
            return (Criteria) this;
        }

        public Criteria andExetimeminLessThanOrEqualTo(Integer value) {
            addCriterion("exetimemin <=", value, "exetimemin");
            return (Criteria) this;
        }

        public Criteria andExetimeminIn(List<Integer> values) {
            addCriterion("exetimemin in", values, "exetimemin");
            return (Criteria) this;
        }

        public Criteria andExetimeminNotIn(List<Integer> values) {
            addCriterion("exetimemin not in", values, "exetimemin");
            return (Criteria) this;
        }

        public Criteria andExetimeminBetween(Integer value1, Integer value2) {
            addCriterion("exetimemin between", value1, value2, "exetimemin");
            return (Criteria) this;
        }

        public Criteria andExetimeminNotBetween(Integer value1, Integer value2) {
            addCriterion("exetimemin not between", value1, value2, "exetimemin");
            return (Criteria) this;
        }

        public Criteria andIntervalhourIsNull() {
            addCriterion("intervalhour is null");
            return (Criteria) this;
        }

        public Criteria andIntervalhourIsNotNull() {
            addCriterion("intervalhour is not null");
            return (Criteria) this;
        }

        public Criteria andIntervalhourEqualTo(Integer value) {
            addCriterion("intervalhour =", value, "intervalhour");
            return (Criteria) this;
        }

        public Criteria andIntervalhourNotEqualTo(Integer value) {
            addCriterion("intervalhour <>", value, "intervalhour");
            return (Criteria) this;
        }

        public Criteria andIntervalhourGreaterThan(Integer value) {
            addCriterion("intervalhour >", value, "intervalhour");
            return (Criteria) this;
        }

        public Criteria andIntervalhourGreaterThanOrEqualTo(Integer value) {
            addCriterion("intervalhour >=", value, "intervalhour");
            return (Criteria) this;
        }

        public Criteria andIntervalhourLessThan(Integer value) {
            addCriterion("intervalhour <", value, "intervalhour");
            return (Criteria) this;
        }

        public Criteria andIntervalhourLessThanOrEqualTo(Integer value) {
            addCriterion("intervalhour <=", value, "intervalhour");
            return (Criteria) this;
        }

        public Criteria andIntervalhourIn(List<Integer> values) {
            addCriterion("intervalhour in", values, "intervalhour");
            return (Criteria) this;
        }

        public Criteria andIntervalhourNotIn(List<Integer> values) {
            addCriterion("intervalhour not in", values, "intervalhour");
            return (Criteria) this;
        }

        public Criteria andIntervalhourBetween(Integer value1, Integer value2) {
            addCriterion("intervalhour between", value1, value2, "intervalhour");
            return (Criteria) this;
        }

        public Criteria andIntervalhourNotBetween(Integer value1, Integer value2) {
            addCriterion("intervalhour not between", value1, value2, "intervalhour");
            return (Criteria) this;
        }

        public Criteria andIntervalminIsNull() {
            addCriterion("intervalmin is null");
            return (Criteria) this;
        }

        public Criteria andIntervalminIsNotNull() {
            addCriterion("intervalmin is not null");
            return (Criteria) this;
        }

        public Criteria andIntervalminEqualTo(Integer value) {
            addCriterion("intervalmin =", value, "intervalmin");
            return (Criteria) this;
        }

        public Criteria andIntervalminNotEqualTo(Integer value) {
            addCriterion("intervalmin <>", value, "intervalmin");
            return (Criteria) this;
        }

        public Criteria andIntervalminGreaterThan(Integer value) {
            addCriterion("intervalmin >", value, "intervalmin");
            return (Criteria) this;
        }

        public Criteria andIntervalminGreaterThanOrEqualTo(Integer value) {
            addCriterion("intervalmin >=", value, "intervalmin");
            return (Criteria) this;
        }

        public Criteria andIntervalminLessThan(Integer value) {
            addCriterion("intervalmin <", value, "intervalmin");
            return (Criteria) this;
        }

        public Criteria andIntervalminLessThanOrEqualTo(Integer value) {
            addCriterion("intervalmin <=", value, "intervalmin");
            return (Criteria) this;
        }

        public Criteria andIntervalminIn(List<Integer> values) {
            addCriterion("intervalmin in", values, "intervalmin");
            return (Criteria) this;
        }

        public Criteria andIntervalminNotIn(List<Integer> values) {
            addCriterion("intervalmin not in", values, "intervalmin");
            return (Criteria) this;
        }

        public Criteria andIntervalminBetween(Integer value1, Integer value2) {
            addCriterion("intervalmin between", value1, value2, "intervalmin");
            return (Criteria) this;
        }

        public Criteria andIntervalminNotBetween(Integer value1, Integer value2) {
            addCriterion("intervalmin not between", value1, value2, "intervalmin");
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