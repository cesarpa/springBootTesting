package com.example.demo;

import com.example.demo.model.Account;
import org.springframework.beans.factory.annotation.Autowired;

public class AccountService {
    @Autowired
    AccountRepository repository;

    public Account getById() {
        return repository.findOne();
    }
}
