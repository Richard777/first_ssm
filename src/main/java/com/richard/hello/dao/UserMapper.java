package com.richard.hello.dao;

import com.richard.hello.model.User;

public interface UserMapper {
    int deleteByPrimaryKey(String name);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String name);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}