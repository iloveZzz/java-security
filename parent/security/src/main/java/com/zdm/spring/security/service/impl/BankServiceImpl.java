package com.zdm.spring.security.service.impl;

import com.zdm.spring.security.entity.Account;
import com.zdm.spring.security.service.BankService;
import org.springframework.stereotype.Service;

@Service
public class BankServiceImpl implements BankService {
    @Override
    public Account readAccount(long id) {
        Account account = new Account("朱道明","男",1992310123,10000);
        return account;
    }

    @Override
    public Account readAccount() {
        Account account = new Account("朱道明","男",1992310123,10000);
        return account;
    }
}
