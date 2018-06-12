package com.gsccs.cms.controller.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.common.util.StringUtils;
import me.chanjar.weixin.mp.api.WxMpConfigStorage;
import me.chanjar.weixin.mp.api.WxMpMessageRouter;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.api.impl.WxMpServiceImpl;
import me.chanjar.weixin.mp.bean.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.WxMpXmlOutMessage;
import me.chanjar.weixin.mp.bean.result.WxMpOAuth2AccessToken;
import me.chanjar.weixin.mp.bean.result.WxMpUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gsccs.cms.controller.core.GenericController;
import com.gsccs.cms.controller.pojo.ReturnModel;
import com.gsccs.cms.weixin.service.WxAppService;
import com.gsccs.cms.wx.handler.LogHandler;
import com.gsccs.cms.wx.handler.MsgHandler;
import com.gsccs.cms.wx.handler.SubscribeHandler;
import com.gsccs.cms.wx.service.CoreService;

/**
 * 
 * 
 */
@Controller
@RequestMapping("/api/{appid}")
public class WebWxAppController extends GenericController {

	
	@Autowired
	protected CoreService coreService;
	@Autowired
	private WxAppService wxAppService;
	@Resource
	WxMpConfigStorage wxMpConfigStorage;
	
	@Autowired
    protected LogHandler logHandler;
    @Autowired
    protected SubscribeHandler subscribeHandler;
    @Autowired
    protected MsgHandler msgHandler;

    private WxMpMessageRouter router;

	/**
	 * 微信公众号webservice主服务接口，提供与微信服务器的信息交互
	 * 
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping(value = "/auth.do")
	public void wechatCore(@PathVariable("appid") String appid,HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		response.setContentType("text/html;charset=utf-8");
		response.setStatus(HttpServletResponse.SC_OK);

		String signature = request.getParameter("signature");
		String nonce = request.getParameter("nonce");
		String timestamp = request.getParameter("timestamp");
		
		wxMpConfigStorage.init(appid);
		WxMpService wxMpService = new WxMpServiceImpl();
		wxMpService.setWxMpConfigStorage(wxMpConfigStorage);
		
		if (!wxMpService.checkSignature(timestamp, nonce, signature)) {
			// 消息签名不正确，说明不是公众平台发过来的消息
			response.getWriter().println("非法请求");
			return;
		}

		String echostr = request.getParameter("echostr");
		if (StringUtils.isNotBlank(echostr)) {
			// 说明是一个仅仅用来验证的请求，回显echostr
			response.getWriter().println(echostr);
			return;
		}

		String encryptType = StringUtils.isBlank(request
				.getParameter("encrypt_type")) ? "raw" : request
				.getParameter("encrypt_type");

		if ("raw".equals(encryptType)) {
			// 明文传输的消息
			WxMpXmlMessage inMessage = WxMpXmlMessage.fromXml(request
					.getInputStream());
			refreshRouter(wxMpService);
			WxMpXmlOutMessage outMessage = route(inMessage);
			response.getWriter().write(outMessage.toXml());
			return;
		}

		if ("aes".equals(encryptType)) {
			// 是aes加密的消息
			String msgSignature = request.getParameter("msg_signature");
			WxMpXmlMessage inMessage = WxMpXmlMessage.fromEncryptedXml(
					request.getInputStream(), wxMpConfigStorage, timestamp, nonce,
					msgSignature);
			logger.debug("\n消息解密后内容为：\n{} ", inMessage.toString());
			refreshRouter(wxMpService);
			WxMpXmlOutMessage outMessage = route(inMessage);
			logger.info(response.toString());
			response.getWriter()
					.write(outMessage.toEncryptedXml(wxMpConfigStorage));
			return;
		}

		response.getWriter().println("不可识别的加密类型");
		return;
	}

	/**
	 * 通过openid获得基本用户信息 详情请见:
	 * http://mp.weixin.qq.com/wiki/14/bb5031008f1494a59c6f71fa0f319c66.html
	 * 
	 * @param response
	 * @param openid
	 *            openid
	 * @param lang
	 *            zh_CN, zh_TW, en
	 */
	@RequestMapping(value = "getUserInfo")
	public WxMpUser getUserInfo(HttpServletResponse response,
			@RequestParam(value = "openid") String openid,
			@RequestParam(value = "lang") String lang) {
		ReturnModel returnModel = new ReturnModel();
		WxMpUser wxMpUser = null;
		WxMpService wxMpService = null;
		try {
			wxMpUser = wxMpService.getUserService().userInfo(openid, lang);
			returnModel.setResult(true);
			returnModel.setDatum(wxMpUser);
			renderString(response, returnModel);
		} catch (WxErrorException e) {
			returnModel.setResult(false);
			returnModel.setReason(e.getError().toString());
			renderString(response, returnModel);
			logger.error(e.getError().toString());
		}
		return wxMpUser;
	}

	/**
	 * 通过code获得基本用户信息 详情请见:
	 * http://mp.weixin.qq.com/wiki/14/bb5031008f1494a59c6f71fa0f319c66.html
	 * 
	 * @param response
	 * @param code
	 *            code
	 * @param lang
	 *            zh_CN, zh_TW, en
	 */
	@RequestMapping(value = "getOAuth2UserInfo")
	public void getOAuth2UserInfo(HttpServletResponse response,
			@RequestParam(value = "code") String code,
			@RequestParam(value = "lang") String lang) {
		ReturnModel returnModel = new ReturnModel();
		WxMpOAuth2AccessToken accessToken;
		WxMpUser wxMpUser;
		WxMpService wxMpService = null;
		try {
			accessToken = wxMpService.oauth2getAccessToken(code);
			wxMpUser = wxMpService.getUserService().userInfo(
					accessToken.getOpenId(), lang);
			returnModel.setResult(true);
			returnModel.setDatum(wxMpUser);
			renderString(response, returnModel);
		} catch (WxErrorException e) {
			returnModel.setResult(false);
			returnModel.setReason(e.getError().toString());
			renderString(response, returnModel);
			logger.error(e.getError().toString());
		}
	}

	/**
	 * 用code换取oauth2的openid 详情请见:
	 * http://mp.weixin.qq.com/wiki/1/8a5ce6257f1d3b2afb20f83e72b72ce9.html
	 * 
	 * @param response
	 * @param code
	 *            code
	 */
	@RequestMapping(value = "getOpenid")
	public void getOpenid(HttpServletResponse response,
			@RequestParam(value = "code") String code) {
		ReturnModel returnModel = new ReturnModel();
		WxMpOAuth2AccessToken accessToken;
		WxMpService wxMpService = null;
		try {
			accessToken = wxMpService.oauth2getAccessToken(code);
			returnModel.setResult(true);
			returnModel.setDatum(accessToken.getOpenId());
			renderString(response, returnModel);
		} catch (WxErrorException e) {
			returnModel.setResult(false);
			returnModel.setReason(e.getError().toString());
			renderString(response, returnModel);
			logger.error(e.getError().toString());
		}
	}
	
    public void refreshRouter(WxMpService wxMpService) {
        final WxMpMessageRouter newRouter = new WxMpMessageRouter(wxMpService);
        // 记录所有事件的日志
        newRouter.rule().handler(this.logHandler).next();
        // 关注事件
        newRouter.rule().async(false).msgType(WxConsts.XML_MSG_EVENT)
                .event(WxConsts.EVT_SUBSCRIBE).handler(subscribeHandler)
                .end();
        // 默认
        newRouter.rule().async(false).handler(msgHandler).end();
        this.router = newRouter;
    }

    public WxMpXmlOutMessage route(WxMpXmlMessage inMessage) {
        try {
            return this.router.route(inMessage);
        } catch (Exception e) {
            this.logger.error(e.getMessage(), e);
        }

        return null;
    }

}
