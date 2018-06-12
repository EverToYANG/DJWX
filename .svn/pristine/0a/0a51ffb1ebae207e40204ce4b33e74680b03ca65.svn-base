package com.gsccs.cms.auth.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.gsccs.cms.auth.dao.FuncMapper;
import com.gsccs.cms.auth.model.Func;
import com.gsccs.cms.auth.model.FuncExample;
import com.gsccs.cms.auth.model.Msg;
import com.gsccs.cms.auth.model.FuncExample.Criteria;
import com.gsccs.cms.auth.service.FuncService;

/**
 * 功能菜单相关服务
 * 
 * @author x.d zhang
 * @version 1.0
 */
@Service
public class FuncServiceImpl implements FuncService {

	@Resource
	private FuncMapper funcMapper;
	private Func func;

	/**
	 * 判断是否有子菜单
	 * 
	 * @param parId
	 * @return
	 */
	public boolean haveSon(String parId) {
		FuncExample example = new FuncExample();
		Criteria criteria = example.createCriteria();
		criteria.andParidEqualTo(parId);
		return funcMapper.countByExample(example) > 0;
	}

	/**
	 * 查询根菜单
	 * 
	 * @return
	 */
	public List<Func> selectRoot() {
		return funcMapper.selectRoot();
	}

	/**
	 * 查询所有
	 * 
	 * @return
	 */
	public List<Func> selectAll(String isok) {
		FuncExample example = new FuncExample();
		Criteria criteria = example.createCriteria();
		if (StringUtils.isNotEmpty(isok)) {
			criteria.andIsokEqualTo(isok);
		}
		example.setOrderByClause(" ordernum ");
		return funcMapper.selectByExample(example);
	}

	/**
	 * 查询所有有权限的
	 * 
	 * @return
	 */
	public List<Func> selectAllAuth(String userid) {
		return funcMapper.selectAllAuth(userid);
	}

	/**
	 * 根据用户查询根菜单
	 * 
	 * @return
	 */
	public List<Func> selectRootAuth(String userid) {
		return funcMapper.selectRootAuth(userid);
	}

	/**
	 * 查询根菜单
	 * 
	 * @return
	 */
	public List<Func> selectByParid(String par) {
		return funcMapper.selectByParid(par);
	}

	/**
	 * 根据查询根菜单
	 * 
	 * @return
	 */
	public List<Func> selectByParidAuth(String par, String userid) {
		FuncExample example = new FuncExample();
		example.setParid(par);
		example.setUserid(userid);
		return funcMapper.selectByParidAuth(example);
	}

	/**
	 * 根据id查询菜单
	 * 
	 * @return
	 */
	public Func selectById(String id) {
		return funcMapper.selectByPrimaryKey(id);
	}

	/**
	 * 更新
	 * 
	 * @param func
	 */
	public void update(Func func) {
		funcMapper.updateByPrimaryKey(func);
	}

	/**
	 * 更新所属菜单
	 * 
	 * @param func
	 */
	public void updatePar(Func func) {
		funcMapper.updatePar(func);
	}

	/**
	 * 添加
	 * 
	 * @param func
	 */
	public void insert(Func func) {
		funcMapper.insert(func);
	}

	/**
	 * 递归删除
	 * 
	 * @param id
	 */
	public void delete(String id) {
		// 先看是否有子菜单
		List<Func> sons = funcMapper.selectByParid(id);
		if (sons != null && sons.size() > 0) {
			// 删除子菜单
			for (int i = 0; i < sons.size(); i++) {
				delete(sons.get(i).getId());
			}
		}
		// 删除当前菜单
		funcMapper.deleteByPrimaryKey(id);
	}

	/**
	 * 根据菜单id获取所有父级菜单
	 * 
	 * @param funcId
	 * @param funcList
	 * @return
	 */
	public List<Func> getPars(String funcId, List<Func> funcList) {
		if (funcList == null) {
			funcList = new ArrayList<Func>();
		}
		// 获取funcId的父级菜单
		func = funcMapper.selectParById(funcId);
		if (func != null) {
			// 添加到list
			funcList.add(func);
			// 递归处理
			getPars(func.getId(), funcList);
		}
		return funcList;
	}

	/**
	 * 根据菜单id获取所有父级菜单(从session中提取数据)
	 * 
	 * @param funcId
	 * @param funcList
	 * @return
	 */
	public List<Func> getPars(HttpSession session, String funcId,
			List<Func> funcList) {
		if (funcList == null) {
			funcList = new ArrayList<Func>();
		}
		if (session.getAttribute("funcs") != null) {
			List<Func> funcs = (List<Func>) session.getAttribute("funcs");
			if (funcs != null && funcs.size() > 0) {
				for (Func func : funcs) {
					if (funcId.equals(func.getId())) {
						if (StringUtils.isNotEmpty(func.getParid())) {
							// 递归处理
							getPars(session, func.getParid(), funcList);
						}
						// 添加到list
						funcList.add(func);
					}
				}
			}
		}
		return funcList;
	}

	/**
	 * 根据菜单id获取所有子级菜单
	 * 
	 * @param funcId
	 * @param funcList
	 * @return
	 */
	public List<Func> getSons(String funcId, List<Func> funcList, Integer level) {
		level = null == level ? 1 : level;
		if (funcList == null) {
			funcList = new ArrayList<Func>();
		}
		// 获取funcId的子级菜单
		FuncExample example = new FuncExample();
		Criteria criteria = example.createCriteria();
		criteria.andParidEqualTo(funcId);
		List<Func> sonList = funcMapper.selectByExample(example);
		if (sonList != null && sonList.size() > 0) {
			for (int i = 0; i < sonList.size(); i++) {
				// 添加到list
				sonList.get(i).setLevel(level);
				;
				funcList.add(sonList.get(i));
				// 递归处理
				getSons(sonList.get(i).getId(), funcList, level + 1);
			}
		}
		return funcList;
	}

	/**
	 * 下降
	 */
	public void down(Func func) {
		if (func != null) {
			// 查询同级别下面第一个菜单的排序
			Func func2 = new Func();
			func2.setParid(func.getParid());
			if (StringUtils.isEmpty(func.getParid())) {
				func2.setParid("root");
			}
			func2.setSql(" id<>'" + func.getId() + "' and ordernum>="
					+ func.getOrdernum());
			List<Func> funcList = find(func2, " ordernum ", 1, 1);
			if (funcList != null && funcList.size() > 0) {
				Func nextFunc = funcList.get(0);
				if (nextFunc != null) {
					if (nextFunc.getOrdernum().equals(func.getOrdernum())) {
						func.setOrdernum(nextFunc.getOrdernum() + 1);
					} else {
						int nextNum = nextFunc.getOrdernum();
						nextFunc.setOrdernum(func.getOrdernum());
						func.setOrdernum(nextNum);
					}
					update(func);
					update(nextFunc);
				}
			}
		}
	}

	/**
	 * 上升
	 */
	public void up(Func func) {
		if (func != null) {
			// 查询同级别上面第一个菜单的排序
			Func func2 = new Func();
			func2.setParid(func.getParid());
			if (StringUtils.isEmpty(func.getParid())) {
				func2.setParid("root");
			}
			func2.setSql(" id<>'" + func.getId() + "' and ordernum<="
					+ func.getOrdernum());
			List<Func> funcList = find(func2, " ordernum desc ", 1, 1);
			if (funcList != null && funcList.size() > 0) {
				Func nextFunc = funcList.get(0);
				if (nextFunc != null) {
					if (nextFunc.getOrdernum().equals(func.getOrdernum())) {
						func.setOrdernum(nextFunc.getOrdernum() - 1);
					} else {
						int nextNum = nextFunc.getOrdernum();
						nextFunc.setOrdernum(func.getOrdernum());
						func.setOrdernum(nextNum);
					}
					update(func);
					update(nextFunc);
				}
			}
		}
	}

	/**
	 * 获取同级最大排序号
	 * 
	 * @param parid
	 * @return
	 */
	public int maxNum(String parid) {
		Func func = new Func();
		func.setParid(parid);
		if (StringUtils.isEmpty(parid)) {
			func.setParid("root");
		}
		List<Func> funcList = find(func, "ordernum desc", 1, 1);
		if (funcList != null && funcList.size() > 0) {
			func = funcList.get(0);
			return func.getOrdernum() + 1;
		}
		return 0;
	}

	/**
	 * 分页查询
	 */
	public List<Func> find(Func func, String order, int currPage, int pageSize) {
		FuncExample example = new FuncExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(func, criteria);
		if (order != null && order.trim().length() > 0) {
			example.setOrderByClause(order);
		}
		example.setCurrPage(currPage);
		example.setPageSize(pageSize);
		return funcMapper.selectPageByExample(example);
	}

	/**
	 * 处理查询条件
	 * 
	 * @param info
	 * @param criteria
	 */
	public void proSearchParam(Func func, Criteria criteria) {
		if (func != null) {
			if (StringUtils.isNotEmpty(func.getParid())) {
				if ("root".equals(func.getParid())) {
					criteria.andSql(" (parid is null or parid='') ");
				} else {
					criteria.andParidEqualTo(func.getParid());
				}
			}
			if (StringUtils.isNotEmpty(func.getSql())) {
				criteria.andSql(func.getSql());
			}
		}
	}

	/**
	 * 生成左侧菜单树
	 * 
	 * @param roleid
	 * @return
	 */
	public String createTree(HttpServletRequest request, String parid,
			List<Func> list) {
		StringBuffer html = new StringBuffer();
		// 生成一级
		if (list != null && list.size() > 0) {
			boolean hasChildren = false;
			for (int i = 0; i < list.size(); i++) {
				if (parid.equals(list.get(i).getParid())) {
					hasChildren = false;
					html.append("<tr treeItemLevel='1'>");
					html.append("<td  style='width:100%'>");

					if (haveSon(list.get(i).getId())) {
						hasChildren = true;
						html.append("<img align='absmiddle' style='cursor:pointer' onClick='displayChildren(this);' isAjax='false' isOpen='false' id='"
								+ list.get(i).getId()
								+ "' src='"
								+ request.getContextPath()
								+ "/static/tree/image/plus.gif' />");
					} else {
						html.append("<img align='absmiddle' src='"
								+ request.getContextPath()
								+ "/static/tree/image/empty.gif' />");
					}
					html.append("<img align='absmiddle' border='0' src='"
							+ request.getContextPath()
							+ "/static/tree/image/folder.gif' />&nbsp;");
					if (StringUtils.isNotEmpty(list.get(i).getUrlpath())) {
						html.append("<a href='javascript:func(\""
								+ list.get(i).getUrlpath()
								+ (list.get(i).getUrlpath().indexOf("?") > 0 ? ""
										: "?") + "&pageFuncId="
								+ list.get(i).getId() + "\")'>");
						html.append(list.get(i).getName());
						html.append("</a>");
					} else {
						html.append(list.get(i).getName());
					}
					html.append("</td></tr>");
					if (hasChildren) {
						// 处理子级
						createTreeSon(request, list, list.get(i).getId(), html,
								2, list.get(i).getId());
					}
				}
			}
		}
		return html.toString();
	}

	/**
	 * 生成左侧菜单树
	 * 
	 * @param roleid
	 * @return
	 */
	public String createTreeSon(HttpServletRequest request, List<Func> list,
			String pid, StringBuffer html, int treeItemLevel, String pidpath) {
		// 生成子级
		if (list != null && list.size() > 0) {
			boolean hasChildren = false;
			for (int i = 0; i < list.size(); i++) {
				if (pid.equals((list.get(i).getParid()))) {
					hasChildren = false;
					html.append("<tr treeItemLevel='" + treeItemLevel
							+ "' style='display:none'>");
					html.append("<td style='width:100%'>");
					for (int j = 1; j < treeItemLevel; j++) {
						html.append("<img align='absmiddle' src='"
								+ request.getContextPath()
								+ "/static/tree/image/empty.gif' />");
					}
					if (haveSon(list.get(i).getId())) {
						hasChildren = true;
						html.append("<img align='absmiddle' style='cursor:pointer' onClick='displayChildren(this);' isAjax='false' isOpen='false' id='"
								+ list.get(i).getId()
								+ "' src='"
								+ request.getContextPath()
								+ "/static/tree/image/plus.gif' />");
					} else {
						html.append("<img align='absmiddle' src='"
								+ request.getContextPath()
								+ "/static/tree/image/empty.gif' />");
					}
					html.append("<img align='absmiddle' border='0' src='"
							+ request.getContextPath()
							+ "/static/tree/image/folder.gif' />&nbsp;");
					if (StringUtils.isNotEmpty(list.get(i).getUrlpath())) {
						html.append("<a href='javascript:func(\""
								+ list.get(i).getUrlpath()
								+ (list.get(i).getUrlpath().indexOf("?") > 0 ? ""
										: "?") + "&pageFuncId="
								+ list.get(i).getId() + "\")'>");
						html.append(list.get(i).getName());
						html.append("</a>");
					} else {
						html.append(list.get(i).getName());
					}
					html.append("</td></tr>");
					if (hasChildren) {
						// 处理子级
						createTreeSon(request, list, list.get(i).getId(), html,
								treeItemLevel + 1, pidpath + "_"
										+ list.get(i).getId());
					}
				}
			}
		}
		return html.toString();
	}

	/**
	 * 生成左侧菜单树
	 * 
	 * @param roleid
	 * @return
	 */
	public List<Func> createTree(String parid, List<Func> list) {
		List<Func> allUserMenu = new ArrayList<Func>();
		// 生成一级
		if (list != null && list.size() > 0) {
			boolean hasChildren = false;
			for (int i = 0; i < list.size(); i++) {
				if (parid.equals(list.get(i).getParid())) {
					hasChildren = false;
					list.get(i).setLevel(1);
					list.get(i).setChecked(false);
					if (haveSon(list.get(i).getId())) {
						hasChildren = true;
					}

					allUserMenu.add(list.get(i));

					if (hasChildren) {
						// 处理子级
						createTreeSon(list, list.get(i).getId(), allUserMenu, 2);
					}
				}
			}
		}
		return allUserMenu;
	}

	/**
	 * 生成左侧菜单树
	 * 
	 * @param roleid
	 * @return
	 */
	public List<Func> createTreeSon(List<Func> list, String pid,
			List<Func> allUserMenu, int treeItemLevel) {
		// 生成子级
		if (list != null && list.size() > 0) {
			boolean hasChildren = false;
			for (int i = 0; i < list.size(); i++) {
				if (pid.equals((list.get(i).getParid()))) {
					hasChildren = false;

					list.get(i).setLevel(treeItemLevel);
					list.get(i).setChecked(false);
					if (haveSon(list.get(i).getId())) {
						hasChildren = true;
					}

					allUserMenu.add(list.get(i));

					if (hasChildren) {
						// 处理子级
						createTreeSon(list, list.get(i).getId(), allUserMenu,
								treeItemLevel + 1);
					}
				}
			}
		}
		return allUserMenu;
	}

}
