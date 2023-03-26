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
@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
public class ProviderDubboMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderDubboMain8001.class,args);
        log.info("==============Dubbo8001启动成功==============");
    }
}

