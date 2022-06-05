package com.chen.pojo;

import com.chen.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {


    @Override
    public List<User> selectUsers() {
        SqlSession sqlSession=getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        return userMapper.selectUsers();
    }
}
