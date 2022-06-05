package com.chen.pojo;

import com.chen.mapper.StudentMapper;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class StudentImpl extends SqlSessionDaoSupport implements StudentMapper {

    @Override
    public List<Student> selectStudents() {
        return getSqlSession().getMapper(StudentMapper.class).selectStudents();
    }

    @Override
    public int insertStudent(Student student) {
        return getSqlSession().getMapper(StudentMapper.class).insertStudent(student);
    }

    @Override
    public void updateStudent(int id, String name, int tid) {
        getSqlSession().getMapper(StudentMapper.class).updateStudent(id, name, tid);
    }

    @Override
    public void deleteStudent(int id) {
        getSqlSession().getMapper(StudentMapper.class).deleteStudent(id);
    }
}
