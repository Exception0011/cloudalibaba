package com.huangkai.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.huangkai.mapper.AccountMapper;
import com.huangkai.pojo.AccountInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 转帐逻辑
 *
 * @author Huangkai on 2023/3/26
 */
@Service
public class AccountService {

    @Autowired
    private AccountMapper accountMapper;
    /**
    * @Description: 转账
    * @Param: 账号
    * @return: 转账金额
    */

    public void transfer(String account,Double amount){

        QueryWrapper<AccountInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("account_no",account);
        AccountInfo accountInfo = accountMapper.selectOne(queryWrapper);
        if (accountInfo != null){
            Double accountBalance = accountInfo.getAccountBalance();
            accountInfo.setAccountBalance(amount+accountBalance);
        }
        accountMapper.updateById(accountInfo);

    }
}

