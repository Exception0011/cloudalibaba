package com.huangkai.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

/**
 * @author Huangkai on 2023/3/23
 */

@Service
public class PaymentService {
    @SentinelResource("goods")
    public String query(){
        return "查询商品";
    }
}

