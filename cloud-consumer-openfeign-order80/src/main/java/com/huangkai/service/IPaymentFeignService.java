package com.huangkai.service;

import com.huangkai.service.fallbacke.PaymentServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 远程调用的接口
 *
 * @author Huangkai on 2023/3/21
 */

@Service
@FeignClient(value = "payment-provider",fallback = PaymentServiceFallback.class)
public interface IPaymentFeignService {

    @GetMapping("/payment/index")
    String index();
}
