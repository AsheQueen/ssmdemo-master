package com.outman.service;

import com.outman.po.OrgUserKey;

/**
 * @author xuwenlong
 * @create 2018-02-06 下午6:46
 **/

public interface RelOrgUserService {

    OrgUserKey getRelOrgUser(Integer orgId, Integer userId);
}
