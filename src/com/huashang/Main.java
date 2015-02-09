package com.huashang;

import com.huashang.dao.factory.DaoFactory;
import com.huashang.dao.UserInfoDao;

public class Main {

    public static void main(String[] args) {

        System.out.print("test");

        DaoFactory daoFactory = new DaoFactory();
        UserInfoDao userInfo = daoFactory.getUserInfoDaoInstance();
        boolean b = userInfo.login("test", "123456");

        System.out.print(b);

        MyCrawler crawler = new MyCrawler();
        crawler.crawling(new String[] { "http://www.baidu.com" });

    }
}
