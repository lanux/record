package com.hchl;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类 编 号：
 * 类 名 称：
 * 内容摘要：
 * 创建日期：2017/9/26
 * 编码作者：hcl
 */
@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class SleuthProviderApplication
{

    private final Logger logger = Logger.getLogger(getClass());

    @RequestMapping(value = "/trace-2", method = RequestMethod.GET)
    public String trace()
    {
        logger.info(" = = = <call trace-2> == = ");
        return "trace";
    }

    public static void main(String[] args)
    {
        SpringApplication.run(SleuthProviderApplication.class, args);
    }
}
