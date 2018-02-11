package com.outman.dao.impl;

import com.outman.dao.LawerDao;
import com.outman.mapper.LawerMapper;
import com.outman.po.Lawer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author xuwenlong
 * @create 2018-02-02 下午3:56
 **/
@Repository
public class LawerDaoImpl implements LawerDao {

    @Autowired
    private LawerMapper lawerMapper;

    public int deleteByPrimaryKey(Integer id) {
        return lawerMapper.deleteByPrimaryKey(id);
    }

    public int insert(Lawer record) {
        return lawerMapper.insert(record);
    }

    public int insertSelective(Lawer record) {
        return lawerMapper.insertSelective(record);
    }

    public Lawer selectByPrimaryKey(Integer id) {
        return lawerMapper.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(Lawer record) {
        return lawerMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Lawer record) {
        return lawerMapper.updateByPrimaryKey(record);
    }

    public List<Lawer> selectAll() {
        return lawerMapper.selectAll();
    }

    public Lawer getLawer(Integer id) {
        return lawerMapper.selectByPrimaryKey(id);
    }
}
