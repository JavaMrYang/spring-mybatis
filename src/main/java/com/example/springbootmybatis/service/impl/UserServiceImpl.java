package com.example.springbootmybatis.service.impl;

import com.example.springbootmybatis.entity.User;
import com.example.springbootmybatis.mapper.UserMapper;
import com.example.springbootmybatis.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

public class UserServiceImpl implements UserService {
    private Logger log=LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private UserMapper userMapper;

    @Cacheable(value = "user",keyGenerator ="keyGenerator",key = "'user_'+#id")
    @Override
    public User findByName(String name) {
       User user=userMapper.findUserByName(name);
        return user;
    }

    @Override
    public void saveUser(User user) {
       userMapper.saveUser(user);
    }

    @CachePut(value = "user",key = "'user_'+#id")
    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    @CacheEvict(value = "user",key = "'user_'+#id")
    @Override
    public void deleteUser(Integer id) {
        userMapper.deleteUser(id);
    }
}
