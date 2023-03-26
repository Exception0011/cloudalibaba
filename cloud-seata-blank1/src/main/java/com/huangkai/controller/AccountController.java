package com.huangkai.controller;

/**
 * 账号的控制器
 *
 * @author Huangkai on 2023/3/26
 */

import com.huangkai.service.AccountService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 分类名称
 * 分类备注/描述
* @Param:
* @return:
*/
@RestController
@RequestMapping("bank1")
@GlobalTransactional
@Transactional
public class AccountController {

    @Autowired
    private AccountService accountService;

    /**
     * 转账
     * api描述
     * @param account 账号名
     * @param amount  转账金额
     * @return 返回值描述
     * @author Admin
     * @description TODO
     * @date
    */



    @RequestMapping("transfer")
    public String transfer(String account,Double amount){
        accountService.transfer(account,amount);
        return "转账成功";
    }
}

