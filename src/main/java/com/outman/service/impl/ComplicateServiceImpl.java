package com.outman.service.impl;

import com.outman.dao.ComplicateDao;
import com.outman.po.Complicate;
import com.outman.service.ComplicateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xuwenlong
 * @create 2018-01-22 上午11:10
 **/
@Service
public class ComplicateServiceImpl implements ComplicateService {

    @Autowired
    private ComplicateDao complicateDao;

    public int deleteByPrimaryKey(Long complicateId) {
        return complicateDao.deleteByPrimaryKey(complicateId);
    }

    public int insert(Complicate record) {
        return complicateDao.insert(record);
    }

    public int insertSelective(Complicate record) {
        return complicateDao.insertSelective(record);
    }

    public Complicate selectByPrimaryKey(Long complicateId) {
        return complicateDao.selectByPrimaryKey(complicateId);
    }

    public int updateByPrimaryKeySelective(Complicate record) {
        return complicateDao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Complicate record) {
        return complicateDao.updateByPrimaryKey(record);
    }

    public List<Complicate> selectByShopId(Integer shopId) {
        return complicateDao.selectByShopId(shopId);
    }
}
