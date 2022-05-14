package com.atguigu.controller;

import com.atguigu.bean.Account;
import com.atguigu.service.AccountService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author 李政澎
 * @Description
 * @create 2022-05-12 14:18
 */
@Controller
public class AccountController {
    @Autowired
    private AccountService accountService;
    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping("/account")
    public String getAll(Model model){
        System.out.println("表现层，查询所有账户信息");

        List<Account> list = accountService.getAll();
        model.addAttribute("lists",list);
        return "success";
    }
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public String add(Account account) {
        accountService.saveAccount(account);
        return "redirect:/account";
    }
    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public String getId(@PathVariable("id") Integer id,Model model){
        Account id1 = accountService.getById(id);
        model.addAttribute("ids",id1);
        return "update";
    }
    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public String update(Account account){
        accountService.updateAccount(account);
        return "redirect:/account";
    }
    @RequestMapping(value ="/user/{id}",method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Integer id){
        System.out.println("删除");
        accountService.delete(id);
        return "redirect:/account";
    }
//gitxiugai
//hello111
}
