package com.huangkai.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Huangkai on 2023/3/26
 */
@FeignClient("seata-bank2")
public interface AccountServiceFeign {

    @GetMapping("/bank2/transfer")
    String transfer(@RequestParam("account") String account,@RequestParam("amount") Double amount);
}
