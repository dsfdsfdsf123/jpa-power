package com.jpa.jpapower.article.dao;

import com.jpa.jpapower.article.entity.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author liugang
 * @create 2018/12/4 15:49
 **/
public interface ArticleDao extends JpaRepository<Article,Integer> {
    /**
     * 获取文章列表，按status和id降序
     * @param pageable
     * @return
     */
    Page<Article> findAllByOrderByStatusDescIdDesc(Pageable pageable);
}
