package com.outman.mapper;

import com.outman.po.Img;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ImgMapper {
    int deleteByPrimaryKey(Long imgId);

    int insert(Img record);

    int insertSelective(Img record);

    Img selectByPrimaryKey(Long imgId);

    int updateByPrimaryKeySelective(Img record);

    int updateByPrimaryKey(Img record);

    List<Img> selectByRelId(Integer shopId);

    List<Img> selectByRelTypeId(@Param("relId") Integer relId,@Param("typeId") Short typeId);
}