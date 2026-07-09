package com.cognizant.account.controller;

import com.cognizant.account.model.Account;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AccountController.class);

    private List<Account> accounts = Arrays.asList(
        new Account(1, "Savings", 50000.00, "John Doe"),
        new Account(2, "Checking", 25000.00, "Jane Smith"),
        new Account(3, "Savings", 75000.00, "Ravi Kumar")
    );

    @GetMapping
    public List<Account> getAllAccounts() {
        LOGGER.info("Start - getAllAccounts");
        LOGGER.debug("accounts={}", accounts);
        LOGGER.info("End - getAllAccounts");
        return accounts;
    }

    @GetMapping("/{id}")
    public Account getAccountById(@PathVariable int id) {
        LOGGER.info("Start - getAccountById id={}", id);
        Account account = accounts.stream()
                .filter(a -> a.getAccountId() == id)
                .findFirst()
                .orElse(null);
        LOGGER.debug("account={}", account);
        LOGGER.info("End - getAccountById");
        return account;
    }
}