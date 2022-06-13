package com.order.chanOrderSample.service;

import com.order.chanOrderSample.domain.Account;
import com.order.chanOrderSample.dto.AccountDto;
import com.order.chanOrderSample.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AccountService {

    private final AccountRepository accountRepository;

    public Account signUp(AccountDto account){
        return accountRepository.save(account.toEntity());
    }

    public Account findId(String id){
        return accountRepository.findByName(id);
    }
}
