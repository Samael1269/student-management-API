# Student Management API

This is a simple Spring Boot REST API project for managing student records. The application connects to a MySQL database and allows users to create, view, update, and delete student information.

## Technologies Used

* Java 17
* Spring Boot
* Spring Web
* Spring Data JPA
* MySQL
* Gradle
* Postman

## Project Features

* Add a new student
* View all students
* View a student by ID
* Update student details
* Delete a student
* Store student data in MySQL database

## Project Structure

```text
src/main/java/com/example/studentmanagementapi
├── controller
│   └── studentcontroller.java
├── model
│   └── student.java
├── repository
│   └── studentrepository.java
├── service
│   └── studentservice.java
└── StudentManagementApiApplication.java
```

## Database Configuration

The application uses MySQL database.

Database name:

```sql
student_db
```

Example configuration in `application.properties`:

```properties
spring.application.name=student-management-api

spring.datasource.url=jdbc:mysql://localhost:3307/student_db
spring.datasource.username=broot
spring.datasource.password=your_mysql_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

server.port=8080
```

## API Endpoints

### Get All Students

```http
GET http://localhost:8080/api/students
```

### Add Student

```http
POST http://localhost:8080/api/students
```

Request body:

```json
{
  "name": "Sam",
  "email": "sam@example.com",
  "course": "Software Engineering"
}
```

### Get Student by ID

```http
GET http://localhost:8080/api/students/{id}
```

Example:

```http
GET http://localhost:8080/api/students/1
```

### Update Student

```http
PUT http://localhost:8080/api/students/{id}
```

Example:

```http
PUT http://localhost:8080/api/students/1
```

Request body:

```json
{
  "name": "Sam Updated",
  "email": "samupdated@example.com",
  "course": "Computer Science"
}
```

### Delete Student

```http
DELETE http://localhost:8080/api/students/{id}
```

Example:

```http
DELETE http://localhost:8080/api/students/1
```

## How to Run the Project

### 1. Clone the repository

```bash
git clone https://github.com/your-username/student-management-api.git
```

### 2. Open the project in IntelliJ IDEA

Open the project folder in IntelliJ IDEA.

### 3. Create MySQL database

```sql
CREATE DATABASE student_db;
```

### 4. Update database password

Open:

```text
src/main/resources/application.properties
```

Update the MySQL password:

```properties
spring.datasource.password=your_mysql_password
```

### 5. Run the application

Run the main class:

```text
StudentManagementApiApplication.java
```

Or run using Gradle:

```bash
.\gradlew bootRun
```

## How to Build JAR File

Run:

```bash
.\gradlew clean build
```

The JAR file will be created inside:

```text
build/libs
```

To run the JAR file:

```bash
java -jar build/libs/student-management-api-0.0.1-SNAPSHOT.jar
```

## Testing

The API can be tested using Postman or browser.

Example:

```text
http://localhost:8080/api/students
```

## Status

The project is working locally with Spring Boot, MySQL, and Postman.

## System Architecture Diagram

<img width="1448" height="1086" alt="student management api" src="https://github.com/user-attachments/assets/bebc51b4-996e-4854-9b51-4d985a9756db" />

