package com.outman.dao.impl;

import com.outman.dao.ImgDao;
import com.outman.mapper.ImgMapper;
import com.outman.po.Img;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author xuwenlong
 * @create 2018-01-22 下午4:34
 **/

@Repository
public class ImgDaoImpl implements ImgDao {

    @Autowired
    private ImgMapper imgMapper;

    public int deleteByPrimaryKey(Long imgId) {
        return imgMapper.deleteByPrimaryKey(imgId);
    }

    public int insert(Img record) {
        return imgMapper.insert(record);
    }

    public int insertSelective(Img record) {
        return imgMapper.insertSelective(record);
    }

    public Img selectByPrimaryKey(Long imgId) {
        return imgMapper.selectByPrimaryKey(imgId);
    }

    public int updateByPrimaryKeySelective(Img record) {
        return imgMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Img record) {
        return imgMapper.updateByPrimaryKey(record);
    }

    public List<Img> selectByRelId(Integer shopId) {
        return imgMapper.selectByRelId(shopId);
    }

    public List<Img> selectByComplicateId(Integer complicateId) {
        return imgMapper.selectByRelId(complicateId);
    }

    public List<Img> selectByRelTypeId(Integer relId, Integer typeId) {
        return imgMapper.selectByRelTypeId(relId,Short.parseShort(Integer.toString(typeId)));
    }
}
