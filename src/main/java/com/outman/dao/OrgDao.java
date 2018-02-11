package com.outman.dao;

import com.outman.po.Org;
import com.outman.po.OrgUserKey;

/**
 * @author xuwenlong
 * @create 2018-02-06 下午2:21
 **/

public interface OrgDao {
    Org getOrg(Integer orgId);

    OrgUserKey getRelOrgUser(Integer orgId, Integer userId);
}
