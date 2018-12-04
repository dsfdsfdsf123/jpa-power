package com.jpa.jpapower.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 * @author liugang
 * @create 2018/12/4 17:30
 **/
@Component
public class MyUserDetailService implements UserDetailsService {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        logger.info("用户的用户名:{}",username);
        //封装用户信息，并返回。参数分别是：用户名，密码，用户权限
        User user = new User(username,"123456",
                AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
        return user;
    }
}
