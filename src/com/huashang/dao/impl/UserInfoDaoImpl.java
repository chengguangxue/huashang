package com.huashang.dao.impl;

/**
 * Created by ccxx on 2015-02-08.
 */

import com.huashang.dao.UserInfoDao;
import com.huashang.dao.config.MySqlMapConfig;

import com.huashang.dao.bean.UserInfo;

import com.ibatis.sqlmap.client.*;
import java.sql.*;

public class UserInfoDaoImpl implements UserInfoDao {

    // static Logger logger = Logger.getLogger(UserInfoDaoImpl.class);

    public UserInfoDaoImpl() {
        // PropertyConfigurator.configure("log4j.properties");
    }

    public boolean login(String name, String password) {
        SqlMapClient sqlMap = MySqlMapConfig.getSqlMapInstance();

        try {
            UserInfo userInfo = new UserInfo();
            userInfo.setUserName(name);
            userInfo = (UserInfo)sqlMap.queryForObject("UserMap.findUserByUserName", userInfo);
            if( userInfo != null ) {
                System.out.print(userInfo.getUserName());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return true;
    }

}
