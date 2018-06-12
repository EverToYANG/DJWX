package com.gsccs.cms.controller.core;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.htmlparser.Node;
import org.htmlparser.NodeFilter;
import org.htmlparser.Parser;
import org.htmlparser.filters.TagNameFilter;
import org.htmlparser.tags.ImageTag;
import org.htmlparser.util.NodeList;
import org.htmlparser.util.ParserException;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.gsccs.cms.auth.model.Config;
import com.gsccs.cms.auth.service.UserService;
import com.gsccs.cms.auth.utils.AuthConst;
import com.gsccs.cms.bass.controller.CmsBaseController;
import com.gsccs.cms.bass.utils.FileUtil;
import com.gsccs.cms.bass.utils.OssConfig;
import com.gsccs.cms.bass.utils.Pager;
import com.gsccs.cms.core.model.Channel;
import com.gsccs.cms.core.model.Content;
import com.gsccs.cms.core.model.Site;
import com.gsccs.cms.core.service.ContentImgService;
import com.gsccs.cms.core.service.ContentSignService;
import com.gsccs.cms.core.service.SensitiveService;
import com.gsccs.cms.core.service.SiteService;
import com.gsccs.cms.core.util.CmsConst;
import com.gsccs.cms.weixin.model.WxApp;

/**
 * 站点内容相关操作
 * 
 * @author x.d zhang
 * @version 1.0
 */
@Controller
@RequestMapping("/cms")
public class ArticleController extends CmsBaseController {

	@Resource
	private SensitiveService sensitiveService;
	@Resource
	private SiteService siteService;
	@Resource
	private ContentSignService infoSignService;
	@Resource
	private ContentImgService infoImgService;
	@Resource
	private UserService userService;

	/**
	 * 管理页面信息列表
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/infoList.do")
	public String infoList(Content info,
			@RequestParam(defaultValue = " addtime desc ") String order,
			@RequestParam(defaultValue = "1") int currPage,
			@RequestParam(defaultValue = "10") int pageSize,
			String htmlIndexnumStr, ModelMap map, HttpServletResponse response) {
		Subject subject = SecurityUtils.getSubject();
		if (!subject.hasRole(AuthConst.SYS_ADMIN)) {
			info.setSite(getWxApp().getId());
		} 
		if (info.getChannel() != null) {
			Channel channel = channelService.findById(info.getChannel());
			map.put("channel", channel);
		}
		List<Content> infoList = contentService.find(info, order, currPage,
				pageSize);
		int totalCount = contentService.count(info);
		Pager pager = new Pager(request);
		pager.appendParam("channel");
		pager.appendParam("title");
		pager.appendParam("pageSize");
		pager.appendParam("pageFuncId");
		pager.setCurrPage(currPage);
		pager.setPageSize(pageSize);
		pager.setTotalCount(totalCount);
		pager.setOutStrBootstrap("infoList.do");
		map.put("pageStr", pager.getOutStrBootstrap());
		map.put("list", infoList);
		map.put("order", order);
		return "cms/infoList";
	}

	/**
	 * 编辑页面
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/infoEdit.do")
	public String infoEdit(Long id, Long channelid, ModelMap map,
			HttpServletResponse response) {
		if (null==getWxApp()) {
			map.put("msg", "无权限操作，请用公众号管理员帐号登录");
			map.put("isCloseWindow", true);
			map.put("isRefresh", true);
			return "admin/msg";
		}
		WxApp wxApp = getWxApp();
		if (wxApp != null) {
			// 获取一级栏目
			List<Channel> channelList = channelService.findByPar(wxApp.getId(),
					0l);
			// 设置是否有子栏目
			if (channelList != null && channelList.size() > 0) {
				for (int i = 0; i < channelList.size(); i++) {
					if (channelService.hasChildren(channelList.get(i).getId())) {
						channelList.get(i).setHasChildren("true");
					}
				}
			}
			map.put("channelList", channelList);
			Channel channel = null;
			// 编辑
			if (null != id) {
				Content info = contentService.findById(id);
				map.put("info", info);
				channel = channelService.findById(info.getChannel());
			}
			// 添加,传递参数channel.id
			if (null != channelid) {
				channel = channelService.findById(channelid);
			}
			map.put("channel", channel);
			//.put("site", site);
		}
		return "cms/infoEdit";
	}

	/**
	 * 编辑
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/infoEditDo.do")
	public String infoEditDo(
			Content content,
			String oldchannelid,
			String pageFuncId,
			@RequestParam(value = "imgfile", required = false) MultipartFile imgfile,
			String oldImg,
			@RequestParam(value = "videoUpload", required = false) MultipartFile videoUpload,
			HttpServletRequest request,
			ModelMap map, HttpServletResponse response) {
		String appid = getWxApp().getId();
		Site site = siteService.findById(appid);
		SimpleDateFormat formater = new SimpleDateFormat("yyyyMMdd");
		if (content != null) {
			String oper = "添加";
			try {
				content.setSite(site.getId());
				// 敏感词处理
				content.setTitle(sensitiveService.replace(content.getTitle()));
				content.setShorttitle(sensitiveService.replace(content
						.getShorttitle()));
				content.setContent(sensitiveService.replace(content
						.getContent()));
				content.setDescription(sensitiveService.replace(content
						.getDescription()));
				// 附件处理
				
				
				if (videoUpload != null && videoUpload.getSize() > 0) {
					// 生成目标文件
					String ext = FileUtil.getExt(
							videoUpload.getOriginalFilename()).toLowerCase();
					if (!".flv".equals(ext)) {
						map.put("msg", "只能上传flv格式的视频!");
						map.put("isBack", true);
						return "admin/msg";
					}
					String filename = new Date().getTime() + ext;
					File targetFile = new File(OssConfig.ROOT_PATH
							+ File.separator + appid 
							+ File.separator + formater.format(new Date())
							+ File.separator + filename);
					
					File folder = new File(OssConfig.ROOT_PATH
							+ File.separator + appid 
							+ File.separator + formater.format(new Date())
							+ File.separator);
					if (!folder.exists()) {
						folder.mkdirs();
					}
					if (!targetFile.exists()) {
						targetFile.createNewFile();
					}
					// 复制到目标文件
					FileUtil.copy(videoUpload, targetFile);
					// 生成访问地址
					content.setVideo("/vedio/"+formater.format(new Date())+"/"+ filename);
				}

				
				if (content.getId() != null) {
					// 更新
					oper = "更新";
					Content oldContent = contentService.findById(content
							.getId());
					if (oldContent != null) {
						oldContent.setAuthor(content.getAuthor());
						oldContent.setAddtime(content.getAddtime());
						oldContent.setChannel(content.getChannel());
						oldContent.setContent(content.getContent());
						oldContent.setDescription(content.getDescription());
						oldContent.setImg(content.getImg());
						oldContent.setIstop(content.getIstop());
						oldContent.setIshot(content.getIshot());
						oldContent.setShorttitle(content.getShorttitle());
						oldContent.setSite(content.getSite());
						oldContent.setSource(content.getSource());
						oldContent.setTags(content.getTags());
						oldContent.setTemplet(content.getTemplet());
						oldContent.setTitle(content.getTitle());
						oldContent.setUrl(content.getUrl());
						oldContent.setIscomment(content.getIscomment());
						oldContent.setVideo(content.getVideo());
						oldContent.setIndexnum(content.getIndexnum());
						if (imgfile != null && imgfile.getSize() > 0) {
							// 生成目标文件
							String ext = FileUtil.getExt(
									imgfile.getOriginalFilename())
									.toLowerCase();
							if (!".jpg".equals(ext) && !".jpeg".equals(ext)
									&& !".gif".equals(ext)
									&& !".png".equals(ext)) {
								map.put("msg", "只能上传jpg,jpeg,gif,png格式的图片!");
								map.put("isBack", true);
								return "admin/msg";
							}
							String filename = new Date().getTime() + ext;
							File targetFile = new File(OssConfig.ROOT_PATH
									+ File.separator + appid 
									+ File.separator + formater.format(new Date())
									+ File.separator + filename);
							
							File folder = new File(OssConfig.ROOT_PATH
									+ File.separator + appid 
									+ File.separator + formater.format(new Date())
									+ File.separator);
							if (!folder.exists()) {
								folder.mkdirs();
							}
							if (!targetFile.exists()) {
								targetFile.createNewFile();
							}
							// 复制到目标文件
							FileUtil.copy(imgfile, targetFile);
							// 生成访问地址
							content.setImg("/images/"+formater.format(new Date())+"/"+ filename);
						}
						contentService.update(oldContent);
					}
				} else {
					// 添加
					if (imgfile != null && imgfile.getSize() > 0) {
						// 生成目标文件
						String ext = FileUtil.getExt(
								imgfile.getOriginalFilename()).toLowerCase();
						if (!".jpg".equals(ext) && !".jpeg".equals(ext)
								&& !".gif".equals(ext) && !".png".equals(ext)) {
							map.put("msg", "只能上传jpg,jpeg,gif,png格式的图片!");
							map.put("isBack", true);
							return "admin/msg";
						}
						String filename = new Date().getTime() + ext;
						File targetFile = new File(OssConfig.ROOT_PATH
								+ File.separator + appid 
								+ File.separator + formater.format(new Date())
								+ File.separator + filename);
						
						File folder = new File(OssConfig.ROOT_PATH
								+ File.separator + appid 
								+ File.separator + formater.format(new Date())
								+ File.separator);
						if (!folder.exists()) {
							folder.mkdirs();
						}
						if (!targetFile.exists()) {
							targetFile.createNewFile();
						}
						// 复制到目标文件
						FileUtil.copy(imgfile, targetFile);
						// 生成访问地址
						content.setImg("/images/"+formater.format(new Date())+"/"+ filename);
					}
					content.setAdduser(getLoginUser().getId());
					content.setClicknum(0);
					contentService.insert(content);
				}
				msg = "操作成功";
				map.put("forwardUrl", "infoEdit.do?pageFuncId="
						+ pageFuncId);
				map.put("forwardSeconds", 3);
			} catch (Exception e) {
				e.printStackTrace();
				operlogService.log(
						getLoginName(),
						oper + "信息(" + content.getTitle() + ")失败:"
								+ e.toString(), request);
				msg = "操作失败:" + e.toString();
				map.put("forwardSeconds", 0);
			}
		}
		map.put("msg", msg);
		return "admin/msg";
	}

	
	/**
	 * 复制
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/infoCopy.do")
	public String infoCopy(Long channelid, String ids, ModelMap map,
			HttpServletResponse response){
		if (ids != null && ids.trim().length() > 0) {
			StringBuilder sb = new StringBuilder();
			String[] idArr = ids.split(";");
			if (idArr != null && idArr.length > 0 && channelid != null) {
				Channel toChannel = channelService.findById(channelid);
				Channel channel = toChannel;
				if (toChannel != null) {
					Content info = null;
					Channel oldChannel = null;
					try {
						for (int i = 0; i < idArr.length; i++) {
							if (idArr[i].trim().length() > 0) {
								info = contentService.findById(Long.valueOf(idArr[i]));
								if (info != null) {
									oldChannel = channelService.findById(info
											.getChannel());
									info.setChannel(channelid);
									contentService.insert(info);
									sb.append(idArr[i] + ";");
									msg = "复制信息(" + oldChannel.getName()
											+ " >> " + toChannel.getName()
											+ " " + info.getTitle() + ")成功!";
								}
								operlogService
										.log(getLoginName(), msg, request);
							}
						}
							msg = "复制信息成功!";
					} catch (Exception e) {
						msg = "复制信息(" + oldChannel.getName() + " >> "
								+ toChannel.getName() + " " + info.getTitle()
								+ ")失败:" + e.toString() + "!";
						operlogService.log(getLoginName(), msg, request);
						msg = "复制信息失败:" + e.getMessage();
					}
				}
			}
		}
		map.put("msg", msg);
		map.put("isCloseWindow", true);
		map.put("isRefresh", true);
		return "admin/msg";
	}

	/**
	 * 移动
	 * 
	 * @param map
	 * @return
	 */

	@RequestMapping("/infoMove.do")
	public String infoMove(Long channelid, String ids, ModelMap map,
			HttpServletResponse response){
		if (ids != null && ids.trim().length() > 0) {
			StringBuilder sb = new StringBuilder();
			String[] idArr = ids.split(";");
			if (idArr != null && idArr.length > 0 && channelid != null) {
				Channel oldChannel = null;
				List<Channel> oldList = new ArrayList<Channel>();
				String oldChannelIds = "";
				Content info = null;
				Channel toChannel = channelService.findById(channelid);
				Channel channel = toChannel;
				if (toChannel != null) {
					try {
						for (int i = 0; i < idArr.length; i++) {
							if (idArr[i].trim().length() > 0) {
								info = contentService.findById(Long.valueOf(idArr[i]));
								oldChannel = channelService.findById(info
										.getChannel());
								/*if (oldChannelIds.indexOf(oldChannel.getId()) < 0) {
									oldList.add(oldChannel);
									oldChannelIds += oldChannel.getId() + ";";
								}*/
								if (info != null) {
									info.setChannel(channelid);
									contentService.update(info);
									sb.append(idArr[i] + ";");
									msg = "移动信息(" + oldChannel.getName()
											+ " >> " + toChannel.getName()
											+ " " + info.getTitle() + ")成功!";
								}
								operlogService
										.log(getLoginName(), msg, request);
							}
						}
						map.put("oldChannelIds", oldChannelIds);
						// 新栏目处理
						msg = "移动信息成功!";
					} catch (Exception e) {
						msg = "移动信息(" + oldChannel.getName() + " >> "
								+ toChannel.getName() + " " + info.getTitle()
								+ ")失败:" + e.toString() + "!";
						operlogService.log(getLoginName(), msg, request);
						msg = "移动信息失败:" + e.getMessage();
					}
				}
			}
		}
		map.put("msg", msg);
		map.put("isCloseWindow", true);
		map.put("isRefresh", true);
		return "admin/msg";
	}

	

	
	
	/**
	 * 删除
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/infoDel.do")
	public String infoDel(String ids, String channel, String pageFuncId,
			ModelMap map, HttpServletResponse response) {
		if (ids != null && ids.trim().length() > 0) {
			StringBuilder sb = new StringBuilder();
			String[] idArr = ids.split(";");
			if (idArr != null && idArr.length > 0) {
				Content info = null;
				try {
					for (int i = 0; i < idArr.length; i++) {
						if (idArr[i].trim().length() > 0) {
							info = contentService.findById(Long.valueOf(idArr[i]));
							if (info != null) {
								contentService.del(idArr[i]);
								sb.append(idArr[i] + ";");
								msg = "删除信息(" + info.getTitle() + ")成功!";
							}
							operlogService.log(getLoginName(), msg, request);
						}
					}
					map.put("forwardSeconds", 3);
				} catch (Exception e) {
					map.put("forwardSeconds", 0);
					msg = "删除信息(" + info.getTitle() + ")失败:" + e.toString()
							+ "!";
					operlogService.log(getLoginName(), msg, request);
				}
			}
		}
		map.put("msg", "操作成功");
		map.put("forwardUrl", "infoList.do?pageFuncId=" + pageFuncId
				+ "&channel=" + channel);
		return "admin/msg";
	}


	/**
	 * 信息提取页面
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/infoExtract.do")
	public String infoExtract(Content info,
			@RequestParam(defaultValue = " addtime desc ") String order,
			@RequestParam(defaultValue = "1") int currPage,
			@RequestParam(defaultValue = "10") int pageSize, ModelMap map,
			HttpServletResponse response) {
		if (info == null) {
			info = new Content();
		}
		List<Content> infoList = contentService.find(info, order, currPage,
				pageSize);
		int totalCount = contentService.count(info);
		Pager pager = new Pager(request);
		pager.appendParam("channel");
		pager.appendParam("site");
		pager.appendParam("channelname1");
		pager.appendParam("sitename1");
		pager.appendParam("searchKey");
		pager.appendParam("pageSize");
		pager.appendParam("pageFuncId");
		pager.setCurrPage(currPage);
		pager.setPageSize(pageSize);
		pager.setTotalCount(totalCount);
		pager.setOutStrBootstrap("infoExtract.do");
		map.put("pageStr", pager.getOutStrBootstrap());
		map.put("list", infoList);
		map.put("order", order);
		return "cms/infoExtract";
	}

	/**
	 * 信息提取
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/infoExtractDo.do")
	public String infoExtractDo(Long channelid, String ids, ModelMap map,
			HttpServletResponse response) {
		if (null !=channelid && StringUtils.isNotEmpty(ids)) {
			Channel channel = channelService.findById(channelid);
			if (channel != null) {
				try {
					String[] idArr = ids.split(";");
					if (idArr != null && idArr.length > 0) {
						Content info;
						for (int i = 0; i < idArr.length; i++) {
							if (idArr[i].trim().length() > 0) {
								info = contentService.findById(Long.valueOf(idArr[i]));
								if (info != null) {
									// 复制到新栏目
									if (info != null) {
										info.setChannel(channel.getId());
										info.setSite(channel.getSite());
										contentService.insert(info);
										msg = "提取信息 " + info.getTitle() + " 到 "
												+ channel.getName() + " "
												+ info.getTitle() + ")成功!";
									}
								}
							}
						}
					}
					msg = "提取成功";
				} catch (Exception e) {
					e.printStackTrace();
					msg = "提取信息失败:" + e.getMessage();
				}
			} else {
				msg = "没有找到要提取到的栏目";
			}
		}
		operlogService.log(getLoginName(), msg, request);
		map.put("msg", msg);
		map.put("isCloseWindow", true);
		return "admin/msg";
	}
	

	/**
	 * 日期型数据转换，将页面上的表示日期限的字符串，转换为Date型
	 * **/
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss");
		dateFormat.setLenient(true);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				dateFormat, true));

	}
}
