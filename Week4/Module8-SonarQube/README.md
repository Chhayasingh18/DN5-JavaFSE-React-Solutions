# Module 8: Code Quality and SonarQube

## What is SonarQube?
SonarQube is an open-source platform for continuous inspection of code quality. It performs automatic reviews with static analysis of code to detect bugs, code smells, and security vulnerabilities.

## Key Features
- Detects bugs, vulnerabilities, and code smells
- Supports 25+ programming languages including Java
- Provides quality gates to enforce standards
- Integrates with Maven, Jenkins, and CI/CD pipelines

## SonarQube Architecture
- **SonarQube Server** — runs the analysis engine and stores results
- **SonarQube Database** — stores configuration and analysis results
- **SonarQube Scanner** — runs on the project and sends results to server

## How to Integrate with Maven
Add this to `pom.xml`:

```xml
<plugin>
    <groupId>org.sonarsource.scanner.maven</groupId>
    <artifactId>sonar-maven-plugin</artifactId>
    <version>3.9.1.2184</version>
</plugin>
```

Run analysis:
```bash
mvn sonar:sonar -Dsonar.projectKey=my-project -Dsonar.host.url=http://localhost:9000
```

## Quality Gates
A Quality Gate is a set of conditions a project must meet:

| Metric | Threshold |
|--------|-----------|
| Code Coverage | > 80% |
| Critical Bugs | 0 |
| Vulnerabilities | 0 |
| Technical Debt Ratio | < 5% |

## Code Smells vs Bugs vs Vulnerabilities

| Type | Description |
|------|-------------|
| Bug | Code that produces incorrect behavior |
| Vulnerability | Security weakness attackers could exploit |
| Code Smell | Maintainability issue making code hard to understand |