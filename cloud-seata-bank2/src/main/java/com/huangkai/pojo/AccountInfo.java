package com.huangkai.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 账号实体类
 *
 * @author Huangkai on 2023/3/26
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName("account_info")
@Data
public class AccountInfo {
    //id
    @TableId
    private Long id;
    //户主姓名
    @TableField("account_name")
    private String accountName;
    //银行卡号
    @TableField("account_no")
    private String accountNo;
    //账户密码
    @TableField("account_password")
    private String accountPassword;
    //账户余额
    @TableField("account_balance")
    private Double accountBalance;


}


