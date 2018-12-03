package com.jpa.jpapower.permissionRole.entity;

import javax.persistence.*;

/**
 * @author liugang
 * @create 2018/12/3 17:55
 **/
@Entity
@Table(name = "t_permissionRole")
public class PermissionRole {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 10,name = "role_id")
    private Integer roleId;

    @Column(length = 10,name = "permission_id")
    private Integer permissionId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }
}
