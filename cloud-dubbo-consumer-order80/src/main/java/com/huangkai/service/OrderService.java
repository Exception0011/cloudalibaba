package com.huangkai.service;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * @author Huangkai on 2023/3/21
 */
@Service
public class OrderService {
    @DubboReference(mock = "com.huangkai.service.fallback.PaymentServiceFallback")
    private IPaymentService iPaymentService;
    public String index(){
        return iPaymentService.index();
    }
}

