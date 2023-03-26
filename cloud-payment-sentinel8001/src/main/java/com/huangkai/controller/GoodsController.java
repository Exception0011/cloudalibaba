package com.huangkai.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Huangkai on 2023/3/23
 */
@RestController
public class GoodsController {
    @SentinelResource("goods")
    @GetMapping("index")
    public String index(Integer index){
        return "index";
    }
}

