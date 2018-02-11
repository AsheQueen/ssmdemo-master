package com.outman.service.impl;

import com.outman.dao.NewsDao;
import com.outman.po.News;
import com.outman.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xuwenlong
 * @create 2018-02-06 上午10:15
 **/

@Service
public class NewsServiceImpl implements NewsService{

    @Autowired
    private NewsDao newsDao;

    public List<News> getNewsList() {
        return newsDao.getNewsList();
    }

    public News getNews(Integer id) {
        return newsDao.getNews(id);
    }
}
