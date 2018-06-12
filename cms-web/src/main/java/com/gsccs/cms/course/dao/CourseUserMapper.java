package com.gsccs.cms.course.dao;

import com.gsccs.cms.course.model.CourseUser;
import com.gsccs.cms.course.model.CourseUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseUserMapper {
    int countByExample(CourseUserExample example);

    int deleteByExample(CourseUserExample example);

    int deleteByPrimaryKey(String id);

    int insert(CourseUser record);

    int insertSelective(CourseUser record);

    List<CourseUser> selectByExample(CourseUserExample example);

    CourseUser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CourseUser record, @Param("example") CourseUserExample example);

    int updateByExample(@Param("record") CourseUser record, @Param("example") CourseUserExample example);

    int updateByPrimaryKeySelective(CourseUser record);

    int updateByPrimaryKey(CourseUser record);
}