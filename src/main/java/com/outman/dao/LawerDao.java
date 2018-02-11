package com.outman.dao;

import com.outman.po.Lawer;

import java.util.List;

/**
 * @author xuwenlong
 * @create 2018-02-02 下午3:55
 **/

public interface LawerDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Lawer record);

    int insertSelective(Lawer record);

    Lawer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Lawer record);

    int updateByPrimaryKey(Lawer record);

    List<Lawer> selectAll();

    Lawer getLawer(Integer id);
}
