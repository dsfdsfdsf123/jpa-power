package com.jpa.jpapower.role.entity;

import javax.persistence.*;

/**
 * @author liugang
 * @create 2018/12/3 17:46
 **/
@Entity
@Table(name = "t_role")
public class Role {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 20)
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
