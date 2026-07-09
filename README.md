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

## Repository Structure

**Week 1**
- Module1-DesignPatterns → SingletonPatternExample.java, FactoryMethodPatternExample.java
- Module2-DSA → EcommerceSearch.java, FinancialForecasting.java
- Module3-PLSQL → Exercise1_ControlStructures.sql, Exercise3_StoredProcedures.sql
- Module4-TDD → pom.xml, src/main/java/com/dn5 (Calculator, ExternalApi, MyService), src/test/java/com/dn5 (CalculatorTest, MyServiceTest)

**Week 2**
- Module5-SpringCore → pom.xml, src/main/java/com/library (LibraryManagementApplication, BookService, BookRepository), src/main/resources/applicationContext.xml
- Module6-SpringJPA → pom.xml, src/main/java/com/cognizant/ormlearn (OrmLearnApplication, Country, CountryRepository, CountryService), src/main/resources (application.properties, data.sql)

**Week 3**
- Module7-SpringREST → pom.xml, src/main/java/com/cognizant/springlearn (SpringLearnApplication, HelloController, CountryController, AuthenticationController, CountryService, Country, CountryNotFoundException, SecurityConfig, JwtAuthorizationFilter), src/main/resources (application.properties, country.xml)

**Week 4**
- Module8-SonarQube → Pending
- Module9-Microservices → Pending

**Week 5**
- Module10-React → Pending

**Week 6**
- Module10-React (continued), Module11-Git-CICD → Pending

**Week 7**
- Module12-DevOps-Docker-Cloud-GenAI → Pending

## How to Run

**Week 1 - Module 4 (JUnit/Mockito):**
```bash
cd Week1/Module4-TDD
mvn test
```

**Week 2 - Module 5 (Spring Core):**
```bash
cd Week2/Module5-SpringCore
mvn compile exec:java -Dexec.mainClass="com.library.LibraryManagementApplication"
```

**Week 2 - Module 6 (Spring Data JPA):**
```bash
cd Week2/Module6-SpringJPA
mvn spring-boot:run
```

**Week 3 - Module 7 (Spring REST + JWT):**
```bash
cd Week3/Module7-SpringREST
mvn spring-boot:run
# curl -s -u user:pwd http://localhost:8083/hello
# curl -s -u user:pwd http://localhost:8083/countries
# curl -s -u user:pwd http://localhost:8083/authenticate
```

## Author

**Chhaya Singh**
VIT Bhopal | Cognizant DN 5.0 Candidate (Java FSE React)