package com.gsccs.cms.auth.service.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.stereotype.Service;

import com.gsccs.cms.auth.dao.UnitMapper;
import com.gsccs.cms.auth.model.Unit;
import com.gsccs.cms.auth.model.UnitExample;
import com.gsccs.cms.auth.model.UnitExample.Criteria;
import com.gsccs.cms.auth.service.UnitService;

/**
 * 组织机构相关服务
 * 
 * @author x.d zhang
 * @version 1.0
 */
@Service
public class UnitServiceImpl implements UnitService {

	@Resource
	private UnitMapper mapper;
	@Resource
	private SqlSessionFactoryBean sqlSessionFactoryBean;

	public void insert(Unit unit) {
		if (null != unit){
			Long parid = unit.getParid()==null?0:unit.getParid();
			unit.setParid(parid);
			mapper.insert(unit);
		}
	}

	
	public void update(Unit unit) {
		mapper.updateByPrimaryKey(unit);
	}

	/**
	 * 查询是否有子数据
	 * 
	 * @param parId
	 * @return
	 */
	public boolean hasChildren(Long parId) {
		UnitExample example = new UnitExample();
		Criteria criteria = example.createCriteria();
		criteria.andParidEqualTo(parId);
		return mapper.countByExample(example) > 0;
	}

	/**
	 * 根据id查询
	 * 
	 * @param id
	 * @return
	 */
	public Unit findById(Long id) {
		if (id != null) {
			return mapper.selectByPrimaryKey(id);
		}
		return null;
	}

	/**
	 * 根据用户查询用户所属有效单位
	 * 
	 * @param user
	 * @return
	 */
	public List<Unit> findByUser(String user) {
		if (user != null && user.trim().length() > 0) {
			UnitExample example = new UnitExample();
			example.setUserId(user);
			return mapper.findByUser(example);
		}
		return null;
	}

	/**
	 * 查询所有单位，顶级单位和下级单位
	 * 
	 * @param parid
	 *            上级单位id
	 * @return list
	 */
	public List<Unit> selectUnit(Long parid) {
		return mapper.selectUnitByparid(parid);
	}

	/**
	 * 根据查询
	 * 
	 * @param isok
	 * @return
	 */
	public List<Unit> findByUser(String isok, String user) {
		UnitExample example = new UnitExample();
		Criteria criteria = example.createCriteria();
		if (isok != null && isok.trim().length() > 0) {
			criteria.andIsokEqualTo(isok);
		}
		if (user != null && user.trim().length() > 0) {
			criteria.andSql(" id in (select unit from sys_unit_user where users='"
					+ user + "')");
		}
		return mapper.selectByExample(example);
	}

	/**
	 * 调用unit_del存储过程
	 * 
	 * @param roleId
	 */
	public void callUnitDelPro(Long unitId) {
		try {
			Connection con = sqlSessionFactoryBean.getObject().openSession()
					.getConnection();
			CallableStatement cstmt = con.prepareCall("{call unit_del(?)}");
			cstmt.setLong(1, unitId);
			cstmt.execute();
		} catch (Exception e) {
			if (e.getMessage().indexOf("No data") < 0) {
				System.out.println("调用unit_del存储过程时出错");
				e.printStackTrace();
			}
		}
	}

	/**
	 * 调用unit_update存储过程
	 * 
	 * @param roleId
	 */
	public void callUnitUpdatePro(Long unitId) {
		try {
			Connection con = sqlSessionFactoryBean.getObject().openSession()
					.getConnection();
			CallableStatement cstmt = con.prepareCall("{call unit_update(?)}");
			cstmt.setLong(1, unitId);
			cstmt.execute();
		} catch (Exception e) {
			if (e.getMessage().indexOf("No data") < 0) {
				System.out.println("调用unit_update存储过程时出错");
				e.printStackTrace();
			}
		}
	}

	/**
	 * 根据父id查询
	 * 
	 * @param parid
	 * @return
	 */
	public List<Unit> findByPar(Long parid, String isok, String ismail,
			boolean cache) {
		UnitExample example = new UnitExample();
		Criteria criteria = example.createCriteria();
		if (parid != null) {
			criteria.andParidEqualTo(parid);
		}else{
			criteria.andSql(" (parid is null or parid = 0) ");
		}
		
		if (isok != null && isok.trim().length() > 0) {
			criteria.andIsokEqualTo(isok.trim());
		}
		if (ismail != null && ismail.trim().length() > 0) {
			criteria.andIsmailEqualTo(ismail.trim());
		}
		example.setOrderByClause(" orderNum ");
		if (cache) {
			return mapper.selectByExampleCache(example);
		} else {
			return mapper.selectByExample(example);
		}
	}


	/**
	 * 分页查询
	 */
	public List<Unit> find(Unit unit, String order, int currPage, int pageSize) {
		UnitExample example = new UnitExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(unit, criteria);
		if (order != null && order.trim().length() > 0) {
			example.setOrderByClause(order);
		}
		example.setCurrPage(currPage);
		example.setPageSize(pageSize);
		return mapper.selectPageByExample(example);
	}

	/**
	 * 根据查询
	 * 
	 * @param isok
	 * @return
	 */
	public List<Unit> findAll(Unit unit, String order) {
		UnitExample example = new UnitExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(unit, criteria);
		if (order != null && order.trim().length() > 0) {
			example.setOrderByClause(order);
		}
		return mapper.selectByExample(example);
	}

	/**
	 * 处理查询条件
	 * 
	 * @param info
	 * @param criteria
	 */
	public void proSearchParam(Unit unit, Criteria criteria) {
		if (unit != null) {
			if (null != unit.getParid()) {
				if (unit.getParid().longValue()==0l) {
					criteria.andSql(" (parid is null or parid=0) ");
				} else {
					criteria.andParidEqualTo(unit.getParid());
				}
			}
			if (StringUtils.isNotEmpty(unit.getIsok())) {
				criteria.andIsokEqualTo(unit.getIsok());
			}
			if (StringUtils.isNotEmpty(unit.getSql())) {
				criteria.andSql(unit.getSql());
			}
		}
	}

	/**
	 * 递归删除
	 * 
	 * @param id
	 */
	public void delete(Long id) {
		// 先看是否有子单位
		List<Unit> sons = mapper.selectUnitByparid(id);
		if (sons != null && sons.size() > 0) {
			// 删除子单位
			for (int i = 0; i < sons.size(); i++) {
				delete(sons.get(i).getId());
			}
		}
		// 删除当前单位
		mapper.deleteByPrimaryKey(id);
	}

	/**
	 * 下降
	 */
	public void down(Unit unit) {
		if (unit != null) {
			// 查询同级别下面第一个菜单的排序
			Unit unit2 = new Unit();
			unit2.setParid(unit.getParid());
			if (null == unit.getParid()) {
				unit2.setParid(0l);
			}
			unit2.setSql(" id<>'" + unit.getId() + "' and ordernum>="
					+ unit.getOrdernum());
			List<Unit> unitList = find(unit2, " ordernum ", 1, 1);
			if (unitList != null && unitList.size() > 0) {
				Unit nextunit = unitList.get(0);
				if (nextunit != null) {
					if (nextunit.getOrdernum().equals(unit.getOrdernum())) {
						unit.setOrdernum(nextunit.getOrdernum() + 1);
					} else {
						int nextNum = nextunit.getOrdernum();
						nextunit.setOrdernum(unit.getOrdernum());
						unit.setOrdernum(nextNum);
					}
					update(unit);
					update(nextunit);
				}
			}
		}
	}

	/**
	 * 上升
	 */
	public void up(Unit unit) {
		if (unit != null) {
			// 查询同级别上面第一个菜单的排序
			Unit unit2 = new Unit();
			unit2.setParid(unit.getParid());
			if (null == unit.getParid()) {
				unit2.setParid(0l);
			}
			unit2.setSql(" id<>'" + unit.getId() + "' and ordernum<="
					+ unit.getOrdernum());
			List<Unit> unitList = find(unit2, " ordernum desc ", 1, 1);
			if (unitList != null && unitList.size() > 0) {
				Unit nextunit = unitList.get(0);
				if (nextunit != null) {
					if (nextunit.getOrdernum().equals(unit.getOrdernum())) {
						unit.setOrdernum(nextunit.getOrdernum() - 1);
					} else {
						int nextNum = nextunit.getOrdernum();
						nextunit.setOrdernum(unit.getOrdernum());
						unit.setOrdernum(nextNum);
					}
					update(unit);
					update(nextunit);
				}
			}
		}
	}

	/**
	 * 生成授权树
	 * 
	 * @param roleid
	 * @return
	 */
	public String createTree(HttpServletRequest request, String selectids) {
		StringBuffer html = new StringBuffer();
		// 查询菜单
		Unit unit = new Unit();
		unit.setIsok("1");
		List<Unit> list = findAll(unit, "ordernum");
		// 生成一级
		if (list != null && list.size() > 0) {
			boolean hasChildren = false;
			for (int i = 0; i < list.size(); i++) {
				if (null==list.get(i).getParid()) {
					hasChildren = false;
					html.append("<tr treeItemLevel='1'>");
					html.append("<td><input "
							+ (selectids.indexOf(list.get(i).getId().toString()) > -1 ? "checked"
									: "") + " onclick='treeIdCheck(\""
							+ list.get(i).getId()
							+ "\")' type='checkbox' name='ids' unit='"
							+ list.get(i).getName() + "' value='"
							+ list.get(i).getId() + "' id='"
							+ list.get(i).getId() + "'/></td>");
					html.append("<td>");

					if (hasChildren(list.get(i).getId())) {
						hasChildren = true;
						html.append("<img align='absmiddle' style='cursor:pointer' onClick='displayChildren(this);' isAjax='false' isOpen='true' id='"
								+ list.get(i).getId()
								+ "' src='"
								+ request.getContextPath()
								+ "/static/tree/image/minus.gif' />");
					} else {
						html.append("<img align='absmiddle' src='"
								+ request.getContextPath()
								+ "/static/tree/image/empty.gif' />");
					}
					html.append("<img align='absmiddle' border='0' src='"
							+ request.getContextPath()
							+ "/static/tree/image/folder.gif' />&nbsp;");
					html.append(list.get(i).getName());
					html.append("</td></tr>");
					if (hasChildren) {
						// 处理子级
						createTreeSon(request, list, list.get(i).getId(),
								selectids, html, 2, list.get(i).getId().toString());
					}
				}
			}
		}
		return html.toString();
	}

	/**
	 * 生成授权树
	 * 
	 * @param roleid
	 * @return
	 */
	public String createTreeSon(HttpServletRequest request, List<Unit> list,
			Long pid, String selectids, StringBuffer html, int treeItemLevel,
			String pidpath) {
		// 生成子级
		if (list != null && list.size() > 0) {
			boolean hasChildren = false;
			for (int i = 0; i < list.size(); i++) {
				if (pid.equals((list.get(i).getParid()))) {
					hasChildren = false;
					html.append("<tr treeItemLevel='" + treeItemLevel + "'>");
					html.append("<td><input "
							+ (selectids.indexOf(list.get(i).getId().toString()) > -1 ? "checked"
									: "") + " onclick='treeIdCheck(\""
							+ pidpath + "_" + list.get(i).getId()
							+ "\")'  type='checkbox' name='ids' unit='"
							+ list.get(i).getName() + "' value='"
							+ list.get(i).getId() + "' id='"
							+ list.get(i).getId() + "'/></td>");
					html.append("<td>");
					for (int j = 1; j < treeItemLevel; j++) {
						html.append("<img align='absmiddle' src='"
								+ request.getContextPath()
								+ "/static/tree/image/empty.gif' />");
					}
					if (hasChildren(list.get(i).getId())) {
						hasChildren = true;
						html.append("<img align='absmiddle' style='cursor:pointer' onClick='displayChildren(this);' isAjax='false' isOpen='true' id='"
								+ list.get(i).getId()
								+ "' src='"
								+ request.getContextPath()
								+ "/static/tree/image/minus.gif' />");
					} else {
						html.append("<img align='absmiddle' src='"
								+ request.getContextPath()
								+ "/static/tree/image/empty.gif' />");
					}
					html.append("<img align='absmiddle' border='0' src='"
							+ request.getContextPath()
							+ "/static/tree/image/folder.gif' />&nbsp;");
					html.append(list.get(i).getName());
					html.append("</td></tr>");
					if (hasChildren) {
						// 处理子级
						createTreeSon(request, list, list.get(i).getId(),
								selectids, html, treeItemLevel + 1, pidpath
										+ "_" + list.get(i).getId());
					}
				}
			}
		}
		return html.toString();
	}

	
	@Override
	public List<Unit> findByCorpid(String corpid) {
		return mapper.selectUnitByCorpid(corpid);
	}
	
}
