package com.gsccs.cms.bass.tag;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Component;

import com.gsccs.cms.auth.model.Oper;
import com.gsccs.cms.auth.service.PermService;
import com.gsccs.cms.bass.utils.OperButtonUtil;
import com.gsccs.cms.bass.utils.SpringContextUtil;

/**
 * 操作按钮列表标签
 * 
 * @author x.d zhang
 * @version 1.0
 */
@Component
public class OperButtonsTag extends BaseTag {

	private String buttonAttr = "";

	private String split = "&nbsp;";

	public int doStartTag() throws JspException {
		try {
			// 判断是否有pageFuncId参数
			HttpServletRequest request = getRequest();
			if (request.getParameter("pageFuncId") != null
					&& request.getParameter("pageFuncId").trim().length() > 0) {
				String pageFuncId = request.getParameter("pageFuncId").trim();
				// request.getSession().getAttribute("");
				Subject subject = SecurityUtils.getSubject();
				// 先查找session中是否已存在
				List<Oper> buttons = OperButtonUtil.getButtons(pageFuncId,
						request);
				if (buttons == null || buttons.size() == 0) {
					buttons = new ArrayList<Oper>();
					// 未存在则重新读取
					List<Oper> buttonList = null;
					PermService operService = (PermService) SpringContextUtil
							.getBean("operService");
					// if (isWebSysteLogin()) {
					buttons = operService.findByFuncOk(pageFuncId);
					// .findByFunc(pageFuncId, "");
					// }else {
					// buttons=operbuttonService.findByAuth(pageFuncId,
					// getLoginUser().getId());
					// }
					// 设置到session
					OperButtonUtil.setButtons(pageFuncId, buttons, request);
				}
				if (buttons != null && buttons.size() > 0) {
					StringBuilder sBuilder = new StringBuilder();
					Oper operbutton;
					// 输出操作按钮
					for (int i = 0; i < buttons.size(); i++) {
						operbutton = buttons.get(i);
						if (operbutton != null) {
							if (i > 0) {
								sBuilder.append(split);
							}
							sBuilder.append("<button  onclick=\"");
							sBuilder.append(operbutton.getCode());
							sBuilder.append("\" class=\"btn "
									+ operbutton.getCss() + "\" ");
							sBuilder.append(buttonAttr);
							sBuilder.append(" >");
							sBuilder.append(operbutton.getName());
							sBuilder.append("</button>");
						}
					}
					pageContext.getOut().println(sBuilder.toString());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return this.SKIP_BODY;
	}

	public String getButtonAttr() {
		return buttonAttr;
	}

	public void setButtonAttr(String buttonAttr) {
		this.buttonAttr = buttonAttr;
	}

	public String getSplit() {
		return split;
	}

	public void setSplit(String split) {
		this.split = split;
	}
}