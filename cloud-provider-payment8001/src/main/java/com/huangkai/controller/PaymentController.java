package com.huangkai.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author Huangkai on 2023/3/21
 */
@RestController
@RequestMapping("payment")
public class PaymentController {

    @GetMapping("index")
    public String index(){
        /*try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/
        return "pay success";
    }

}

