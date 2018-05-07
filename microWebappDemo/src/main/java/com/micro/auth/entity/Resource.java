package com.micro.auth.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by linsyn on 2018/5/4.
 */
public class Resource {


    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String perms;
    private String url;

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
    public String getPerms() {
        return perms;
    }
    public void setPerms(String perms) {
        this.perms = perms;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
}
