package com.huangkai;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Huangkai on 2023/3/23
 */
@SpringBootApplication
@Slf4j
@EnableDiscoveryClient
public class PaymentSentinelMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentSentinelMain8001.class,args);
        log.info("============8001sentinel启动成功================");
    }
}

