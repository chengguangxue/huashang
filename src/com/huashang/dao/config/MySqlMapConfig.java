package com.huashang.dao.config;

/**
 * Created by ccxx on 2015-02-08.
 */

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

import java.io.IOException;
import java.io.Reader;

public class MySqlMapConfig {

    private static SqlMapClient sqlMap = null;

    static {
        try {
            String resource = "sql-map-config.xml";
            Reader reader = Resources.getResourceAsReader(resource);
            sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlMapClient getSqlMapInstance () {
        return sqlMap;
    }

}
