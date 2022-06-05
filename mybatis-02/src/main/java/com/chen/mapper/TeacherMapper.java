package com.chen.mapper;

import com.chen.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {

//    List<Teacher> getTeacher();

    //获取指定老师的学生
    Teacher getTeacher(@Param("tid")int id);
}
