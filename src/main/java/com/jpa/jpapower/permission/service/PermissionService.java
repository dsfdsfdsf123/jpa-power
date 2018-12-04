package com.jpa.jpapower.permission.service;

import com.jpa.jpapower.permission.entity.Permission;

import java.util.List;

/**
 * @author liugang
 * @create 2018/12/4 11:41
 **/
public interface PermissionService {

    List<Permission> findByUserName(String username);
}
