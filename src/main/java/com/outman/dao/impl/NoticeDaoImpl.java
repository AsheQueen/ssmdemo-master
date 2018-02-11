package com.outman.dao.impl;

import com.outman.dao.NoticeDao;
import com.outman.mapper.NoticeMapper;
import com.outman.po.Notice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import java.util.List;

/**
 * @author xuwenlong
 * @create 2018-02-01 上午11:44
 **/

@Repository
public class NoticeDaoImpl implements NoticeDao {

    @Autowired
    private NoticeMapper noticeMapper;

    public Notice queryNoticeByid(Integer id) {
        return noticeMapper.selectByPrimaryKey(id);
    }

    public List<Notice> queryNoticesByParams(Notice notice) {
        return noticeMapper.selectByNotice(notice);
    }

    public Integer save(Notice notice) {
        return noticeMapper.insert(notice);
    }

    public Integer deleteByToDoListId(String todolistId) {
       return noticeMapper.deleteByToDoListId(todolistId);
    }

    public Notice selectNoticeByToDoListId(String toddolistId) {
        return noticeMapper.selectNoticeByToDoListId(toddolistId);
    }

    public Integer updateNotice(Notice notice) {
        return noticeMapper.updateByPrimaryKey(notice);
    }

    public List<Notice> getAllNotice() {
        return noticeMapper.getAllNotice();
    }

    public List<Notice> queryNoticesByParams(Integer shopId, Integer listId, Integer orgId, Integer userId) {
        return noticeMapper.selectByParams( shopId,  listId,  orgId,  userId);
    }
}
