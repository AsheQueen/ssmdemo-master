package com.outman.dao.impl;

import com.outman.dao.AiHardDao;
import com.outman.mapper.AiHardMapper;

import com.outman.po.AiHard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author xuwenlong
 * @create 2018-02-02 下午5:49
 **/

@Repository
public class AiHardDaoImpl implements AiHardDao {

    @Autowired
    private AiHardMapper aiHardMapper;

    public List<AiHard> getAiHardList() {
        return aiHardMapper.getAiHardList();
    }

    public AiHard getAiHard(Integer id) {
        return aiHardMapper.selectByPrimaryKey(id);
    }
}
