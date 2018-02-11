package com.outman.mapper;

import com.outman.po.Complicate;

import java.util.List;

public interface ComplicateMapper {
    int deleteByPrimaryKey(Long complicateId);

    int insert(Complicate record);

    int insertSelective(Complicate record);

    Complicate selectByPrimaryKey(Long complicateId);

    int updateByPrimaryKeySelective(Complicate record);

    int updateByPrimaryKey(Complicate record);

    List<Complicate> selectByShopId(Integer shopId);
}