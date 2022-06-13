package com.chan.CustomerSample.service;

import com.chan.CustomerSample.dto.AccountDto;
import com.chan.CustomerSample.repository.AccountRepository;
import com.chan.CustomerSample.domain.Account;
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
