package com.huangkai.service.fallbacke;

import com.huangkai.service.IPaymentFeignService;
import org.springframework.stereotype.Component;

/**
 * 降级
 *
 * @author Huangkai on 2023/3/21
 */
@Component
public class PaymentServiceFallback implements IPaymentFeignService {
    @Override
    public String index() {
        return "系统繁忙稍后再试";
    }
}

