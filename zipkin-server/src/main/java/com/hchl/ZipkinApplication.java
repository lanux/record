package com.hchl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;
import zipkin.server.EnableZipkinServer;

/**
 * 类 编 号：
 * 类 名 称：
 * 内容摘要：
 * 创建日期：2017/9/26
 * 编码作者：hcl
 */
@EnableZipkinStreamServer
@SpringBootApplication
public class ZipkinApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(ZipkinApplication.class, args);
    }
}
