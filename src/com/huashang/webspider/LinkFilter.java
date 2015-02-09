package com.huashang.webspider;

/**
 * Created by ccxx on 2015/2/5.
 */

public interface LinkFilter {

    public boolean accept(String url);

}