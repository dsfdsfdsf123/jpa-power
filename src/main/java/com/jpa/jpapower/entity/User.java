package com.jpa.jpapower.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @author liugang
 * @create 2018/12/4 23:35
 **/
@Entity
@Table(name = "t_user")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "username",length = 30)
    private String username;
    @Column(name = "password",length = 50)
    private String password;
    @ManyToOne
    @JoinColumn(name = "role_id")
    private List<Role> roles;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
