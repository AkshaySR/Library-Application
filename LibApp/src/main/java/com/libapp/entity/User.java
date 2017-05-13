package com.libapp.entity;

import javax.persistence.*;

/**
 * Created by akshayshivanne on 4/22/2017.
 */


@Entity
@Table(name="User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="username")
    private String username;

    @Column(name="password")
    private String password;

    public User(){}

    public User(String username,String password){
        this.username=username;
        this.password=password;
    }



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


}
