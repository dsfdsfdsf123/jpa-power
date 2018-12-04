package com.jpa.jpapower.articlecategory.entity;

import com.jpa.jpapower.article.entity.Article;
import com.jpa.jpapower.category.entity.Category;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author liugang
 * @create 2018/12/4 14:28
 **/
@Entity
@Table(name = "t_article_category")
public class ArticleCategory implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    @Id
    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;
    @Id
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
