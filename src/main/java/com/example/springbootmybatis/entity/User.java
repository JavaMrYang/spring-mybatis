package com.example.springbootmybatis.entity;


import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    /**
     * 主键id
     */
    private Integer id;
    /**
    *用户名称
     */
    private String name;
    /**
     *用户年龄
     */
    private Integer age;
    /**
     *用户性别
     */
    private Integer sex;
    /**
     *用户创建时间
     */
    private Date create_time;
    /**
     *用户被更新的最后时间
     */
    private Date updated_time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdated_time() {
        return updated_time;
    }

    public void setUpdated_time(Date updated_time) {
        this.updated_time = updated_time;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", create_time=" + create_time +
                ", updated_time=" + updated_time +
                '}';
    }
}

