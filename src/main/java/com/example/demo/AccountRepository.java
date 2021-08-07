package com.example.demo;

import com.example.demo.model.Account;

public class AccountRepository {

    public Account findOne() {
        return new Account(1, "cesar");
    }

}
