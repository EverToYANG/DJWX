package com.gsccs.cms.module.service;

import java.util.List;

import com.gsccs.cms.module.model.Consult;
import com.gsccs.cms.module.model.ConsultExample.Criteria;

/**
 * 
 * 留言本相关服务
 * 
 * @author x.d zhang
 * @version 1.0
 */
public interface ConsultService {

	/**
	 * 分页查询
	 */
	public List<Consult> find(Consult param, String order,
			int currPage, int pageSize, boolean cache);

	
	/**
	 * 查询
	 */
	public List<Consult> findByParid(Long parid,boolean cache);
	
	public List<Consult> find(Consult guestbook);

	
	/**
	 * 统计
	 * 
	 * @param guestbook
	 * @return
	 */
	public int count(Consult Guestbook, boolean cache);

	/**
	 * 处理查询条件
	 * 
	 * @param guestbook
	 * @param criteria
	 */
	public void proSearchParam(Consult guestbook, Criteria criteria);

	/**
	 * 根据id查询
	 * 
	 * @param id
	 * @param cache
	 * @return
	 */
	public Consult findById(Long id);

	/**
	 * 更新
	 * 
	 * @param param
	 */
	public void update(Consult param);

	/**
	 * 添加
	 * 
	 * @param param
	 * @return
	 */
	public Long add(Consult param);

	/**
	 * 删除
	 * 
	 * @param id
	 */
	public void del(Long id);

	/**
	 * 留言频率统计 年
	 * 
	 * @param guestbook
	 * @return
	 */
	public List<Consult> guestbookUpdateYear(Consult guestbook);

	/**
	 * 留言频率统计 年
	 * 
	 * @param guestbook
	 * @return
	 */
	public List<Consult> guestbookUpdateYear(Consult guestbook,
			int currPage, int pageSize);

	/**
	 * 留言频率统计 年
	 * 
	 * @param guestbook
	 * @return
	 */
	public int guestbookUpdateYearCount(Consult guestbook);

	/**
	 * 留言频率合计 年
	 * 
	 * @param guestbook
	 * @return
	 */
	public int guestbookUpdateYearSum(Consult guestbook);

	/**
	 * 留言频率统计 月
	 * 
	 * @param guestbook
	 * @return
	 */
	public List<Consult> guestbookUpdateMonth(Consult guestbook);

	/**
	 * 留言频率统计 月
	 * 
	 * @param guestbook
	 * @return
	 */
	public List<Consult> guestbookUpdateMonth(Consult guestbook,
			int currPage, int pageSize);

	/**
	 * 留言频率统计 月
	 * 
	 * @param guestbook
	 * @return
	 */
	public int guestbookUpdateMonthCount(Consult guestbook);

	/**
	 * 留言频率合计 月
	 * 
	 * @param guestbook
	 * @return
	 */
	public int guestbookUpdateMonthSum(Consult guestbook);

	/**
	 * 留言频率统计 日
	 * 
	 * @param guestbook
	 * @return
	 */
	public List<Consult> guestbookUpdateDay(Consult guestbook);

	/**
	 * 留言频率统计 日
	 * 
	 * @param guestbook
	 * @return
	 */
	public List<Consult> guestbookUpdateDay(Consult guestbook,
			int currPage, int pageSize);

	/**
	 * 留言频率统计 日
	 * 
	 * @param guestbook
	 * @return
	 */
	public int guestbookUpdateDayCount(Consult guestbook);

	/**
	 * 留言频率合计 日
	 * 
	 * @param guestbook
	 * @return
	 */
	public int guestbookUpdateDaySum(Consult guestbook);

	/**
	 * 留言频率合计 周
	 * 
	 * @param guestbook
	 * @return
	 */
	public int guestbookUpdateWeekSum(Consult guestbook);

	/**
	 * 留言频率统计 周
	 * 
	 * @param guestbook
	 * @return
	 */
	public List<Consult> guestbookUpdateWeek(Consult guestbook);

	/**
	 * 站点留言统计
	 * 
	 * @param info
	 * @return
	 */
	public List<Consult> sysSiteGuestbook(Consult guestbook, int currPage,
			int pageSize);

	/**
	 * 站点留言统计
	 * 
	 * @param Consult
	 * @return
	 */
	public List<Consult> sysSiteGuestbook(Consult guestbook);

	/**
	 * 站点留言统计
	 * 
	 * @param Consult
	 * @return
	 */
	public int sysSiteGuestbookCount(Consult guestbook);

	/**
	 * 站点留言合计
	 * 
	 * @param Consult
	 * @return
	 */
	public int sysSiteGuestbookSum(Consult guestbook);

}
