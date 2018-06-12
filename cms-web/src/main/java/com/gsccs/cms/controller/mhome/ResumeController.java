package com.gsccs.cms.controller.mhome;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gsccs.cms.bass.controller.MemberBaseController;
import com.gsccs.cms.bass.utils.Pager;
import com.gsccs.cms.module.model.Resume;
import com.gsccs.cms.module.service.ResumeService;

/**
 * 简历相关操作
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
@Controller("MemberResumeController")
@RequestMapping("/m/resume")
public class ResumeController extends MemberBaseController{

	@Resource
	private ResumeService resumeService;
	

	/**
	 * 列表
	 * @return
	 */
	@RequestMapping("/resume.do")
	public String resume(Resume resume,@RequestParam(defaultValue="1") int currPage,@RequestParam(defaultValue="10") int pageSize,
			@RequestParam(defaultValue=" addtime desc ") String order,ModelMap map,HttpServletResponse response){
		if (resume==null ){
			resume=new Resume();
		}
		resume.setMemberid(getLoginMember().getId());
		List<Resume> resumeList=resumeService.find(resume, order, currPage, pageSize);
		int totalCount=resumeService.count(resume);
		
		Pager pager=new Pager(request);
		pager.appendParam("resume.job");
		pager.appendParam("resume.state");
		pager.appendParam("pageSize",""+pageSize);
		pager.appendParam("pageFuncId");
		pager.setCurrPage(currPage);
		pager.setPageSize(pageSize);
		pager.setTotalCount(totalCount);
		pager.setOutStrBootstrap("resume.do");
		map.put("pageStr", pager.getOutStrBootstrap());
		map.put("list", resumeList);
		map.put("order", order);
		
		return "member/resume";
	}

	/**
	 * 详细信息
	 * @return
	 */
	@RequestMapping("/resumeInfo.do")
	public String resumeInfo(Resume resume,ModelMap map,HttpServletResponse response){
		if (resume!=null && StringUtils.isNotEmpty(resume.getId())) {
			resume=resumeService.findById(resume.getId());
			map.put("resume", resume);
		}
		return "member/resumeInfo";
	}

	/**
	 * 删除
	 * @return
	 */
	@RequestMapping("/resumeDel.do")
	public String resumeDel(String ids,ModelMap map,HttpServletResponse response){
		if (ids!=null && ids.trim().length()>0) {
			String[] idArr=ids.split(";");
			if (idArr!=null && idArr.length>0) {
				for (int i = 0; i < idArr.length; i++) {
					if (idArr[i].trim().length()>0) {
						try {
							resumeService.del(idArr[i]);
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
		map.put("forwardUrl", "resume.do");
		return "member/msg";
	}
}
