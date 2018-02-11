package com.outman.mapper;

import com.outman.po.Lawer;

import java.util.List;

public interface LawerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Lawer record);

    int insertSelective(Lawer record);

    Lawer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Lawer record);

    int updateByPrimaryKey(Lawer record);

    List<Lawer> selectAll();
}