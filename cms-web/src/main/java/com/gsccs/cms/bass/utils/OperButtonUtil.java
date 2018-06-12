package com.gsccs.cms.bass.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.gsccs.cms.auth.model.Oper;

/**
 * 关于操作按钮一些常用操作
 * 
 * @author x.d zhang 
 * @version 2.0
 */
public class OperButtonUtil {

	/**
	 * 根据菜单获取操作按钮列表
	 */
	public static List<Oper> getButtons(String funcId,
			HttpServletRequest request) {
		if (funcId != null && funcId.trim().length() > 0 && request != null) {
			// 判断session中是否含有operButtons
			HttpSession session = request.getSession();
			if (session.getAttribute("operButtons") != null) {
				Map<String, List<Oper>> operButtons = (Map<String, List<Oper>>) session
						.getAttribute("operButtons");
				// 判断是否包含funcId的值
				if (operButtons != null && operButtons.containsKey(funcId)) {
					// 返回session中保存的操作按钮
					return operButtons.get(funcId);
				}
			}
		}
		return null;
	}

	/**
	 * 根据菜单,操作按钮名获取操作按钮
	 */
	public static Oper getButton(String funcId, String buttonName,
			HttpServletRequest request) {
		if (funcId != null && funcId.trim().length() > 0 && request != null
				&& buttonName != null && buttonName.trim().length() > 0) {
			// 判断session中是否含有operButtons
			HttpSession session = request.getSession();
			if (session.getAttribute("operButtons") != null) {
				Map<String, List<Oper>> operButtons = (Map<String, List<Oper>>) session
						.getAttribute("operButtons");
				// 判断是否包含funcId的值
				if (operButtons != null && operButtons.containsKey(funcId)) {
					// 判断是否有此操作按钮
					List<Oper> buttonList = operButtons.get(funcId);
					if (buttonList != null && buttonList.size() > 0) {
						// 返回操作按钮
						for (int i = 0; i < buttonList.size(); i++) {
							if (buttonList.get(i).getName().equals(buttonName)) {
								return buttonList.get(i);
							}
						}
					}
				}
			}
		}
		return null;
	}

	/**
	 * 根据菜单设置操作按钮列表
	 */
	public static void setButtons(String funcId, List<Oper> buttons,
			HttpServletRequest request) {
		if (funcId != null && funcId.trim().length() > 0 && request != null
				&& buttons != null) {
			// 判断session中是否含有operButtons
			HttpSession session = request.getSession();
			Map<String, List<Oper>> operButtons = null;
			if (session.getAttribute("operButtons") != null) {
				operButtons = (Map<String, List<Oper>>) session
						.getAttribute("operButtons");
			} else {
				operButtons = new HashMap<String, List<Oper>>();
			}
			operButtons.put(funcId, buttons);
			session.setAttribute("operButtons", operButtons);
		}
	}

	/**
	 * 判断是否已包含funcid
	 * 
	 * @param funcId
	 * @param request
	 * @return
	 */
	public static boolean haveFunc(String funcId, HttpServletRequest request) {
		if (funcId != null && funcId.trim().length() > 0 && request != null) {
			// 判断session中是否含有operButtons
			HttpSession session = request.getSession();
			if (session.getAttribute("operButtons") != null) {
				Map<String, List<Oper>> operButtons = (Map<String, List<Oper>>) session
						.getAttribute("operButtons");
				// 判断是否包含funcId的值
				if (operButtons != null && operButtons.containsKey(funcId)) {
					return true;
				}
			}
		}
		return false;
	}
}
