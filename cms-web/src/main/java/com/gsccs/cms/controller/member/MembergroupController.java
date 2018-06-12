package com.gsccs.cms.controller.member;

import java.io.File;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.gsccs.cms.bass.controller.CmsBaseController;
import com.gsccs.cms.bass.utils.FileUtil;
import com.gsccs.cms.member.model.Memberauth;
import com.gsccs.cms.member.model.Membergroup;
import com.gsccs.cms.member.model.PartyUnit;
import com.gsccs.cms.member.service.MemberauthService;
import com.gsccs.cms.member.service.PartyUnitService;
import com.gsccs.cms.member.service.MembergroupService;

/**
 * 会员组相关操作
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
@Controller
@RequestMapping("/member")
public class MembergroupController extends CmsBaseController {

	@Resource
	private MembergroupService membergroupService;
	@Resource
	private MemberauthService memberauthService;
	@Resource
	private PartyUnitService membergroupAuthService;

	/**
	 * 会员组管理页面
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/group.do")
	public String membergroup(Membergroup membergroup, ModelMap map,
			HttpServletResponse response) {
		if (membergroup == null) {
			membergroup = new Membergroup();
		}
		List<Membergroup> membergroupList = membergroupService.find(
				membergroup, " ordernum ");
		map.put("list", membergroupList);
		return "member/group";
	}

	/**
	 * 会员组编辑页面
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/groupEdit.do")
	public String membergroupEdit(Membergroup membergroup, ModelMap map,
			HttpServletResponse response) {
		if (membergroup != null && membergroup.getId() != null
				&& membergroup.getId().trim().length() > 0) {
			membergroup = membergroupService.findById(membergroup.getId());
			map.put("membergroup", membergroup);
		}
		return "member/groupEdit";
	}

	/**
	 * 会员组编辑
	 * 
	 * @param map
	 * @return
	 */

	@RequestMapping("/groupEditDo.do")
	public String membergroupEditDo(
			Membergroup membergroup,
			ModelMap map, HttpServletResponse response) {
		String oper = "添加";

		try {
			if (membergroup.getId() != null
					&& membergroup.getId().trim().length() > 0) {
				// 更新
				oper = "更新";
				membergroupService.update(membergroup);
				operlogService.log(getLoginName(), oper, request);
			} else {
				membergroupService.insert(membergroup);
			}
			oper += "会员组(" + membergroup.getName() + ")成功!";
		} catch (Exception e) {
			oper += "会员组(" + membergroup.getName() + ") 失败:" + e.toString()
					+ "!";

		}
		operlogService.log(getLoginName(), oper, request);
		map.put("msg", oper);
		map.put("isCloseWindow", true);
		map.put("isRefresh", true);
		return "admin/msg";
	}


	/**
	 * 会员组删除
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/groupDel.do")
	public String membergroupDel(String pageFuncId, String ids, ModelMap map,
			HttpServletResponse response) {
		if (ids != null && ids.trim().length() > 0) {
			StringBuilder sb = new StringBuilder();
			String[] idArr = ids.split(";");
			if (idArr != null && idArr.length > 0) {
				Membergroup membergroup = null;
				for (int i = 0; i < idArr.length; i++) {
					if (idArr[i].trim().length() > 0) {
						try {
							membergroup = membergroupService.findById(idArr[i]);
							if (membergroup != null) {
								membergroupService.del(membergroup.getId());
								sb.append(idArr[i] + ";");
								msg = "删除会员组成功:" + membergroup.getName();
								map.put("forwardSeconds", 3);
							}
						} catch (Exception e) {
							msg = "删除会员组失败:" + membergroup.getName() + " "
									+ e.getMessage();
							map.put("forwardSeconds", 0);
						}
						operlogService.log(getLoginName(), msg, request);
					}
				}
			}

		}
		map.put("msg", msg);
		map.put("forwardUrl", "member/group.do?pageFuncId=" + pageFuncId);
		return "admin/msg";
	}

}
