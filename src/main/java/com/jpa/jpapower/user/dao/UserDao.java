package com.jpa.jpapower.user.dao;

import com.jpa.jpapower.common.respo.BaseDao;
import com.jpa.jpapower.user.entity.User;

/**
 * @author liugang
 * @create 2018/12/4 16:50
 **/
public interface UserDao extends BaseDao<User,Integer> {

    User findOneByUsername(String name);
}
