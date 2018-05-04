package com.demo.micro.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by linsyn on 2018/4/16.
 */
@Service
public class RibbonService {
    @Autowired
    private RestTemplate restTemplate;

    public User findById(Long id) {
        // http://服务提供者的serviceId/url
        return this.restTemplate.getForObject("http://microservice-provider-user/" + id, User.class);
    }

    public  String findBook() {
        return this.restTemplate.getForObject("http://pms/pms/book" , String.class);

    }
}
