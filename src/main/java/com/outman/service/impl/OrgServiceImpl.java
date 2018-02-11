package com.outman.service.impl;

import com.outman.dao.OrgDao;
import com.outman.po.Org;
import com.outman.po.OrgUserKey;
import com.outman.service.OrgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xuwenlong
 * @create 2018-02-06 下午2:19
 **/

@Service
public class OrgServiceImpl implements OrgService {

    @Autowired
    private OrgDao orgDao;

    public Org getOrg(Integer orgId) {
        return orgDao.getOrg(orgId);
    }

    public OrgUserKey getRelOrgUser(Integer orgId, Integer userId) {
        return orgDao.getRelOrgUser(orgId,userId);
    }
}
