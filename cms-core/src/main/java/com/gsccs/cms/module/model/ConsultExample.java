package com.gsccs.cms.module.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.gsccs.cms.bass.base.BaseExample;

public class ConsultExample extends BaseExample {

	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public ConsultExample() {
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

		public Criteria andParidIsNotNull() {
			addCriterion("parid is not null");
			return (Criteria) this;
		}
		
		public Criteria andParidIsNull() {
			addCriterion("parid is null");
			return (Criteria) this;
		}


		public Criteria andParidEqualTo(Long value) {
			addCriterion("parid =", value, "parid");
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

		public Criteria andGuestbookstateEqualTo(String value) {
			addCriterion("g.state =", value, "state");
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

		public Criteria andMembernameIsNull() {
			addCriterion("membername is null");
			return (Criteria) this;
		}

		public Criteria andMembernameIsNotNull() {
			addCriterion("membername is not null");
			return (Criteria) this;
		}

		public Criteria andMembernameEqualTo(String value) {
			addCriterion("membername =", value, "membername");
			return (Criteria) this;
		}

		public Criteria andMembernameNotEqualTo(String value) {
			addCriterion("membername <>", value, "membername");
			return (Criteria) this;
		}

		public Criteria andMembernameGreaterThan(String value) {
			addCriterion("membername >", value, "membername");
			return (Criteria) this;
		}

		public Criteria andMembernameGreaterThanOrEqualTo(String value) {
			addCriterion("membername >=", value, "membername");
			return (Criteria) this;
		}

		public Criteria andMembernameLessThan(String value) {
			addCriterion("membername <", value, "membername");
			return (Criteria) this;
		}

		public Criteria andMembernameLessThanOrEqualTo(String value) {
			addCriterion("membername <=", value, "membername");
			return (Criteria) this;
		}

		public Criteria andMembernameLike(String value) {
			addCriterion("membername like", value, "membername");
			return (Criteria) this;
		}

		public Criteria andSitenameLike(String value) {
			addCriterion("s.name like", value, "sitename");
			return (Criteria) this;
		}

		public Criteria andMembernameNotLike(String value) {
			addCriterion("membername not like", value, "membername");
			return (Criteria) this;
		}

		public Criteria andMembernameIn(List<String> values) {
			addCriterion("membername in", values, "membername");
			return (Criteria) this;
		}

		public Criteria andMembernameNotIn(List<String> values) {
			addCriterion("membername not in", values, "membername");
			return (Criteria) this;
		}

		public Criteria andMembernameBetween(String value1, String value2) {
			addCriterion("membername between", value1, value2, "membername");
			return (Criteria) this;
		}

		public Criteria andMembernameNotBetween(String value1, String value2) {
			addCriterion("membername not between", value1, value2, "membername");
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

		public Criteria andSexIsNull() {
			addCriterion("sex is null");
			return (Criteria) this;
		}

		public Criteria andSexIsNotNull() {
			addCriterion("sex is not null");
			return (Criteria) this;
		}

		public Criteria andSexEqualTo(String value) {
			addCriterion("sex =", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexNotEqualTo(String value) {
			addCriterion("sex <>", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexGreaterThan(String value) {
			addCriterion("sex >", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexGreaterThanOrEqualTo(String value) {
			addCriterion("sex >=", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexLessThan(String value) {
			addCriterion("sex <", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexLessThanOrEqualTo(String value) {
			addCriterion("sex <=", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexLike(String value) {
			addCriterion("sex like", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexNotLike(String value) {
			addCriterion("sex not like", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexIn(List<String> values) {
			addCriterion("sex in", values, "sex");
			return (Criteria) this;
		}

		public Criteria andSexNotIn(List<String> values) {
			addCriterion("sex not in", values, "sex");
			return (Criteria) this;
		}

		public Criteria andSexBetween(String value1, String value2) {
			addCriterion("sex between", value1, value2, "sex");
			return (Criteria) this;
		}

		public Criteria andSexNotBetween(String value1, String value2) {
			addCriterion("sex not between", value1, value2, "sex");
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

		public Criteria andQqIsNull() {
			addCriterion("qq is null");
			return (Criteria) this;
		}

		public Criteria andQqIsNotNull() {
			addCriterion("qq is not null");
			return (Criteria) this;
		}

		public Criteria andQqEqualTo(String value) {
			addCriterion("qq =", value, "qq");
			return (Criteria) this;
		}

		public Criteria andQqNotEqualTo(String value) {
			addCriterion("qq <>", value, "qq");
			return (Criteria) this;
		}

		public Criteria andQqGreaterThan(String value) {
			addCriterion("qq >", value, "qq");
			return (Criteria) this;
		}

		public Criteria andQqGreaterThanOrEqualTo(String value) {
			addCriterion("qq >=", value, "qq");
			return (Criteria) this;
		}

		public Criteria andQqLessThan(String value) {
			addCriterion("qq <", value, "qq");
			return (Criteria) this;
		}

		public Criteria andQqLessThanOrEqualTo(String value) {
			addCriterion("qq <=", value, "qq");
			return (Criteria) this;
		}

		public Criteria andQqLike(String value) {
			addCriterion("qq like", value, "qq");
			return (Criteria) this;
		}

		public Criteria andQqNotLike(String value) {
			addCriterion("qq not like", value, "qq");
			return (Criteria) this;
		}

		public Criteria andQqIn(List<String> values) {
			addCriterion("qq in", values, "qq");
			return (Criteria) this;
		}

		public Criteria andQqNotIn(List<String> values) {
			addCriterion("qq not in", values, "qq");
			return (Criteria) this;
		}

		public Criteria andQqBetween(String value1, String value2) {
			addCriterion("qq between", value1, value2, "qq");
			return (Criteria) this;
		}

		public Criteria andQqNotBetween(String value1, String value2) {
			addCriterion("qq not between", value1, value2, "qq");
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

		public Criteria andReuseridIsNull() {
			addCriterion("reuserid is null");
			return (Criteria) this;
		}

		public Criteria andReuseridIsNotNull() {
			addCriterion("reuserid is not null");
			return (Criteria) this;
		}

		public Criteria andReuseridEqualTo(String value) {
			addCriterion("reuserid =", value, "reuserid");
			return (Criteria) this;
		}

		public Criteria andReuseridNotEqualTo(String value) {
			addCriterion("reuserid <>", value, "reuserid");
			return (Criteria) this;
		}

		public Criteria andReuseridGreaterThan(String value) {
			addCriterion("reuserid >", value, "reuserid");
			return (Criteria) this;
		}

		public Criteria andReuseridGreaterThanOrEqualTo(String value) {
			addCriterion("reuserid >=", value, "reuserid");
			return (Criteria) this;
		}

		public Criteria andReuseridLessThan(String value) {
			addCriterion("reuserid <", value, "reuserid");
			return (Criteria) this;
		}

		public Criteria andReuseridLessThanOrEqualTo(String value) {
			addCriterion("reuserid <=", value, "reuserid");
			return (Criteria) this;
		}

		public Criteria andReuseridLike(String value) {
			addCriterion("reuserid like", value, "reuserid");
			return (Criteria) this;
		}

		public Criteria andReuseridNotLike(String value) {
			addCriterion("reuserid not like", value, "reuserid");
			return (Criteria) this;
		}

		public Criteria andReuseridIn(List<String> values) {
			addCriterion("reuserid in", values, "reuserid");
			return (Criteria) this;
		}

		public Criteria andReuseridNotIn(List<String> values) {
			addCriterion("reuserid not in", values, "reuserid");
			return (Criteria) this;
		}

		public Criteria andReuseridBetween(String value1, String value2) {
			addCriterion("reuserid between", value1, value2, "reuserid");
			return (Criteria) this;
		}

		public Criteria andReuseridNotBetween(String value1, String value2) {
			addCriterion("reuserid not between", value1, value2, "reuserid");
			return (Criteria) this;
		}

		public Criteria andIclassidIsNull() {
			addCriterion("iclassid is null");
			return (Criteria) this;
		}

		public Criteria andIclassidIsNotNull() {
			addCriterion("iclassid is not null");
			return (Criteria) this;
		}

		public Criteria andIclassidEqualTo(Integer value) {
			addCriterion("iclassid =", value, "iclassid");
			return (Criteria) this;
		}

		public Criteria andTypeEqualTo(String value) {
			addCriterion("type =", value, "type");
			return (Criteria) this;
		}
		
		public Criteria andIsshowEqualTo(String value) {
			addCriterion("isshow =", value, "isshow");
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