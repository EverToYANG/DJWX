package com.gsccs.cms.controller.mhome;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gsccs.cms.bass.controller.MemberBaseController;
import com.gsccs.cms.bass.utils.Pager;
import com.gsccs.cms.member.service.CreditruleService;
import com.gsccs.cms.module.model.Comment;
import com.gsccs.cms.module.service.CommentService;

/**
 * 
 * 评论相关操作
 * 
 * @author x.d zhang
 * @version 1.0
 */
@Controller("MemberCommentController")
@RequestMapping("/m/comment")
public class CommentController extends MemberBaseController {

	@Resource
	private CommentService commentService;
	@Resource
	private CreditruleService creditruleService;

	/**
	 * 列表
	 * 
	 * @return
	 */
	@RequestMapping("/comment.do")
	public String comment(Comment comment,
			@RequestParam(defaultValue = "1") int currPage,
			@RequestParam(defaultValue = "10") int pageSize,
			@RequestParam(defaultValue = " addtime desc ") String order,
			ModelMap map, HttpServletResponse response) {
		if (comment == null) {
			comment = new Comment();
		}
		Map<String, String> objtypes = comment.getObjtypes();
		map.put("objtypes", objtypes);
		comment.setMemberid(getLoginMember().getId());
		List<Comment> commentList = commentService.find(comment, order,
				currPage, pageSize, false);
		int totalCount = commentService.count(comment, false);

		Pager pager = new Pager(request);
		pager.appendParam("isanonymous");
		pager.appendParam("objtype");
		pager.appendParam("objid");
		pager.appendParam("content");
		pager.appendParam("state");
		pager.appendParam("pageSize", "" + pageSize);
		pager.appendParam("pageFuncId");
		pager.setCurrPage(currPage);
		pager.setPageSize(pageSize);
		pager.setTotalCount(totalCount);
		pager.setOutStrBootstrap("comment.do");
		map.put("pageStr", pager.getOutStrBootstrap());
		map.put("list", commentList);
		map.put("order", order);

		return "member/comment";
	}

	/**
	 * 删除
	 * 
	 * @return
	 */
	@RequestMapping("/commentDel.do")
	public String commentDel(String ids, ModelMap map,
			HttpServletResponse response) {
		if (ids != null && ids.trim().length() > 0) {
			String[] idArr = ids.split(";");
			if (idArr != null && idArr.length > 0) {
				for (int i = 0; i < idArr.length; i++) {
					if (idArr[i].trim().length() > 0) {
						try {
							commentService.del(idArr[i]);
							// 处理积分
							creditruleService.credit(getLoginMember(),
									"comment_del");
							map.put("forwardSeconds", 3);
							map.put("msg", "操作成功");
						} catch (Exception e) {
							map.put("forwardSeconds", 0);
							e.printStackTrace();
							map.put("msg", "操作失败：" + e.getMessage());
						}
					}
				}
			}
		}
		map.put("forwardUrl", "comment.do");
		return "member/msg";
	}
}
