package com.chan.CustomerSample.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Entity @Table(name = "ACCOUNT")
public class Account {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(length = 100)
    private String password;

}
