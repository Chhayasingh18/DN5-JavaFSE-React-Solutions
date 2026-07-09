package com.cognizant.loan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoanServiceApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoanServiceApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(LoanServiceApplication.class, args);
        LOGGER.info("Loan Service Started");
    }
}