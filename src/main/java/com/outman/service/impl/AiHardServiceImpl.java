package com.outman.service.impl;

import com.outman.dao.AiHardDao;
import com.outman.po.AiHard;
import com.outman.service.AiHardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xuwenlong
 * @create 2018-02-02 下午5:46
 **/

@Service
public class AiHardServiceImpl implements AiHardService {

    @Autowired
    private AiHardDao aiHardDao;

    public List<AiHard> getAiHardList() {
        return aiHardDao.getAiHardList();
    }

    public AiHard getAiHard(Integer id) {
        return aiHardDao.getAiHard(id);
    }
}
