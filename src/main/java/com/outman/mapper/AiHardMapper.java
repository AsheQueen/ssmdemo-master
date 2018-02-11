package com.outman.mapper;

import com.outman.po.AiHard;

import java.util.List;

public interface AiHardMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AiHard record);

    int insertSelective(AiHard record);

    AiHard selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AiHard record);

    int updateByPrimaryKey(AiHard record);

    List<AiHard> getAiHardList();

}