package com.example.springbootmybatis.mapper;

import com.example.springbootmybatis.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from tb_user where name=#{name}")
    User findUserByName(@Param(value = "name") String name);

    @Insert("insert into tb_user(name,age,sex,crea)values(#{name},#{age},#{sex})")
    int insertUser(@Param(value = "name") String name,@Param(value = "age")Integer age,
                   @Param(value = "sex")Integer sex);

    @Insert("insert into tb_user(name,age,sex)values(#{name},#{age},#{sex})")
    @Options(useGeneratedKeys = true,keyProperty = "id")
    int saveUser(User user);

    @Update("update tb_user set name=#{name},age=#{age} where id=#{id}")
    int updateUser(User user);



    @Delete("delete from tb_user where id=#{id}")
    int deleteUser(Integer id);

    @Select("select * from tb_user")
    List<User> list();
}
