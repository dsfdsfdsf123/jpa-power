package com.jpa.jpapower.category.dao;

import com.jpa.jpapower.category.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author liugang
 * @create 2018/12/4 15:52
 **/
public interface CategoryDao extends JpaRepository<Category, Integer> {
}
