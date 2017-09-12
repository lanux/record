package com.hchl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    UserService userService;


    @RequestMapping("/getUser")
    public  String getUser(){

        return userService.consumer();
    }
}
