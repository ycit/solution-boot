package com.ycit.entity;

import javax.persistence.*;

/**
 * user entity
 *
 * @author xlch
 * @Date 2017-12-21 11:02
 */

@Entity
@Table(name = "user")
public class User {

    private long id;
    private String name;
    private String email;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}