package com.huangkai.controller;

/**
 * 账号的控制器
 *
 * @author Huangkai on 2023/3/26
 */

import com.huangkai.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* @Description: 转账
* @Param:
* @return:
*/
@RestController
@RequestMapping("bank2")
@Transactional
public class AccountController {

    @Autowired
    private AccountService accountService;
    @GetMapping("transfer")
    public String transfer(String account,Double amount){
        accountService.transfer(account,amount);
        return "转账成功";
    }
}

