package com.gsccs.cms.module.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsccs.cms.module.model.Comment;
import com.gsccs.cms.module.model.CommentExample;

public interface CommentMapper {

	int countByExample(CommentExample example);

	int countByExampleCache(CommentExample example);

	List<Comment> commentUpdateYear(CommentExample example);

	List<Comment> commentUpdateYearPage(CommentExample example);

	List<Comment> commentUpdateMonth(CommentExample example);

	List<Comment> commentUpdateMonthPage(CommentExample example);

	List<Comment> commentUpdateDay(CommentExample example);

	List<Comment> commentUpdateDayPage(CommentExample example);

	List<Comment> commentUpdateWeek(CommentExample example);

	int commentUpdateYearCount(CommentExample example);

	int commentUpdateYearSum(CommentExample example);

	int commentUpdateMonthCount(CommentExample example);

	int commentUpdateMonthSum(CommentExample example);

	int commentUpdateDayCount(CommentExample example);

	int commentUpdateDaySum(CommentExample example);

	int commentUpdateWeekSum(CommentExample example);

	List<Comment> sysSiteCommentPage(CommentExample example);

	List<Comment> sysSiteComment(CommentExample example);

	int sysSiteCommentCount(CommentExample example);

	int sysSiteCommentSum(CommentExample example);

	int deleteByExample(CommentExample example);

	int deleteByPrimaryKey(String id);

	int insert(Comment record);

	int insertSelective(Comment record);

	List<Comment> selectByExample(CommentExample example);

	List<Comment> selectPageByExample(CommentExample example);

	List<Comment> selectPageByExampleCache(CommentExample example);

	Comment selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") Comment record,
			@Param("example") CommentExample example);

	int updateByExample(@Param("record") Comment record,
			@Param("example") CommentExample example);

	int updateByPrimaryKeySelective(Comment record);

	int updateByPrimaryKey(Comment record);
}