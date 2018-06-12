package com.gsccs.cms.auth.dao;


import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.gsccs.cms.auth.model.Oper;
import com.gsccs.cms.auth.model.OperExample;

public interface OperMapper {
    
    int countByExample(OperExample example);
    
    int deleteByExample(OperExample example);
    
    int deleteByPrimaryKey(String id);
    
    int insert(Oper record);
   
    int insertSelective(Oper record);
    
    List<Oper> selectByExample(OperExample example);
    
    Oper selectByPrimaryKey(String id);
    
    int updateByExampleSelective(@Param("record") Oper record, @Param("example") OperExample example);
    
    int updateByExample(@Param("record") Oper record, @Param("example") OperExample example);
    
    int updateByPrimaryKeySelective(Oper record);
    
    int updateByPrimaryKey(Oper record);
    
    List<Oper> selectAllOper(String userid);
    
    List<Oper> selectByFunUser(Map<String,Object> map);
} 