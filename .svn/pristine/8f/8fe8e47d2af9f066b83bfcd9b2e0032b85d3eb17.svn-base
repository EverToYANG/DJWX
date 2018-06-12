package com.gsccs.cms.module.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.gsccs.cms.bass.base.BaseExample;

public class CollectExample extends BaseExample {

	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public CollectExample() {
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

		public Criteria andMemberidIsNull() {
			addCriterion("memberid is null");
			return (Criteria) this;
		}

		public Criteria andMemberidIsNotNull() {
			addCriterion("memberid is not null");
			return (Criteria) this;
		}

		public Criteria andMemberidEqualTo(String value) {
			addCriterion("memberid =", value, "memberid");
			return (Criteria) this;
		}

		public Criteria andMemberidNotEqualTo(String value) {
			addCriterion("memberid <>", value, "memberid");
			return (Criteria) this;
		}

		public Criteria andMemberidGreaterThan(String value) {
			addCriterion("memberid >", value, "memberid");
			return (Criteria) this;
		}

		public Criteria andMemberidGreaterThanOrEqualTo(String value) {
			addCriterion("memberid >=", value, "memberid");
			return (Criteria) this;
		}

		public Criteria andMemberidLessThan(String value) {
			addCriterion("memberid <", value, "memberid");
			return (Criteria) this;
		}

		public Criteria andMemberidLessThanOrEqualTo(String value) {
			addCriterion("memberid <=", value, "memberid");
			return (Criteria) this;
		}

		public Criteria andMemberidLike(String value) {
			addCriterion("memberid like", value, "memberid");
			return (Criteria) this;
		}

		public Criteria andMemberidNotLike(String value) {
			addCriterion("memberid not like", value, "memberid");
			return (Criteria) this;
		}

		public Criteria andMemberidIn(List<String> values) {
			addCriterion("memberid in", values, "memberid");
			return (Criteria) this;
		}

		public Criteria andMemberidNotIn(List<String> values) {
			addCriterion("memberid not in", values, "memberid");
			return (Criteria) this;
		}

		public Criteria andMemberidBetween(String value1, String value2) {
			addCriterion("memberid between", value1, value2, "memberid");
			return (Criteria) this;
		}

		public Criteria andMemberidNotBetween(String value1, String value2) {
			addCriterion("memberid not between", value1, value2, "memberid");
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

		public Criteria andSitenameIsNull() {
			addCriterion("sitename is null");
			return (Criteria) this;
		}

		public Criteria andSitenameIsNotNull() {
			addCriterion("sitename is not null");
			return (Criteria) this;
		}

		public Criteria andSitenameEqualTo(String value) {
			addCriterion("sitename =", value, "sitename");
			return (Criteria) this;
		}

		public Criteria andSitenameNotEqualTo(String value) {
			addCriterion("sitename <>", value, "sitename");
			return (Criteria) this;
		}

		public Criteria andSitenameGreaterThan(String value) {
			addCriterion("sitename >", value, "sitename");
			return (Criteria) this;
		}

		public Criteria andSitenameGreaterThanOrEqualTo(String value) {
			addCriterion("sitename >=", value, "sitename");
			return (Criteria) this;
		}

		public Criteria andSitenameLessThan(String value) {
			addCriterion("sitename <", value, "sitename");
			return (Criteria) this;
		}

		public Criteria andSitenameLessThanOrEqualTo(String value) {
			addCriterion("sitename <=", value, "sitename");
			return (Criteria) this;
		}

		public Criteria andSitenameLike(String value) {
			addCriterion("sitename like", value, "sitename");
			return (Criteria) this;
		}

		public Criteria andSitenameNotLike(String value) {
			addCriterion("sitename not like", value, "sitename");
			return (Criteria) this;
		}

		public Criteria andSitenameIn(List<String> values) {
			addCriterion("sitename in", values, "sitename");
			return (Criteria) this;
		}

		public Criteria andSitenameNotIn(List<String> values) {
			addCriterion("sitename not in", values, "sitename");
			return (Criteria) this;
		}

		public Criteria andSitenameBetween(String value1, String value2) {
			addCriterion("sitename between", value1, value2, "sitename");
			return (Criteria) this;
		}

		public Criteria andSitenameNotBetween(String value1, String value2) {
			addCriterion("sitename not between", value1, value2, "sitename");
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

		public Criteria andObjtypeIsNull() {
			addCriterion("objtype is null");
			return (Criteria) this;
		}

		public Criteria andObjtypeIsNotNull() {
			addCriterion("objtype is not null");
			return (Criteria) this;
		}

		public Criteria andObjtypeEqualTo(String value) {
			addCriterion("objtype =", value, "objtype");
			return (Criteria) this;
		}

		public Criteria andObjtypeNotEqualTo(String value) {
			addCriterion("objtype <>", value, "objtype");
			return (Criteria) this;
		}

		public Criteria andObjtypeGreaterThan(String value) {
			addCriterion("objtype >", value, "objtype");
			return (Criteria) this;
		}

		public Criteria andObjtypeGreaterThanOrEqualTo(String value) {
			addCriterion("objtype >=", value, "objtype");
			return (Criteria) this;
		}

		public Criteria andObjtypeLessThan(String value) {
			addCriterion("objtype <", value, "objtype");
			return (Criteria) this;
		}

		public Criteria andObjtypeLessThanOrEqualTo(String value) {
			addCriterion("objtype <=", value, "objtype");
			return (Criteria) this;
		}

		public Criteria andObjtypeLike(String value) {
			addCriterion("objtype like", value, "objtype");
			return (Criteria) this;
		}

		public Criteria andObjtypeNotLike(String value) {
			addCriterion("objtype not like", value, "objtype");
			return (Criteria) this;
		}

		public Criteria andObjtypeIn(List<String> values) {
			addCriterion("objtype in", values, "objtype");
			return (Criteria) this;
		}

		public Criteria andObjtypeNotIn(List<String> values) {
			addCriterion("objtype not in", values, "objtype");
			return (Criteria) this;
		}

		public Criteria andObjtypeBetween(String value1, String value2) {
			addCriterion("objtype between", value1, value2, "objtype");
			return (Criteria) this;
		}

		public Criteria andObjtypeNotBetween(String value1, String value2) {
			addCriterion("objtype not between", value1, value2, "objtype");
			return (Criteria) this;
		}

		public Criteria andArticleidIsNull() {
			addCriterion("articleid is null");
			return (Criteria) this;
		}

		public Criteria andArticleidIsNotNull() {
			addCriterion("articleid is not null");
			return (Criteria) this;
		}

		public Criteria andArticleidEqualTo(String value) {
			addCriterion("articleid =", value, "articleid");
			return (Criteria) this;
		}

		public Criteria andArticleidNotEqualTo(String value) {
			addCriterion("articleid <>", value, "articleid");
			return (Criteria) this;
		}

		public Criteria andArticleidLike(String value) {
			addCriterion("articleid like", value, "articleid");
			return (Criteria) this;
		}

		public Criteria andArticleidNotLike(String value) {
			addCriterion("articleid not like", value, "articleid");
			return (Criteria) this;
		}

		public Criteria andArticleidIn(List<String> values) {
			addCriterion("articleid in", values, "articleid");
			return (Criteria) this;
		}

		public Criteria andArticleidNotIn(List<String> values) {
			addCriterion("articleid not in", values, "articleid");
			return (Criteria) this;
		}

		public Criteria andArticleidBetween(String value1, String value2) {
			addCriterion("articleid between", value1, value2, "articleid");
			return (Criteria) this;
		}

		public Criteria andArticleidNotBetween(String value1, String value2) {
			addCriterion("articleid not between", value1, value2, "articleid");
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