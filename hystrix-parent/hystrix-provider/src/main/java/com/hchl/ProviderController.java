package com.hchl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {


    @RequestMapping("/getUser")
    public String getUser() throws InterruptedException {
//        Thread.sleep(5000L);
        return "success";
    }
}



