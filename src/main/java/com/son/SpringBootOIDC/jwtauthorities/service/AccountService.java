package com.son.SpringBootOIDC.jwtauthorities.service;

import com.son.SpringBootOIDC.jwtauthorities.domain.Account;
import org.springframework.stereotype.Service;


@Service
public class AccountService {

    public Account findAccountByPrincipal(String principal) {
        // NOTE: real-world code would typically perform some sort of DB lookup
        return new Account(1l, "0001", "101888444-0");
    }
}