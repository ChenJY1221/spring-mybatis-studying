package com.chen.mapper;

import com.chen.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface TeacherMapper {

    Teacher getTeacher(@Param("tid") int id);
}
