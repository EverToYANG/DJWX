package com.gsccs.cms.wx.service;

import me.chanjar.weixin.mp.bean.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.WxMpXmlOutMessage;
import me.chanjar.weixin.mp.bean.result.WxMpUser;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;

import java.io.IOException;
import java.util.List;

/**
 */
public interface CoreService {

    /**
     * HttpGet请求
     *
     *  @param urlWithParams
     * @throws Exception
     */
    public void requestGet(String urlWithParams) throws IOException;

    /**
     * HttpPost请求
     *
     * @param url
     * @param params
     * @throws ClientProtocolException
     * @throws IOException
     */
    public void requestPost(String url, List<NameValuePair> params) throws ClientProtocolException, IOException;

}
