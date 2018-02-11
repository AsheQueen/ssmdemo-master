package com.outman.dao;

import com.outman.po.Complicate;

import java.util.List;

/**
 * @author xuwenlong
 * @create 2018-01-22 上午11:17
 **/

public interface ComplicateDao {

    int deleteByPrimaryKey(Long complicateId);

    int insert(Complicate record);

    int insertSelective(Complicate record);

    Complicate selectByPrimaryKey(Long complicateId);

    int updateByPrimaryKeySelective(Complicate record);

    int updateByPrimaryKey(Complicate record);

    List<Complicate> selectByShopId(Integer shopId);
}
