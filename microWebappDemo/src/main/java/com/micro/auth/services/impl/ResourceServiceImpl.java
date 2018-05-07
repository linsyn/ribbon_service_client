package com.micro.auth.services.impl;

import java.util.ArrayList;
import  java.util.List;
import com.micro.auth.services.IResourceService;
import com.micro.auth.entity.Resource;
import org.springframework.stereotype.Service;

/**
 * Created by linsyn on 2018/5/7.
 */
@Service("resourceService")
public class ResourceServiceImpl implements IResourceService {

    public List<Resource> getAll() {
        //return resourceDAO.getAll();
        ArrayList<Resource> lists = new ArrayList<>();
        return lists;
    }
}
