package com.gsccs.cms.auth.service.impl;

import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.gsccs.cms.auth.dao.RoleFuncMapper;
import com.gsccs.cms.auth.dao.RoleOperMapper;
import com.gsccs.cms.auth.model.Func;
import com.gsccs.cms.auth.model.Oper;
import com.gsccs.cms.auth.model.RoleFunc;
import com.gsccs.cms.auth.model.RoleFuncExample;
import com.gsccs.cms.auth.model.RoleOper;
import com.gsccs.cms.auth.model.RoleOperExample;
import com.gsccs.cms.auth.model.RoleFuncExample.Criteria;
import com.gsccs.cms.auth.service.FuncService;
import com.gsccs.cms.auth.service.PermService;
import com.gsccs.cms.auth.service.RoleAuthService;


/**
 * 关于菜单、操作角色的相关服务
 * @author x.d zhang
 * 2013-12-8
 */
@Service
public class RoleAuthServiceImpl implements RoleAuthService{

	@Resource
	private RoleFuncMapper roleFuncMapper;
	@Resource
	private RoleOperMapper roleOperMapper;
	@Resource
	private FuncService funcService;
	@Resource
	private PermService operService;
	
	
	/**
	 * 检查是否有此记录
	 * @param roleid
	 * @param funcid
	 * @return
	 */
	public boolean haveRoleFunc(String roleid,String funcid){
		RoleFuncExample example=new RoleFuncExample();
		Criteria criteria=example.createCriteria();
		criteria.andFuncidEqualTo(funcid);
		criteria.andRoleidEqualTo(roleid);
		return roleFuncMapper.countByExample(example)>0;
	}
	
	
	/**
	 * 检查是否有此记录
	 * @param roleid
	 * @param funcid
	 * @return
	 */
	public RoleFunc findRoleFunc(String roleid,String funcid){
		RoleFuncExample example=new RoleFuncExample();
		Criteria criteria=example.createCriteria();
		criteria.andFuncidEqualTo(funcid);
		criteria.andRoleidEqualTo(roleid);
		List<RoleFunc> list=roleFuncMapper.selectByExample(example);
		if (list!=null && list.size()>0) {
			return list.get(0);
		}
		return null;
	}
	/**
	 * 添加权限
	 * @param roleid
	 * @param funcid
	 * @return
	 */
	public int addRoleFunc(String roleid,String funcid,String dataLevel){
		RoleFunc roleFunc=new RoleFunc();
		roleFunc.setFuncid(funcid);
		roleFunc.setRoleid(roleid);
		roleFunc.setId(UUID.randomUUID().toString());
		return roleFuncMapper.insert(roleFunc);
	}
	/**
	 * 删除权限
	 * @param roleid
	 * @param funcid
	 * @return
	 */
	public int delRoleFunc(String roleid,String funcid){
		RoleFuncExample example=new RoleFuncExample();
		Criteria criteria=example.createCriteria();
		criteria.andFuncidEqualTo(funcid);
		criteria.andRoleidEqualTo(roleid);
		return roleFuncMapper.deleteByExample(example);
	}
	/**
	 * 删除权限
	 * @param roleid
	 * @param funcid
	 * @return
	 */
	public int delRoleFunc(String roleid){
		RoleFuncExample example=new RoleFuncExample();
		Criteria criteria=example.createCriteria();
		criteria.andRoleidEqualTo(roleid);
		return roleFuncMapper.deleteByExample(example);
	}
	/**
	 * 更新
	 * @param roleFunc
	 * @return
	 */
	public int update(RoleFunc roleFunc){
		return roleFuncMapper.updateByPrimaryKey(roleFunc);
	}
	
	@Override
	public String createTreeAuth(HttpServletRequest request, String roleid,String userId) {
		StringBuffer html=new StringBuffer();
		if (StringUtils.isNotEmpty(roleid)) {
			//查询菜单
			List<Func> list = funcService.selectAllAuth(userId);
			//生成一级
			if (list!=null && list.size()>0) {
				boolean hasChildren=false;
				for (int i = 0; i < list.size(); i++) {
					if (StringUtils.isEmpty(list.get(i).getParid())) {
						hasChildren=false;
						List<Oper> operList = operService.findByFunc(list.get(i).getId());
						html.append("<tr treeItemLevel='1'>");
						html.append("<td><input "+(haveRoleFunc(roleid, list.get(i).getId())?"checked":"")+" onclick='treeIdCheck(\""+list.get(i).getId()+"\")' type='checkbox' name='ids' value='"+list.get(i).getId()+"' id='"+list.get(i).getId()+"'/></td>");
						
						html.append("<td>");
						if (funcService.haveSon(list.get(i).getId())) {
							hasChildren=true;
							html.append("<img align='absmiddle' style='cursor:pointer' onClick='displayChildren(this);' isAjax='false' isOpen='true' id='"+list.get(i).getId()+"' src='"+request.getContextPath()+"/static/tree/image/minus.gif' />");
						}else {
							html.append("<img align='absmiddle' src='"+request.getContextPath()+"/static/tree/image/empty.gif' />");
						}
						html.append("<img align='absmiddle' border='0' src='"+request.getContextPath()+"/static/tree/image/folder.gif' />&nbsp;");
						html.append(list.get(i).getName());
						html.append("</td>");
						html.append("<td>");
						if (null != operList && operList.size()>0){
							for (int j=0;j<operList.size();j++){
								html.append("<input "+(haveRoleOper(roleid, operList.get(j).getId())?"checked":"")+" onclick='treeIdCheck(\""+operList.get(j).getId()+"\")' type='checkbox' name='operids' value='"+operList.get(j).getId()+"' id='"+operList.get(j).getId()+"'/>");
								html.append(operList.get(j).getName());
							}
						}
						html.append("&nbsp;</td>");
						html.append("</tr>");
						if (hasChildren) {
							//处理子级
							createTreeSon(request,list, list.get(i).getId(),roleid, html,2,list.get(i).getId());
						}
					}
				}
			}
		}
		return html.toString();
	}
	
	/**
	 * 生成授权树
	 * @param roleid
	 * @return
	 */
	public String createTree(HttpServletRequest request,String roleid){
		StringBuffer html=new StringBuffer();
		if (StringUtils.isNotEmpty(roleid)) {
			//查询菜单 
			List<Func> list = funcService.selectAll("1");
			//生成一级
			if (list!=null && list.size()>0) {
				boolean hasChildren=false;
				for (int i = 0; i < list.size(); i++) {
					if (StringUtils.isEmpty(list.get(i).getParid())) {
						hasChildren=false;
						List<Oper> operList = operService.findByFunc(list.get(i).getId());
						html.append("<tr treeItemLevel='1'>");
						html.append("<td><input "+(haveRoleFunc(roleid, list.get(i).getId())?"checked":"")+" onclick='treeIdCheck(\""+list.get(i).getId()+"\")' type='checkbox' name='ids' value='"+list.get(i).getId()+"' id='"+list.get(i).getId()+"'/></td>");
						
						html.append("<td>");
						if (funcService.haveSon(list.get(i).getId())) {
							hasChildren=true;
							html.append("<img align='absmiddle' style='cursor:pointer' onClick='displayChildren(this);' isAjax='false' isOpen='true' id='"+list.get(i).getId()+"' src='"+request.getContextPath()+"/static/tree/image/minus.gif' />");
						}else {
							html.append("<img align='absmiddle' src='"+request.getContextPath()+"/static/tree/image/empty.gif' />");
						}
						html.append("<img align='absmiddle' border='0' src='"+request.getContextPath()+"/static/tree/image/folder.gif' />&nbsp;");
						html.append(list.get(i).getName());
						html.append("</td>");
						html.append("<td>");
						if (null != operList && operList.size()>0){
							for (int j=0;j<operList.size();j++){
								html.append("<input "+(haveRoleOper(roleid, operList.get(j).getId())?"checked":"")+" onclick='treeIdCheck(\""+operList.get(j).getId()+"\")' type='checkbox' name='operids' value='"+operList.get(j).getId()+"' id='"+operList.get(j).getId()+"'/>");
								html.append(operList.get(j).getName());
							}
						}
						html.append("&nbsp;</td>");
						html.append("</tr>");
						if (hasChildren) {
							//处理子级
							createTreeSon(request,list, list.get(i).getId(),roleid, html,2,list.get(i).getId());
						}
					}
				}
			}
		}
		return html.toString();
	}
	/**
	 * 生成授权树
	 * @param roleid
	 * @return
	 */
	public String createTreeSon(HttpServletRequest request,List<Func> list,String pid,String roleid,StringBuffer html,int treeItemLevel,String pidpath){
		if (StringUtils.isNotEmpty(roleid)) {
			//生成子级
			if (list!=null && list.size()>0) {
				boolean hasChildren=false;
				for (int i = 0; i < list.size(); i++) {
					if (pid.equals((list.get(i).getParid()))) {
						hasChildren=false;
						List<Oper> operList = operService.findByFunc(list.get(i).getId());
						html.append("<tr treeItemLevel='"+treeItemLevel+"'>");
						html.append("<td><input "+(haveRoleFunc(roleid, list.get(i).getId())?"checked":"")+" onclick='treeIdCheck(\""+pidpath+"_"+list.get(i).getId()+"\")'  type='checkbox' name='ids' value='"+list.get(i).getId()+"' id='"+pidpath+"_"+list.get(i).getId()+"'/></td>");
						html.append("<td>");
						for (int j = 1; j < treeItemLevel; j++) {
							html.append("<img align='absmiddle' src='"+request.getContextPath()+"/static/tree/image/empty.gif' />");
						}
						if (funcService.haveSon(list.get(i).getId())) {
							hasChildren=true;
							html.append("<img align='absmiddle' style='cursor:pointer' onClick='displayChildren(this);' isAjax='false' isOpen='true' id='"+list.get(i).getId()+"' src='"+request.getContextPath()+"/static/tree/image/minus.gif' />");
						}else {
							html.append("<img align='absmiddle' src='"+request.getContextPath()+"/static/tree/image/empty.gif' />");
						}
						html.append("<img align='absmiddle' border='0' src='"+request.getContextPath()+"/static/tree/image/folder.gif' />&nbsp;");
						html.append(list.get(i).getName());
						html.append("</td>");
						html.append("<td>");
						if (null != operList && operList.size()>0){
							for (int j=0;j<operList.size();j++){
								html.append("<input "+(haveRoleOper(roleid, operList.get(j).getId())?"checked":"")+" onclick='treeIdCheck(\""+operList.get(j).getId()+"\")' type='checkbox' name='operids' value='"+operList.get(j).getId()+"' id='"+operList.get(j).getId()+"'/>");
								html.append(operList.get(j).getName());
							}
						}
						html.append("&nbsp;</td>");
						html.append("</tr>");
						if (hasChildren) {
							//处理子级
							createTreeSon(request,list, list.get(i).getId(),roleid, html,treeItemLevel+1,pidpath+"_"+list.get(i).getId());
						}
					}
				}
			}
		}
		return html.toString();
	}
	
	@Override
	public boolean haveRoleOper(String roleid, String operid) {
		RoleOperExample example=new RoleOperExample();
		RoleOperExample.Criteria criteria=example.createCriteria();
		criteria.andOperidEqualTo(operid);
		criteria.andRoleidEqualTo(roleid);
		return roleOperMapper.countByExample(example)>0;
	}
	
	@Override
	public RoleOper findRoleOper(String roleid, String operid) {
		RoleOperExample example=new RoleOperExample();
		RoleOperExample.Criteria criteria=example.createCriteria();
		criteria.andOperidEqualTo(operid);
		criteria.andRoleidEqualTo(roleid);
		List<RoleOper> list=roleOperMapper.selectByExample(example);
		if (list!=null && list.size()>0) {
			return list.get(0);
		}
		return null;
	}
	@Override
	public int addRoleOper(String roleid, String operid) {
		RoleOper roleOper=new RoleOper();
		roleOper.setOperid(operid);
		roleOper.setRoleid(roleid);
		roleOper.setId(UUID.randomUUID().toString());
		return roleOperMapper.insert(roleOper);
	}
	@Override
	public int delRoleOper(String roleid, String operid) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int update(RoleOper roleOper) {
		return 0;
	}
	
	@Override
	public int delRoleOper(String roleid) {
		RoleOperExample example=new RoleOperExample();
		RoleOperExample.Criteria criteria=example.createCriteria();
		criteria.andRoleidEqualTo(roleid);
		return roleOperMapper.deleteByExample(example);
	}
	
	public RoleFuncMapper getRoleFuncMapper() {
		return roleFuncMapper;
	}
	public void setRoleFuncMapper(RoleFuncMapper roleFuncMapper) {
		this.roleFuncMapper = roleFuncMapper;
	}


	


	
}
