package com.example.springbootmybatis.mapper;

import com.example.springbootmybatis.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from tb_user where name=#{name}")
    User findUserByName(@Param(value = "name") String name);

    @Insert("insert into tb_user(name,age,sex)values(#{name},#{age},#{sex})")
    int insertUser(@Param(value = "name") String name,@Param(value = "age")Integer age,
                   @Param(value = "sex")Integer sex);

    @Select({"select * from tb_user"})
    List<User> list();
}
