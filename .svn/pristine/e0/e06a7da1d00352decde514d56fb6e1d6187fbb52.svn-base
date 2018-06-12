package com.gsccs.cms.core.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gsccs.cms.core.dao.ContentSignMapper;
import com.gsccs.cms.core.model.ContentSign;
import com.gsccs.cms.core.model.ContentSignExample;
import com.gsccs.cms.core.model.ContentSignExample.Criteria;
import com.gsccs.cms.core.service.ContentSignService;



/**
 * 信息签收服务
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
@Service
public class ContentSignServiceImpl implements ContentSignService {

	@Resource
	private ContentSignMapper infoSignMapper;

	/**
	 * 用户签收信息改变
	 * 
	 * @param infoid
	 * @param signusers
	 */
	public void infoedit(String infoid, String[] signusers) {
		if (signusers != null && signusers.length > 0) {
			// 检查那些删除了，并删除
			ContentSignExample example = new ContentSignExample();
			Criteria criteria = example.createCriteria();
			criteria.andInfoidEqualTo(infoid);
			List<String> userList = new ArrayList<String>();
			for (int i = 0; i < signusers.length; i++) {
				userList.add(signusers[i]);
			}
			criteria.andUseridNotIn(userList);
			infoSignMapper.deleteByExample(example);
			// 检查那些新增加，并增加
			for (int i = 0; i < signusers.length; i++) {
				if (countByInfoUser(infoid, signusers[i]) == 0) {
					ContentSign infoSign = new ContentSign();
					infoSign.setInfoid(infoid);
					infoSign.setUserid(signusers[i]);
					save(infoSign);
				}
			}
		}
	}

	/**
	 * 根据用户id和信息id统计
	 * 
	 * @param infoid
	 * @param userid
	 * @return
	 */
	public int countByInfoUser(String infoid, String userid) {
		ContentSignExample example = new ContentSignExample();
		Criteria criteria = example.createCriteria();
		criteria.andInfoidEqualTo(infoid);
		criteria.andUseridEqualTo(userid);
		return infoSignMapper.countByExample(example);
	}

	/**
	 * 保存
	 * 
	 * @param infoSign
	 * @return
	 */
	public String save(ContentSign infoSign) {
		if (infoSign != null) {
			infoSign.setId(UUID.randomUUID().toString());
			infoSignMapper.insert(infoSign);
			return infoSign.getId();
		}
		return "";
	}

	/**
	 * 根据信息id查询
	 * 
	 * @param infoid
	 * @return
	 */
	public List<ContentSign> findByInfo(String infoid) {
		ContentSignExample example = new ContentSignExample();
		Criteria criteria = example.createCriteria();
		criteria.andInfoidEqualTo(infoid);
		return infoSignMapper.selectByExample(example);
	}

	/**
	 * 根据信息id查询签收情况
	 * 
	 * @param infoid
	 * @return
	 */
	public List<ContentSign> findSignByInfo(String infoid) {
		ContentSignExample example = new ContentSignExample();
		Criteria criteria = example.createCriteria();
		criteria.andInfoidEqualTo(infoid);
		example.setOrderByClause(" users.loginname ");
		return infoSignMapper.selectSignByExample(example);
	}

	/**
	 * 判断指定信息是否有指定签收用户
	 * 
	 * @param userid
	 * @param infoid
	 * @return
	 */
	public ContentSign findByUserInfo(String userid, String infoid) {
		ContentSignExample example = new ContentSignExample();
		Criteria criteria = example.createCriteria();
		criteria.andInfoidEqualTo(infoid);
		criteria.andUseridEqualTo(userid);
		List<ContentSign> list = infoSignMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	/**
	 * 编辑
	 * 
	 * @param infoid
	 * @param userid
	 * @param request
	 */
	public void update(ContentSign infoSign) {
		if (infoSign != null) {
			infoSignMapper.updateByPrimaryKey(infoSign);
		}
	}

	public ContentSignMapper getInfoSignMapper() {
		return infoSignMapper;
	}

	public void setInfoSignMapper(ContentSignMapper infoSignMapper) {
		this.infoSignMapper = infoSignMapper;
	}
}
