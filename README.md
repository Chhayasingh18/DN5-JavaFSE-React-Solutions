# DN5.0 - Java FSE React - Solutions

This repository contains my hands-on exercise solutions for the Cognizant Digital Nurture 5.0 (DN 5.0) Deep Skilling Program — Java FSE React stream.

## About the Program

Cognizant Digital Nurture 5.0 is a 7-week Deep Skilling program as part of the Campus Hiring 2027 process. This repository tracks my progress through all mandatory hands-on exercises across the program modules.

## Tech Stack

- Java
- SQL / PL-SQL
- JUnit 5 & Mockito
- Spring Core, Spring Boot, Spring Data JPA & Spring REST
- Spring Security & JWT Authentication
- Hibernate / H2 Database
- React
- Git & GitHub

## Repository Structure
DN5-JavaFSE-React-Solutions/
│
├── Week1/
│   ├── Module1-DesignPatterns/
│   │   ├── SingletonPatternExample.java
│   │   └── FactoryMethodPatternExample.java
│   ├── Module2-DSA/
│   │   ├── EcommerceSearch.java
│   │   └── FinancialForecasting.java
│   ├── Module3-PLSQL/
│   │   ├── Exercise1_ControlStructures.sql
│   │   └── Exercise3_StoredProcedures.sql
│   └── Module4-TDD/
│       ├── pom.xml
│       └── src/
│           ├── main/java/com/dn5/
│           │   ├── Calculator.java
│           │   ├── ExternalApi.java
│           │   └── MyService.java
│           └── test/java/com/dn5/
│               ├── CalculatorTest.java
│               └── MyServiceTest.java
│
├── Week2/
│   ├── Module5-SpringCore/
│   │   ├── pom.xml
│   │   ├── README.md
│   │   └── src/main/
│   │       ├── java/com/library/
│   │       │   ├── LibraryManagementApplication.java
│   │       │   ├── service/BookService.java
│   │       │   └── repository/BookRepository.java
│   │       └── resources/applicationContext.xml
│   └── Module6-SpringJPA/
│       ├── pom.xml
│       ├── README.md
│       └── src/main/
│           ├── java/com/cognizant/ormlearn/
│           │   ├── OrmLearnApplication.java
│           │   ├── model/Country.java
│           │   ├── repository/CountryRepository.java
│           │   └── service/CountryService.java
│           └── resources/
│               ├── application.properties
│               └── data.sql
│
├── Week3/
│   └── Module7-SpringREST/
│       ├── pom.xml
│       └── src/main/
│           ├── java/com/cognizant/springlearn/
│           │   ├── SpringLearnApplication.java
│           │   ├── controller/
│           │   │   ├── HelloController.java
│           │   │   ├── CountryController.java
│           │   │   └── AuthenticationController.java
│           │   ├── service/CountryService.java
│           │   ├── model/Country.java
│           │   ├── exception/CountryNotFoundException.java
│           │   └── security/
│           │       ├── SecurityConfig.java
│           │       └── JwtAuthorizationFilter.java
│           └── resources/
│               ├── application.properties
│               └── country.xml
│
├── Week4/
│   ├── Module8-SonarQube/
│   └── Module9-Microservices/
│
├── Week5/
│   └── Module10-React/
│
├── Week6/
│   ├── Module10-React/
│   └── Module11-Git-CICD/
│
└── Week7/
└── Module12-DevOps-Docker-Cloud-GenAI/

## Progress Tracker

| CTS Week | Module | Topics | Status |
|----------|--------|--------|--------|
| Week 1 | Module 1 | Design Patterns & Principles | ✅ Completed |
| Week 1 | Module 2 | Data Structures & Algorithms | ✅ Completed |
| Week 1 | Module 3 | PL/SQL Programming | ✅ Completed |
| Week 1 | Module 4 | TDD, JUnit & Mockito | ✅ Completed |
| Week 2 | Module 5 | Spring Core & Maven | ✅ Completed |
| Week 2 | Module 6 | Spring Data JPA & Hibernate | ✅ Completed |
| Week 3 | Module 7 | Spring REST using Spring Boot 3 + JWT | ✅ Completed |
| Week 4 | Module 8 | Code Quality & SonarQube | ⬜ Pending |
| Week 4 | Module 9 | Microservices with Spring Boot 3 & Spring Cloud | ⬜ Pending |
| Week 5 | Module 10 | React | ⬜ Pending |
| Week 6 | Module 10 | React (continued) + GIT & CI/CD | ⬜ Pending |
| Week 7 | Module 12 | DevOps, Docker, Cloud & GenAI | ⬜ Pending |

## How to Run

**Java files (Week 1 - Module 1 & 2):**
Compile and run directly with `javac` and `java`, or open in any IDE.

**PL/SQL (Week 1 - Module 3):**
Run `.sql` files in MySQL / phpMyAdmin against a database named `BankDB`.

**JUnit/Mockito (Week 1 - Module 4):**
```bash
cd Week1/Module4-TDD
mvn test
```

**Spring Core (Week 2 - Module 5):**
```bash
cd Week2/Module5-SpringCore
mvn compile exec:java -Dexec.mainClass="com.library.LibraryManagementApplication"
```

**Spring Data JPA (Week 2 - Module 6):**
```bash
cd Week2/Module6-SpringJPA
mvn spring-boot:run
```

**Spring REST + JWT (Week 3 - Module 7):**
```bash
cd Week3/Module7-SpringREST
mvn spring-boot:run
# Test endpoints:
# curl -s -u user:pwd http://localhost:8083/hello
# curl -s -u user:pwd http://localhost:8083/countries
# curl -s -u user:pwd http://localhost:8083/authenticate
```

## Verification Schedule

CTS progress verification every **Friday (10am-12pm or 2-3pm)** and **Saturday (10am-1pm)** with Rakesh sir / Dharmendar ji at VIT Bhopal.

## Author

**Chhaya Singh**
VIT Bhopal | Cognizant DN 5.0 Candidate (Java FSE React)