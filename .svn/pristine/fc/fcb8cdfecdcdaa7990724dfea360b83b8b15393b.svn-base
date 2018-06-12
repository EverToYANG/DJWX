package com.gsccs.cms.controller.core;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.gsccs.cms.auth.service.UserService;
import com.gsccs.cms.auth.utils.AuthConst;
import com.gsccs.cms.bass.controller.CmsBaseController;
import com.gsccs.cms.core.model.Channel;
import com.gsccs.cms.core.service.ChannelService;
import com.gsccs.cms.core.service.SensitiveService;
import com.gsccs.cms.core.service.SiteService;

/**
 * 栏目相关操作
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
@Controller
@RequestMapping("/cms")
public class ChannelController extends CmsBaseController {
	@Resource
	private ChannelService channelService;
	@Resource
	private SensitiveService sensitiveService;
	@Resource
	private SiteService siteService;
	@Resource
	private UserService userService;

	/**
	 * 管理页面
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/channel.do")
	public String channel(String type, ModelMap map,
			HttpServletResponse response) {
		String siteid = "";
		Subject subject = SecurityUtils.getSubject();
		if (subject.hasRole(AuthConst.SYS_ADMIN)) {
			siteid = "0";
		} else{
			siteid = getWxApp().getId();
		}
		// 栏目管理页面
		List<Channel> channelList = channelService.findByPar(siteid, 0l);
		// 设置是否有子栏目
		if (channelList != null && channelList.size() > 0) {
			for (int i = 0; i < channelList.size(); i++) {
				if (channelService.hasChildren(channelList.get(i).getId())) {
					channelList.get(i).setHasChildren("true");
				}
			}
		}
		map.put("channelList", channelList);
		map.put("site", siteService.findById(siteid));
		if ("select".equals(type)) {
			return "cms/channelSelect";
		}
		return "cms/channel";
	}

	/**
	 * 下级数据
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/channelSon.do")
	public String channelSon(Long pid, String plevel, ModelMap map,
			HttpServletResponse response) {
		String siteid = "";
		Subject subject = SecurityUtils.getSubject();
		if (subject.hasRole(AuthConst.SYS_ADMIN)) {
			siteid = "0";
		} else{
			siteid = getWxApp().getId();
		}
		if (null != pid && StringUtils.isNotEmpty(plevel)) {
			// 提取子
			List<Channel> channelList = channelService.findByPar(siteid, pid);
			// 设置是否有子栏目
			if (channelList != null && channelList.size() > 0) {
				for (int i = 0; i < channelList.size(); i++) {
					if (channelService.hasChildren(channelList.get(i).getId())) {
						channelList.get(i).setHasChildren("true");
					}
				}
			}
			map.put("channelList", channelList);
			try {
				map.put("level", Integer.parseInt(plevel) + 1);
			} catch (Exception e) {
			}
		}
		return "cms/channelSon";
	}

	/**
	 * 编辑页面
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/channelEdit.do")
	public String channelEdit(Long pid, Long id, ModelMap map,
			HttpServletResponse response) {
		if (null != id) {
			// 编辑页面
			Channel channel = channelService.findById(id);
			// 编辑页面
			map.put("channel", channel);
		} else {
			// 添加页面
			Channel channel = new Channel();
			channel.setParid(pid);
			map.put("channel", channel);
		}
		return "cms/channelEdit";
	}

	/**
	 * 编辑
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/channelEditDo.do")
	public String channelEditDo(
			Channel channel,
			@RequestParam(value = "imgfile", required = false) MultipartFile imgfile,
			String oldImg, String pageFuncId, ModelMap map,
			HttpServletResponse response) {
		String oper = "添加";
		String appid = null;
		try {
			Subject subject = SecurityUtils.getSubject();
			if (subject.hasRole(AuthConst.SYS_ADMIN)) {
				appid = "0";
			}else{
				appid = getWxApp().getId();
			} 
			channel.setSite(appid);
			// 敏感词处理
			channel.setName(sensitiveService.replace(channel.getName()));
			channel.setContent(sensitiveService.replace(channel
					.getContent()));
			
			if (channel.getId() != null) {
				oper = "更新";
				channelService.update(channel);
			} else {
				channelService.insert(channel);
			}
			msg = oper + "栏目 " + channel.getName() + " 成功";
			map.put("forwardSeconds", 3);
			map.put("msg", msg);
			map.put("forwardUrl", "channel.do?pageFuncId=" + pageFuncId);
			return "admin/msg";
		} catch (Exception e) {
			e.printStackTrace();
			msg = oper + "栏目 " + channel.getName() + " 操作失败:" + e.toString();
			map.put("msg", msg);
			map.put("isBack", true);
			return "admin/msg";
		}
	}

	/**
	 * 转移页面
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/channelTree.do")
	public String channelTree(ModelMap map, HttpServletResponse response) {
		String siteid = "";
		Subject subject = SecurityUtils.getSubject();
		if (subject.hasRole(AuthConst.SYS_ADMIN)) {
			siteid = "0";
		} else{
			siteid = getWxApp().getId();
		}
		// 查询一级
		List<Channel> channelList = channelService.findByPar(
				siteid, 0l);
		// 设置是否有子栏目
		if (channelList != null && channelList.size() > 0) {
			for (int i = 0; i < channelList.size(); i++) {
				if (channelService.hasChildren(channelList.get(i).getId())) {
					channelList.get(i).setHasChildren("true");
				}
			}
		}
		map.put("channelList", channelList);
		return "cms/channelTree";
	}

	/**
	 * 子站点
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/channelSonTree.do")
	public String channelSonTree(Long pid, String plevel, ModelMap map,
			HttpServletResponse response) {
		Subject subject = SecurityUtils.getSubject();
		if (null != pid && StringUtils.isNotEmpty(plevel)) {
			// 提取子菜单
			List<Channel> channelList = channelService.findByPar("", pid);
			// 设置是否有子栏目
			if (channelList != null && channelList.size() > 0) {
				for (int i = 0; i < channelList.size(); i++) {
					if (channelService.hasChildren(channelList.get(i).getId())) {
						channelList.get(i).setHasChildren("true");
					}
				}
			}
			map.put("channelList", channelList);
			try {
				map.put("level", Integer.parseInt(plevel) + 1);
			} catch (Exception e) {
			}
		}
		return "cms/channelSonTree";
	}

	/**
	 * 转移处理
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/channelPar.do")
	public String channelPar(Long id, Long pid, HttpServletRequest request,
			ModelMap map, HttpServletResponse response) {
		String msg = "";
		if (null != id) {
			Channel channel = channelService.findById(id);
			if (null != pid) {
				Channel parChannel = channelService.findById(pid);
				if (parChannel != null) {
					msg = "改变栏目 " + channel.getName() + " 的所属栏目为 "
							+ parChannel.getName() + " ";
				}
			} else {
				msg = "改变栏目 " + channel.getName() + " 的所属栏目为 根栏目 ";
			}
			if (channel != null) {
				try {
					channel.setParid(pid);
					channelService.update(channel);
					msg += "成功!";
				} catch (Exception e) {
					msg += "失败:" + e.toString();
				}
				operlogService.log(getLoginName(), msg, request);
			}
		}
		map.put("isCloseWindow", true);
		map.put("isRefresh", true);
		operlogService.log(getLoginName(), msg, request);
		map.put("msg", msg);
		return "admin/msg";
	}

	/**
	 * 删除
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/channelDel.do")
	public String channelDel(String pageFuncId, String ids, ModelMap map,
			HttpServletResponse response) {
		if (ids != null && ids.trim().length() > 0) {
			String[] idArr = ids.split(";");
			if (idArr != null && idArr.length > 0) {
				Channel channel;
				for (int i = 0; i < idArr.length; i++) {
					if (idArr[i].trim().length() > 0) {
						channel = channelService.findById(Long
								.valueOf(idArr[i]));
						if (channel != null) {
							try {
								channelService.del(Long.valueOf(idArr[i]));
								operlogService.log(getLoginName(), "删除栏目成功:"
										+ channel.getName(), request);
							} catch (Exception e) {
								operlogService.log(
										getLoginName(),
										"删除栏目失败:" + channel.getName() + " "
												+ e.getMessage(), request);
							}
						}
					}
				}
			}
		}
		map.put("msg", "操作成功");
		map.put("forwardUrl", "channel.do?pageFuncId=" + pageFuncId);
		map.put("forwardSeconds", 3);
		return "admin/msg";
	}

	/**
	 * 排序
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/channelOrder.do")
	public String channelOrder(Long id, String type, ModelMap map,
			HttpServletResponse response){
		if (null != id) {
			Channel channel = channelService.findById(id);
			if (channel != null) {
				String msg = "";
				try {
					if ("up".equals(type)) {
						msg += "上升";
						channelService.up(channel);
					} else if ("down".equals(type)) {
						msg += "下降";
						channelService.down(channel);
					}
				} catch (Exception e) {
					msg += "栏目 " + channel.getName() + " 失败:" + e.toString();
				}
				msg += "栏目 " + channel.getName() + " 成功";
				operlogService.log(getLoginName(), msg, request);
			}
		}
		return channel("", map, response);
	}
}
