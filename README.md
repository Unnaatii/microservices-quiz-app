# Microservices Quiz Application

A Spring Boot based Microservices architecture project demonstrating 
API Gateway, Service Registry (Eureka), and inter-service communication.

---

## 🏗 Architecture

This project contains the following services:

- Registry-service – Eureka Server (Service Discovery)
- API-Gateway – Central entry point for all services
- Question-service – Manages quiz questions
- Quiz-service – Manages quizzes and communicates with Question-service

---

## 📷 Eureka Server Dashboard

Below is the Eureka Service Registry showing all registered microservices:

![Eureka Dashboard 1](screenshots/eureka-dashboard.png)

![Eureka Dashboard 2](screenshots/eureka-dashboard-services.png)

![Eureka Dashboard 3](screenshots/eureka-dashboard-main.png)

## 🛠 Tech Stack

- Java 17
- Spring Boot
- Spring Cloud
- Eureka Server
- Spring Cloud Gateway
- Spring Data JPA
- Maven
