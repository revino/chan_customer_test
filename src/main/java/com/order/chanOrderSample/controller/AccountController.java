package com.order.chanOrderSample.controller;

import com.order.chanOrderSample.domain.Account;
import com.order.chanOrderSample.dto.AccountDto;
import com.order.chanOrderSample.service.AccountService;
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
