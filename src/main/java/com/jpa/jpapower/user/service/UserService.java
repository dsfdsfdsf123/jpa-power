package com.jpa.jpapower.user.service;

import com.jpa.jpapower.user.entity.User;

/**
 * @author liugang
 * @create 2018/12/4 16:54
 **/
public interface UserService {

    User findByName(String name);


}
