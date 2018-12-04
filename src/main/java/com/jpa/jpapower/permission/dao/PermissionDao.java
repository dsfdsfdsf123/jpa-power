package com.jpa.jpapower.permission.dao;

import com.jpa.jpapower.permission.entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * @author liugang
 * @create 2018/12/4 11:35
 **/
public interface PermissionDao extends JpaRepository<Permission,Integer>, JpaSpecificationExecutor {

    @Override
    public List<Permission> findAll();

    List<Permission> findByUsername(String username);
}
