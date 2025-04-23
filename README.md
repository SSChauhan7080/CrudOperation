# CrudOperation
In this i introduced the all crud operation
Prerequisites

Java 17+

Spring Boot

MySQL Server

Maven

Postman (for API testing)

Clone the Project

git clone https://github.com/your-username/your-repo-name.git
cd your-repo-name

Configure the Database

Important: 🚨 Before running the project:

Open the application.properties file.

Change the database credentials according to your local setup:

spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password

Replace:

your_database_name with your MySQL database name

your_mysql_username with your MySQL username

your_mysql_password with your MySQL password

Install Dependencies

mvn clean install

Run the Application

mvn spring-boot:run

The server will start on http://localhost:8080 by default.

🛠️ Using Postman

Use Postman to perform CRUD operations on various APIs.

Example API Endpoints

Operation

Endpoint

Method

Create User

/api/users

POST

Get User by ID

/api/users/{id}

GET

Update User

/api/users/{id}

PUT

Delete User

/api/users/{id}

DELETE

Don't forget to set Content-Type: application/json while making POST and PUT requests.

🌟 Features

User Management (Register, Login)

Product Management (Add, Update, Delete Products)

Cart Operations (Add/Remove products)

Order Processing

Payment and Refund Handling

Support Ticket Management

🚀 Technologies Used

Java 17

Spring Boot

Spring Data JPA

MySQL

Postman
