package com.outman.dao.impl;

import com.outman.dao.NewsDao;
import com.outman.mapper.NewsMapper;
import com.outman.po.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xuwenlong
 * @create 2018-02-06 上午10:18
 **/

@Service
public class NewsDaoImpl implements NewsDao {

    @Autowired
    private NewsMapper newsMapper;

    public List<News> getNewsList() {
        return newsMapper.getNewsList();
    }

    public News getNews(Integer id) {
        return newsMapper.selectByPrimaryKey(id);
    }
}
