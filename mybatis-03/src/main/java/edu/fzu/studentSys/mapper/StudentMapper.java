package edu.fzu.studentSys.mapper;

import edu.fzu.studentSys.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {

    List<Student> findStudentByNameOrMajor(@Param("sname")String studentName, @Param("smajor")String major);

    int insertStudent(Student student);

    List<Student> findIdLessThanFive();
}
