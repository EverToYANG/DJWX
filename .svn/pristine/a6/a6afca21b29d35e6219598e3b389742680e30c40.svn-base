package com.gsccs.cms.controller.auth;

import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gsccs.cms.auth.model.Oper;
import com.gsccs.cms.auth.model.Users;
import com.gsccs.cms.auth.service.OperlogService;
import com.gsccs.cms.auth.service.PermService;
import com.gsccs.cms.auth.shiro.annotation.CurrentUser;
import com.gsccs.cms.bass.controller.BaseController;
import com.gsccs.cms.bass.exception.AuthException;
import com.gsccs.cms.bass.exception.SiteCheckException;
import com.gsccs.cms.bass.utils.ResponseUtil;

/**
 * 操作按钮管理相关操作
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
@Controller
@RequestMapping("/sysmg")
public class OperButtonController extends BaseController {

	@Resource
	private PermService operbuttonService;
	@Resource
	private OperlogService operlogService;

	/**
	 * 操作按钮管理页面
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/operbutton.do")
	public String operbutton(String funcid, ModelMap map,
			HttpServletResponse response) {
		map.put("list", operbuttonService.findByFunc(funcid));
		return "sysmg/operbutton";
	}

	/**
	 * 操作按钮添加
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/operbuttonAdd.do")
	public String operbuttonAdd(Oper operbutton,
			HttpServletRequest request, ModelMap map,
			HttpServletResponse response){
		String id = "", result = "0", msg = "";
		try {
			msg = "添加操作按钮 " + operbutton.getName() + " ";
			// 判断名称是否存在
			if (operbuttonService.haveName(operbutton.getFunc(),
					operbutton.getName())) {
				msg = "此操作按钮名称已存在!";
			} else {
				operbutton.setCode(operbutton.getCode().replace("<参数>", "&"));
				operbutton.setName(operbutton.getName().replace("<参数>", "&"));
				operbutton.setId(UUID.randomUUID().toString());
				operbuttonService.insert(operbutton);
				result = "1";
				msg += "成功";
				id = "<属性>" + operbutton.getId();
			}
		} catch (Exception e) {
			result = "0";
			msg += "失败:" + e.toString();
		}
		ResponseUtil.writeUTF(response, result + msg + id);
		return null;
	}

	/**
	 * 操作按钮编辑
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/operbuttonUpdate.do")
	public String operbuttonUpdate(Oper operbutton,
			HttpServletRequest request, ModelMap map,
			HttpServletResponse response){
		String id = "", result = "0", msg = "";
		try {
			msg = "修改操作按钮 " + operbutton.getName() + " ";
			// 获取老数据
			Oper old = operbuttonService.findById(operbutton.getId());
			if (old != null) {
				// 判断名称是否有变化
				if (!old.getName().equals(operbutton.getName())) {
					// 有变化则判断是否已存在
					if (operbuttonService.haveName(old.getFunc(),
							operbutton.getName())) {
						msg = "此操作按钮名称已存在!";
						ResponseUtil.writeUTF(response, result + msg);
						return null;
					}
				}
				operbutton.setCode(operbutton.getCode().replace("<参数>", "&"));
				operbutton.setName(operbutton.getName().replace("<参数>", "&"));
				operbuttonService.update(operbutton);
				result = "1";
				msg += "成功";
			} else {
				msg = "此操作按钮不存在!";
				ResponseUtil.writeUTF(response, result + msg);
				return null;
			}
		} catch (Exception e) {
			result = "0";
			msg += "失败:" + e.toString();
		}
		ResponseUtil.writeUTF(response, result + msg + id);
		return null;
	}

	/**
	 * 操作按钮删除
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/operbuttonDel.do")
	public String operbuttonDel(Oper operbutton,
			HttpServletRequest request, ModelMap map,
			HttpServletResponse response) {
		String id = "", result = "0", msg = "";
		try {
			msg = "删除操作按钮 " + operbutton.getName() + " ";
			operbuttonService.delete(operbutton.getId());
			result = "1";
			msg += "成功";
			id = "<属性>" + operbutton.getId();
		} catch (Exception e) {
			result = "0";
			msg += "失败:" + e.toString();
		}
		ResponseUtil.writeUTF(response, result + msg + id);
		return null;
	}
}
