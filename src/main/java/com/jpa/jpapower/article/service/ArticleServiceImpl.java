package com.jpa.jpapower.article.service;

import com.jpa.jpapower.article.dao.ArticleDao;
import com.jpa.jpapower.article.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author liugang
 * @create 2018/12/4 15:54
 **/
public class ArticleServiceImpl implements ArticleService{
    @Autowired
    private ArticleDao articleDao;

    @Override
    public Page<Article> findAll(Pageable pageable) {
        Page<Article> articlePage = articleDao.findAllByOrOrderByStatusDescIdDesc(pageable);
        return articlePage;
    }
}
