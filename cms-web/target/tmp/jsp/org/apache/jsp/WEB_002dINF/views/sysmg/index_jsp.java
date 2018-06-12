package org.apache.jsp.WEB_002dINF.views.sysmg;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/include/bsie_head.jsp");
    _jspx_dependants.add("/include/bsie_foot.jsp");
    _jspx_dependants.add("/include/openWindow.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
    _jspx_tagPool_c_if_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<title>党建服务平台</title>\r\n");
      out.write('\r');
      out.write('\n');

response.setHeader("Cache-Control","no-cache");    
response.setHeader("Pragma","no-cache"); 
response.setDateHeader ("Expires", 0); 

      out.write("\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <!-- Le styles -->\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/bootstrap/css/bootstrap.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/unicorn/css/bootstrap-responsive.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/unicorn/css/select2.css\">\r\n");
      out.write("    <!-- -->\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/unicorn/css/uniform.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/unicorn/css/unicorn.main.css\">\r\n");
      out.write("     \r\n");
      out.write("    <!--[if lte IE 6]>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/bootstrap/css/bootstrap-ie6.min.css\">\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("    <!--[if lte IE 7]>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/bootstrap/css/ie.css\">\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("    \r\n");
      out.write("    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/common/js/html5.js\"></script>\r\n");
      out.write("    <![endif]-->");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Le javascript ================================================== -->\r\n");
      out.write("<!-- Placed at the end of the document so the pages load faster -->\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/common/js/jquery-1.7.2.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/common/js/jquery-1.8.3.min.js\"></script>\r\n");
      out.write("<!--[if lte IE 6]>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/common/js/bootstrap-ie.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/bootstrap/js/bootstrap.min.js\" type=\"text/javascript\" ></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/bootstrap/js/bootstrap-alert.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/unicorn/js/jquery.ui.custom.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/unicorn/js/jquery.uniform.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/unicorn/js/select2.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/unicorn/js/jquery.dataTables.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/common/js/check.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/common/js/checkLoginName.js\"></script>\r\n");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<div id=\"openWindowModal\" class=\"modal hide fade form-horizontal\">   \r\n");
      out.write("    <div class=\"modal-header\" style=\"height:30px;\">\r\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">×</button>\r\n");
      out.write("        <h3 style=\"font-size:14px\"></h3>  \r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"modal-body\" style=\"width:100%; height:100%; padding:5px 0; margin:0;\">\r\n");
      out.write("        <iframe id=\"openWindowIFrame\" style=\"width:100%;height:100%;background-color:#ffffff;\" scrolling=\"auto\" frameborder=\"0\" width=\"100%\" height=\"100%\"></iframe>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"modal-footer\">\r\n");
      out.write("        <button id=\"openWindowBtn\" class=\"btn btn-primary\" data-loading-text=\"提交中...\">确 定</button>\r\n");
      out.write("        <button class=\"btn\" data-dismiss=\"modal\" aria-hidden=\"true\">取 消</button>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/common/js/openWindow.js\"></script>");
      out.write("\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/admin/cms/js/selectSite.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/skin/style/main_css.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/skin/style/zTreeStyle.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/skin/scripts/zTree/jquery.ztree.core-3.2.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tvar ctx = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\";\r\n");
      out.write("\t/**退出系统**/\r\n");
      out.write("\tfunction logout() {\r\n");
      out.write("\t\tif (confirm(\"您确定要退出本系统吗？\")) {\r\n");
      out.write("\t\t\twindow.location.href = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/logout.do\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t/* zTree插件加载目录的处理  */\r\n");
      out.write("\tvar zTree;\r\n");
      out.write("\tvar setting = {\r\n");
      out.write("\t\tview : {\r\n");
      out.write("\t\t\tdblClickExpand : false,\r\n");
      out.write("\t\t\tshowLine : false,\r\n");
      out.write("\t\t\texpandSpeed : ($.browser.msie && parseInt($.browser.version) <= 6) ? \"\"\r\n");
      out.write("\t\t\t\t\t: \"fast\"\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tdata : {\r\n");
      out.write("\t\t\tkey : {\r\n");
      out.write("\t\t\t\tname : \"name\"\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tsimpleData : {\r\n");
      out.write("\t\t\t\tenable : true,\r\n");
      out.write("\t\t\t\tidKey : \"id\",\r\n");
      out.write("\t\t\t\tpIdKey : \"parid\",\r\n");
      out.write("\t\t\t\trootPId : \"\"\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tcallback : {\r\n");
      out.write("\t\t\t// \t\t\t\tbeforeExpand: beforeExpand,\r\n");
      out.write("\t\t\t// \t\t\t\tonExpand: onExpand,\r\n");
      out.write("\t\t\tonClick : zTreeOnClick\r\n");
      out.write("\t\t}\r\n");
      out.write("\t};\r\n");
      out.write("\r\n");
      out.write("\t/** 用于捕获节点被点击的事件回调函数  **/\r\n");
      out.write("\tfunction zTreeOnClick(event, treeId, treeNode) {\r\n");
      out.write("\t\tvar zTree = $.fn.zTree.getZTreeObj(\"dleft_tab1\");\r\n");
      out.write("\t\tzTree.expandNode(treeNode, null, null, null, true);\r\n");
      out.write("\t\t// \t\tzTree.expandNode(treeNode);\r\n");
      out.write("\t\t// 规定：如果是父类节点，不允许单击操作\r\n");
      out.write("\t\tif (treeNode.isParent) {\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t// 如果节点路径为空或者为\"#\"，不允许单击操作\r\n");
      out.write("\t\tif (treeNode.menuUrl == \"\" || treeNode.menuUrl == \"#\") {\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t// 跳到该节点下对应的路径, 把当前资源ID(id)传到后台，写进Session\r\n");
      out.write("\t\t//$('#rightMain').attr('src', treeNode.menuUrl);\r\n");
      out.write("\t\trightMain(treeNode.menuUrl);\r\n");
      out.write("\r\n");
      out.write("\t\tif (treeNode.isParent) {\r\n");
      out.write("\t\t\t$('#here_area').html(\r\n");
      out.write("\t\t\t\t\t'当前位置：' + treeNode.getParentNode().name\r\n");
      out.write("\t\t\t\t\t\t\t+ '&nbsp;>&nbsp;<span style=\"color:#1A5CC6\">'\r\n");
      out.write("\t\t\t\t\t\t\t+ treeNode.name + '</span>');\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\t$('#here_area').html(\r\n");
      out.write("\t\t\t\t\t'当前位置：系统&nbsp;>&nbsp;<span style=\"color:#1A5CC6\">'\r\n");
      out.write("\t\t\t\t\t\t\t+ treeNode.name + '</span>');\r\n");
      out.write("\t\t}\r\n");
      out.write("\t};\r\n");
      out.write("\t\r\n");
      out.write("\tfunction rightMain(url){\r\n");
      out.write("\t\tif(url.startWith(\"/\")){\r\n");
      out.write("\t\t\turl = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"+url;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t$('#rightMain').attr('src', url);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tString.prototype.startWith = function(compareStr){\r\n");
      out.write("\t    return this.indexOf(compareStr) == 0;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t/* 切换主菜单 */\r\n");
      out.write("\tfunction switchTab(tabpage, tabid) {\r\n");
      out.write("\t\tvar oItem = document.getElementById(tabpage).getElementsByTagName(\"li\");\r\n");
      out.write("\t\tfor (var i = 0; i < oItem.length; i++) {\r\n");
      out.write("\t\t\tvar x = oItem[i];\r\n");
      out.write("\t\t\tx.className = \"\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t//$(document).ajaxStart(onStart).ajaxSuccess(onStop);\r\n");
      out.write("\t\t// 异步加载页签子菜单\r\n");
      out.write("\t\tloadMenu(tabid, 'dleft_tab1');\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\t\t//$(document).ajaxStart(onStart).ajaxSuccess(onStop);\r\n");
      out.write("\t\t/** 默认异步加载首菜单目录  **/\r\n");
      out.write("\t\tloadMenu(defaultMenu, \"dleft_tab1\");\r\n");
      out.write("\t\t// 默认展开所有节点\r\n");
      out.write("\t\tif (zTree) {\r\n");
      out.write("\t\t\t// 默认展开所有节点\r\n");
      out.write("\t\t\t//zTree.expandAll(true);\r\n");
      out.write("\t\t\tzTree.expandAll(false);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\tfunction loadMenu(tabid, treeObj) {\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\ttype:\"POST\",\r\n");
      out.write("\t\t\turl:ctx+\"/func_json.do?funcid=\"+tabid,\r\n");
      out.write("\t\t\tdataType : \"json\",\r\n");
      out.write("\t\t\tsuccess:function(data){\r\n");
      out.write("\t\t\t\tif(data != null){\r\n");
      out.write("\t\t\t\t\tvar str = JSON.stringify(data);\r\n");
      out.write("\t\t\t\t\t$.fn.zTree.init($(\"#\"+treeObj), setting, data);\r\n");
      out.write("\t\t\t\t\tzTree = $.fn.zTree.getZTreeObj(treeObj);\r\n");
      out.write("\t\t\t\t\tif( zTree ){\r\n");
      out.write("\t\t\t\t\t\tzTree.expandAll(false);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}); \r\n");
      out.write("\t}\r\n");
      out.write("\t//选择站点\r\n");
      out.write("\tfunction selectSite(contextPath){\r\n");
      out.write("\t\topenWindow('切换站点',contextPath+'/cms/siteSelect.do',500,0,'false');\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"top\">\r\n");
      out.write("\t\t<div id=\"top_logo\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/index\">党建服务平台</a></div>\r\n");
      out.write("\t\t<div id=\"top_links\">\r\n");
      out.write("\t\t\t<div id=\"top_op\">\r\n");
      out.write("\t\t\t\t<ul class=\"nav pull-right\">\r\n");
      out.write("\t\t\t\t\t<li class=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"btn dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"icon-white icon-user\"></i> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${current_user.name }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" <b class=\"caret\"></b></a>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\" onclick=\"rightMain('sysmg/userProfile.do')\">个人资料</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\" onclick=\"rightMain('sysmg/userPwd.do')\">密码设置</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"divider\"></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<ul class=\"nav pull-right\">\r\n");
      out.write("\t\t\t\t\t<li class=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"btn dropdown-toggle\" data-toggle=\"dropdown\"> <i class=\"icon-white icon-globe\"></i> \r\n");
      out.write("\t\t\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${wxapp.title }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<b class=\"caret\"></b>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"top_close\">\r\n");
      out.write("\t\t\t\t<a href=\"javascript:void(0);\" onclick=\"logout();\" target=\"_parent\"> \r\n");
      out.write("\t\t\t\t<img alt=\"退出系统\" title=\"退出系统\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/skin/images/common/close.jpg\" style=\"position: relative; top: 10px; left: 25px;\">\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- side menu start -->\r\n");
      out.write("\t<div id=\"side\">\r\n");
      out.write("\t\t<div id=\"left_menu\">\r\n");
      out.write("\t\t\t<ul id=\"left_menu_tab\" style=\"height: 200px;\">\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div id=\"nav_show\" style=\"position: absolute; bottom: 0px; padding: 10px;\">\r\n");
      out.write("\t\t\t\t<a href=\"javascript:;\" id=\"show_hide_btn\"> <img alt=\"显示/隐藏\" title=\"显示/隐藏\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/skin/images/common/nav_hide.png\" width=\"35\" height=\"35\">\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"left_menu_cnt\">\r\n");
      out.write("\t\t\t<div id=\"nav_module\">\r\n");
      out.write("\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/skin/images/common/module_1.png\" width=\"210\" height=\"58\" />\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"nav_resource\">\r\n");
      out.write("\t\t\t\t<ul id=\"dleft_tab1\" class=\"ztree\"></ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t//var ctx = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\";\r\n");
      out.write("\t\t$(function() {\r\n");
      out.write("\t\t\t$('#left_menu_tab li').click(function() {\r\n");
      out.write("\t\t\t\tvar index = $(this).index();\r\n");
      out.write("\t\t\t\t\t$(this).find('img').attr('src',\r\n");
      out.write("\t\t\t\t\t\t\tctx + '/static/skin/images/common/'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t+ (index + 1) + '_hover.jpg');\r\n");
      out.write("\t\t\t\t\t$(this).css({background : '#fff'});\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t/* $('#nav_module').find('img')\r\n");
      out.write("\t\t\t\t\t\t\t\t.attr('src',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tctx+ '/static/skin/images/common/module_'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ (index + 1) + '.png'); */\r\n");
      out.write("\t\t\t\t\t$('#left_menu_tab li')\r\n");
      out.write("\t\t\t\t\t\t\t.each(function(i, ele) {\r\n");
      out.write("\t\t\t\t\t\t\t\tif (i != index) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$(ele).find('img').attr('src',ctx + '/static/skin/images/common/'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ (i + 1)+ '.jpg');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$(ele).css({background : '#044599'});\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t// 显示侧边栏\r\n");
      out.write("\t\t\t\t\tswitchSysBar(true);\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t// 显示隐藏侧边栏\r\n");
      out.write("\t\t\t$(\"#show_hide_btn\").click(function() {\r\n");
      out.write("\t\t\t\tswitchSysBar();\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t/**隐藏或者显示侧边栏**/\r\n");
      out.write("\t\tfunction switchSysBar(flag) {\r\n");
      out.write("\t\t\tvar side = $('#side');\r\n");
      out.write("\t\t\tvar left_menu_cnt = $('#left_menu_cnt');\r\n");
      out.write("\t\t\tif (flag == true) { // flag==true\r\n");
      out.write("\t\t\t\tleft_menu_cnt.show(500, 'linear');\r\n");
      out.write("\t\t\t\tside.css({\r\n");
      out.write("\t\t\t\t\twidth : '280px'\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t$('#top_nav').css({\r\n");
      out.write("\t\t\t\t\twidth : '77%',\r\n");
      out.write("\t\t\t\t\tleft : '304px'\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t$('#main').css({\r\n");
      out.write("\t\t\t\t\tleft : '280px'\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\tif (left_menu_cnt.is(\":visible\")) {\r\n");
      out.write("\t\t\t\t\tleft_menu_cnt.hide(10, 'linear');\r\n");
      out.write("\t\t\t\t\tside.css({\r\n");
      out.write("\t\t\t\t\t\twidth : '60px'\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t$('#top_nav').css({\r\n");
      out.write("\t\t\t\t\t\twidth : '100%',\r\n");
      out.write("\t\t\t\t\t\tleft : '60px',\r\n");
      out.write("\t\t\t\t\t\t'padding-left' : '28px'\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t$('#main').css({\r\n");
      out.write("\t\t\t\t\t\tleft : '60px'\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t$(\"#show_hide_btn\").find('img').attr('src',\r\n");
      out.write("\t\t\t\t\t\t\tctx + '/static/skin/images/common/nav_show.png');\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\tleft_menu_cnt.show(500, 'linear');\r\n");
      out.write("\t\t\t\t\tside.css({\r\n");
      out.write("\t\t\t\t\t\twidth : '280px'\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t$('#top_nav').css({\r\n");
      out.write("\t\t\t\t\t\twidth : '77%',\r\n");
      out.write("\t\t\t\t\t\tleft : '304px',\r\n");
      out.write("\t\t\t\t\t\t'padding-left' : '0px'\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t$('#main').css({\r\n");
      out.write("\t\t\t\t\t\tleft : '280px'\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t$(\"#show_hide_btn\").find('img').attr('src',\r\n");
      out.write("\t\t\t\t\t\t\tctx + '/static/skin/images/common/nav_hide.png');\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"main\">\r\n");
      out.write("\t\t<iframe name=\"right\" id=\"rightMain\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/main.do\" frameborder=\"no\" scrolling=\"auto\" width=\"100%\" height=\"100%\" allowtransparency=\"true\" />\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${funcList }", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("func");
    _jspx_th_c_forEach_0.setVarStatus("status");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.index==0 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t<script>\r\n");
        out.write("\t\t\t\t\t\t\tvar defaultMenu=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${func.id }", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\";\r\n");
        out.write("\t\t\t\t\t\t</script>\r\n");
        out.write("\t\t\t\t\t\t<li id=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${func.id }", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" class=\"selected\" onClick=\"switchTab('left_menu_tab','");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${func.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("');\" title=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${func.name }", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"><img alt=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${func.name }", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" title=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${func.name }", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" src=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/static/skin/images/common/1_hover.jpg\" width=\"33\" height=\"31\"></li>\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.index!=0 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t<li id=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${func.id }", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" onClick=\"switchTab('left_menu_tab','");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${func.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("');\" title=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${func.name }", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"><img alt=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${func.name }", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" title=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${func.name }", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" src=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/static/skin/images/common/");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.index+1 }", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(".jpg\" width=\"33\" height=\"31\"></li>\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }
}
