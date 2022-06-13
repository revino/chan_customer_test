package com.order.chanOrderSample.repository;

import com.order.chanOrderSample.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
     Account findByName(String name);
}
