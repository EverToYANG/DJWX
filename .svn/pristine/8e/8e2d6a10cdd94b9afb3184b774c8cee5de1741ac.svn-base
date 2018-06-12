package com.gsccs.cms.controller.module;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gsccs.cms.auth.utils.AuthConst;
import com.gsccs.cms.bass.controller.CmsBaseController;
import com.gsccs.cms.bass.utils.Pager;
import com.gsccs.cms.module.model.Consult;
import com.gsccs.cms.module.model.Itemclass;
import com.gsccs.cms.module.service.ConsultService;
import com.gsccs.cms.module.service.ItemclassService;
import com.gsccs.cms.wx.service.MpMsgService;

/**
 * 留言本相关操作
 * 
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
@Controller
@RequestMapping("/guestbook")
public class ConsultController extends CmsBaseController {

	private String tmlShortId = "OPENTM406851402";

	@Resource
	private ConsultService consultService;
	@Resource
	private ItemclassService itemclassService;
	@Resource
	private MpMsgService mpMsgService;

	/**
	 * 留言列表
	 * 
	 * @return
	 */
	@RequestMapping("/list.do")
	public String list(Consult param, String type,
			@RequestParam(defaultValue = " addtime desc ") String order,
			@RequestParam(defaultValue = "1") int currPage,
			@RequestParam(defaultValue = "10") int pageSize, ModelMap map,
			HttpServletResponse response) {
		Itemclass iclassparam = new Itemclass();
		Subject subject = SecurityUtils.getSubject();
		if (!subject.hasRole(AuthConst.SYS_ADMIN)) {
			param.setSiteid(getWxApp().getId());
			iclassparam.setCorpid(null == getWxApp() ? "" : getWxApp().getId());
		}
		param.setType(type);
		List<Consult> consultList = consultService.find(param, order,
				currPage, pageSize, false);
		int totalCount = consultService.count(param, false);
		List<Itemclass> iclasseList = itemclassService.find(iclassparam);
		Pager pager = new Pager(request);
		pager.appendParam("title");
		pager.appendParam("name");
		pager.appendParam("state");
		pager.appendParam("pageSize");
		pager.appendParam("pageFuncId");
		pager.setCurrPage(currPage);
		pager.setPageSize(pageSize);
		pager.setTotalCount(totalCount);
		pager.setOutStrBootstrap("guestbook/list.do");
		map.put("pageStr", pager.getOutStrBootstrap());
		map.put("list", consultList);
		map.put("order", order);
		map.put("consult", param);
		map.put("iclasseList", iclasseList);
		return "module/guestbook";
	}

	/**
	 * 办理 页面
	 * 
	 * @return
	 */
	@RequestMapping("/pro.do")
	public String guestbookPro(Long id, Consult guestbook, ModelMap map,
			HttpServletResponse response) {
		if (null != id) {
			guestbook = consultService.findById(id);
		}
		map.put("guestbook", guestbook);
		return "module/guestbookPro";
	}

	/**
	 * 办理
	 * 
	 * @return
	 */
	@RequestMapping("/proDo.do")
	public String guestbookProDo(Long id, String content, String name,
			String pageFuncId,
			ModelMap map) {
		if (null != id) {
			// 更新事项状态
			Consult guestbook = consultService.findById(id);
			guestbook.setState("1");
			consultService.update(guestbook);

			// 增加处理事项数据
			Consult reGuestbook = new Consult();
			reGuestbook.setParid(id);
			reGuestbook.setName(name);
			reGuestbook.setContent(content);
			reGuestbook.setSiteid(guestbook.getSiteid());
			consultService.add(reGuestbook);

			// 发送模板消息通知用户
			String url = "#";
			// 发送模板通知
			Map<String, String> data = new HashMap<String, String>();
			data.put("first", "您好，我们已成功处理您提交的事项");
			data.put("keyword1", guestbook.getAddtimeStr());
			data.put("keyword2", "事项上报");
			data.put("keyword3", "已处理");
			data.put("remark", reGuestbook.getContent());
			mpMsgService.sendMsg(guestbook.getSiteid(), guestbook.getMemberid(),
					tmlShortId, url, data);
		}
		map.put("msg", msg);
		map.put("forwardUrl", "guestbook/list.do?pageFuncId=" + pageFuncId);
		map.put("forwardSeconds", 3);
		return "admin/msg";
	}

	/**
	 * 查看留言详情 页面
	 * 
	 * @return
	 */
	@RequestMapping("/check.do")
	public String guestbookCheck(Long id, ModelMap map,
			HttpServletResponse response) {
		Consult consult = null;
		if (null != id) {
			consult = consultService.findById(id);
		}
		map.put("consult", consult);
		return "module/guestbookCheck";
	}

	/**
	 * 删除
	 * 
	 * @return
	 */
	@RequestMapping("/del.do")
	public String guestbookDel(String ids, String pageFuncId, ModelMap map,
			HttpServletResponse response) {
		if (ids != null && ids.trim().length() > 0) {
			String[] idArr = ids.split(";");
			if (idArr != null && idArr.length > 0) {
				Consult guestbook = null;
				for (int i = 0; i < idArr.length; i++) {
					if (idArr[i].trim().length() > 0) {
						try {
							guestbook = consultService.findById(Long.valueOf(idArr[i]));
							if (guestbook != null) {
								consultService.del(guestbook.getId());
								msg = "删除留言(" + guestbook.getTitle() + ")成功!";
								map.put("forwardSeconds", 3);
							}
						} catch (Exception e) {
							map.put("forwardSeconds", 0);
							e.printStackTrace();
							msg = "删除留言(" + guestbook.getTitle() + ")失败:"
									+ e.toString() + "!";
						}
						operlogService.log(getLoginName(), msg, request);
					}
				}
			}
		}
		map.put("msg", msg);
		map.put("forwardUrl", "guestbook/list.do?pageFuncId=" + pageFuncId);
		return "admin/msg";
	}
}
