package com.customer.chanCustomerSample.repository;

import com.customer.chanCustomerSample.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
     Account findByName(String name);
}
