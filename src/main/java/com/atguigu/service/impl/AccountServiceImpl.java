package com.atguigu.service.impl;

import com.atguigu.bean.Account;
import com.atguigu.mapper.AccountMapper;
import com.atguigu.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 李政澎
 * @Description
 * @create 2022-05-12 14:16
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;
    @Override
    public List<Account> getAll() {
        System.out.println("业务层，查询所有账户");
       return accountMapper.selectByExample(null);

    }

    @Override
    public Account getById(Integer id) {
        return accountMapper.selectByPrimaryKey(id);
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层，保存账户");
        accountMapper.insert(account);
    }

    @Override
    public void updateAccount(Account account) {
        accountMapper.updateByPrimaryKeySelective(account);
    }

    @Override
    public int delete(Integer id) {
        return accountMapper.deleteByPrimaryKey(id);
    }
}
