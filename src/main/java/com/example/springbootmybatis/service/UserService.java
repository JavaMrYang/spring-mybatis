package com.example.springbootmybatis.service;


import com.example.springbootmybatis.entity.User;

public interface UserService {
    User findByName(String name);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(Integer id);
}
