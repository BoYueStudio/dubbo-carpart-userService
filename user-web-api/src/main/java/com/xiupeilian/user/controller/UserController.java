package com.xiupeilian.user.controller;

import com.xiupeilian.user.model.User;
import com.xiupeilian.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class UserController {
    //依赖注入userService，userService哪里来?
    @Autowired(required = false)
    private UserService userService;

    @RequestMapping("/user")
    public @ResponseBody User findUserById(int id){
        System.out.println("我的id:"+id);
        return userService.findUserById(id);
    }
}
