

# Employee Management API

[![Java](https://img.shields.io/badge/Java-17-blue.svg)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![Maven](https://img.shields.io/badge/Maven-3.8+-orange.svg)](https://maven.apache.org/)
[![Build](https://github.com/nourkastyve/apiemployee/actions/workflows/maven.yml/badge.svg)](https://github.com/nourkastyve/apiemployee/actions)

---

## Table of Contents

* [Overview](#overview)
* [Features](#features)
* [Tech Stack](#tech-stack)
* [Installation](#installation)

    * [Prerequisites](#prerequisites)
    * [Setup](#setup)
* [Project Structure](#project-structure)
* [API Endpoints](#api-endpoints)
* [Database](#database)
* [Running Tests](#running-tests)
* [Contribution](#contribution)
* [License](#license)

---

## Overview

**Employee Management API** is a RESTful application built with **Spring Boot** for managing employees within an organization.
It offers endpoints for creating, reading, updating, and deleting employee records and is easily extensible and integrable into other systems.

---

## Features

* CRUD operations for employee management
* In-memory database (**H2**) for rapid prototyping
* Easy database switching to MySQL or PostgreSQL
* Integrated testing with **JUnit 5** and **Mockito**
* GitHub Actions CI workflow for automatic builds and tests

---

## Tech Stack

* **Java 17**
* **Spring Boot 3.x**
* **Spring Web**
* **Spring Data JPA**
* **Lombok**
* **H2 Database** (default)
* **JUnit 5 & Mockito**
* **Maven**

---

## Installation

### Prerequisites

* **Java 17+** installed
* **Maven 3.8+** installed
* **Git** installed

### Setup

1. **Clone the repository**

   ```bash
   git clone https://github.com/nourkastyve/apiemployee.git
   cd apiemployee
   ```
2. **Build the project**

   ```bash
   mvn clean install
   ```
3. **Run the application**

   ```bash
   mvn spring-boot:run
   ```
4. **Access the API**

    * Base URL: [http://localhost:8080/api/employees](http://localhost:9000/api/employees)
    * H2 Console: [http://localhost:8080/h2-console](http://localhost:9000/h2-console)

---

## Project Structure

```
src/main/java/com/example/employees
 ├── controller    # REST controllers
 ├── service       # Business logic
 ├── repository    # JPA repositories
 ├── model         # JPA entities
 └── dto           # Data Transfer Objects (optional)

src/main/resources
 ├── application.properties
 └── data.sql      # Initial database seed (optional)
```

---

## API Endpoints

### Get All Employees

`GET /api/employees`
**Response:**

```json
[
  {
    "id": 1,
    "firstName": "John",
    "lastName": "Doe",
    "email": "john.doe@example.com"
  }
]
```

### Get Employee by ID

`GET /api/employees/{id}`

### Create Employee

`POST /api/employees`
**Request Body:**

```json
{
  "firstName": "Jane",
  "lastName": "Smith",
  "email": "jane.smith@example.com"
}
```

### Update Employee

`PUT /api/employees/{id}`

### Delete Employee

`DELETE /api/employees/{id}`

---

## Database

### Example `data.sql`

```sql
INSERT INTO employees (first_name, last_name, email) VALUES ('John', 'Doe', 'john.doe@example.com');
INSERT INTO employees (first_name, last_name, email) VALUES ('Jane', 'Smith', 'jane.smith@example.com');
```

---

## Running Tests

This project includes unit tests using **JUnit 5** and **Mockito**.
Run all tests:

```bash
mvn test
```

---

## Contribution

Contributions are welcome!

1. Fork the repository
2. Create a new branch (`git checkout -b feature/YourFeature`)
3. Commit your changes (`git commit -m 'Add some feature'`)
4. Push to the branch (`git push origin feature/YourFeature`)
5. Open a **Pull Request**

