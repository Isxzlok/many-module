package com.test.service.controller;

import com.test.common.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping(value = "user")
    public User index() {

        User user = new User();

        user.setId(1);
        user.setName("张三");

        return user;
    }

}
