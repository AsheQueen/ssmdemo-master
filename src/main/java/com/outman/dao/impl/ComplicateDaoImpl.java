package com.outman.dao.impl;

import com.outman.dao.ComplicateDao;
import com.outman.mapper.ComplicateMapper;
import com.outman.po.Complicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author xuwenlong
 * @create 2018-01-22 上午11:16
 **/
@Repository
public class ComplicateDaoImpl implements ComplicateDao {

    @Autowired
    private ComplicateMapper complicateMapper;


    public int deleteByPrimaryKey(Long complicateId) {
        return 0;
    }

    public int insert(Complicate record) {
        return 0;
    }

    public int insertSelective(Complicate record) {
        return 0;
    }

    public Complicate selectByPrimaryKey(Long complicateId) {
        return complicateMapper.selectByPrimaryKey(complicateId);
    }

    public int updateByPrimaryKeySelective(Complicate record) {
        return 0;
    }

    public int updateByPrimaryKey(Complicate record) {
        return 0;
    }

    public List<Complicate> selectByShopId(Integer shopId) {
        System.out.println(complicateMapper.selectByShopId(shopId));
        return complicateMapper.selectByShopId(shopId);
    }
}
