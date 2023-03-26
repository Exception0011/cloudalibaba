package com.huangkai;

/**
 * @author Huangkai on 2023/3/26
 */

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
* @Description: 主启动类
* @Param:
* @return:
*/

@MapperScan("com.huangkai.mapper")
@SpringBootApplication
@Slf4j
@EnableDiscoveryClient
public class SeataBlank2Main6002 {
    public static void main(String[] args) {
        SpringApplication.run(SeataBlank2Main6002.class,args);
        log.info("SeataBlank2Main6002启动成功");
    }
}

