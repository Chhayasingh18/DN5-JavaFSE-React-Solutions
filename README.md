# DN5.0 - Java FSE React - Solutions

This repository contains my hands-on exercise solutions for the Cognizant Digital Nurture 5.0 (DN 5.0) Deep Skilling Program — Java FSE React stream.

## About the Program

Cognizant Digital Nurture 5.0 is a 7-week Deep Skilling program as part of the Campus Hiring 2027 process. This repository tracks my progress through all mandatory hands-on exercises across the program modules.

## Tech Stack

- Java
- SQL / PL-SQL
- JUnit 5 & Mockito
- Spring Core, Spring Boot & Spring Data JPA
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

│   └── Module2-DSA/

│       ├── EcommerceSearch.java

│       └── FinancialForecasting.java

│

├── Week2/

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

├── Week3/

│   └── Module5-SpringCore/

│       ├── pom.xml

│       ├── README.md

│       └── src/main/

│           ├── java/com/library/

│           │   ├── LibraryManagementApplication.java

│           │   ├── service/BookService.java

│           │   └── repository/BookRepository.java

│           └── resources/applicationContext.xml

│

├── Week4/

│   ├── Module6-SpringJPA/

│   │   ├── pom.xml

│   │   ├── README.md

│   │   └── src/main/

│   │       ├── java/com/cognizant/ormlearn/

│   │       │   ├── OrmLearnApplication.java

│   │       │   ├── model/Country.java

│   │       │   ├── repository/CountryRepository.java

│   │       │   └── service/CountryService.java

│   │       └── resources/

│   │           ├── application.properties

│   │           └── data.sql

│   └── Module7-SpringREST/

│

├── Week5/

│   └── Module8-Microservices/

│

├── Week6/

│   └── Module9-React/

│

└── Week7/

└── Module10-16-Debugging-Git-DevOps-Cloud-GenAI/

## Progress Tracker

| Week | Module | Status |
|------|--------|--------|
| Week 1 | Design Patterns & Principles | ✅ Completed |
| Week 1 | Data Structures & Algorithms | ✅ Completed |
| Week 2 | PL/SQL Programming | ✅ Completed |
| Week 2 | TDD (JUnit & Mockito) | ✅ Completed |
| Week 3 | Spring Core & Maven | ✅ Completed |
| Week 4 | Spring Data JPA & Hibernate | ✅ Completed |
| Week 4 | Spring REST (Spring Boot 3) | ⬜ Pending |
| Week 5 | Microservices | ⬜ Pending |
| Week 6 | React | ⬜ Pending |
| Week 7 | Debugging, Git, DevOps, Cloud, GenAI | ⬜ Pending |

## How to Run

**Java files (Week 1):**
Compile and run directly with `javac` and `java`, or open in any IDE.

**PL/SQL (Week 2 - Module 3):**
Run the `.sql` files in MySQL / phpMyAdmin against a database named `BankDB`.

**JUnit/Mockito (Week 2 - Module 4):**
```bash
cd Week2/Module4-TDD
mvn test
```

**Spring Core (Week 3 - Module 5):**
```bash
cd Week3/Module5-SpringCore
mvn compile exec:java -Dexec.mainClass="com.library.LibraryManagementApplication"
```

**Spring Data JPA (Week 4 - Module 6):**
```bash
cd Week4/Module6-SpringJPA
mvn spring-boot:run
```

## Author

**Chhaya Singh**
VIT Bhopal | Cognizant DN 5.0 Candidate (Java FSE React)