package com.outman.dao;

import com.outman.po.InviteEntity;
import com.outman.po.Org;
import com.outman.po.User;

import java.util.List;

/**
 * Created by zhangxiaoliang on 2017/7/12.
 */
public interface UserDao {
    User findUserById(int id) throws Exception;

    User findUserByPhone(String userPhone) throws Exception;

    Integer findOrgIdByUserId(Integer userId)throws Exception;

    Org findOrgInfoByOrgId(Integer orgId)throws Exception;

    List<InviteEntity> isInvited(Integer userId);

    Integer updatePassword(User user);
}
