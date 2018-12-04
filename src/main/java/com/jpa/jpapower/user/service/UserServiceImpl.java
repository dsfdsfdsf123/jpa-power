package com.jpa.jpapower.user.service;

import com.jpa.jpapower.user.dao.UserDao;
import com.jpa.jpapower.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author liugang
 * @create 2018/12/4 16:56
 **/
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;


    @Override
    public void addUser(User user) {
        userDao.save(user);
    }

    @Override
    public User findByName(String name) {
        return userDao.findOneByUsername(name);
    }
}
