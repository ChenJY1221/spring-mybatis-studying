package com.chen.mapper;

import com.chen.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {

    List<Student> selectStudents();
    int insertStudent(Student student);
    void updateStudent(@Param("sid") int id, @Param("sname") String name, @Param("tid") int tid);
    void deleteStudent(@Param("sid") int id);
}
