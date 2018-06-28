package com.example.springbootmybatis.controller;

import com.example.springbootmybatis.entity.User;
import com.example.springbootmybatis.mapper.UserMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/query/{page}/{pageSize}")
    public PageInfo query(@PathVariable Integer page, @PathVariable Integer pageSize) {
        if(page!= null && pageSize!= null){
            PageHelper.startPage(page, pageSize);
        }
        List<User> users = userMapper.list();
        return new PageInfo(users);
    }
}
