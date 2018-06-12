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
import com.gsccs.cms.module.model.Collect;
import com.gsccs.cms.module.service.CollectService;

/**
 * 会员中心 收藏相关操作
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
@Controller("MemberCollectController")
@RequestMapping("/m/collect")
public class CollectController extends MemberBaseController {

	@Resource
	private CollectService collectService;
	

	/**
	 * 列表
	 * @return
	 */
	@RequestMapping("/store.do")
	public String store(Collect store,@RequestParam(defaultValue="1") int currPage,@RequestParam(defaultValue="10") int pageSize,
			@RequestParam(defaultValue=" storetime desc ") String order,ModelMap map,HttpServletResponse response){
		if (store==null ){
			store=new Collect();
		}
		Map<String, String> objtypes=store.getObjtypes();
		map.put("objtypes", objtypes);
		store.setMemberid(getLoginMember().getId());
		List<Collect> storeList=collectService.find(store, order, currPage, pageSize);
		int totalCount=collectService.count(store);
		
		Pager pager=new Pager(request);
		pager.appendParam("objtype");
		pager.appendParam("objtitle");
		pager.appendParam("sitename");
		pager.appendParam("channelname");
		pager.appendParam("pageSize",""+pageSize);
		pager.appendParam("pageFuncId");
		pager.setCurrPage(currPage);
		pager.setPageSize(pageSize);
		pager.setTotalCount(totalCount);
		pager.setOutStrBootstrap("store.do");
		map.put("pageStr", pager.getOutStrBootstrap());
		map.put("list", storeList);
		map.put("order", order);
		
		return "member/store";
	}

	/**
	 * 删除
	 * @return
	 */
	@RequestMapping("/storeDel.do")
	public String storeDel(String ids,ModelMap map,HttpServletResponse response){
		if (ids!=null && ids.trim().length()>0) {
			String[] idArr=ids.split(";");
			if (idArr!=null && idArr.length>0) {
				for (int i = 0; i < idArr.length; i++) {
					if (idArr[i].trim().length()>0) {
						try {
							collectService.del(idArr[i]);
							map.put("forwardSeconds", 3);
							map.put("msg", "操作成功");
						} catch (Exception e) {
							map.put("forwardSeconds", 0);
							e.printStackTrace();
							map.put("msg", "操作失败："+e.getMessage());
						}
					}
				}
			}
		}
		map.put("forwardUrl", "store.do");
		return "member/msg";
	}
}
