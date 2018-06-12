package com.gsccs.cms.controller.mhome;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gsccs.cms.bass.controller.MemberBaseController;
import com.gsccs.cms.bass.utils.Pager;
import com.gsccs.cms.member.model.Creditlog;
import com.gsccs.cms.member.model.Creditrule;
import com.gsccs.cms.member.service.CreditlogService;
import com.gsccs.cms.member.service.CreditruleService;

/**
 * 会员中心  积分记录相关操作
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
@Controller("MemberCreditlogController")
@RequestMapping("/m/member")
public class CreditlogController extends MemberBaseController {

	@Resource
	private CreditlogService creditlogService;
	@Resource
	private CreditruleService creditruleService;
	

	/**
	 * 列表
	 * @return
	 */
	@RequestMapping("/creditlog.do")
	public String creditlog(Creditlog creditlog,@RequestParam(defaultValue="1") int currPage,@RequestParam(defaultValue="10") int pageSize,
			@RequestParam(defaultValue=" credittime desc ") String order,ModelMap map,HttpServletResponse response){
		if (creditlog==null ){
			creditlog=new Creditlog();
		}
		creditlog.setMemberid(getLoginMember().getId());
		List<Creditrule> creditruleList=creditruleService.find(null, "ordernum", true);
		map.put("creditruleList", creditruleList);
		List<Creditlog> creditlogList=creditlogService.find(creditlog, order, currPage, pageSize);
		int totalCount=creditlogService.count(creditlog);
		
		Pager pager=new Pager(request);
		pager.appendParam("creditruleid");
		pager.appendParam("type");
		pager.appendParam("pageSize",""+pageSize);
		pager.appendParam("pageFuncId");
		pager.setCurrPage(currPage);
		pager.setPageSize(pageSize);
		pager.setTotalCount(totalCount);
		pager.setOutStrBootstrap("creditlog.do");
		map.put("pageStr", pager.getOutStrBootstrap());
		map.put("list", creditlogList);
		map.put("order", order);
		
		return "member/creditlog";
	}
}
