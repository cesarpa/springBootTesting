package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.mockito.Mockito.verify;

@RunWith(SpringJUnit4ClassRunner.class)
public class AccountServiceTests {

    @InjectMocks
    AccountService service;

    @Mock
    AccountRepository repository;

    private final Integer ID = 1;

    @Test
    public void findByIdTests() {
        service.getById();
        verify(repository).findOne();
    }

}
