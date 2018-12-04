package com.jpa.jpapower.dao;

import com.jpa.jpapower.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author liugang
 * @create 2018/12/4 23:46
 **/
public interface UserDao extends JpaRepository<User,Integer> {
    User findByUsername(String username);
}
