package com.jpa.jpapower.roleUser.entity;

import javax.persistence.*;

/**
 * @author liugang
 * @create 2018/12/3 17:59
 **/
@Entity
@Table(name = "t_roleUser")
public class RoleUser {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 10,name = "user_id")
    private Integer userId;

    @Column(length = 10,name = "role_id")
    private Integer roleId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}
