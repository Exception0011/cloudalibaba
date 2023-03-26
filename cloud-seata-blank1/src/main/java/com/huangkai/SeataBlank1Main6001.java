package com.huangkai;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@Slf4j
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan("com.huangkai.mapper")
public class SeataBlank1Main6001 {
    public static void main(String[] args) {
        SpringApplication.run(SeataBlank1Main6001.class,args);
        log.info("SeataBlank1Main6001启动成功");
    }
}