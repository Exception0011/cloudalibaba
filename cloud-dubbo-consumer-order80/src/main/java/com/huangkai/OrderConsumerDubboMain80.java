package com.huangkai;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 主启动类
 *
 * @author Huangkai on 2023/3/21
 */
@EnableDiscoveryClient
@SpringBootApplication
@Slf4j
public class OrderConsumerDubboMain80 {


    public static void main(String[] args) {
        SpringApplication.run(OrderConsumerDubboMain80.class, args);
        log.info("************** OrderConsumerDubboMain80 *********");
    }


}


