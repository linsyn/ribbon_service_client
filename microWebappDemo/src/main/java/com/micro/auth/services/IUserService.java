package com.micro.auth.services;

import com.micro.auth.entity.User;

/**
 * Created by linsyn on 2018/5/4.
 */
public interface IUserService {
     User getUser(String userName);
}
