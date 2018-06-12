package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/html\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/common/css/login.css\">\n");
      out.write("\n");
      out.write("<!--[if IE]>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"https://res.wx.qq.com/mpres/htmledition/style/wxm_ie1c6cc2.css\"/>\n");
      out.write("  <![endif]-->\n");
      out.write("<title>党建服务平台</title>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("if(window !=top){  \n");
      out.write("    top.location.href=location.href;  \n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div id=\"header\">\n");
      out.write("\t\t<div class=\"wrapper1\" style=\"margin-left:0px;\">\n");
      out.write("\t\t\t<a href=\"#\" class=\"dib\"><h1><font style=\"color: #DF0404\">“O2O”党建微信服务平台</font></h1><!-- <img src=\"./login/logo.png\"> --></a>\n");
      out.write("\t\t\t<span class=\"hd_login_info\"> </span>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"banner\">\n");
      out.write("\t\t<div class=\"wrapper\">\n");
      out.write("\t\t\t<div class=\"login-panel\">\n");
      out.write("\t\t\t\t<h3>登录</h3>\n");
      out.write("\t\t\t\t<div class=\"login-mod\">\n");
      out.write("\t\t\t\t\t<div class=\"login-err-panel dn\" id=\"err_area\">\n");
      out.write("\t\t\t\t\t\t<span class=\"icon-wrapper\">\n");
      out.write("\t\t\t\t\t\t<i class=\"icon24-login err\" style=\"margin-top: -.2em; *margin-top: 0;\"></i>&nbsp;&nbsp;&nbsp;&nbsp;</span>\n");
      out.write("\t\t\t\t\t\t<span id=\"err_tips\"></span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<form class=\"login-form\" id=\"login-form\" method=\"post\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/login.do\" onsubmit=\"return submitForm();\">\n");
      out.write("\t\t\t\t\t\t<div class=\"login-un\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"icon-wrapper\"><i class=\"icon24-login un\"></i></span>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" id=\"username\" name=\"username\" maxlength=\"20\"\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"登陆账号\" autocomplete=\"off\" >\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"login-pwd\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"icon-wrapper\"><i class=\"icon24-login pwd\"></i></span>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"password\" id=\"password\" name=\"password\" placeholder=\"密码\" value=\"\" autocomplete=\"off\" maxlength=\"50\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"login-code-panel\" id=\"verify_area\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" id=\"captcha\" name=\"captcha\"\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"width: 70px\" placeholder=\"验证码\" value=\"\" maxlength=\"4\"> \n");
      out.write("\t\t\t\t\t\t\t<img id=\"kaptchaImage\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/kaptcha.do\"\n");
      out.write("\t\t\t\t\t\t\t\ttitle=\"点击重新获取验证码\" style=\"cursor: hand;vertical-align: middle;height: 40px;\"\n");
      out.write("\t\t\t\t\t\t\t\tonclick=\"this.src='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/kaptcha.do?date='+new Date();\"\n");
      out.write("\t\t\t\t\t\t\t\t/>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\n");
      out.write("\t\t\t\t\t\t<div class=\"login-help-panel\">\n");
      out.write("\t\t\t\t\t\t\t<input id=\"RememberMe\" class=\"login-remember-pwd\" type=\"checkbox\" name=\"rememberMe\" onclick=\"RememberMeClick()\" checked=\"checked\"/>\n");
      out.write("\t\t\t\t\t\t\t记住帐号\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\n");
      out.write("\t\t\t\t\t\t<div class=\"login-btn-panel\">\n");
      out.write("\t\t\t\t\t\t\t<button type=\"submit\" class=\"login-btn\" title=\"点击登录\" id=\"login_button\">登录</button>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"footer\">\n");
      out.write("\t\t<span>Copyright&nbsp;© 2013-2016 甘肃中通申信科技有限公司. All Rights Reserved.</span>\n");
      out.write("\t</div>\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/common/js/jquery-1.7.2.min.js\"></script>\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/common/js/cookie.js\"></script>\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/common/js/login.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\tvar error=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\";\n");
      out.write("\tif (error != \"\"){\n");
      out.write("\t\t$(\"#err_area\").removeClass(\"dn\");\n");
      out.write("\t\t$(\"#err_tips\").html(error); \n");
      out.write("\t}\n");
      out.write("\t</script>\n");
      out.write("</body>\n");
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
}
