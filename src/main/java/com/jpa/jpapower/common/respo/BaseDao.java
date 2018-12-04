package com.jpa.jpapower.common.respo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

/**
 * @author liugang
 * @create 2018/12/4 16:49
 **/
public interface BaseDao<T,ID extends Serializable> extends JpaRepository {
}
