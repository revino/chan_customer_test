package com.chan.CustomerSample.repository;

import com.chan.CustomerSample.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
     Account findByName(String name);
}
