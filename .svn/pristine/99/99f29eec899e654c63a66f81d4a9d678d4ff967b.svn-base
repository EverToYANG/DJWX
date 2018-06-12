package com.gsccs.weixin.service;

import java.io.File;

import org.springframework.stereotype.Service;

import com.gsccs.cms.weixin.model.WxApp;

import io.github.elkan1788.mpsdk4j.vo.api.Media;

/**
 * 多媒体API
 * 
 * @author 刘杰
 *
 * @date 2016年9月18日
 */
@Service
public class MediaApi extends WXAppConfig {

	/**
	 * 上传多媒体文件
	 * 
	 * <pre/>
	 * 上传的临时多媒体文件有格式和大小限制,如下:
	 * <li/>图片(image): 1M,支持JPG格式
	 * <li/>语音(voice):2M,播放长度不超过60s,支持AMR\MP3格式
	 * <li/>视频(video):10MB,支持MP4格式
	 * <li/>缩略图(thumb):64KB,支持JPG格式
	 * 
	 * <pre/>
	 * 媒体文件在后台保存时间为3天,即3天后media_id失效。
	 * 
	 * @param type
	 *            多媒体类型 {@link io.github.elkan1788.mpsdk4j.common.MediaType}
	 * @param media
	 *            多媒体文件
	 * @return 实体{@link Media}
	 */
	public Media upMedia(WxApp wxApp, String type, File media) {
		return getAPI(wxApp).upMedia(type, media);
	}

	// 下载多媒体文件
	public File dlMedia(WxApp wxApp, String mediaId) {
		return getAPI(wxApp).dlMedia(mediaId);
	}

}
