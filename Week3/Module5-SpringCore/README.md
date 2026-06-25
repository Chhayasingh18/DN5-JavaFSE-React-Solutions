# Module 5: Spring Core and Maven

## Exercise 1: Configuring a Basic Spring Application
- Created Maven project `LibraryManagement`
- Added Spring Core (`spring-context`) dependency in `pom.xml`
- Configured `applicationContext.xml` defining beans for `BookService` and `BookRepository`
- `LibraryManagementApplication` main class loads the Spring context successfully

## Exercise 2: Implementing Dependency Injection
- `BookRepository` is wired into `BookService` via setter injection, configured in `applicationContext.xml` using `<property name="bookRepository" ref="bookRepository" />`
- `BookService` has a `setBookRepository()` method
- Verified by running the main class — output: `Book-101: The Great Gatsby`

## Exercise 4: Creating and Configuring a Maven Project
- Maven project created with `groupId: com.library`, `artifactId: LibraryManagement`
- `pom.xml` includes Spring Context dependency
- Maven Compiler Plugin configured for Java version 1.8

## How to Run
mvn compile exec:java -Dexec.mainClass="com.library.LibraryManagementApplication"

## Output
Result: Book-101: The Great Gatsby