package com.micro.auth.services.impl;

import com.micro.auth.services.IUserService;
import org.springframework.stereotype.Service;
import com.micro.auth.entity.User;
/**
 * Created by linsyn on 2018/5/7.
 */
@Service("userService")
public class UserServiceImpl implements IUserService {


    public User getUser(String login) {
        return null;
    }

}