package com.outman.dao;

import com.outman.po.OrgUserKey;

/**
 * @author xuwenlong
 * @create 2018-02-06 下午6:49
 **/

public interface RelOrgUserDao {
    OrgUserKey getRelOrgUser(Integer orgId, Integer userId);
}
