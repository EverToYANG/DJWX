package com.gsccs.cms.core.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsccs.cms.module.model.Mail;
import com.gsccs.cms.module.model.MailExample;

public interface MailMapper {
    
    int countByExample(MailExample example);
    int countByExampleCache(MailExample example);

    
    int deleteByExample(MailExample example);

    
    int deleteByPrimaryKey(String id);

    
    int insert(Mail record);

    
    int insertSelective(Mail record);

    
    List<Mail> selectByExample(MailExample example);
    List<Mail> selectPageByExample(MailExample example);
    List<Mail> selectPageByExampleCache(MailExample example);

    
    Mail selectByPrimaryKey(String id);
    Mail selectByQuerycode(String querycode);
    Mail selectByQuerycodeCache(String querycode);

    
    int updateByExampleSelective(@Param("record") Mail record, @Param("example") MailExample example);

    
    int updateByExample(@Param("record") Mail record, @Param("example") MailExample example);

    
    int updateByPrimaryKeySelective(Mail record);

    
    int updateByPrimaryKey(Mail record);
}