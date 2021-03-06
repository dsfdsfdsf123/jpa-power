package com.jpa.jpapower.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author liugang
 * @create 2018/12/4 20:47
 **/
@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityHttpSecurity extends WebSecurityConfigurerAdapter {

    @Bean
    UserDetailsService customUserService(){
        //注册UserDetailsService 的bean
        return new CustomUserService();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .passwordEncoder(new BCryptPasswordEncoder())
                .withUser("java")
                .password(new BCryptPasswordEncoder().encode("123456"))
                .roles("ADMIN");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().cors().disable().headers().disable()
                .authorizeRequests()
                .antMatchers("/resources/**","/signup","/about").permitAll()
                .antMatchers("/admin/**").hasRole("ADMIN")
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .defaultSuccessUrl("/admin")
                .permitAll()
                .and()
                .logout()
                .logoutSuccessUrl("/login")
                .permitAll();
    }
}
