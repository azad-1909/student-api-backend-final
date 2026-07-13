# 🎓 Student Management API

A production-grade RESTful API built to manage student records. This backend system is fully containerized and uses automated database migrations to ensure data integrity across environments.

## 🚀 Tech Stack
* **Core Framework:** Spring Boot 3.x
* **Language:** Java 17+
* **Database:** MySQL
* **Database Migrations:** Flyway
* **Containerization:** Docker
* **Server:** Apache Tomcat

## 🏗️ Architecture & Objectives
This project successfully integrates three core backend disciplines:
1. **REST API Development:** Created robust endpoints to handle HTTP requests and JSON mapping.
2. **Database Version Control:** Implemented Flyway to automatically track, manage, and execute SQL schema changes on startup.
3. **Environment Isolation:** Wrote a `Dockerfile` to package the Java application and its dependencies into a standalone Linux container, mapping port `8084` to handle external traffic while utilizing `host.docker.internal` to connect to a local database.

## 🛠️ Local Setup & Installation

### 1. Clone the Repository
```bash
git clone [https://github.com/azad-1909/student-api-backend-final.git](https://github.com/azad-1909/student-api-backend-final.git)
```
### 2. Configure Database
Ensure MySQL is running on your machine. The application will automatically connect and Flyway will execute the `V1__create_students_table.sql` script to build your schema.

### 3. Build and Run via Docker
```bash
docker build -t student-api-backend .
docker run -p 8084:8084 student-api-backend
```

<img width="1919" height="1079" alt="Screenshot 2026-06-08 200216" src="https://github.com/user-attachments/assets/a34fe741-c31d-4cba-9d38-0d1adaede016" />


<img width="1919" height="1070" alt="Screenshot 2026-06-08 200224" src="https://github.com/user-attachments/assets/4db2b2f8-f4b0-4093-91ec-103679b14702" />


<img width="1919" height="1079" alt="Screenshot 2026-06-08 201707" src="https://github.com/user-attachments/assets/ae039968-b780-4c82-a40e-b2def1a0035e" />


<img width="1919" height="1079" alt="Screenshot 2026-06-08 201714" src="https://github.com/user-attachments/assets/5f1a63df-2dda-4105-97ff-a5aa39113463" />


<img width="1918" height="1079" alt="Screenshot 2026-06-08 201744" src="https://github.com/user-attachments/assets/72c888c4-4ff3-4f10-a696-e671a0506b63" />


<img width="1919" height="1079" alt="Screenshot 2026-06-08 201802" src="https://github.com/user-attachments/assets/5ca1e58f-c2a2-4496-9b5a-0ef279e0648c" />


## 📝 Task Submission Documents
* [Task 1 - REST API Development](https://docs.google.com/document/d/1FY5p1W8P7nSlWtnOGJvS_vW2wd7aZZgGtRb5Z_nzh0Q/edit?usp=sharing)
* [Task 2 - Database Version Control](https://docs.google.com/document/d/1013bDXRPMubd51ycy0jwDudDdH7UZAqZpAuYXdDwD_k/edit?usp=sharing)
* [Task 4 - Dockerization](https://docs.google.com/document/d/1WpR9bduvHbNwuvY9mF67zv6LKi8IaQ_sBhk6COIxWrU/edit?usp=sharing)
