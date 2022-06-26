package com.chan.CustomerSample.dto;

import com.chan.CustomerSample.domain.Account;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AccountDto {

    private String password;

    private String name;

    public Account toEntity(){
        return Account.builder()
                .password(this.password)
                .name(this.name)
                .build();
    }

}
