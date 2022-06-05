package com.chen.test;

import com.chen.mapper.StudentMapper;
import com.chen.mapper.TeacherMapper;
import com.chen.pojo.Student;
import com.chen.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class TeacherTest {

    @Test
    public void testTeacher() {

        SqlSession sqlSession = MybatisUtil.getSqlSession();
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
        System.out.println(teacherMapper.getTeacher(1));
        sqlSession.close();
    }


}
