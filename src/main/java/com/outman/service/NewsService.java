package com.outman.service;

import com.outman.po.News;

import java.util.List;

/**
 * @author xuwenlong
 * @create 2018-02-06 上午10:14
 **/

public interface NewsService {
    List<News> getNewsList();

    News getNews(Integer id);
}
