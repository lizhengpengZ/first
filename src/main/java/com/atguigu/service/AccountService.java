package com.atguigu.service;

import com.atguigu.bean.Account;

import java.util.List;

/**
 * @author 李政澎
 * @Description
 * @create 2022-05-12 14:15
 */
public interface AccountService {

    List<Account> getAll();

     Account getById(Integer id);

    void saveAccount(Account account);

    void updateAccount(Account account);

    int delete(Integer id);
}
