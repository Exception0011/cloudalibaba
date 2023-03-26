package com.huangkai.Controller;

import com.huangkai.service.IPaymentFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Huangkai on 2023/3/21
 */
@RestController
@RequestMapping("order")
public class OrderController {
    @Autowired
    private IPaymentFeignService iPaymentFeignService;

    @RequestMapping("index")
    public String index(){
        return iPaymentFeignService.index();
    }
}

