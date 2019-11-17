package com.xiupeilian.user.model;

import java.io.Serializable;

/**
 * @Description:
 * @Author: boyue
 * @CreateDate: 2019/9/5 20:19
 * @Version: 1.0
 **/
public class User implements Serializable {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
