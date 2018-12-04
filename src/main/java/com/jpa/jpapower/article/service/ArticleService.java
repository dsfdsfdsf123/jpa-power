package com.jpa.jpapower.article.service;

import com.jpa.jpapower.article.entity.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author liugang
 * @create 2018/12/4 15:53
 **/
public interface ArticleService {

    Page<Article> findAll(Pageable pageable);
}
