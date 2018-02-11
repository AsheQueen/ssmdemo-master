package com.outman.service;

import com.outman.po.Lawer;

import java.util.List;

/**
 * @author xuwenlong
 * @create 2018-02-02 下午4:00
 **/

public interface LawerService {
    List<Lawer> getLawer();

    Lawer getLawer(Integer id);
}
