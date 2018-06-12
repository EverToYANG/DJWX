package com.gsccs.cms.exam.model;

import java.util.Date;
import java.util.Map;

import com.gsccs.cms.exam.domain.QuestionHistory;

public class UserQuestionHistory {

	private int id;
	private String userId;
	private Date modifyTime;
	private String historyStr;
	/**
	 * 最外面一层map记录正确和错误，0错误，1正确 暂时只使用0，1方便后期扩展
	 */
	private Map<Integer, Map<Integer, QuestionHistory>> history;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getHistoryStr() {
		return historyStr;
	}

	public void setHistoryStr(String historyStr) {
		this.historyStr = historyStr;
	}

	public Map<Integer, Map<Integer, QuestionHistory>> getHistory() {
		return history;
	}

	public void setHistory(Map<Integer, Map<Integer, QuestionHistory>> history) {
		this.history = history;
	}

}
