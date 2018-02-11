package com.outman.service.impl;

import com.outman.dao.RelOrgUserDao;
import com.outman.po.OrgUserKey;
import com.outman.service.RelOrgUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xuwenlong
 * @create 2018-02-06 下午6:48
 **/

@Service
public class RelOrgUserServiceImpl implements RelOrgUserService {

    @Autowired
    private RelOrgUserDao relOrgUserDao;

    public OrgUserKey getRelOrgUser(Integer orgId, Integer userId) {
        return relOrgUserDao.getRelOrgUser(orgId, userId);
    }
}
