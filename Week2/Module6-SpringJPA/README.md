# Module 6: Spring Data JPA with Hibernate

## Hands on 1: Spring Data JPA - Quick Example
- Created Spring Boot project with Spring Data JPA + H2 in-memory database
- `Country` entity mapped to a `country` table using `@Entity`, `@Table`, `@Id`, `@Column`
- `CountryRepository` extends `JpaRepository<Country, String>` (no boilerplate code needed)
- `CountryService` autowires the repository and exposes `getAllCountries()` with `@Transactional`
- Verified via `OrmLearnApplication` main method — successfully retrieved and printed all 4 countries

## Hands on 4: Difference between JPA, Hibernate, and Spring Data JPA

**Java Persistence API (JPA)**
- A specification (JSR 338) for persisting, reading, and managing data from Java objects
- Does NOT contain any concrete implementation — it's just a set of rules/interfaces

**Hibernate**
- An ORM (Object-Relational Mapping) tool that *implements* the JPA specification
- Handles the actual translation between Java objects and database tables

**Spring Data JPA**
- Does not implement JPA itself — it's an abstraction layer *on top of* an implementation like Hibernate
- Removes boilerplate code (no manual Session/Transaction management needed)
- Manages transactions automatically via `@Transactional`

**Code comparison:**

Hibernate (manual, verbose):
```java
public Integer addEmployee(Employee employee) {
    Session session = factory.openSession();
    Transaction tx = null;
    try {
        tx = session.beginTransaction();
        Integer id = (Integer) session.save(employee);
        tx.commit();
        return id;
    } catch (HibernateException e) {
        if (tx != null) tx.rollback();
    } finally {
        session.close();
    }
}
```

Spring Data JPA (declarative, minimal):
```java
public interface EmployeeRepository extends JpaRepository {
}

@Transactional
public void addEmployee(Employee employee) {
    employeeRepository.save(employee);
}
```

**Conclusion:** Spring Data JPA drastically reduces code while Hibernate (used underneath) still does the actual ORM work.

## How to Run
mvn spring-boot:run

## Output
Country: Country{code='IN', name='India'}

Country: Country{code='US', name='United States of America'}

Country: Country{code='FR', name='France'}

Country: Country{code='JP', name='Japan'}