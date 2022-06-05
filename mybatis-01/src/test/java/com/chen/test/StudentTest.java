package com.chen.test;

import com.chen.mapper.StudentMapper;
import com.chen.pojo.Student;
import com.chen.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class StudentTest {

    @Test
    public void getStudent2() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        for (Student student : mapper.getStudent2()) {
            System.out.println(student);
        }
        sqlSession.close();
    }

    @Test
    public void testStudent() {

        SqlSession sqlSession = MybatisUtil.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        for (Student student : mapper.getStudent()) {
            System.out.println(student);
        }
        sqlSession.close();
    }
}
