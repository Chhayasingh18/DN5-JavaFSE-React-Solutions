package com.cognizant.loan.controller;

import com.cognizant.loan.model.Loan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/loans")
public class LoanController {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoanController.class);

    private List<Loan> loans = Arrays.asList(
        new Loan(1, "Home Loan", 500000.00, 8.5, "John Doe"),
        new Loan(2, "Car Loan", 100000.00, 9.0, "Jane Smith"),
        new Loan(3, "Personal Loan", 50000.00, 10.5, "Ravi Kumar")
    );

    @GetMapping
    public List<Loan> getAllLoans() {
        LOGGER.info("Start - getAllLoans");
        LOGGER.debug("loans={}", loans);
        LOGGER.info("End - getAllLoans");
        return loans;
    }

    @GetMapping("/{id}")
    public Loan getLoanById(@PathVariable int id) {
        LOGGER.info("Start - getLoanById id={}", id);
        Loan loan = loans.stream()
                .filter(l -> l.getLoanId() == id)
                .findFirst()
                .orElse(null);
        LOGGER.debug("loan={}", loan);
        LOGGER.info("End - getLoanById");
        return loan;
    }
}