package com.outman.service;

import com.outman.po.Img;

import java.util.List;

/**
 * @author xuwenlong
 * @create 2018-01-22 下午4:37
 **/

public interface ImgService {

    int deleteByPrimaryKey(Long imgId);

    int insert(Img record);

    int insertSelective(Img record);

    Img selectByPrimaryKey(Long imgId);

    int updateByPrimaryKeySelective(Img record);

    int updateByPrimaryKey(Img record);

    List<Img> selectByRelId(Integer shopId);

    List<Img> selectByComplicateId(Integer complicateId);

    List<Img> selectByRelTypeId(Integer relId, Integer typeId);
}
