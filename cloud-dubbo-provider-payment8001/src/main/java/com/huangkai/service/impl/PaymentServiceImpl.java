package com.huangkai.service.impl;

import com.huangkai.service.IPaymentService;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.config.annotation.Method;

/**
 * @author Huangkai on 2023/3/21
 */
@DubboService(timeout = 5000,methods = {@Method(name = "index",retries = 2)},cluster = "failfast")
public class PaymentServiceImpl implements IPaymentService {
    @Override
    public String index() {
        return "dubbo service";
    }
}

