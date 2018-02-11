package com.outman.dao;

import com.outman.po.Notice;

import java.util.List;

/**
 * @author xuwenlong
 * @create 2018-02-01 上午11:44
 **/

public interface NoticeDao {

    public Notice queryNoticeByid(Integer id);

    List<Notice> queryNoticesByParams(Notice notice);

    Integer save(Notice notice);

    Integer deleteByToDoListId(String todolistId);

    Notice selectNoticeByToDoListId(String toddolistId);

    Integer updateNotice(Notice notice);

    List<Notice> getAllNotice();

    List<Notice> queryNoticesByParams(Integer shopId, Integer listId, Integer orgId, Integer userId);
}
