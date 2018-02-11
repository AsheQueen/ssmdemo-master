package com.outman.service;

import com.outman.po.AiHard;
import com.outman.po.News;

import java.util.List;

/**
 * @author xuwenlong
 * @create 2018-02-02 下午5:45
 **/

public interface AiHardService {
    List<AiHard> getAiHardList();

    AiHard getAiHard(Integer id);

}
