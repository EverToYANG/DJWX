package com.gsccs.cms.controller.member;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gsccs.cms.bass.controller.CmsBaseController;
import com.gsccs.cms.bass.utils.Pager;
import com.gsccs.cms.member.model.Creditrule;
import com.gsccs.cms.member.service.CreditruleService;

/**
 * 积分规则管理相关操作
 * 
 * @author x.d zhang
 * @version 1.0
 */
@Controller
@RequestMapping("/credit")
public class CreditruleController extends CmsBaseController {

	@Resource
	private CreditruleService creditruleService;

	/**
	 * 积分规则管理页面
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/rulelist.do")
	public String creditrule(Creditrule creditrule,
			@RequestParam(defaultValue = "1") int currPage,
			@RequestParam(defaultValue = "10") int pageSize,
			@RequestParam(defaultValue = " ordernum ") String order,
			ModelMap map, HttpServletResponse response){
		List<Creditrule> creditruleList = null;
		if (creditrule == null) {
			creditrule = new Creditrule();
		}
		creditruleList = creditruleService.find(creditrule, order, currPage,
				pageSize);
		int totalCount = creditruleService.count(creditrule);
		Pager pager = new Pager(request);
		pager.appendParam("name");
		pager.appendParam("code");
		pager.appendParam("rewardtype");
		pager.appendParam("cycletype");
		pager.appendParam("pageSize", "" + pageSize);
		pager.appendParam("pageFuncId");
		pager.setCurrPage(currPage);
		pager.setPageSize(pageSize);
		pager.setTotalCount(totalCount);

		pager.setOutStrBootstrap("creditrule.do");
		map.put("pageStr", pager.getOutStrBootstrap());
		map.put("list", creditruleList);
		map.put("order", order);
		return "member/creditrule";
	}

	/**
	 * 积分规则编辑页面
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/ruleEdit.do")
	public String creditruleEdit(Creditrule creditrule, ModelMap map,
			HttpServletResponse response){
		if (creditrule != null && creditrule.getId() != null
				&& creditrule.getId().trim().length() > 0) {
			creditrule = creditruleService.findById(creditrule.getId());
			map.put("creditrule", creditrule);
		}
		return "member/creditruleEdit";
	}

	/**
	 * 积分规则编辑
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/ruleEditDo.do")
	public String creditruleEditDo(Creditrule creditrule, ModelMap map,
			HttpServletResponse response) {
		String oper = "添加";
		try {
			if (creditrule != null && creditrule.getId() != null) {
				Creditrule oldCreditrule = creditruleService
						.findById(creditrule.getId());
				if (oldCreditrule != null) {
					oldCreditrule.setName(creditrule.getName());
					oldCreditrule.setCode(creditrule.getCode());
					oldCreditrule.setCycletype(creditrule.getCycletype());
					oldCreditrule.setCycletime(creditrule.getCycletime());
					oldCreditrule.setCycletypeStr(creditrule.getCycletypeStr());
					oldCreditrule.setCredit(creditrule.getCredit());
					oldCreditrule.setRewardnum(creditrule.getRewardnum());
					oldCreditrule.setRewardtype(creditrule.getRewardtype());
					oldCreditrule.setRewardtypeStr(creditrule
							.getRewardtypeStr());
					oldCreditrule.setExperience(creditrule.getExperience());
					oldCreditrule.setOrdernum(creditrule.getOrdernum());
					oper = "修改";
					creditruleService.update(creditrule);
				} else {
					// 添加
					creditruleService.add(creditrule);
				}

			} else {
				// 添加
				creditruleService.add(creditrule);
			}
			oper += "积分规则(" + creditrule.getName() + ")成功!";
		} catch (Exception e) {
			oper += "积分规则(" + creditrule.getName() + ")失败:" + e.toString()
					+ "!";
		}
		operlogService.log(getLoginName(), oper, request);
		map.put("msg", oper);
		map.put("isCloseWindow", true);
		map.put("isRefresh", true);

		return "admin/msg";
	}

	/**
	 * 积分规则删除
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/ruleDel.do")
	public String creditruleDel(String pageFuncId, String ids, ModelMap map,
			HttpServletResponse response){
		if (ids != null && ids.trim().length() > 0) {
			StringBuilder sb = new StringBuilder();
			String[] idArr = ids.split(";");
			if (idArr != null && idArr.length > 0) {
				Creditrule creditrule = null;
				for (int i = 0; i < idArr.length; i++) {
					if (idArr[i].trim().length() > 0) {
						try {
							creditrule = creditruleService.findById(idArr[i]);
							if (creditrule != null) {
								creditruleService.del(creditrule.getId());
								sb.append(idArr[i] + ";");
								operlogService.log(getLoginName(), "删除积分规则成功:"
										+ creditrule.getName(), request);
							}
						} catch (Exception e) {
							operlogService.log(getLoginName(),
									"删除积分规则失败:" + creditrule.getName() + " "
											+ e.getMessage(), request);
						}

					}
				}
			}

		}

		map.put("msg", "操作成功");
		map.put("forwardUrl", "credit/rulelist.do?pageFuncId=" + pageFuncId);
		map.put("forwardSeconds", 3);
		return "admin/msg";

	}

}
