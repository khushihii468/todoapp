# TodoApp - Starter Project (Resume-ready)

Simple Spring Boot Starter project demonstrating:
- Java 17, Spring Boot 3, Spring Web, Spring Data JPA
- H2 in-memory database (Oracle-ready)
- Simple REST APIs for Users and Todos
- Minimal static frontend (HTML + JS)

## Run locally
1. Ensure JDK 17 is installed.
2. Build and run using Maven:
```bash
./mvnw spring-boot:run
# or
mvn spring-boot:run
```
3. Open the demo UI: http://localhost:8080/index.html
4. H2 console (for debugging): http://localhost:8080/h2-console (JDBC URL: jdbc:h2:mem:todo)

## Sample curl requests
Register user:
```bash
curl -X POST -H "Content-Type: application/json" -d '{"username":"khushi","email":"k@example.com","passwordHash":"pass"}' http://localhost:8080/api/users/register
```
Create todo:
```bash
curl -X POST -H "Content-Type: application/json" -d '{"title":"Buy milk","description":"From store","dueDate":"2025-12-01","status":"NEW","userId":1}' http://localhost:8080/api/todos
```
Get todos:
```bash
curl "http://localhost:8080/api/todos?userId=1"
```

## What to add to your resume
**Spring Boot To-Do & User Manager** — Built a RESTful microservice using Java & Spring Boot with JPA/Hibernate (H2, Oracle-ready), implemented CRUD APIs for users and todos, and a minimal HTML/JS UI. Tech: Java, Spring Boot, JPA, H2, Maven, Git.
