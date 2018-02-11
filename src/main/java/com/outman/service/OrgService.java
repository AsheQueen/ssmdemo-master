package com.outman.service;

import com.outman.po.Org;
import com.outman.po.OrgUserKey;

/**
 * @author xuwenlong
 * @create 2018-02-06 下午2:18
 **/

public interface OrgService {
    Org getOrg(Integer orgId);

    OrgUserKey getRelOrgUser(Integer orgId, Integer userId);
}
