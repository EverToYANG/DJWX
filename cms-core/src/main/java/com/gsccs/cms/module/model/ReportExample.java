package com.gsccs.cms.module.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.gsccs.cms.bass.base.BaseExample;

public class ReportExample extends BaseExample {
    
    protected String orderByClause;

    
    protected boolean distinct;

    
    protected List<Criteria> oredCriteria;

    
    public ReportExample() {
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

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNull() {
            addCriterion("filename is null");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNotNull() {
            addCriterion("filename is not null");
            return (Criteria) this;
        }

        public Criteria andFilenameEqualTo(String value) {
            addCriterion("filename =", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotEqualTo(String value) {
            addCriterion("filename <>", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThan(String value) {
            addCriterion("filename >", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("filename >=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThan(String value) {
            addCriterion("filename <", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThanOrEqualTo(String value) {
            addCriterion("filename <=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLike(String value) {
            addCriterion("filename like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotLike(String value) {
            addCriterion("filename not like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameIn(List<String> values) {
            addCriterion("filename in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotIn(List<String> values) {
            addCriterion("filename not in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameBetween(String value1, String value2) {
            addCriterion("filename between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotBetween(String value1, String value2) {
            addCriterion("filename not between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenumIsNull() {
            addCriterion("filenum is null");
            return (Criteria) this;
        }

        public Criteria andFilenumIsNotNull() {
            addCriterion("filenum is not null");
            return (Criteria) this;
        }

        public Criteria andFilenumEqualTo(String value) {
            addCriterion("filenum =", value, "filenum");
            return (Criteria) this;
        }

        public Criteria andFilenumNotEqualTo(String value) {
            addCriterion("filenum <>", value, "filenum");
            return (Criteria) this;
        }

        public Criteria andFilenumGreaterThan(String value) {
            addCriterion("filenum >", value, "filenum");
            return (Criteria) this;
        }

        public Criteria andFilenumGreaterThanOrEqualTo(String value) {
            addCriterion("filenum >=", value, "filenum");
            return (Criteria) this;
        }

        public Criteria andFilenumLessThan(String value) {
            addCriterion("filenum <", value, "filenum");
            return (Criteria) this;
        }

        public Criteria andFilenumLessThanOrEqualTo(String value) {
            addCriterion("filenum <=", value, "filenum");
            return (Criteria) this;
        }

        public Criteria andFilenumLike(String value) {
            addCriterion("filenum like", value, "filenum");
            return (Criteria) this;
        }

        public Criteria andFilenumNotLike(String value) {
            addCriterion("filenum not like", value, "filenum");
            return (Criteria) this;
        }

        public Criteria andFilenumIn(List<String> values) {
            addCriterion("filenum in", values, "filenum");
            return (Criteria) this;
        }

        public Criteria andFilenumNotIn(List<String> values) {
            addCriterion("filenum not in", values, "filenum");
            return (Criteria) this;
        }

        public Criteria andFilenumBetween(String value1, String value2) {
            addCriterion("filenum between", value1, value2, "filenum");
            return (Criteria) this;
        }

        public Criteria andFilenumNotBetween(String value1, String value2) {
            addCriterion("filenum not between", value1, value2, "filenum");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNull() {
            addCriterion("linkman is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNotNull() {
            addCriterion("linkman is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanEqualTo(String value) {
            addCriterion("linkman =", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotEqualTo(String value) {
            addCriterion("linkman <>", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThan(String value) {
            addCriterion("linkman >", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("linkman >=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThan(String value) {
            addCriterion("linkman <", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThanOrEqualTo(String value) {
            addCriterion("linkman <=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLike(String value) {
            addCriterion("linkman like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotLike(String value) {
            addCriterion("linkman not like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanIn(List<String> values) {
            addCriterion("linkman in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotIn(List<String> values) {
            addCriterion("linkman not in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanBetween(String value1, String value2) {
            addCriterion("linkman between", value1, value2, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotBetween(String value1, String value2) {
            addCriterion("linkman not between", value1, value2, "linkman");
            return (Criteria) this;
        }

        public Criteria andIssuerIsNull() {
            addCriterion("issuer is null");
            return (Criteria) this;
        }

        public Criteria andIssuerIsNotNull() {
            addCriterion("issuer is not null");
            return (Criteria) this;
        }

        public Criteria andIssuerEqualTo(String value) {
            addCriterion("issuer =", value, "issuer");
            return (Criteria) this;
        }

        public Criteria andIssuerNotEqualTo(String value) {
            addCriterion("issuer <>", value, "issuer");
            return (Criteria) this;
        }

        public Criteria andIssuerGreaterThan(String value) {
            addCriterion("issuer >", value, "issuer");
            return (Criteria) this;
        }

        public Criteria andIssuerGreaterThanOrEqualTo(String value) {
            addCriterion("issuer >=", value, "issuer");
            return (Criteria) this;
        }

        public Criteria andIssuerLessThan(String value) {
            addCriterion("issuer <", value, "issuer");
            return (Criteria) this;
        }

        public Criteria andIssuerLessThanOrEqualTo(String value) {
            addCriterion("issuer <=", value, "issuer");
            return (Criteria) this;
        }

        public Criteria andIssuerLike(String value) {
            addCriterion("issuer like", value, "issuer");
            return (Criteria) this;
        }

        public Criteria andIssuerNotLike(String value) {
            addCriterion("issuer not like", value, "issuer");
            return (Criteria) this;
        }

        public Criteria andIssuerIn(List<String> values) {
            addCriterion("issuer in", values, "issuer");
            return (Criteria) this;
        }

        public Criteria andIssuerNotIn(List<String> values) {
            addCriterion("issuer not in", values, "issuer");
            return (Criteria) this;
        }

        public Criteria andIssuerBetween(String value1, String value2) {
            addCriterion("issuer between", value1, value2, "issuer");
            return (Criteria) this;
        }

        public Criteria andIssuerNotBetween(String value1, String value2) {
            addCriterion("issuer not between", value1, value2, "issuer");
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

        public Criteria andAttchIsNull() {
            addCriterion("attch is null");
            return (Criteria) this;
        }

        public Criteria andAttchIsNotNull() {
            addCriterion("attch is not null");
            return (Criteria) this;
        }

        public Criteria andAttchEqualTo(String value) {
            addCriterion("attch =", value, "attch");
            return (Criteria) this;
        }

        public Criteria andAttchNotEqualTo(String value) {
            addCriterion("attch <>", value, "attch");
            return (Criteria) this;
        }

        public Criteria andAttchGreaterThan(String value) {
            addCriterion("attch >", value, "attch");
            return (Criteria) this;
        }

        public Criteria andAttchGreaterThanOrEqualTo(String value) {
            addCriterion("attch >=", value, "attch");
            return (Criteria) this;
        }

        public Criteria andAttchLessThan(String value) {
            addCriterion("attch <", value, "attch");
            return (Criteria) this;
        }

        public Criteria andAttchLessThanOrEqualTo(String value) {
            addCriterion("attch <=", value, "attch");
            return (Criteria) this;
        }

        public Criteria andAttchLike(String value) {
            addCriterion("attch like", value, "attch");
            return (Criteria) this;
        }

        public Criteria andAttchNotLike(String value) {
            addCriterion("attch not like", value, "attch");
            return (Criteria) this;
        }

        public Criteria andAttchIn(List<String> values) {
            addCriterion("attch in", values, "attch");
            return (Criteria) this;
        }

        public Criteria andAttchNotIn(List<String> values) {
            addCriterion("attch not in", values, "attch");
            return (Criteria) this;
        }

        public Criteria andAttchBetween(String value1, String value2) {
            addCriterion("attch between", value1, value2, "attch");
            return (Criteria) this;
        }

        public Criteria andAttchNotBetween(String value1, String value2) {
            addCriterion("attch not between", value1, value2, "attch");
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
        public Criteria andSql(String value) {
            addCriterion( value);
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