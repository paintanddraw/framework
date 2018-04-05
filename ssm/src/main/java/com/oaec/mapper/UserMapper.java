package com.oaec.mapper;

import com.oaec.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    //使用配置文件的方式
    public User getById(int id);

    //使用注解的方式
    @Select("SELECT * FROM users" )
    public List<User> find();

    public List<User> getUserPage();
    //插入
    public int insert(User user);

}
