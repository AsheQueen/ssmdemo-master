package com.outman.service.impl;

import com.outman.dao.LawerDao;
import com.outman.po.Lawer;
import com.outman.service.LawerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xuwenlong
 * @create 2018-02-02 下午4:03
 **/
@Service
public class LawerServiceImpl implements LawerService {

    @Autowired
    private LawerDao lawerDao;

    public List<Lawer> getLawer() {
        return lawerDao.selectAll();
    }

    public Lawer getLawer(Integer id) {
        return lawerDao.getLawer(id);
    }
}
