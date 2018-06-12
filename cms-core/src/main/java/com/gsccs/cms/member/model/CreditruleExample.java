package com.gsccs.cms.member.model;

import java.util.ArrayList;
import java.util.List;

import com.gsccs.cms.bass.base.BaseExample;

public class CreditruleExample extends BaseExample {

	protected String orderByClause;
	protected boolean distinct;
	protected List<Criteria> oredCriteria;

	public CreditruleExample() {
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

		public Criteria andCodeIsNull() {
			addCriterion("code is null");
			return (Criteria) this;
		}

		public Criteria andCodeIsNotNull() {
			addCriterion("code is not null");
			return (Criteria) this;
		}

		public Criteria andCodeEqualTo(String value) {
			addCriterion("code =", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotEqualTo(String value) {
			addCriterion("code <>", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeGreaterThan(String value) {
			addCriterion("code >", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeGreaterThanOrEqualTo(String value) {
			addCriterion("code >=", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeLessThan(String value) {
			addCriterion("code <", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeLessThanOrEqualTo(String value) {
			addCriterion("code <=", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeLike(String value) {
			addCriterion("code like", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotLike(String value) {
			addCriterion("code not like", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeIn(List<String> values) {
			addCriterion("code in", values, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotIn(List<String> values) {
			addCriterion("code not in", values, "code");
			return (Criteria) this;
		}

		public Criteria andCodeBetween(String value1, String value2) {
			addCriterion("code between", value1, value2, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotBetween(String value1, String value2) {
			addCriterion("code not between", value1, value2, "code");
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

		public Criteria andRewardtypeIsNull() {
			addCriterion("rewardtype is null");
			return (Criteria) this;
		}

		public Criteria andRewardtypeIsNotNull() {
			addCriterion("rewardtype is not null");
			return (Criteria) this;
		}

		public Criteria andRewardtypeEqualTo(Integer value) {
			addCriterion("rewardtype =", value, "rewardtype");
			return (Criteria) this;
		}

		public Criteria andRewardtypeNotEqualTo(Integer value) {
			addCriterion("rewardtype <>", value, "rewardtype");
			return (Criteria) this;
		}

		public Criteria andRewardtypeGreaterThan(Integer value) {
			addCriterion("rewardtype >", value, "rewardtype");
			return (Criteria) this;
		}

		public Criteria andRewardtypeGreaterThanOrEqualTo(Integer value) {
			addCriterion("rewardtype >=", value, "rewardtype");
			return (Criteria) this;
		}

		public Criteria andRewardtypeLessThan(Integer value) {
			addCriterion("rewardtype <", value, "rewardtype");
			return (Criteria) this;
		}

		public Criteria andRewardtypeLessThanOrEqualTo(Integer value) {
			addCriterion("rewardtype <=", value, "rewardtype");
			return (Criteria) this;
		}

		public Criteria andRewardtypeIn(List<Integer> values) {
			addCriterion("rewardtype in", values, "rewardtype");
			return (Criteria) this;
		}

		public Criteria andRewardtypeNotIn(List<Integer> values) {
			addCriterion("rewardtype not in", values, "rewardtype");
			return (Criteria) this;
		}

		public Criteria andRewardtypeBetween(Integer value1, Integer value2) {
			addCriterion("rewardtype between", value1, value2, "rewardtype");
			return (Criteria) this;
		}

		public Criteria andRewardtypeNotBetween(Integer value1, Integer value2) {
			addCriterion("rewardtype not between", value1, value2, "rewardtype");
			return (Criteria) this;
		}

		public Criteria andCycletypeIsNull() {
			addCriterion("cycletype is null");
			return (Criteria) this;
		}

		public Criteria andCycletypeIsNotNull() {
			addCriterion("cycletype is not null");
			return (Criteria) this;
		}

		public Criteria andCycletypeEqualTo(Integer value) {
			addCriterion("cycletype =", value, "cycletype");
			return (Criteria) this;
		}

		public Criteria andCycletypeNotEqualTo(Integer value) {
			addCriterion("cycletype <>", value, "cycletype");
			return (Criteria) this;
		}

		public Criteria andCycletypeGreaterThan(Integer value) {
			addCriterion("cycletype >", value, "cycletype");
			return (Criteria) this;
		}

		public Criteria andCycletypeGreaterThanOrEqualTo(Integer value) {
			addCriterion("cycletype >=", value, "cycletype");
			return (Criteria) this;
		}

		public Criteria andCycletypeLessThan(Integer value) {
			addCriterion("cycletype <", value, "cycletype");
			return (Criteria) this;
		}

		public Criteria andCycletypeLessThanOrEqualTo(Integer value) {
			addCriterion("cycletype <=", value, "cycletype");
			return (Criteria) this;
		}

		public Criteria andCycletypeIn(List<Integer> values) {
			addCriterion("cycletype in", values, "cycletype");
			return (Criteria) this;
		}

		public Criteria andCycletypeNotIn(List<Integer> values) {
			addCriterion("cycletype not in", values, "cycletype");
			return (Criteria) this;
		}

		public Criteria andCycletypeBetween(Integer value1, Integer value2) {
			addCriterion("cycletype between", value1, value2, "cycletype");
			return (Criteria) this;
		}

		public Criteria andCycletypeNotBetween(Integer value1, Integer value2) {
			addCriterion("cycletype not between", value1, value2, "cycletype");
			return (Criteria) this;
		}

		public Criteria andCycletimeIsNull() {
			addCriterion("cycletime is null");
			return (Criteria) this;
		}

		public Criteria andCycletimeIsNotNull() {
			addCriterion("cycletime is not null");
			return (Criteria) this;
		}

		public Criteria andCycletimeEqualTo(Integer value) {
			addCriterion("cycletime =", value, "cycletime");
			return (Criteria) this;
		}

		public Criteria andCycletimeNotEqualTo(Integer value) {
			addCriterion("cycletime <>", value, "cycletime");
			return (Criteria) this;
		}

		public Criteria andCycletimeGreaterThan(Integer value) {
			addCriterion("cycletime >", value, "cycletime");
			return (Criteria) this;
		}

		public Criteria andCycletimeGreaterThanOrEqualTo(Integer value) {
			addCriterion("cycletime >=", value, "cycletime");
			return (Criteria) this;
		}

		public Criteria andCycletimeLessThan(Integer value) {
			addCriterion("cycletime <", value, "cycletime");
			return (Criteria) this;
		}

		public Criteria andCycletimeLessThanOrEqualTo(Integer value) {
			addCriterion("cycletime <=", value, "cycletime");
			return (Criteria) this;
		}

		public Criteria andCycletimeIn(List<Integer> values) {
			addCriterion("cycletime in", values, "cycletime");
			return (Criteria) this;
		}

		public Criteria andCycletimeNotIn(List<Integer> values) {
			addCriterion("cycletime not in", values, "cycletime");
			return (Criteria) this;
		}

		public Criteria andCycletimeBetween(Integer value1, Integer value2) {
			addCriterion("cycletime between", value1, value2, "cycletime");
			return (Criteria) this;
		}

		public Criteria andCycletimeNotBetween(Integer value1, Integer value2) {
			addCriterion("cycletime not between", value1, value2, "cycletime");
			return (Criteria) this;
		}

		public Criteria andRewardnumIsNull() {
			addCriterion("rewardnum is null");
			return (Criteria) this;
		}

		public Criteria andRewardnumIsNotNull() {
			addCriterion("rewardnum is not null");
			return (Criteria) this;
		}

		public Criteria andRewardnumEqualTo(Integer value) {
			addCriterion("rewardnum =", value, "rewardnum");
			return (Criteria) this;
		}

		public Criteria andRewardnumNotEqualTo(Integer value) {
			addCriterion("rewardnum <>", value, "rewardnum");
			return (Criteria) this;
		}

		public Criteria andRewardnumGreaterThan(Integer value) {
			addCriterion("rewardnum >", value, "rewardnum");
			return (Criteria) this;
		}

		public Criteria andRewardnumGreaterThanOrEqualTo(Integer value) {
			addCriterion("rewardnum >=", value, "rewardnum");
			return (Criteria) this;
		}

		public Criteria andRewardnumLessThan(Integer value) {
			addCriterion("rewardnum <", value, "rewardnum");
			return (Criteria) this;
		}

		public Criteria andRewardnumLessThanOrEqualTo(Integer value) {
			addCriterion("rewardnum <=", value, "rewardnum");
			return (Criteria) this;
		}

		public Criteria andRewardnumIn(List<Integer> values) {
			addCriterion("rewardnum in", values, "rewardnum");
			return (Criteria) this;
		}

		public Criteria andRewardnumNotIn(List<Integer> values) {
			addCriterion("rewardnum not in", values, "rewardnum");
			return (Criteria) this;
		}

		public Criteria andRewardnumBetween(Integer value1, Integer value2) {
			addCriterion("rewardnum between", value1, value2, "rewardnum");
			return (Criteria) this;
		}

		public Criteria andRewardnumNotBetween(Integer value1, Integer value2) {
			addCriterion("rewardnum not between", value1, value2, "rewardnum");
			return (Criteria) this;
		}

		public Criteria andCreditIsNull() {
			addCriterion("credit is null");
			return (Criteria) this;
		}

		public Criteria andCreditIsNotNull() {
			addCriterion("credit is not null");
			return (Criteria) this;
		}

		public Criteria andCreditEqualTo(Integer value) {
			addCriterion("credit =", value, "credit");
			return (Criteria) this;
		}

		public Criteria andCreditNotEqualTo(Integer value) {
			addCriterion("credit <>", value, "credit");
			return (Criteria) this;
		}

		public Criteria andCreditGreaterThan(Integer value) {
			addCriterion("credit >", value, "credit");
			return (Criteria) this;
		}

		public Criteria andCreditGreaterThanOrEqualTo(Integer value) {
			addCriterion("credit >=", value, "credit");
			return (Criteria) this;
		}

		public Criteria andCreditLessThan(Integer value) {
			addCriterion("credit <", value, "credit");
			return (Criteria) this;
		}

		public Criteria andCreditLessThanOrEqualTo(Integer value) {
			addCriterion("credit <=", value, "credit");
			return (Criteria) this;
		}

		public Criteria andCreditIn(List<Integer> values) {
			addCriterion("credit in", values, "credit");
			return (Criteria) this;
		}

		public Criteria andCreditNotIn(List<Integer> values) {
			addCriterion("credit not in", values, "credit");
			return (Criteria) this;
		}

		public Criteria andCreditBetween(Integer value1, Integer value2) {
			addCriterion("credit between", value1, value2, "credit");
			return (Criteria) this;
		}

		public Criteria andCreditNotBetween(Integer value1, Integer value2) {
			addCriterion("credit not between", value1, value2, "credit");
			return (Criteria) this;
		}

		public Criteria andExperienceIsNull() {
			addCriterion("experience is null");
			return (Criteria) this;
		}

		public Criteria andExperienceIsNotNull() {
			addCriterion("experience is not null");
			return (Criteria) this;
		}

		public Criteria andExperienceEqualTo(Integer value) {
			addCriterion("experience =", value, "experience");
			return (Criteria) this;
		}

		public Criteria andExperienceNotEqualTo(Integer value) {
			addCriterion("experience <>", value, "experience");
			return (Criteria) this;
		}

		public Criteria andExperienceGreaterThan(Integer value) {
			addCriterion("experience >", value, "experience");
			return (Criteria) this;
		}

		public Criteria andExperienceGreaterThanOrEqualTo(Integer value) {
			addCriterion("experience >=", value, "experience");
			return (Criteria) this;
		}

		public Criteria andExperienceLessThan(Integer value) {
			addCriterion("experience <", value, "experience");
			return (Criteria) this;
		}

		public Criteria andExperienceLessThanOrEqualTo(Integer value) {
			addCriterion("experience <=", value, "experience");
			return (Criteria) this;
		}

		public Criteria andExperienceIn(List<Integer> values) {
			addCriterion("experience in", values, "experience");
			return (Criteria) this;
		}

		public Criteria andExperienceNotIn(List<Integer> values) {
			addCriterion("experience not in", values, "experience");
			return (Criteria) this;
		}

		public Criteria andExperienceBetween(Integer value1, Integer value2) {
			addCriterion("experience between", value1, value2, "experience");
			return (Criteria) this;
		}

		public Criteria andExperienceNotBetween(Integer value1, Integer value2) {
			addCriterion("experience not between", value1, value2, "experience");
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