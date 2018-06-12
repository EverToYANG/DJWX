<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html class="hb-loaded" style="font-size: 40px;">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=Edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta name="apple-mobile-web-app-status-bar-style" content="yes">
    <script src="${pageContext.request.contextPath}/static/common/js/jquery-1.8.3.min.js" type="text/javascript"></script>
    <!--link( rel="stylesheet" href="http://c.csdnimg.cn/public/common/toolbar/css/index.css" )-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/weui/css/bootstrap.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/weui/css/avatar.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/weui/css/common.css">
    <!-- [if IE 7]-->
    <!--link( rel="stylesheet" href="assets/css/font-awesome-ie7.min.css" )-->
    <!-- [endif]-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/weui/css/main.css">
    <!-- [if lt IE 9]-->
    <script src="${pageContext.request.contextPath}/static/weui/js/html5shiv.min.js"></script>
    <!-- [endif]-->
    <title>折叠布局 原理及实现</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/weui/js/blog_mobile.js"></script>
</head>
<body>
<div class="blog_main">
      <div class="blog_top_wrap">
        <div class="blog_top"><i id="menu_J" class="iconfont icon_l"></i>
            <form method="get" action="http://m.blog.csdn.net/search/index" id="searchform">
			    <i id="search_J" class="iconfont icon_r"></i>
			    <div id="search_c_J" class="search">
			         <input type="text" placeholder="请输入" id="search" name="keyword" page="1" value=""><i class="iconfont icon_search"></i><i class="iconfont icon_close"></i>
			    </div>
			</form>
			<script type="text/javascript" src="static/weui/js/search.js"></script>
          	<h2 class="blog_top_t">移动开发</h2>
        </div>
      </div>

      <div class="main_list">
        <div class="new_hot">
			<a href="http://m.blog.csdn.net/Column/Index?Channel=mobile&amp;Type=New" class="blog_new">最新</a>
			<a href="http://m.blog.csdn.net/Column/Index?Channel=mobile&amp;Type=Hot" class="blog_hot blog_red">最热</a>
        </div>

		<dl class="m_list clearfix">
              <dt><a href="http://m.blog.csdn.net/article/details?id=52736383">
                                               【移动开发】
                         
                  Android6.0权限管理到RxPermissions源码分析</a></dt>
              <dd>
                <label>
                    <a href="http://m.blog.csdn.net/blog/index?username=Neacy_Zz"><img src="./移动开发博客专栏 - 博客频道 - CSDN.NET_files/3_neacy_zz.jpg" alt="Neacy_Zz"></a>
                    <a href="http://m.blog.csdn.net/blog/index?username=Neacy_Zz" class="username">Neacy_Zz</a>
                </label>
                  <span><em>10小时前</em><em>|</em><a href="http://m.blog.csdn.net/article/details?id=52736383">92 阅读</a></span>
              </dd>
	</dl>
	
	<dl class="m_list clearfix">
              <dt><a href="http://m.blog.csdn.net/article/details?id=52735273">
                                               【移动开发】
                         
                  Android开发——View绘制过程源码解析（一）</a></dt>
              <dd>
                <label>
                    <a href="http://m.blog.csdn.net/blog/index?username=SEU_Calvin"><img src="./移动开发博客专栏 - 博客频道 - CSDN.NET_files/3_seu_calvin.jpg" alt="SEU_Calvin"></a>
                    <a href="http://m.blog.csdn.net/blog/index?username=SEU_Calvin" class="username">SEU_Calvin</a>
                </label>
                  <span><em>昨天 22:29</em><em>|</em><a href="http://m.blog.csdn.net/article/details?id=52735273">964 阅读</a></span>
              </dd>
</dl>

<dl class="m_list clearfix">
              <dt><a href="http://m.blog.csdn.net/article/details?id=52733390">
                                               【移动开发】
                         
                  HyBrid App框架</a></dt>
              <dd>
                <label>
                    <a href="http://m.blog.csdn.net/blog/index?username=Notzuonotdied"><img src="http://avatar.csdn.net/D/3/D/3_notzuonotdied.jpg" alt="Notzuonotdied"></a>
                    <a href="http://m.blog.csdn.net/blog/index?username=Notzuonotdied" class="username">Notzuonotdied</a>
                </label>
                  <span><em>昨天 12:50</em><em>|</em><a href="http://m.blog.csdn.net/article/details?id=52733390">229 阅读</a></span>
              </dd>
</dl>

<dl class="m_list clearfix">
              <dt><a href="http://m.blog.csdn.net/article/details?id=52728711">
                                               【移动开发】
                         
                  iOS - 监控键盘高度、屏蔽字符、限制字符个数</a></dt>
              <dd>
                <label>
                    <a href="http://m.blog.csdn.net/blog/index?username=mjw1991222"><img src="./移动开发博客专栏 - 博客频道 - CSDN.NET_files/3_mjw1991222.jpg" alt="mjw1991222"></a>
                    <a href="http://m.blog.csdn.net/blog/index?username=mjw1991222" class="username">mjw1991222</a>
                </label>
                  <span><em>昨天 11:50</em><em>|</em><a href="http://m.blog.csdn.net/article/details?id=52728711">209 阅读</a></span>
              </dd>
</dl>

<dl class="m_list clearfix">
              <dt><a href="http://m.blog.csdn.net/article/details?id=52734722">
                                               【移动开发】
                         
                  IOS 动画设计(3)——模糊效果的使用总结</a></dt>
              <dd>
                <label>
                    <a href="http://m.blog.csdn.net/blog/index?username=huangfei711"><img src="./移动开发博客专栏 - 博客频道 - CSDN.NET_files/3_huangfei711.jpg" alt="huangfei711"></a>
                    <a href="http://m.blog.csdn.net/blog/index?username=huangfei711" class="username">huangfei711</a>
                </label>
                  <span><em>昨天 17:55</em><em>|</em><a href="http://m.blog.csdn.net/article/details?id=52734722">119 阅读</a></span>
              </dd>
</dl>

<dl class="m_list clearfix">
              <dt><a href="http://m.blog.csdn.net/article/details?id=52733856">
                                               【移动开发】
                         
                  Android31--Android之机型适配</a></dt>
              <dd>
                <label>
                    <a href="http://m.blog.csdn.net/blog/index?username=u012954720"><img src="./移动开发博客专栏 - 博客频道 - CSDN.NET_files/3_u012954720.jpg" alt="u012954720"></a>
                    <a href="http://m.blog.csdn.net/blog/index?username=u012954720" class="username">u012954720</a>
                </label>
                  <span><em>昨天 18:52</em><em>|</em><a href="http://m.blog.csdn.net/article/details?id=52733856">117 阅读</a></span>
              </dd>
</dl>

<dl class="m_list clearfix">
              <dt><a href="http://m.blog.csdn.net/article/details?id=52662896">
                                               【移动开发】
                         
                  java/android 设计模式学习笔记（22）---模板方法模式</a></dt>
              <dd>
                <label>
                    <a href="http://m.blog.csdn.net/blog/index?username=zhao_zepeng"><img src="./移动开发博客专栏 - 博客频道 - CSDN.NET_files/3_zhao_zepeng.jpg" alt="zhao_zepeng"></a>
                    <a href="http://m.blog.csdn.net/blog/index?username=zhao_zepeng" class="username">zhao_zepeng</a>
                </label>
                  <span><em>昨天 15:47</em><em>|</em><a href="http://m.blog.csdn.net/article/details?id=52662896">108 阅读</a></span>
              </dd>
</dl>

<dl class="m_list clearfix">
              <dt><a href="http://m.blog.csdn.net/article/details?id=52734807">
                                               【移动开发】
                         
                  android 列表ListView和可扩展列表ExpandableListView的实现</a></dt>
              <dd>
                <label>
                    <a href="http://m.blog.csdn.net/blog/index?username=youmingyu"><img src="./移动开发博客专栏 - 博客频道 - CSDN.NET_files/3_youmingyu.jpg" alt="youmingyu"></a>
                    <a href="http://m.blog.csdn.net/blog/index?username=youmingyu" class="username">youmingyu</a>
                </label>
                  <span><em>昨天 18:29</em><em>|</em><a href="http://m.blog.csdn.net/article/details?id=52734807">98 阅读</a></span>
              </dd>
</dl>

<dl class="m_list clearfix">
              <dt><a href="http://m.blog.csdn.net/article/details?id=52733222">
                                               【移动开发】
                         
                  Android性能分析工具</a></dt>
              <dd>
                <label>
                    <a href="http://m.blog.csdn.net/blog/index?username=axi295309066"><img src="./移动开发博客专栏 - 博客频道 - CSDN.NET_files/3_axi295309066.jpg" alt="axi295309066"></a>
                    <a href="http://m.blog.csdn.net/blog/index?username=axi295309066" class="username">axi295309066</a>
                </label>
                  <span><em>昨天 11:48</em><em>|</em><a href="http://m.blog.csdn.net/article/details?id=52733222">95 阅读</a></span>
              </dd>
</dl>

<dl class="m_list clearfix">
              <dt><a href="http://m.blog.csdn.net/article/details?id=52734261">
                                               【移动开发】
                         
                  Android 实现带指示器的自动轮播式ViewPager</a></dt>
              <dd>
                <label>
                    <a href="http://m.blog.csdn.net/blog/index?username=a553181867"><img src="./移动开发博客专栏 - 博客频道 - CSDN.NET_files/3_a553181867.jpg" alt="a553181867"></a>
                    <a href="http://m.blog.csdn.net/blog/index?username=a553181867" class="username">a553181867</a>
                </label>
                  <span><em>昨天 16:09</em><em>|</em><a href="http://m.blog.csdn.net/article/details?id=52734261">193 阅读</a></span>
              </dd>
</dl>

<dl class="m_list clearfix">
              <dt><a href="http://m.blog.csdn.net/article/details?id=52005355">
                                               【移动开发】
                         
                  微信小程序开发常见问题分析</a></dt>
              <dd>
                <label>
                    <a href="http://m.blog.csdn.net/blog/index?username=xiehuimx"><img src="./移动开发博客专栏 - 博客频道 - CSDN.NET_files/3_xiehuimx.jpg" alt="xiehuimx"></a>
                    <a href="http://m.blog.csdn.net/blog/index?username=xiehuimx" class="username">xiehuimx</a>
                </label>
                  <span><em>昨天 22:47</em><em>|</em><a href="http://m.blog.csdn.net/article/details?id=52005355">164 阅读</a></span>
              </dd>
</dl>

<dl class="m_list clearfix">
              <dt><a href="http://m.blog.csdn.net/article/details?id=52732770">
                                               【移动开发】
                         
                  微信分享与QQ分享功能</a></dt>
              <dd>
                <label>
                    <a href="http://m.blog.csdn.net/blog/index?username=new_one_object"><img src="./移动开发博客专栏 - 博客频道 - CSDN.NET_files/3_new_one_object.jpg" alt="new_one_object"></a>
                    <a href="http://m.blog.csdn.net/blog/index?username=new_one_object" class="username">new_one_object</a>
                </label>
                  <span><em>昨天 11:43</em><em>|</em><a href="http://m.blog.csdn.net/article/details?id=52732770">147 阅读</a></span>
              </dd>
</dl>

<dl class="m_list clearfix">
              <dt><a href="http://m.blog.csdn.net/article/details?id=52732907">
                                               【移动开发】
                         
                  Java微信开发入门</a></dt>
              <dd>
                <label>
                    <a href="http://m.blog.csdn.net/blog/index?username=Monkey_D_Lufy"><img src="http://avatar.csdn.net/E/C/3/3_monkey_d_lufy.jpg" alt="Monkey_D_Lufy"></a>
                    <a href="http://m.blog.csdn.net/blog/index?username=Monkey_D_Lufy" class="username">Monkey_D_Lufy</a>
                </label>
                  <span><em>昨天 10:40</em><em>|</em><a href="http://m.blog.csdn.net/article/details?id=52732907">147 阅读</a></span>
              </dd>
</dl>

<dl class="m_list clearfix">
              <dt><a href="http://m.blog.csdn.net/article/details?id=52728570">
                                               【移动开发】
                         
                  View绘制详解(三)，扒一扒View的测量过程</a></dt>
              <dd>
                <label>
                    <a href="http://m.blog.csdn.net/blog/index?username=u012702547"><img src="./移动开发博客专栏 - 博客频道 - CSDN.NET_files/3_u012702547.jpg" alt="u012702547"></a>
                    <a href="http://m.blog.csdn.net/blog/index?username=u012702547" class="username">u012702547</a>
                </label>
                  <span><em>昨天 13:37</em><em>|</em><a href="http://m.blog.csdn.net/article/details?id=52728570">146 阅读</a></span>
              </dd>
</dl>

<dl class="m_list clearfix">
              <dt><a href="http://m.blog.csdn.net/article/details?id=52733406">
                                               【移动开发】
                         
                  【Android】WebView：onReceiveError的应用与变迁</a></dt>
              <dd>
                <label>
                    <a href="http://m.blog.csdn.net/blog/index?username=barryhappy"><img src="./移动开发博客专栏 - 博客频道 - CSDN.NET_files/3_barryhappy.jpg" alt="barryhappy"></a>
                    <a href="http://m.blog.csdn.net/blog/index?username=barryhappy" class="username">barryhappy</a>
                </label>
                  <span><em>昨天 12:43</em><em>|</em><a href="http://m.blog.csdn.net/article/details?id=52733406">144 阅读</a></span>
              </dd>
</dl>

<dl class="m_list clearfix">
              <dt><a href="http://m.blog.csdn.net/article/details?id=52689949">
                                               【移动开发】
                         
                  Android进阶——GridView实现可长按item显示可删除的小图标的UI</a></dt>
              <dd>
                <label>
                    <a href="http://m.blog.csdn.net/blog/index?username=CrazyMo_"><img src="http://avatar.csdn.net/A/2/3/3_crazymo_.jpg" alt="CrazyMo_"></a>
                    <a href="http://m.blog.csdn.net/blog/index?username=CrazyMo_" class="username">CrazyMo_</a>
                </label>
                  <span><em>昨天 10:53</em><em>|</em><a href="http://m.blog.csdn.net/article/details?id=52689949">139 阅读</a></span>
              </dd>
</dl>

<dl class="m_list clearfix">
              <dt><a href="http://m.blog.csdn.net/article/details?id=52705492">
                                               【移动开发】
                         
                  Android中的 事件流----浅析安卓中的动与静（四） 进程间通讯</a></dt>
              <dd>
                <label>
                    <a href="http://m.blog.csdn.net/blog/index?username=liufangbaishi2014"><img src="./移动开发博客专栏 - 博客频道 - CSDN.NET_files/3_liufangbaishi2014.jpg" alt="liufangbaishi2014"></a>
                    <a href="http://m.blog.csdn.net/blog/index?username=liufangbaishi2014" class="username">liufangbaishi2014</a>
                </label>
                  <span><em>昨天 13:40</em><em>|</em><a href="http://m.blog.csdn.net/article/details?id=52705492">136 阅读</a></span>
              </dd>
</dl>

<dl class="m_list clearfix">
              <dt><a href="http://m.blog.csdn.net/article/details?id=52733823">
                                               【移动开发】
                         
                  RCNN学习笔记(11):R-FCN: Object Detection via Region-based Fully Convolutional Networks</a></dt>
              <dd>
                <label>
                    <a href="http://m.blog.csdn.net/blog/index?username=u011534057"><img src="./移动开发博客专栏 - 博客频道 - CSDN.NET_files/3_u011534057.jpg" alt="u011534057"></a>
                    <a href="http://m.blog.csdn.net/blog/index?username=u011534057" class="username">u011534057</a>
                </label>
                  <span><em>昨天 14:33</em><em>|</em><a href="http://m.blog.csdn.net/article/details?id=52733823">131 阅读</a></span>
              </dd>
</dl>

<dl class="m_list clearfix">
              <dt><a href="http://m.blog.csdn.net/article/details?id=52733341">
                                               【移动开发】
                         
                  实现iOS图片等资源文件的热更新化(三):动态的资源文件夹</a></dt>
              <dd>
                <label>
                    <a href="http://m.blog.csdn.net/blog/index?username=sinat_30800357"><img src="./移动开发博客专栏 - 博客频道 - CSDN.NET_files/3_sinat_30800357.jpg" alt="sinat_30800357"></a>
                    <a href="http://m.blog.csdn.net/blog/index?username=sinat_30800357" class="username">sinat_30800357</a>
                </label>
                  <span><em>昨天 12:21</em><em>|</em><a href="http://m.blog.csdn.net/article/details?id=52733341">130 阅读</a></span>
              </dd>
</dl>

<dl class="m_list clearfix">
              <dt><a href="http://m.blog.csdn.net/article/details?id=52733018">
                                               【移动开发】
                         
                  ViewPager使用（一）</a></dt>
              <dd>
                <label>
                    <a href="http://m.blog.csdn.net/blog/index?username=wanghgsz"><img src="http://avatar.csdn.net/A/0/8/3_wanghgsz.jpg" alt="wanghgsz"></a>
                    <a href="http://m.blog.csdn.net/blog/index?username=wanghgsz" class="username">wanghgsz</a>
                </label>
                  <span><em>昨天 11:04</em><em>|</em><a href="http://m.blog.csdn.net/article/details?id=52733018">125 阅读</a></span>
              </dd>
</dl>

<dl class="m_list clearfix">
              <dt><a href="http://m.blog.csdn.net/article/details?id=52734435">
                                               【移动开发】
                         
                  Android开发使用的常见第三方框架汇总</a></dt>
              <dd>
                <label>
                    <a href="http://m.blog.csdn.net/blog/index?username=miaozhenzhong"><img src="./移动开发博客专栏 - 博客频道 - CSDN.NET_files/3_miaozhenzhong.jpg" alt="miaozhenzhong"></a>
                    <a href="http://m.blog.csdn.net/blog/index?username=miaozhenzhong" class="username">miaozhenzhong</a>
                </label>
                  <span><em>昨天 16:47</em><em>|</em><a href="http://m.blog.csdn.net/article/details?id=52734435">113 阅读</a></span>
              </dd>
</dl>

<dl class="m_list clearfix">
              <dt><a href="http://m.blog.csdn.net/article/details?id=52736008">
                                               【移动开发】
                         
                  android之Toolbar使用详解</a></dt>
              <dd>
                <label>
                    <a href="http://m.blog.csdn.net/blog/index?username=listeners_Gao"><img src="./移动开发博客专栏 - 博客频道 - CSDN.NET_files/3_listeners_gao.jpg" alt="listeners_Gao"></a>
                    <a href="http://m.blog.csdn.net/blog/index?username=listeners_Gao" class="username">listeners_Gao</a>
                </label>
                  <span><em>昨天 23:09</em><em>|</em><a href="http://m.blog.csdn.net/article/details?id=52736008">100 阅读</a></span>
              </dd>
</dl>

<dl class="m_list clearfix">
              <dt><a href="http://m.blog.csdn.net/article/details?id=52734781">
                                               【移动开发】
                         
                  OpenGrok源码搜索引擎搭建</a></dt>
              <dd>
                <label>
                    <a href="http://m.blog.csdn.net/blog/index?username=luzhenrong45"><img src="./移动开发博客专栏 - 博客频道 - CSDN.NET_files/3_luzhenrong45.jpg" alt="luzhenrong45"></a>
                    <a href="http://m.blog.csdn.net/blog/index?username=luzhenrong45" class="username">luzhenrong45</a>
                </label>
                  <span><em>昨天 18:13</em><em>|</em><a href="http://m.blog.csdn.net/article/details?id=52734781">97 阅读</a></span>
              </dd>
</dl>

<dl class="m_list clearfix">
              <dt><a href="http://m.blog.csdn.net/article/details?id=52728487">
                                               【移动开发】
                         
                  Activity的声明周期和启动模式</a></dt>
              <dd>
                <label>
                    <a href="http://m.blog.csdn.net/blog/index?username=mockingbirds"><img src="./移动开发博客专栏 - 博客频道 - CSDN.NET_files/3_mockingbirds.jpg" alt="mockingbirds"></a>
                    <a href="http://m.blog.csdn.net/blog/index?username=mockingbirds" class="username">mockingbirds</a>
                </label>
                  <span><em>昨天 15:22</em><em>|</em><a href="http://m.blog.csdn.net/article/details?id=52728487">96 阅读</a></span>
              </dd>
</dl>

<dl class="m_list clearfix">
              <dt><a href="http://m.blog.csdn.net/article/details?id=52728721">
                                               【移动开发】
                         
                  Java Annotation 简析(二)</a></dt>
              <dd>
                <label>
                    <a href="http://m.blog.csdn.net/blog/index?username=Jo__yang"><img src="./移动开发博客专栏 - 博客频道 - CSDN.NET_files/3_jo__yang.jpg" alt="Jo__yang"></a>
                    <a href="http://m.blog.csdn.net/blog/index?username=Jo__yang" class="username">Jo__yang</a>
                </label>
                  <span><em>昨天 23:16</em><em>|</em><a href="http://m.blog.csdn.net/article/details?id=52728721">90 阅读</a></span>
              </dd>
</dl>

<dl class="m_list clearfix">
              <dt><a href="http://m.blog.csdn.net/article/details?id=52735757">
                                               【移动开发】
                         
                  Android开源项目及库</a></dt>
              <dd>
                <label>
                    <a href="http://m.blog.csdn.net/blog/index?username=lipengshiwo"><img src="./移动开发博客专栏 - 博客频道 - CSDN.NET_files/3_lipengshiwo.jpg" alt="lipengshiwo"></a>
                    <a href="http://m.blog.csdn.net/blog/index?username=lipengshiwo" class="username">lipengshiwo</a>
                </label>
                  <span><em>昨天 22:21</em><em>|</em><a href="http://m.blog.csdn.net/article/details?id=52735757">88 阅读</a></span>
              </dd>
</dl>

<dl class="m_list clearfix">
              <dt><a href="http://m.blog.csdn.net/article/details?id=52734063">
                                               【移动开发】
                         
                  Eclipse搭建stm32开发环境+jlink调试</a></dt>
              <dd>
                <label>
                    <a href="http://m.blog.csdn.net/blog/index?username=ZhaoFa_JLU"><img src="./移动开发博客专栏 - 博客频道 - CSDN.NET_files/3_zhaofa_jlu.jpg" alt="ZhaoFa_JLU"></a>
                    <a href="http://m.blog.csdn.net/blog/index?username=ZhaoFa_JLU" class="username">ZhaoFa_JLU</a>
                </label>
                  <span><em>昨天 15:32</em><em>|</em><a href="http://m.blog.csdn.net/article/details?id=52734063">66 阅读</a></span>
              </dd>
</dl>

<dl class="m_list clearfix">
              <dt><a href="http://m.blog.csdn.net/article/details?id=52735728">
                                               【移动开发】
                         
                  android 开发书签大全</a></dt>
              <dd>
                <label>
                    <a href="http://m.blog.csdn.net/blog/index?username=lipengshiwo"><img src="./移动开发博客专栏 - 博客频道 - CSDN.NET_files/3_lipengshiwo.jpg" alt="lipengshiwo"></a>
                    <a href="http://m.blog.csdn.net/blog/index?username=lipengshiwo" class="username">lipengshiwo</a>
                </label>
                  <span><em>昨天 22:15</em><em>|</em><a href="http://m.blog.csdn.net/article/details?id=52735728">63 阅读</a></span>
              </dd>
</dl>

<dl class="m_list clearfix">
              <dt><a href="http://m.blog.csdn.net/article/details?id=52734504">
                                               【移动开发】
                         
                  android之三种方式解析xml(dom,sax,pull)</a></dt>
              <dd>
                <label>
                    <a href="http://m.blog.csdn.net/blog/index?username=song_shui_lin"><img src="./移动开发博客专栏 - 博客频道 - CSDN.NET_files/3_song_shui_lin.jpg" alt="song_shui_lin"></a>
                    <a href="http://m.blog.csdn.net/blog/index?username=song_shui_lin" class="username">song_shui_lin</a>
                </label>
                  <span><em>昨天 16:59</em><em>|</em><a href="http://m.blog.csdn.net/article/details?id=52734504">200 阅读</a></span>
              </dd>
</dl>

	<dl class="m_list clearfix">
	              <dt><a href="http://m.blog.csdn.net/article/details?id=52728861">
	                                               【移动开发】
	                         
	                  Android中子线程真的不能更新UI吗？</a></dt>
	              <dd>
	                <label>
	                    <a href="http://m.blog.csdn.net/blog/index?username=xyh269"><img src="http://avatar.csdn.net/F/0/2/3_xyh269.jpg" alt="xyh269"></a>
	                    <a href="http://m.blog.csdn.net/blog/index?username=xyh269" class="username">xyh269</a>
	                </label>
	                  <span><em>昨天 17:58</em><em>|</em><a href="http://m.blog.csdn.net/article/details?id=52728861">289 阅读</a></span>
	              </dd>
	</dl>
	</div>
      
	<div class="leftNav">
		<div class="left_top">
		        <a href="https://passport.csdn.net/account/login?from=http%3a%2f%2fm.blog.csdn.net%2fColumn%2fIndex%3fChannel%3dmobile%26Type%3dHot"><img src="./移动开发博客专栏 - 博客频道 - CSDN.NET_files/1_csdn.jpg"></a>
		        <a href="https://passport.csdn.net/account/login?from=http%3a%2f%2fm.blog.csdn.net%2fColumn%2fIndex%3fChannel%3dmobile%26Type%3dHot" class="sign">未登录</a> 
		</div>
	        
		<ul class="nav_list">
	            <li><a href="http://m.blog.csdn.net/home/index"><i>•</i><span>首页</span><img src="./移动开发博客专栏 - 博客频道 - CSDN.NET_files/iconfont-youjiantou.png" alt="img" class="arrow_r"></a></li>
	                <li><a href="http://m.blog.csdn.net/Column/Index?Channel=mobile&amp;Type=New"><i>•</i><span>移动开发</span><img src="./移动开发博客专栏 - 博客频道 - CSDN.NET_files/iconfont-youjiantou.png" alt="img" class="arrow_r"></a></li>
	                <li><a href="http://m.blog.csdn.net/Column/Index?Channel=web&amp;Type=New"><i>•</i><span>Web前端</span><img src="./移动开发博客专栏 - 博客频道 - CSDN.NET_files/iconfont-youjiantou.png" alt="img" class="arrow_r"></a></li>
	                <li><a href="http://m.blog.csdn.net/Column/Index?Channel=enterprise&amp;Type=New"><i>•</i><span>架构设计</span><img src="./移动开发博客专栏 - 博客频道 - CSDN.NET_files/iconfont-youjiantou.png" alt="img" class="arrow_r"></a></li>
	                <li><a href="http://m.blog.csdn.net/Column/Index?Channel=code&amp;Type=New"><i>•</i><span>编程语言</span><img src="./移动开发博客专栏 - 博客频道 - CSDN.NET_files/iconfont-youjiantou.png" alt="img" class="arrow_r"></a></li>
	                <li><a href="http://m.blog.csdn.net/Column/Index?Channel=www&amp;Type=New"><i>•</i><span>互联网</span><img src="./移动开发博客专栏 - 博客频道 - CSDN.NET_files/iconfont-youjiantou.png" alt="img" class="arrow_r"></a></li>
	                <li><a href="http://m.blog.csdn.net/Column/Index?Channel=database&amp;Type=New"><i>•</i><span>数据库</span><img src="./移动开发博客专栏 - 博客频道 - CSDN.NET_files/iconfont-youjiantou.png" alt="img" class="arrow_r"></a></li>
	                <li><a href="http://m.blog.csdn.net/Column/Index?Channel=system&amp;Type=New"><i>•</i><span>系统运维</span><img src="./移动开发博客专栏 - 博客频道 - CSDN.NET_files/iconfont-youjiantou.png" alt="img" class="arrow_r"></a></li>
	                <li><a href="http://m.blog.csdn.net/Column/Index?Channel=cloud&amp;Type=New"><i>•</i><span>云计算</span><img src="./移动开发博客专栏 - 博客频道 - CSDN.NET_files/iconfont-youjiantou.png" alt="img" class="arrow_r"></a></li>
	                <li><a href="http://m.blog.csdn.net/Column/Index?Channel=software&amp;Type=New"><i>•</i><span>研发管理</span><img src="./移动开发博客专栏 - 博客频道 - CSDN.NET_files/iconfont-youjiantou.png" alt="img" class="arrow_r"></a></li>
	                <li><a href="http://m.blog.csdn.net/Column/Index?Channel=other&amp;Type=New"><i>•</i><span>综合</span><img src="./移动开发博客专栏 - 博客频道 - CSDN.NET_files/iconfont-youjiantou.png" alt="img" class="arrow_r"></a></li>
		</ul>
	</div>

	<div id="mask"></div>
</div>    
	<script type="text/javascript" src="${pageContext.request.contextPath}/static/weui/js/columnarticlelist.js"></script>

	<div class="ad_box">
      <div class="ad_l"><a href="http://ms.csdn.net/download.html"><img src="./移动开发博客专栏 - 博客频道 - CSDN.NET_files/index_AD.jpg" alt="img"></a><span>即使是一小步<br>也想与你分享</span></div>
      <div class="ad_r"><a href="http://ms.csdn.net/download.html" class="open_btn">打开</a><i class="ad_close iconfont"></i></div>
    </div>

   <div class="backToTop" style="display: none;"><img src="${pageContext.request.contextPath}/static/weui/images/iconfont-fudongxiangshang.png" alt="img"></div>
   <div class="blog_footer">©1999-2012, csdn.net, All Rights Reserved</div>
   <script type="text/javascript" src="${pageContext.request.contextPath}/static/weui/js/fontSize.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/static/weui/js/tracking.js"></script>
</body>
</html>
