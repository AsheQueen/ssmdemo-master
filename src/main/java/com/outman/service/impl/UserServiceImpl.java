package com.outman.service.impl;

import com.outman.dao.UserDao;
import com.outman.po.InviteEntity;
import com.outman.po.Org;
import com.outman.po.User;
import com.outman.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: outman
 * Date: 2017/7/7
 * Time: 下午9:20
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public User findUserById(int id) throws Exception {

        return userDao.findUserById(id);
    }

    public User findUserByPhone(String userPhone) throws Exception {
        return userDao.findUserByPhone(userPhone);
    }

    public Integer findOrgIdByUserId(Integer userId) throws Exception {
        return userDao.findOrgIdByUserId(userId);
    }

    public Org findOrgInfoByOrgId(Integer orgId) throws Exception {
        return userDao.findOrgInfoByOrgId(orgId);
    }

    public List<InviteEntity> isInvited(Integer userId) {
        return userDao.isInvited(userId);
    }

    public Integer updatePassword(User user) {
        return userDao.updatePassword(user);
    }
}
