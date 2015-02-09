package com.huashang.dao.factory;

import com.huashang.dao.UserInfoDao;
import com.huashang.dao.impl.UserInfoDaoImpl;

/**
 * Created by ccxx on 2015-02-08.
 */

public class DaoFactory {

    public UserInfoDao getUserInfoDaoInstance() {
        return new UserInfoDaoImpl();
    }

}
