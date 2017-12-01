package com.zdm.spring.security.service;

import com.zdm.spring.security.entity.Account;
import org.springframework.security.access.prepost.PreAuthorize;

public interface BankService {
    @PreAuthorize("hasAuthority('CESHI')")
    public Account readAccount(long id);
    @PreAuthorize("hasRole('ADMIN')")
    public Account readAccount();
}
