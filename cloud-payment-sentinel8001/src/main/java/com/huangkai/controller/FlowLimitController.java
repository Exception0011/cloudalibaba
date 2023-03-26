package com.huangkai.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 流量控制
 *
 * @author Huangkai on 2023/3/23
 */


@RestController
public class FlowLimitController {


    @GetMapping("testA")
    public String testA(){
        return "------------testA";
    }

    @GetMapping("testB")
    public String testB(){
        return "------------testB";
    }
}


