package com.gsccs.cms.module.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.gsccs.cms.bass.base.BaseExample;

public class CommentExample extends BaseExample {

	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public CommentExample() {
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

		public Criteria andIsanonymousIsNull() {
			addCriterion("isAnonymous is null");
			return (Criteria) this;
		}

		public Criteria andIsanonymousIsNotNull() {
			addCriterion("isAnonymous is not null");
			return (Criteria) this;
		}

		public Criteria andIsanonymousEqualTo(String value) {
			addCriterion("isAnonymous =", value, "isanonymous");
			return (Criteria) this;
		}

		public Criteria andIsanonymousNotEqualTo(String value) {
			addCriterion("isAnonymous <>", value, "isanonymous");
			return (Criteria) this;
		}

		public Criteria andIsanonymousGreaterThan(String value) {
			addCriterion("isAnonymous >", value, "isanonymous");
			return (Criteria) this;
		}

		public Criteria andIsanonymousGreaterThanOrEqualTo(String value) {
			addCriterion("isAnonymous >=", value, "isanonymous");
			return (Criteria) this;
		}

		public Criteria andIsanonymousLessThan(String value) {
			addCriterion("isAnonymous <", value, "isanonymous");
			return (Criteria) this;
		}

		public Criteria andIsanonymousLessThanOrEqualTo(String value) {
			addCriterion("isAnonymous <=", value, "isanonymous");
			return (Criteria) this;
		}

		public Criteria andIsanonymousLike(String value) {
			addCriterion("isAnonymous like", value, "isanonymous");
			return (Criteria) this;
		}

		public Criteria andIsanonymousNotLike(String value) {
			addCriterion("isAnonymous not like", value, "isanonymous");
			return (Criteria) this;
		}

		public Criteria andIsanonymousIn(List<String> values) {
			addCriterion("isAnonymous in", values, "isanonymous");
			return (Criteria) this;
		}

		public Criteria andIsanonymousNotIn(List<String> values) {
			addCriterion("isAnonymous not in", values, "isanonymous");
			return (Criteria) this;
		}

		public Criteria andIsanonymousBetween(String value1, String value2) {
			addCriterion("isAnonymous between", value1, value2, "isanonymous");
			return (Criteria) this;
		}

		public Criteria andIsanonymousNotBetween(String value1, String value2) {
			addCriterion("isAnonymous not between", value1, value2,
					"isanonymous");
			return (Criteria) this;
		}

		public Criteria andObjidIsNull() {
			addCriterion("objid is null");
			return (Criteria) this;
		}

		public Criteria andObjidIsNotNull() {
			addCriterion("objid is not null");
			return (Criteria) this;
		}

		public Criteria andObjidEqualTo(String value) {
			addCriterion("objid =", value, "objid");
			return (Criteria) this;
		}

		public Criteria andObjidNotEqualTo(String value) {
			addCriterion("objid <>", value, "objid");
			return (Criteria) this;
		}

		public Criteria andObjidGreaterThan(String value) {
			addCriterion("objid >", value, "objid");
			return (Criteria) this;
		}

		public Criteria andObjidGreaterThanOrEqualTo(String value) {
			addCriterion("objid >=", value, "objid");
			return (Criteria) this;
		}

		public Criteria andObjidLessThan(String value) {
			addCriterion("objid <", value, "objid");
			return (Criteria) this;
		}

		public Criteria andObjidLessThanOrEqualTo(String value) {
			addCriterion("objid <=", value, "objid");
			return (Criteria) this;
		}

		public Criteria andObjidLike(String value) {
			addCriterion("objid like", value, "objid");
			return (Criteria) this;
		}

		public Criteria andObjidNotLike(String value) {
			addCriterion("objid not like", value, "objid");
			return (Criteria) this;
		}

		public Criteria andObjidIn(List<String> values) {
			addCriterion("objid in", values, "objid");
			return (Criteria) this;
		}

		public Criteria andObjidNotIn(List<String> values) {
			addCriterion("objid not in", values, "objid");
			return (Criteria) this;
		}

		public Criteria andObjidBetween(String value1, String value2) {
			addCriterion("objid between", value1, value2, "objid");
			return (Criteria) this;
		}

		public Criteria andObjidNotBetween(String value1, String value2) {
			addCriterion("objid not between", value1, value2, "objid");
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

		public Criteria andcStateEqualTo(String value) {
			addCriterion("c.state =", value, "state");
			return (Criteria) this;
		}

		public Criteria andCommentstateEqualTo(String value) {
			addCriterion("c.state =", value, "commentstate");
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

		public Criteria andSitenameLike(String value) {
			addCriterion("s.name like", value, "sitename");
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