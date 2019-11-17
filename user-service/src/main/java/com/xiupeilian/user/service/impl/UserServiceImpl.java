package com.xiupeilian.user.service.impl;

import com.xiupeilian.user.model.User;
import com.xiupeilian.user.service.UserService;

/**
 * @Description:
 * @Author: boyue
 * @CreateDate: 2019/9/5 20:28
 * @Version: 1.0
 **/
public class UserServiceImpl implements UserService {
    public User findUserById(int id) {

        User user=new User();
        user.setPassword("54321");
        user.setUsername("博悦");
        return user;
    }
}
