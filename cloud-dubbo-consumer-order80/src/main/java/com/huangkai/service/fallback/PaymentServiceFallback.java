package com.huangkai.service.fallback;

import com.huangkai.service.IPaymentService;

/**
 * @author Huangkai on 2023/3/21
 */
public class PaymentServiceFallback implements IPaymentService {
    @Override
    public String index() {
        return "服务繁忙，稍后再试";
    }
}

