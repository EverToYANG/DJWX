package com.gsccs.cms.bass.tag;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;

import org.springframework.stereotype.Component;

import com.gsccs.cms.auth.model.Oper;
import com.gsccs.cms.auth.service.PermService;
import com.gsccs.cms.bass.utils.OperButtonUtil;
import com.gsccs.cms.bass.utils.SpringContextUtil;

/**
 * 操作按钮标签
 * 
 * @author x.d zhang
 * @version 1.0
 */
@Component
public class OperButtonTag extends BaseTag {

	private String buttonAttr = " class=\"btn\" ";
	private String buttonName;

	public int doStartTag() throws JspException {
		try {
			// 判断是否有pageFuncId参数
			HttpServletRequest request = getRequest();
			if (request.getParameter("pageFuncId") != null
					&& request.getParameter("pageFuncId").trim().length() > 0) {
				String pageFuncId = request.getParameter("pageFuncId").trim();
				// 先查找session中是否已存在
				Oper button = OperButtonUtil.getButton(pageFuncId, buttonName,
						request);
				// button为null并且session中并没保存funcid则得重新提取
				if (button == null
						&& !OperButtonUtil.haveFunc(pageFuncId, request)) {
					// 未存在则重新读取
					List<Oper> buttonList = null;
					PermService operbuttonService = (PermService) SpringContextUtil
							.getBean("operService");
					buttonList = operbuttonService.findByFuncOk(pageFuncId);
					if (buttonList != null && buttonList.size() > 0) {
						Oper operbutton;
						// 输出操作按钮
						for (int i = 0; i < buttonList.size(); i++) {
							operbutton = buttonList.get(i);
							if (operbutton != null) {
								if (operbutton.getName().equals(buttonName)) {
									button = operbutton;
								}
							}
						}
					}
					// 设置到session
					OperButtonUtil.setButtons(pageFuncId, buttonList, request);
				}
				if (button != null) {
					StringBuilder sBuilder = new StringBuilder();
					// 输出操作按钮
					sBuilder.append("<button onclick=\"");
					sBuilder.append(button.getCode());
					sBuilder.append("\" class=\"btn " + button.getCss() + "\" ");
					sBuilder.append(buttonAttr);
					sBuilder.append(" />");
					sBuilder.append(button.getName());
					sBuilder.append("</button>");
					pageContext.getOut().println(sBuilder.toString());
				}

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
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

	public String getButtonName() {
		return buttonName;
	}

	public void setButtonName(String buttonName) {
		this.buttonName = buttonName;
	}
}