package com.outman.utils;

import java.util.Collection;

/**
 * @author xuwenlong
 * @create 2018-01-22 下午6:15
 **/

public class NullUtil {


    public static boolean isEmpty(Object objs) {
        return (objs == null);
    }


    public static boolean isEmpty(Object[] objs) {
        return ((objs == null) || (objs.length == 0));
    }


    public static boolean isEmpty(Collection<?> objs) {
        return ((objs == null) || (objs.size() <= 0));
    }


    public static boolean isEmpty(byte[] objs) {
        return ((objs == null) || (objs.length == 0));
    }


    public static boolean isEmpty(String str) {
        return ((str == null) || (str.trim().length() == 0));
    }


    public static boolean isEmpty(Long l) {
        return ((l == null) || (l.longValue() == 0L));
    }
}