package com.huangkai.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.huangkai.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Huangkai on 2023/3/23
 */
@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;



    @GetMapping("query")
    public String queryOrder(){
        paymentService.query();
        return "query";
    }

    @GetMapping("save")
    public String saveOrder(){
        paymentService.query();
        return "save";
    }
}

