package com.example.springbootmybatis;

import com.example.springbootmybatis.entity.User;
import com.example.springbootmybatis.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void insertTest(){
        //userMapper.insertUser("张三",12,1);
        User user=userMapper.findUserByName("张三");
        if(user!=null)System.out.println(user);
    }
}
