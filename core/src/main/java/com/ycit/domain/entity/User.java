package com.ycit.domain.entity;

/**
 * POJO
 *
 * @author xlch
 * @Date 2017-12-14 10:47
 */
//@Entity
public class User {

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String email;

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
