package com.huashang.dao.bean;

/**
 * Created by ccxx on 2015-02-08.
 */

public class UserInfo {

    private String user_name;
    private String password;

    public UserInfo() {
    }

    public String getUserName() {
        return user_name;
    }

    public void setUserName(String userName) {
        this.user_name = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
