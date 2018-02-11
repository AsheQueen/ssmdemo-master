package com.outman.mapper;

import com.outman.po.Notice;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NoticeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Notice record);

    int insertSelective(Notice record);

    Notice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Notice record);

    int updateByPrimaryKey(Notice record);

    List<Notice> selectByNotice(Notice notice);

    int deleteByToDoListId(String todolistId);

    Notice selectNoticeByToDoListId(String toddolistId);

    List<Notice> getAllNotice();

    List<Notice> selectByParams(@Param("shopId") Integer shopId,
                                @Param("listId") Integer listId,
                                @Param("orgId") Integer orgId,
                                @Param("userId") Integer userId);
}