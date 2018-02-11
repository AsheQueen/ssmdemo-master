package com.outman.service;

import com.outman.po.Notice;

import java.util.List;

/**提醒
 * @author xuwenlong
 * @create 2018-02-01 上午11:53
 **/

public interface NoticeService {
    public Notice queryNoticeByid(Integer id);

    List<Notice> queryNoticesByParams(Integer shopId,
                                      Integer listId,
                                      Integer orgId,
                                      Integer userId);

    Integer save(Notice notice);

    Integer deleteByToDoListId(String todolistId);

    Notice selectNoticeByToDoListId(String toddolistId);

    Integer updateNotice(Notice notice);

    List<Notice> getAllNotice();
}
