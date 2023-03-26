package com.huangkai.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.huangkai.feign.AccountServiceFeign;
import com.huangkai.mapper.AccountMapper;
import com.huangkai.pojo.AccountInfo;
import com.huangkai.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Huangkai on 2023/3/26
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;

    @Autowired
    private AccountServiceFeign accountServiceFeign;
    @Override
    public void transfer(String account, Double amount) {
        QueryWrapper<AccountInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("account_no",account);
        AccountInfo accountInfo = accountMapper.selectOne(queryWrapper);
        if (accountInfo != null){
            Double accountBalance = accountInfo.getAccountBalance();
            accountInfo.setAccountBalance(accountBalance-amount);
            accountMapper.updateById(accountInfo);
            // 远程调用
            accountServiceFeign.transfer("2",amount);

        }
    }
}

