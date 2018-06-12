package com.gsccs.cms.module.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.gsccs.cms.bass.base.BaseExample;

public class MailExample extends BaseExample {
    
    protected String orderByClause;

    
    protected boolean distinct;

    
    protected List<Criteria> oredCriteria;

    
    public MailExample() {
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

        public Criteria andUnitidIsNull() {
            addCriterion("unitid is null");
            return (Criteria) this;
        }

        public Criteria andUnitidIsNotNull() {
            addCriterion("unitid is not null");
            return (Criteria) this;
        }

        public Criteria andUnitidEqualTo(String value) {
            addCriterion("unitid =", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidNotEqualTo(String value) {
            addCriterion("unitid <>", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidGreaterThan(String value) {
            addCriterion("unitid >", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidGreaterThanOrEqualTo(String value) {
            addCriterion("unitid >=", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidLessThan(String value) {
            addCriterion("unitid <", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidLessThanOrEqualTo(String value) {
            addCriterion("unitid <=", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidLike(String value) {
            addCriterion("unitid like", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidNotLike(String value) {
            addCriterion("unitid not like", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidIn(List<String> values) {
            addCriterion("unitid in", values, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidNotIn(List<String> values) {
            addCriterion("unitid not in", values, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidBetween(String value1, String value2) {
            addCriterion("unitid between", value1, value2, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidNotBetween(String value1, String value2) {
            addCriterion("unitid not between", value1, value2, "unitid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userid like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userid not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andMailtypeIsNull() {
            addCriterion("mailtype is null");
            return (Criteria) this;
        }

        public Criteria andMailtypeIsNotNull() {
            addCriterion("mailtype is not null");
            return (Criteria) this;
        }

        public Criteria andMailtypeEqualTo(String value) {
            addCriterion("mailtype =", value, "mailtype");
            return (Criteria) this;
        }

        public Criteria andMailtypeNotEqualTo(String value) {
            addCriterion("mailtype <>", value, "mailtype");
            return (Criteria) this;
        }

        public Criteria andMailtypeGreaterThan(String value) {
            addCriterion("mailtype >", value, "mailtype");
            return (Criteria) this;
        }

        public Criteria andMailtypeGreaterThanOrEqualTo(String value) {
            addCriterion("mailtype >=", value, "mailtype");
            return (Criteria) this;
        }

        public Criteria andMailtypeLessThan(String value) {
            addCriterion("mailtype <", value, "mailtype");
            return (Criteria) this;
        }

        public Criteria andMailtypeLessThanOrEqualTo(String value) {
            addCriterion("mailtype <=", value, "mailtype");
            return (Criteria) this;
        }

        public Criteria andMailtypeLike(String value) {
            addCriterion("mailtype like", value, "mailtype");
            return (Criteria) this;
        }

        public Criteria andMailtypeNotLike(String value) {
            addCriterion("mailtype not like", value, "mailtype");
            return (Criteria) this;
        }

        public Criteria andMailtypeIn(List<String> values) {
            addCriterion("mailtype in", values, "mailtype");
            return (Criteria) this;
        }

        public Criteria andMailtypeNotIn(List<String> values) {
            addCriterion("mailtype not in", values, "mailtype");
            return (Criteria) this;
        }

        public Criteria andMailtypeBetween(String value1, String value2) {
            addCriterion("mailtype between", value1, value2, "mailtype");
            return (Criteria) this;
        }

        public Criteria andMailtypeNotBetween(String value1, String value2) {
            addCriterion("mailtype not between", value1, value2, "mailtype");
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

        public Criteria andWriterIsNull() {
            addCriterion("writer is null");
            return (Criteria) this;
        }

        public Criteria andWriterIsNotNull() {
            addCriterion("writer is not null");
            return (Criteria) this;
        }

        public Criteria andWriterEqualTo(String value) {
            addCriterion("writer =", value, "writer");
            return (Criteria) this;
        }

        public Criteria andWriterNotEqualTo(String value) {
            addCriterion("writer <>", value, "writer");
            return (Criteria) this;
        }

        public Criteria andWriterGreaterThan(String value) {
            addCriterion("writer >", value, "writer");
            return (Criteria) this;
        }

        public Criteria andWriterGreaterThanOrEqualTo(String value) {
            addCriterion("writer >=", value, "writer");
            return (Criteria) this;
        }

        public Criteria andWriterLessThan(String value) {
            addCriterion("writer <", value, "writer");
            return (Criteria) this;
        }

        public Criteria andWriterLessThanOrEqualTo(String value) {
            addCriterion("writer <=", value, "writer");
            return (Criteria) this;
        }

        public Criteria andWriterLike(String value) {
            addCriterion("writer like", value, "writer");
            return (Criteria) this;
        }

        public Criteria andWriterNotLike(String value) {
            addCriterion("writer not like", value, "writer");
            return (Criteria) this;
        }

        public Criteria andWriterIn(List<String> values) {
            addCriterion("writer in", values, "writer");
            return (Criteria) this;
        }

        public Criteria andWriterNotIn(List<String> values) {
            addCriterion("writer not in", values, "writer");
            return (Criteria) this;
        }

        public Criteria andWriterBetween(String value1, String value2) {
            addCriterion("writer between", value1, value2, "writer");
            return (Criteria) this;
        }

        public Criteria andWriterNotBetween(String value1, String value2) {
            addCriterion("writer not between", value1, value2, "writer");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andIsopenIsNull() {
            addCriterion("isopen is null");
            return (Criteria) this;
        }

        public Criteria andIsopenIsNotNull() {
            addCriterion("isopen is not null");
            return (Criteria) this;
        }

        public Criteria andIsopenEqualTo(String value) {
            addCriterion("isopen =", value, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenNotEqualTo(String value) {
            addCriterion("isopen <>", value, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenGreaterThan(String value) {
            addCriterion("isopen >", value, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenGreaterThanOrEqualTo(String value) {
            addCriterion("isopen >=", value, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenLessThan(String value) {
            addCriterion("isopen <", value, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenLessThanOrEqualTo(String value) {
            addCriterion("isopen <=", value, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenLike(String value) {
            addCriterion("isopen like", value, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenNotLike(String value) {
            addCriterion("isopen not like", value, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenIn(List<String> values) {
            addCriterion("isopen in", values, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenNotIn(List<String> values) {
            addCriterion("isopen not in", values, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenBetween(String value1, String value2) {
            addCriterion("isopen between", value1, value2, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenNotBetween(String value1, String value2) {
            addCriterion("isopen not between", value1, value2, "isopen");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andQuerycodeIsNull() {
            addCriterion("querycode is null");
            return (Criteria) this;
        }

        public Criteria andQuerycodeIsNotNull() {
            addCriterion("querycode is not null");
            return (Criteria) this;
        }

        public Criteria andQuerycodeEqualTo(String value) {
            addCriterion("querycode =", value, "querycode");
            return (Criteria) this;
        }

        public Criteria andQuerycodeNotEqualTo(String value) {
            addCriterion("querycode <>", value, "querycode");
            return (Criteria) this;
        }

        public Criteria andQuerycodeGreaterThan(String value) {
            addCriterion("querycode >", value, "querycode");
            return (Criteria) this;
        }

        public Criteria andQuerycodeGreaterThanOrEqualTo(String value) {
            addCriterion("querycode >=", value, "querycode");
            return (Criteria) this;
        }

        public Criteria andQuerycodeLessThan(String value) {
            addCriterion("querycode <", value, "querycode");
            return (Criteria) this;
        }

        public Criteria andQuerycodeLessThanOrEqualTo(String value) {
            addCriterion("querycode <=", value, "querycode");
            return (Criteria) this;
        }

        public Criteria andQuerycodeLike(String value) {
            addCriterion("querycode like", value, "querycode");
            return (Criteria) this;
        }

        public Criteria andQuerycodeNotLike(String value) {
            addCriterion("querycode not like", value, "querycode");
            return (Criteria) this;
        }

        public Criteria andQuerycodeIn(List<String> values) {
            addCriterion("querycode in", values, "querycode");
            return (Criteria) this;
        }

        public Criteria andQuerycodeNotIn(List<String> values) {
            addCriterion("querycode not in", values, "querycode");
            return (Criteria) this;
        }

        public Criteria andQuerycodeBetween(String value1, String value2) {
            addCriterion("querycode between", value1, value2, "querycode");
            return (Criteria) this;
        }

        public Criteria andQuerycodeNotBetween(String value1, String value2) {
            addCriterion("querycode not between", value1, value2, "querycode");
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

        public Criteria andIpIsNull() {
            addCriterion("ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("ip not between", value1, value2, "ip");
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
        public Criteria andSql(String value) {
            addCriterion( value);
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

        public Criteria andRecontentIsNull() {
            addCriterion("recontent is null");
            return (Criteria) this;
        }

        public Criteria andRecontentIsNotNull() {
            addCriterion("recontent is not null");
            return (Criteria) this;
        }

        public Criteria andRecontentEqualTo(String value) {
            addCriterion("recontent =", value, "recontent");
            return (Criteria) this;
        }

        public Criteria andRecontentNotEqualTo(String value) {
            addCriterion("recontent <>", value, "recontent");
            return (Criteria) this;
        }

        public Criteria andRecontentGreaterThan(String value) {
            addCriterion("recontent >", value, "recontent");
            return (Criteria) this;
        }

        public Criteria andRecontentGreaterThanOrEqualTo(String value) {
            addCriterion("recontent >=", value, "recontent");
            return (Criteria) this;
        }

        public Criteria andRecontentLessThan(String value) {
            addCriterion("recontent <", value, "recontent");
            return (Criteria) this;
        }

        public Criteria andRecontentLessThanOrEqualTo(String value) {
            addCriterion("recontent <=", value, "recontent");
            return (Criteria) this;
        }

        public Criteria andRecontentLike(String value) {
            addCriterion("recontent like", value, "recontent");
            return (Criteria) this;
        }

        public Criteria andRecontentNotLike(String value) {
            addCriterion("recontent not like", value, "recontent");
            return (Criteria) this;
        }

        public Criteria andRecontentIn(List<String> values) {
            addCriterion("recontent in", values, "recontent");
            return (Criteria) this;
        }

        public Criteria andRecontentNotIn(List<String> values) {
            addCriterion("recontent not in", values, "recontent");
            return (Criteria) this;
        }

        public Criteria andRecontentBetween(String value1, String value2) {
            addCriterion("recontent between", value1, value2, "recontent");
            return (Criteria) this;
        }

        public Criteria andRecontentNotBetween(String value1, String value2) {
            addCriterion("recontent not between", value1, value2, "recontent");
            return (Criteria) this;
        }

        public Criteria andRetimeIsNull() {
            addCriterion("retime is null");
            return (Criteria) this;
        }

        public Criteria andRetimeIsNotNull() {
            addCriterion("retime is not null");
            return (Criteria) this;
        }

        public Criteria andRetimeEqualTo(Date value) {
            addCriterion("retime =", value, "retime");
            return (Criteria) this;
        }

        public Criteria andRetimeNotEqualTo(Date value) {
            addCriterion("retime <>", value, "retime");
            return (Criteria) this;
        }

        public Criteria andRetimeGreaterThan(Date value) {
            addCriterion("retime >", value, "retime");
            return (Criteria) this;
        }

        public Criteria andRetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("retime >=", value, "retime");
            return (Criteria) this;
        }

        public Criteria andRetimeLessThan(Date value) {
            addCriterion("retime <", value, "retime");
            return (Criteria) this;
        }

        public Criteria andRetimeLessThanOrEqualTo(Date value) {
            addCriterion("retime <=", value, "retime");
            return (Criteria) this;
        }

        public Criteria andRetimeIn(List<Date> values) {
            addCriterion("retime in", values, "retime");
            return (Criteria) this;
        }

        public Criteria andRetimeNotIn(List<Date> values) {
            addCriterion("retime not in", values, "retime");
            return (Criteria) this;
        }

        public Criteria andRetimeBetween(Date value1, Date value2) {
            addCriterion("retime between", value1, value2, "retime");
            return (Criteria) this;
        }

        public Criteria andRetimeNotBetween(Date value1, Date value2) {
            addCriterion("retime not between", value1, value2, "retime");
            return (Criteria) this;
        }

        public Criteria andProflowIsNull() {
            addCriterion("proflow is null");
            return (Criteria) this;
        }

        public Criteria andProflowIsNotNull() {
            addCriterion("proflow is not null");
            return (Criteria) this;
        }

        public Criteria andProflowEqualTo(String value) {
            addCriterion("proflow =", value, "proflow");
            return (Criteria) this;
        }

        public Criteria andProflowNotEqualTo(String value) {
            addCriterion("proflow <>", value, "proflow");
            return (Criteria) this;
        }

        public Criteria andProflowGreaterThan(String value) {
            addCriterion("proflow >", value, "proflow");
            return (Criteria) this;
        }

        public Criteria andProflowGreaterThanOrEqualTo(String value) {
            addCriterion("proflow >=", value, "proflow");
            return (Criteria) this;
        }

        public Criteria andProflowLessThan(String value) {
            addCriterion("proflow <", value, "proflow");
            return (Criteria) this;
        }

        public Criteria andProflowLessThanOrEqualTo(String value) {
            addCriterion("proflow <=", value, "proflow");
            return (Criteria) this;
        }

        public Criteria andProflowLike(String value) {
            addCriterion("proflow like", value, "proflow");
            return (Criteria) this;
        }

        public Criteria andProflowNotLike(String value) {
            addCriterion("proflow not like", value, "proflow");
            return (Criteria) this;
        }

        public Criteria andProflowIn(List<String> values) {
            addCriterion("proflow in", values, "proflow");
            return (Criteria) this;
        }

        public Criteria andProflowNotIn(List<String> values) {
            addCriterion("proflow not in", values, "proflow");
            return (Criteria) this;
        }

        public Criteria andProflowBetween(String value1, String value2) {
            addCriterion("proflow between", value1, value2, "proflow");
            return (Criteria) this;
        }

        public Criteria andProflowNotBetween(String value1, String value2) {
            addCriterion("proflow not between", value1, value2, "proflow");
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