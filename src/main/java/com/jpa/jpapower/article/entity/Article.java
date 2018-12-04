package com.jpa.jpapower.article.entity;

import com.jpa.jpapower.articlecategory.entity.ArticleCategory;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * @author liugang
 * @create 2018/12/4 14:19
 **/
@Entity
@Table(name = "t_article")
public class Article implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    @Lob
    @Column(columnDefinition = "text")
    private String title;
    @Lob
    @Column(columnDefinition = "longtext")
    private String content;
    private Integer userId;
    private Integer likeCount;
    private Date createTime;
    private Date updateTime;
    private Integer status;
    @OneToMany(mappedBy = "article",cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<ArticleCategory> articleCategoryList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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
