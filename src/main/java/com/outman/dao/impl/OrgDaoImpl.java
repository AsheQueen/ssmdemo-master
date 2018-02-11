package com.outman.dao.impl;

import com.outman.dao.OrgDao;
import com.outman.mapper.OrgMapper;
import com.outman.mapper.OrgUserMapper;
import com.outman.po.Org;
import com.outman.po.OrgUserKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author xuwenlong
 * @create 2018-02-06 下午2:21
 **/
@Repository
public class OrgDaoImpl implements OrgDao {

    @Autowired
    private OrgMapper orgMapper;

    @Autowired
    private OrgUserMapper orgUserMapper;

    public Org getOrg(Integer orgId) {
        return orgMapper.selectByPrimaryKey(orgId.longValue());
    }

    public OrgUserKey getRelOrgUser(Integer orgId, Integer userId) {
        return orgUserMapper.getRelOrgUser(orgId.longValue(),userId.longValue());
    }
}
