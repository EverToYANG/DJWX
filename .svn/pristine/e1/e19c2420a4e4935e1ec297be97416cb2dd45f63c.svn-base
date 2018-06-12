package com.gsccs.cms.core.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class Content implements Serializable {

	private Long id;
	private String state;
	private String iscomment;
	private String iscommentStr;
	public static String ISCOMMENT_NO = "0";// 不允许评论
	public static String ISCOMMENT_MEMBER = "1";// 会员评论
	public static String ISCOMMENT_ALL = "2";// 会员和匿名评论
	private String video;
	private List<String> channelids;// 查询条件 栏目集合
	private String addUserLoginName;
	private String addUserName;
	private int countnum;
	private String isimgs;

	private String site;
	private String infosite;
	private String sitename;
	private String indexnum;
	private Long channel;
	private String channelname;

	private String title;
	private String shorttitle;
	private String showtitle; // 列表显示的标题
	private int showtitleLen; // 列表显示的标题长度

	private String pageurl;

	private String noids;
	private String sitepath;
	private String[] channels;
	private Date starttime;
	private Date endtime;
	private String ishot; // 是否热点
	private String isnew; // 是否最新

	private String source;
	private String author;
	private String description;
	private String tags;

	private String img;

	private String url;
	private Date addtime;

	private String addtimeStr;
	private String dateFormat;

	private String templet;

	private String istop;
	private Integer clicknum;

	private String adduser;
	private String adduserLike;

	private String content;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site == null ? null : site.trim();
	}

	public Long getChannel() {
		return channel;
	}

	public void setChannel(Long channel) {
		this.channel = channel;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title == null ? null : title.trim();
	}

	public String getShorttitle() {
		if (showtitleLen > 0) {
			if (StringUtils.isEmpty(shorttitle)) {
				shorttitle = title;
			}
			if (shorttitle.length() > showtitleLen) {
				shorttitle = shorttitle.substring(0, showtitleLen);
			}
		}
		return shorttitle;
	}

	public void setShorttitle(String shorttitle) {
		this.shorttitle = shorttitle == null ? null : shorttitle.trim();
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source == null ? null : source.trim();
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author == null ? null : author.trim();
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description == null ? null : description.trim();
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags == null ? null : tags.trim();
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img == null ? null : img.trim();
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url == null ? null : url.trim();
	}

	public Date getAddtime() {
		return addtime;
	}

	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public String getTemplet() {
		return templet;
	}

	public void setTemplet(String templet) {
		this.templet = templet == null ? null : templet.trim();
	}

	public String getIstop() {
		return istop;
	}

	public void setIstop(String istop) {
		this.istop = istop == null ? null : istop.trim();
	}

	public Integer getClicknum() {
		return clicknum;
	}

	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}

	public String getAdduser() {
		return adduser;
	}

	public void setAdduser(String adduser) {
		this.adduser = adduser == null ? null : adduser.trim();
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content == null ? null : content.trim();
	}

	public String getAddtimeStr() {
		if (dateFormat == null || dateFormat.trim().length() == 0) {
			dateFormat = "yyyy-MM-dd HH:mm:ss";
		}
		if (addtime != null) {
			addtimeStr = new SimpleDateFormat(dateFormat).format(addtime);
		}
		return addtimeStr;
	}

	public void setAddtimeStr(String addtimeStr) {
		this.addtimeStr = addtimeStr;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getShowtitle() {
		if (StringUtils.isEmpty(showtitle)) {
			// 默认为标题
			showtitle = this.title;
			// 判断是否有短标题
			if (shorttitle != null && shorttitle.trim().length() > 0) {
				showtitle = shorttitle;
			}
			// 判断标题长度
			if (showtitleLen > 0 && showtitle.length() > showtitleLen) {
				showtitle = showtitle.substring(0, showtitleLen);
			}
		}
		return showtitle;
	}

	public void setShowtitle(String showtitle) {
		this.showtitle = showtitle;
	}

	public int getShowtitleLen() {
		return showtitleLen;
	}

	public void setShowtitleLen(int showtitleLen) {
		this.showtitleLen = showtitleLen;
	}

	public String getPageurl() {
		// 判断是否有外部链接
		if (url != null && url.trim().length() > 0) {
			pageurl = url;
		}
		return pageurl;
	}

	public void setPageurl(String pageurl) {
		this.pageurl = pageurl;
	}

	public String getNoids() {
		return noids;
	}

	public void setNoids(String noids) {
		this.noids = noids;
	}

	public String getDateFormat() {
		return dateFormat;
	}

	public void setDateFormat(String dateFormat) {
		this.dateFormat = dateFormat;
	}

	public String getSitepath() {
		return sitepath;
	}

	public void setSitepath(String sitepath) {
		this.sitepath = sitepath;
	}

	public String[] getChannels() {
		return channels;
	}

	public void setChannels(String[] channels) {
		this.channels = channels;
	}

	public Date getStarttime() {
		return starttime;
	}

	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}

	public Date getEndtime() {
		return endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public String getIscomment() {
		return iscomment;
	}

	public void setIscomment(String iscomment) {
		this.iscomment = iscomment;
	}

	public String getIscommentStr() {
		if (ISCOMMENT_NO.equals(iscomment)) {
			iscommentStr = "否";
		} else if (ISCOMMENT_MEMBER.equals(iscomment)) {
			iscommentStr = "会员评论";
		} else if (ISCOMMENT_ALL.equals(iscomment)) {
			iscommentStr = "会员和匿名评论";
		}
		return iscommentStr;
	}

	public void setIscommentStr(String iscommentStr) {
		this.iscommentStr = iscommentStr;
	}

	public String getIndexnum() {
		return indexnum;
	}

	public void setIndexnum(String indexnum) {
		this.indexnum = indexnum;
	}

	public List<String> getChannelids() {
		return channelids;
	}

	public void setChannelids(List<String> channelids) {
		this.channelids = channelids;
	}

	public String getAddUserLoginName() {
		return addUserLoginName;
	}

	public void setAddUserLoginName(String addUserLoginName) {
		this.addUserLoginName = addUserLoginName;
	}

	public String getAddUserName() {
		return addUserName;
	}

	public void setAddUserName(String addUserName) {
		this.addUserName = addUserName;
	}

	public int getCountnum() {
		return countnum;
	}

	public void setCountnum(int countnum) {
		this.countnum = countnum;
	}

	public String getAdduserLike() {
		return adduserLike;
	}

	public void setAdduserLike(String adduserLike) {
		this.adduserLike = adduserLike;
	}

	public String getSitename() {
		return sitename;
	}

	public void setSitename(String sitename) {
		this.sitename = sitename;
	}

	public String getInfosite() {
		return infosite;
	}

	public void setInfosite(String infosite) {
		this.infosite = infosite;
	}

	public String getChannelname() {
		return channelname;
	}

	public void setChannelname(String channelname) {
		this.channelname = channelname;
	}

	public String getIshot() {
		return ishot;
	}

	public void setIshot(String ishot) {
		this.ishot = ishot;
	}

	public String getIsimgs() {
		return isimgs;
	}

	public void setIsimgs(String isimgs) {
		this.isimgs = isimgs;
	}

	public String getIsnew() {
		return isnew;
	}

	public void setIsnew(String isnew) {
		this.isnew = isnew;
	}

}