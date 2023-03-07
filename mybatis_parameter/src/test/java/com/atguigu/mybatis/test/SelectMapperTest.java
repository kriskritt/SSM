package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.SelectMapper;
import com.atguigu.mybatis.pojo.User;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class SelectMapperTest {

    @Test
    public void testGetUserById(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);
    }

    @Test
    public void testGetAllUser(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        List<User> list = mapper.getAllUser();
        list.forEach(System.out::println);
    }

    @Test
    public void testGetCount(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Integer count = mapper.getCount();
        System.out.println(count);
    }

    @Test
    public void testGetUserByIdToMap(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Map<String, Object> map = mapper.getUserByIdToMap(3);//{password=123456, id=3, username=aaa}
        //{password=123456, gendeer=女, id=1, age=8, email=123456@qq.com, username=admin}
        System.out.println(map);
    }

    @Test
    public void testGetAllUserToMap(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        //List<Map<String, Object>> list = mapper.getAllUserToMap();
        //System.out.println(list);
        /**
         * [{password=123456, gendeer=女, id=1, age=8, email=123456@qq.com, username=admin}, 
         * {password=123456, gendeer=女, id=2, age=33, email=12345@qq.com, username=root}, 
         * {password=123456, id=3, username=aaa}]
         */
        Map<String, Object> map = mapper.getAllUserToMap();
        /**
         * {1={password=123456, gendeer=女, id=1, age=8, email=123456@qq.com, username=admin},
         * 2={password=123456, gendeer=女, id=2, age=33, email=12345@qq.com, username=root},
         * 3={password=123456, id=3, username=aaa}}
         */
        System.out.println(map);
    }
}
