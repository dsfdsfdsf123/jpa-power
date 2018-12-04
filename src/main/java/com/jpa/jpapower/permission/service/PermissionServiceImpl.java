package com.jpa.jpapower.permission.service;

import com.jpa.jpapower.permission.dao.PermissionDao;
import com.jpa.jpapower.permission.entity.Permission;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;

import javax.annotation.Resource;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

/**
 * @author liugang
 * @create 2018/12/4 14:02
 **/
public class PermissionServiceImpl implements PermissionService {

    @Resource
    private PermissionDao permissionDao;


    @Override
    public List<Permission> findByUserName(String username) {
        return permissionDao.findByUsername(username);
    }
}
