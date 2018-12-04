package com.jpa.jpapower.category.entity;

import com.jpa.jpapower.articlecategory.entity.ArticleCategory;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * @author liugang
 * @create 2018/12/4 14:25
 **/
@Entity
@Table(name = "category")
public class Category implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String key;
    private Integer status;
    @OneToMany(mappedBy = "category")
    private Set<ArticleCategory> articleCategoryList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Set<ArticleCategory> getArticleCategoryList() {
        return articleCategoryList;
    }

    public void setArticleCategoryList(Set<ArticleCategory> articleCategoryList) {
        this.articleCategoryList = articleCategoryList;
    }
}
