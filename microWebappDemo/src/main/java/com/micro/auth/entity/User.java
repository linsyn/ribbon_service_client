package com.micro.auth.entity;

import java.util.Set;

/**
 * Created by linsyn on 2018/5/4.
 */
public class User {
    private Integer id;
    private String account;
    private String password;
    public Set<Role> getRoles(){
        return null;
    }
    public User() {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
