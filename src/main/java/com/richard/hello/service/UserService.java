package com.richard.hello.service;

import com.richard.hello.dao.UserMapper;
import com.richard.hello.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by liuxubin on 16/2/29.
 */
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public boolean userExist(String uname, String pwd){
        User user = userMapper.selectByPrimaryKey(uname);
        if (user != null){
            String password = user.getPassword();
            if (pwd.equals(password)) {
                return true;
            }
        }
        return false;
    }
}
