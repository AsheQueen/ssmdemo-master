package com.outman.dao.impl;

import com.outman.dao.RelOrgUserDao;
import com.outman.mapper.OrgUserMapper;
import com.outman.po.OrgUserKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author xuwenlong
 * @create 2018-02-06 下午6:50
 **/

@Repository
public class RelOrgUserDaoImpl implements RelOrgUserDao {

    @Autowired
    private OrgUserMapper orgUserMapper;
    public OrgUserKey getRelOrgUser(Integer orgId, Integer userId) {
        return orgUserMapper.getRelOrgUser(orgId.longValue(),userId.longValue());
    }
}
