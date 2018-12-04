//package com.jpa.jpapower.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
///**
// * @author liugang
// * @create 2018/12/4 20:30
// **/
//@EnableWebSecurity
//public class WebSecurityConfig implements WebMvcConfigurer {
//
//    @Bean
//    public UserDetailsService userDetailsService() throws Exception{
//        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
//        manager.createUser(User.withUsername(new BCryptPasswordEncoder().encode("user")).password(new BCryptPasswordEncoder().encode("user")).roles("USER").build());
//        return manager;
//    }
//
//
//}
