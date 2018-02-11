package com.outman.service.impl;

import com.outman.dao.ImgDao;
import com.outman.po.Img;
import com.outman.service.ImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xuwenlong
 * @create 2018-01-22 下午4:38
 **/

@Service
public class ImgServiceImpl implements ImgService {

    @Autowired
    private ImgDao imgDao;

    public int deleteByPrimaryKey(Long imgId) {
        return imgDao.deleteByPrimaryKey(imgId);
    }

    public int insert(Img record) {
        return imgDao.insert(record);
    }

    public int insertSelective(Img record) {
        return imgDao.insert(record);
    }

    public Img selectByPrimaryKey(Long imgId) {
        return imgDao.selectByPrimaryKey(imgId);
    }

    public int updateByPrimaryKeySelective(Img record) {
        return imgDao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Img record) {
        return imgDao.updateByPrimaryKey(record);
    }

    public List<Img> selectByRelId(Integer shopId) {
        return imgDao.selectByRelId(shopId);
    }

    public List<Img> selectByComplicateId(Integer complicateId) {
        return imgDao.selectByComplicateId(complicateId);
    }

    public List<Img> selectByRelTypeId(Integer relId, Integer typeId) {
        return imgDao.selectByRelTypeId(relId, typeId);
    }
}
