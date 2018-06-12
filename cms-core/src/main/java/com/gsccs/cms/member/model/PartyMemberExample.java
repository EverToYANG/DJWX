package com.gsccs.cms.member.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.gsccs.cms.bass.base.BaseExample;

public class PartyMemberExample extends BaseExample {

	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public PartyMemberExample() {
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

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
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

		public Criteria andIdIn(List<String> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<String> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andEduIsNull() {
			addCriterion("edu is null");
			return (Criteria) this;
		}

		public Criteria andEduIsNotNull() {
			addCriterion("edu is not null");
			return (Criteria) this;
		}

		public Criteria andEduEqualTo(String value) {
			addCriterion("edu =", value, "edu");
			return (Criteria) this;
		}

		public Criteria andEduNotEqualTo(String value) {
			addCriterion("edu <>", value, "edu");
			return (Criteria) this;
		}

		public Criteria andEduGreaterThan(String value) {
			addCriterion("edu >", value, "edu");
			return (Criteria) this;
		}

		public Criteria andEduGreaterThanOrEqualTo(String value) {
			addCriterion("edu >=", value, "edu");
			return (Criteria) this;
		}

		public Criteria andEduLessThan(String value) {
			addCriterion("edu <", value, "edu");
			return (Criteria) this;
		}

		public Criteria andEduLessThanOrEqualTo(String value) {
			addCriterion("edu <=", value, "edu");
			return (Criteria) this;
		}

		public Criteria andEduIn(List<String> values) {
			addCriterion("edu in", values, "edu");
			return (Criteria) this;
		}

		public Criteria andEduNotIn(List<String> values) {
			addCriterion("edu not in", values, "edu");
			return (Criteria) this;
		}

		public Criteria andEduBetween(String value1, String value2) {
			addCriterion("edu between", value1, value2, "edu");
			return (Criteria) this;
		}

		public Criteria andEduNotBetween(String value1, String value2) {
			addCriterion("edu not between", value1, value2, "edu");
			return (Criteria) this;
		}

		public Criteria andGroupidIsNull() {
			addCriterion("groupid is null");
			return (Criteria) this;
		}

		public Criteria andGroupidIsNotNull() {
			addCriterion("groupid is not null");
			return (Criteria) this;
		}

		public Criteria andGroupidEqualTo(String value) {
			addCriterion("groupid =", value, "groupid");
			return (Criteria) this;
		}

		public Criteria andGroupidNotEqualTo(String value) {
			addCriterion("groupid <>", value, "groupid");
			return (Criteria) this;
		}
		
		public Criteria andGroupidLike(String value) {
			addCriterion("groupid like", value, "groupid");
			return (Criteria) this;
		}

		public Criteria andGroupidNotLike(String value) {
			addCriterion("groupid not like", value, "groupid");
			return (Criteria) this;
		}

		public Criteria andGroupidIn(List<String> values) {
			addCriterion("groupid in", values, "groupid");
			return (Criteria) this;
		}

		public Criteria andGroupidNotIn(List<String> values) {
			addCriterion("groupid not in", values, "groupid");
			return (Criteria) this;
		}

		public Criteria andGroupidBetween(String value1, String value2) {
			addCriterion("groupid between", value1, value2, "groupid");
			return (Criteria) this;
		}

		public Criteria andGroupidNotBetween(String value1, String value2) {
			addCriterion("groupid not between", value1, value2, "groupid");
			return (Criteria) this;
		}

		public Criteria andPhoneIsNull() {
			addCriterion("phone is null");
			return (Criteria) this;
		}

		public Criteria andPhoneIsNotNull() {
			addCriterion("phone is not null");
			return (Criteria) this;
		}

		public Criteria andPhoneEqualTo(String value) {
			addCriterion("phone =", value, "phone");
			return (Criteria) this;
		}
		
		public Criteria andIdcodeEqualTo(String value) {
			addCriterion("idcode =", value, "idcode");
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

		public Criteria andNameLike(String value) {
			addCriterion("name like", value, "name");
			return (Criteria) this;
		}

		public Criteria andMNameLike(String value) {
			addCriterion("m.name like", value, "name");
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

		public Criteria andWxappidIsNull() {
			addCriterion("wxappid is null");
			return (Criteria) this;
		}

		public Criteria andWxappidIsNotNull() {
			addCriterion("wxappid is not null");
			return (Criteria) this;
		}

		public Criteria andWxappidEqualTo(String value) {
			addCriterion("wxappid =", value, "wxappid");
			return (Criteria) this;
		}

		public Criteria andWxappidNotEqualTo(String value) {
			addCriterion("wxappid <>", value, "wxappid");
			return (Criteria) this;
		}

		
		public Criteria andMobilephoneIsNull() {
			addCriterion("phone is null");
			return (Criteria) this;
		}

		public Criteria andMobilephoneIsNotNull() {
			addCriterion("phone is not null");
			return (Criteria) this;
		}

		public Criteria andMobilephoneEqualTo(String value) {
			addCriterion("phone =", value, "phone");
			return (Criteria) this;
		}

		public Criteria andMobilephoneNotEqualTo(String value) {
			addCriterion("phone <>", value, "phone");
			return (Criteria) this;
		}


		public Criteria andMobilephoneLike(String value) {
			addCriterion("phone like", value, "phone");
			return (Criteria) this;
		}

		public Criteria andMobilephoneNotLike(String value) {
			addCriterion("phone not like", value, "phone");
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

		
		public Criteria andEmailLike(String value) {
			addCriterion("email like", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotLike(String value) {
			addCriterion("email not like", value, "email");
			return (Criteria) this;
		}

		

		public Criteria andStatusIsNull() {
			addCriterion("status is null");
			return (Criteria) this;
		}

		public Criteria andStatusIsNotNull() {
			addCriterion("status is not null");
			return (Criteria) this;
		}

		public Criteria andStatusEqualTo(String value) {
			addCriterion("status =", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotEqualTo(String value) {
			addCriterion("status <>", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusIn(List<String> values) {
			addCriterion("status in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotIn(List<String> values) {
			addCriterion("status not in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusBetween(String value1, String value2) {
			addCriterion("status between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotBetween(String value1, String value2) {
			addCriterion("status not between", value1, value2, "status");
			return (Criteria) this;
		}


		public Criteria andjointimeIsNull() {
			addCriterion("jointime is null");
			return (Criteria) this;
		}

		public Criteria andjointimeIsNotNull() {
			addCriterion("jointime is not null");
			return (Criteria) this;
		}

		public Criteria andjointimeGreaterThan(Date value) {
			addCriterion("jointime >", value, "jointime");
			return (Criteria) this;
		}

		public Criteria andjointimeGreaterThanOrEqualTo(Date value) {
			addCriterion("jointime >=", value, "jointime");
			return (Criteria) this;
		}

		public Criteria andjointimeLessThan(Date value) {
			addCriterion("jointime <", value, "jointime");
			return (Criteria) this;
		}

		public Criteria andjointimeLessThanOrEqualTo(Date value) {
			addCriterion("jointime <=", value, "jointime");
			return (Criteria) this;
		}

		public Criteria andjointimeBetween(Date value1, Date value2) {
			addCriterion("jointime between", value1, value2, "jointime");
			return (Criteria) this;
		}

		public Criteria andjointimeNotBetween(Date value1, Date value2) {
			addCriterion("jointime not between", value1, value2, "jointime");
			return (Criteria) this;
		}

		public Criteria andIntroIsNull() {
			addCriterion("intro is null");
			return (Criteria) this;
		}

		public Criteria andIntroIsNotNull() {
			addCriterion("intro is not null");
			return (Criteria) this;
		}

		public Criteria andIntroEqualTo(String value) {
			addCriterion("intro =", value, "intro");
			return (Criteria) this;
		}

		public Criteria andIntroNotEqualTo(String value) {
			addCriterion("intro <>", value, "intro");
			return (Criteria) this;
		}


		public Criteria andIntroLike(String value) {
			addCriterion("intro like", value, "intro");
			return (Criteria) this;
		}

		public Criteria andIntroNotLike(String value) {
			addCriterion("intro not like", value, "intro");
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

		public Criteria andUnitidNotEqualTo(Integer value) {
			addCriterion("unitid <>", value, "unitid");
			return (Criteria) this;
		}

		public Criteria andUnitidIn(List<Integer> values) {
			addCriterion("unitid in", values, "unitid");
			return (Criteria) this;
		}

		public Criteria andUnitidNotIn(List<Integer> values) {
			addCriterion("unitid not in", values, "unitid");
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
		
		public Criteria andSql(String sql) {
			addCriterion(sql);
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

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
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