package com.jktaihe.dragger2.utils;

/**
 * Created by jktaihe on 9/9/17.
 * blog: blog.jktaihe.com
 */

public class AppUtil {

    public static <T> T newInstance(Class<T> tClass){
        try {
            return tClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
