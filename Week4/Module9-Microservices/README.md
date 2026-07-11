# Module 9: Microservices with Eureka & API Gateway

## Architecture
- **Eureka Server** (port 8761) — service discovery/registry
- **Account Service** (port 8081) — registered with Eureka
- **Loan Service** (port 8082) — registered with Eureka
- **API Gateway** (port 9090) — routes requests to services via Eureka service discovery

## How to Run
Start in this order, each in a separate terminal:
1. `cd eureka-server && mvn spring-boot:run`
2. `cd account-service && mvn spring-boot:run`
3. `cd loan-service && mvn spring-boot:run`
4. `cd api-gateway && mvn spring-boot:run`

Wait ~30 seconds after all services start for Eureka registration to complete.

## Testing via API Gateway
- `http://localhost:9090/account-service/accounts` — all accounts
- `http://localhost:9090/loan-service/loans` — all loans

## Screenshots

### Eureka Dashboard — All Services Registered
![Eureka Dashboard](screenshots/eureka-dashboard.png)

### Account Service Response (via Gateway)
![Account Service](screenshots/account-service-response.png)

### Loan Service Response (via Gateway)
![Loan Service](screenshots/loan-service-response.png)