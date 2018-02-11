package com.outman.dao;

import com.outman.po.News;

import java.util.List;

/**
 * @author xuwenlong
 * @create 2018-02-06 上午10:17
 **/

public interface NewsDao {
    List<News> getNewsList();

    News getNews(Integer id);
}
