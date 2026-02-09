# Enterprise-Order-Analytics-Platform
Designed and developed a cloud-native, microservices-based enterprise platform for order management, inventory tracking, and real-time analytics, simulating a large-scale IBM enterprise environment.


## Overview
A cloud-native microservices platform built with Java 17 and Spring Boot.
Designed to simulate IBM-scale enterprise systems with event-driven processing, scalability,
and database concurrency handling.

## Architecture
- Microservices (Order, Inventory, Analytics, Auth)
- API Gateway routing
- Kafka event-driven analytics
- OAuth2/JWT security
- Dockerized services

## Technology Stack
- Java 17
- Spring Boot 3
- Kafka
- Docker & Docker Compose
- JPA / Hibernate
- OAuth2 / JWT

## How to Run
```bash
mvn clean install
docker-compose up
Key Contributions & Achievements:

Built high-performance RESTful APIs using Java 17 and Spring Boot, following clean architecture and DDD principles.

Designed and optimized relational database schemas with SAP HANA–style SQL, indexing strategies, and transaction isolation tuning.

Implemented event-driven architecture using Kafka for asynchronous processing and real-time analytics.

Improved API response time by ~40% through query optimization, caching, and JVM performance tuning.

Applied concurrency and scalability patterns (thread pools, async processing, idempotent consumers) to support high throughput.

Secured services using OAuth2, JWT, SSL/TLS, and role-based access control following enterprise security best practices.

Implemented CI/CD pipelines with automated testing, container builds, and cloud deployment.

Containerized services with Docker and deployed using Kubernetes, enabling horizontal scaling.

Integrated monitoring, logging, and profiling tools (Prometheus, Grafana, JVM profiling) for observability.

Developed automated unit, integration, and API tests using JUnit, Mockito, Testcontainers, and RestAssured.

Worked in an Agile/Scrum environment, participating in design discussions, code reviews, and technical documentation.
