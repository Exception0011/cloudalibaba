package com.huangkai.controller;

import com.huangkai.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Huangkai on 2023/3/21
 */
@RestController
@RequestMapping("order")
public class OrderController {


    @Autowired
    private OrderService orderService;


    @GetMapping("index")
    public String index(){
        String index = orderService.index();
        System.out.println(index);
        return index;
    }




}

