package com.gsccs.cms.auth.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gsccs.cms.auth.dao.OperMapper;
import com.gsccs.cms.auth.model.Oper;
import com.gsccs.cms.auth.model.OperExample;
import com.gsccs.cms.auth.model.OperExample.Criteria;
import com.gsccs.cms.auth.service.PermService;

/**
 * 关于操作按钮的相关服务
 * 
 * @author x.d zhang 
 */
@Service("operService")
public class PermServiceImpl implements PermService {

	@Resource
	private OperMapper operMapper;

	/**
	 * 查询所有
	 * 
	 * @param funcid
	 * @return
	 */
	public List<Oper> findAll() {
		return operMapper.selectByExample(null);
	}

	/**
	 * 查询菜单下有效操作按钮
	 * 
	 * @param funcid
	 * @return
	 */
	public List<Oper> findByFuncOk(String funcid) {
		if (funcid != null && funcid.trim().length() > 0) {
			OperExample operbuttonExample = new OperExample();
			Criteria criteria = operbuttonExample.createCriteria();
			criteria.andFuncEqualTo(funcid);
			criteria.andIsokEqualTo("1");
			operbuttonExample.setOrderByClause("ordernum");
			return operMapper.selectByExample(operbuttonExample);
		}
		return null;
	}

	/**
	 * 查询菜单下有效操作按钮
	 * 
	 * @param funcid
	 * @return
	 */
	public List<Oper> findByFunc(String funcid) {
		if (funcid != null && funcid.trim().length() > 0) {
			OperExample operbuttonExample = new OperExample();
			Criteria criteria = operbuttonExample.createCriteria();
			criteria.andFuncEqualTo(funcid);
			operbuttonExample.setOrderByClause("ordernum");
			return operMapper.selectByExample(operbuttonExample);
		}
		return null;
	}

	/**
	 * 查询操作按钮
	 * 
	 * @param funcid
	 * @return
	 */
	public Oper findById(String id) {
		if (id != null && id.trim().length() > 0) {
			return operMapper.selectByPrimaryKey(id);
		}
		return null;
	}

	/**
	 * 判断操作按钮名是否存在
	 * 
	 * @param name
	 * @return
	 */
	public boolean haveName(String funcId, String name) {
		if (funcId != null && funcId.trim().length() > 0 && name != null
				&& name.trim().length() > 0) {
			OperExample example = new OperExample();
			Criteria criteria = example.createCriteria();
			criteria.andFuncEqualTo(funcId);
			criteria.andNameEqualTo(name);
			return operMapper.countByExample(example) > 0;
		}
		return false;
	}

	/**
	 * 添加
	 * 
	 * @param operbutton
	 */
	public void insert(Oper operbutton) {
		operMapper.insert(operbutton);
	}

	/**
	 * 更新
	 * 
	 * @param operbutton
	 */
	public void update(Oper operbutton) {
		operMapper.updateByPrimaryKey(operbutton);
	}

	/**
	 * 删除
	 * 
	 * @param id
	 */
	public void delete(String id) {
		operMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<Oper> selectAllOper(String userid) {
		return operMapper.selectAllOper(userid);
	}

	@Override
	public List<Oper> findByFunc(String funcid, String userId) {

		if (funcid != null && funcid.trim().length() > 0) {
			Map<String, Object> params = new HashMap<String, Object>(3);
			params.put("funcid", funcid);
			params.put("userId", userId);

			return operMapper.selectByFunUser(params);
		}
		return null;
	}
}
