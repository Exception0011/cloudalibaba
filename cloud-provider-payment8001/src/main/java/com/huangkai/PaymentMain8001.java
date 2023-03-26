package com.huangkai;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 主启动类
 *
 * @author Huangkai on 2023/3/20
 */

//开启注册发现服务 类似@EnableEurekaClient 只有Eureka不一样，zookeeper nacos这些都是这个注解
@EnableDiscoveryClient
@SpringBootApplication
@Slf4j
public class PaymentMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8001.class,args);
        log.info("==============8001启动成功=============");
    }
}

