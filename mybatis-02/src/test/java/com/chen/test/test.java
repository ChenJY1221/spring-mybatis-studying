package com.chen.test;

import com.chen.mapper.TeacherMapper;
import com.chen.pojo.Teacher;
import com.chen.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class test {

    @Test
    public void teacherTest() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = teacherMapper.getTeacher(1);
        System.out.println(teacher);

        sqlSession.close();


    }
}
