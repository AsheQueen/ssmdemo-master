package com.outman.dao;

import com.outman.po.AiHard;

import java.util.List;

/**
 * @author xuwenlong
 * @create 2018-02-02 下午5:48
 **/

public interface AiHardDao {
    public List<AiHard> getAiHardList();

    AiHard getAiHard(Integer id);
}
