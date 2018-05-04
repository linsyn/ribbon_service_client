package com.demo.micro.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by linsyn on 2018/4/16.
 */
@RestController
public class RibbonController {

        @Autowired
        private RibbonService ribbonService;

        @GetMapping("/ribbon/{id}")
        public User findById(@PathVariable Long id) {
            return this.ribbonService.findById(id);
        }
        @GetMapping("/ribbon/list")
        public String findBook() {
                return this.ribbonService.findBook();
        }

}