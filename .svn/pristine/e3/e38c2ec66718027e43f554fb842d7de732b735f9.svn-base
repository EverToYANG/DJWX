package com.gsccs.cms.wx.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpConfigStorage;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.api.impl.WxMpServiceImpl;
import me.chanjar.weixin.mp.bean.WxMpTemplateData;
import me.chanjar.weixin.mp.bean.WxMpTemplateMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gsccs.cms.weixin.service.WxAppService;

@Service
public class MpMsgServiceImpl implements MpMsgService {

	@Autowired
	private WxAppService wxAppService;
	@Autowired
	WxMpConfigStorage wxMpConfigStorage;

	@Override
	public void sendMsg(String appid,String openid,String tmlShortId, String url,
			Map<String, String> msgMap) {
		
		wxMpConfigStorage.init(appid);
		WxMpService wxMpService = new WxMpServiceImpl();
		
		wxMpService.setWxMpConfigStorage(wxMpConfigStorage);
		
		List<WxMpTemplateData> msgdatas = new ArrayList<>();
		if (null != msgMap && !msgMap.isEmpty()) {
			Iterator<String> its = msgMap.keySet().iterator();
			while (its.hasNext()) {
				String key = its.next();

				WxMpTemplateData tempData = new WxMpTemplateData();
				tempData.setName(key);
				tempData.setValue(msgMap.get(key));
				msgdatas.add(tempData);
			}
		}

		try {
			// 模板消息
			WxMpTemplateMessage message = new WxMpTemplateMessage();
			String templateid = wxMpService.getTemplateId(tmlShortId);
			message.setTemplateId(templateid);
			message.setUrl(url);
			message.setToUser(openid);

			message.setData(msgdatas);
			wxMpService.templateSend(message);
			wxMpService.delTemplateId(templateid);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void sendBatchMsg(String appid,String templateid,
			String url,Map<String, Map<String, String>> usermsgs) {
		try {
			List<WxMpTemplateMessage> messages = new CopyOnWriteArrayList<>();
			List<WxMpTemplateData> msgdatas = new ArrayList<>();
			if (null != usermsgs && !usermsgs.isEmpty()) {
				Iterator<String> msgMaps = usermsgs.keySet().iterator();
				while (msgMaps.hasNext()) {
					String openid = msgMaps.next();
					Map<String, String> msgMap = usermsgs.get(openid);
					if (null != msgMap && !msgMap.isEmpty()) {
						Iterator<String> its = msgMap.keySet().iterator();
						while (its.hasNext()) {
							String key = its.next();
							WxMpTemplateData tempData = new WxMpTemplateData();
							tempData.setName(key);
							tempData.setValue(msgMap.get(key));
							msgdatas.add(tempData);
						}
					}
					// 模板消息
					WxMpTemplateMessage message = new WxMpTemplateMessage();
					message.setTemplateId(templateid);
					message.setUrl(url);
					message.setToUser(openid);
					message.setData(msgdatas);
					// wxService.templateSend(message);
					messages.add(message);
				}
			}
			startSender(appid,messages);
		} catch (Exception e) {
			System.out.println("模板消息发送错误:"+e.getLocalizedMessage());
			//e.printStackTrace();
		}
	}

	/**
	 * 启动发送线程
	 */
	public void startSender(final String appid,final List<WxMpTemplateMessage> messages) {
		Thread thread = new Thread() {
			@Override
			public void run() {
				WxMpService wxService = null;
				while (!messages.isEmpty()) {
					if (null == wxService) {
						wxMpConfigStorage.init(appid);
						wxService = new WxMpServiceImpl();
						wxService.setWxMpConfigStorage(wxMpConfigStorage);
					}
					// 当缓冲区没有数据的时候，此方法会阻塞
					for (WxMpTemplateMessage message : messages) {
						//
						try {
							wxService.templateSend(message);
						} catch (WxErrorException e) {
							System.out.println("推送消息失败："+message.getToUser()+"错误原因:"+e.getLocalizedMessage());
						}finally{
							messages.remove(message);
						}
					}
				}
				System.out.println("模板消息发送线程退出");
			}
		};
		thread.setName("TemplateMessageSender");
		thread.start();
	}

}
