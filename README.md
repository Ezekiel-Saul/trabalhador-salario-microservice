# Multi-Microservices Project

This repository contains two microservices:

1. **rest-template-trabalhador Microservice**: Responsible for salary calculations.
2. **rest-template-salary Microservice**: Manages worker data and communicates with the Salario Microservice.

## Project Structure
## Running the Microservices

### rest-template-salary Microservice
- Navigate to the `rest-template-salary microservice` directory and run:
  ```bash
  mvn spring-boot:run

### rest-template-trabalhador Microservice
- Navigate to the `rest-template-trabalhador microservice` directory and run:
  ```bash
  mvn spring-boot:run

  ### rest-template-trabalhador Microservice
- Navigate to the `rest-template-trabalhador microservice` directory and run:
  ```bash
  mvn spring-boot:run

   ### Communication Between Services
- Trabalhador Microservice calls the Salario Microservice via REST API on:
  ```bash
  http://localhost:8083/salario
