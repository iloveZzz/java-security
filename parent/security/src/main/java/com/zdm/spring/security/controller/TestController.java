package com.zdm.spring.security.controller;

import com.zdm.spring.security.entity.Account;
import com.zdm.spring.security.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("test")
public class TestController {
    @Autowired
    private BankService bankService;
    @RequestMapping("a1")
    public String test(){
        return "test";
    }

    @RequestMapping("account")
    @ResponseBody
    public Account getAccount(){
       return bankService.readAccount(1);
    }
}
