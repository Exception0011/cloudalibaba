package com.huangkai;

/**
 * @author Huangkai on 2023/3/21
 */

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 主启动类
 */
@SpringBootApplication
@Slf4j
@EnableDiscoveryClient
public class NacosConfigMain3344 {
    public static void main(String[] args) {
        SpringApplication.run(NacosConfigMain3344.class,args);
        log.info("*********** NacosConfigMain3344 **********");
    }
}




