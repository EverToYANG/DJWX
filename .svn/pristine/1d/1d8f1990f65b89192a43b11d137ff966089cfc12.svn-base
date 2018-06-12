package com.gsccs.cms.module.service;

import java.util.List;

import com.gsccs.cms.module.model.Comment;
import com.gsccs.cms.module.model.CommentExample.Criteria;

/**
 * 站点评论服务
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
public interface CommentService {

	/**
	 * 分页查询
	 */
	public List<Comment> find(Comment Comment, String order, int currPage,
			int pageSize, boolean iscache);;

	/**
	 * 查询
	 */
	public List<Comment> find(Comment Comment, String order);

	/**
	 * 统计
	 * 
	 * @param info
	 * @return
	 */
	public int count(Comment Comment, boolean iscache);

	/**
	 * 处理查询条件
	 * 
	 * @param info
	 * @param criteria
	 */
	public void proSearchParam(Comment Comment, Criteria criteria);

	/**
	 * 根据id查询
	 * 
	 * @param id
	 * @param cache
	 * @return
	 */
	public Comment findById(String id);

	/**
	 * 更新
	 * 
	 * @param question
	 */
	public void update(Comment Comment);

	/**
	 * 添加
	 * 
	 * @param question
	 * @return
	 */
	public String add(Comment Comment);

	/**
	 * 删除
	 * 
	 * @param id
	 */
	public void del(String id);

	public void state(String id);

	/**
	 * 评论频率统计 年
	 * 
	 * @param comment
	 * @return
	 */
	public List<Comment> commentUpdateYear(Comment comment);

	/**
	 * 评论频率统计 年
	 * 
	 * @param comment
	 * @return
	 */
	public List<Comment> commentUpdateYear(Comment comment, int currPage,
			int pageSize);

	/**
	 * 评论频率统计 年
	 * 
	 * @param comment
	 * @return
	 */
	public int commentUpdateYearCount(Comment comment);

	/**
	 * 评论频率合计 年
	 * 
	 * @param comment
	 * @return
	 */
	public int commentUpdateYearSum(Comment comment);

	/**
	 * 评论频率统计 月
	 * 
	 * @param comment
	 * @return
	 */
	public List<Comment> commentUpdateMonth(Comment comment);

	/**
	 * 评论频率统计 月
	 * 
	 * @param comment
	 * @return
	 */
	public List<Comment> commentUpdateMonth(Comment comment, int currPage,
			int pageSize);

	/**
	 * 评论频率统计 月
	 * 
	 * @param comment
	 * @return
	 */
	public int commentUpdateMonthCount(Comment comment);

	/**
	 * 评论频率合计 月
	 * 
	 * @param comment
	 * @return
	 */
	public int commentUpdateMonthSum(Comment comment);

	/**
	 * 评论频率统计 日
	 * 
	 * @param comment
	 * @return
	 */
	public List<Comment> commentUpdateDay(Comment comment);

	/**
	 * 评论频率统计 日
	 * 
	 * @param comment
	 * @return
	 */
	public List<Comment> commentUpdateDay(Comment comment, int currPage,
			int pageSize);

	/**
	 * 评论频率统计 日
	 * 
	 * @param comment
	 * @return
	 */
	public int commentUpdateDayCount(Comment comment);

	/**
	 * 评论频率合计 日
	 * 
	 * @param comment
	 * @return
	 */
	public int commentUpdateDaySum(Comment comment);

	/**
	 * 评论频率合计 周
	 * 
	 * @param comment
	 * @return
	 */
	public int commentUpdateWeekSum(Comment comment);

	/**
	 * 评论频率统计 周
	 * 
	 * @param comment
	 * @return
	 */
	public List<Comment> commentUpdateWeek(Comment comment);

	/**
	 * 站点评论统计
	 * 
	 * @param info
	 * @return
	 */
	public List<Comment> sysSiteComment(Comment comment, int currPage,
			int pageSize);

	/**
	 * 站点评论统计
	 * 
	 * @param comment
	 * @return
	 */
	public List<Comment> sysSiteComment(Comment comment);

	/**
	 * 站点评论统计
	 * 
	 * @param comment
	 * @return
	 */
	public int sysSiteCommentCount(Comment comment);

	/**
	 * 站点评论合计
	 * 
	 * @param comment
	 * @return
	 */
	public int sysSiteCommentSum(Comment comment);

}
