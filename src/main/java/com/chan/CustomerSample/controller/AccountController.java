package com.chan.CustomerSample.controller;

import com.chan.CustomerSample.domain.Account;
import com.chan.CustomerSample.dto.AccountDto;
import com.chan.CustomerSample.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class AccountController {

    private final AccountService accountService;

    @PostMapping(value = "/account")
    public String signin(@RequestBody AccountDto account){
        accountService.signUp(account);
        return account.getName();
    }

    @GetMapping(value = "/account/{id}")
    public String signin(@PathVariable("id") String id){
        Account account = accountService.findId(id);
        return account.getName() + "-" + account.getPassword();
    }
}
