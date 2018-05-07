package com.micro.auth.services;

/**
 * Created by linsyn on 2018/5/7.
 */
import java.util.List;


import com.micro.auth.entity.Resource;

public interface IResourceService  {
    List<Resource> getAll();
}
