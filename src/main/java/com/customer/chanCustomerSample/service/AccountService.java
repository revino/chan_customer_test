package com.customer.chanCustomerSample.service;

import com.customer.chanCustomerSample.dto.AccountDto;
import com.customer.chanCustomerSample.repository.AccountRepository;
import com.customer.chanCustomerSample.domain.Account;
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
