package com.outman.service.impl;

import com.outman.dao.NoticeDao;
import com.outman.po.Notice;
import com.outman.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 提醒
 *
 * @author xuwenlong
 * @create 2018-02-01 上午11:54
 **/

@Service
public class NoticeServiceImpl implements NoticeService {

    @Autowired
    private NoticeDao noticeDao;
    public Notice queryNoticeByid(Integer id) {
        return noticeDao.queryNoticeByid(id);
    }

    public List<Notice> queryNoticesByParams(Integer shopId,
                                             Integer listId,
                                             Integer orgId,
                                             Integer userId) {
        Notice notice = new Notice();
        notice.setShopId(shopId);
        notice.setListId(listId);
        notice.setOrgId(orgId);
        notice.setUserId(userId);
        return noticeDao.queryNoticesByParams(shopId, listId, orgId, userId);
    }

    public Integer save(Notice notice) {
       return noticeDao.save(notice);
    }

    public Integer deleteByToDoListId(String todolistId) {
        return noticeDao.deleteByToDoListId(todolistId);
    }

    public Notice selectNoticeByToDoListId(String toddolistId) {
        return noticeDao.selectNoticeByToDoListId(toddolistId);
    }

    public Integer updateNotice(Notice notice) {
        return noticeDao.updateNotice(notice);
    }

    public List<Notice> getAllNotice() {
        return noticeDao.getAllNotice();
    }
}
