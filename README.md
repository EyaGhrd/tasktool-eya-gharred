📦 Project Name tasktool

📄 Description
> **TaskTool** is a web-based application for managing daily tasks, helping users organize and track their to-do lists efficiently.*
> 🚀 Installation
> 🔧 Steps

1. **Clone the Repository**

   ```bash
   git clone https://github.com/your-username/project-name.git
   cd project-name
Configure the Database

    Create a PostgreSQL database and user.

    Update src/main/resources/application.properties with your database credentials:

    spring.datasource.url=jdbc:postgresql://localhost:5432/taskapp
    spring.datasource.username=projectuser
    spring.datasource.password=password
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect

Build the Project

mvn clean install

Run the Application

    mvn spring-boot:run

    The application will be available at http://localhost:8080.

🛠️ Usage

    Access the Application

    Open your browser and navigate to http://localhost:8080.

    API Endpoints
        GET /task/tasks - Retrieve all tasks
        POST /task/tasks - Create a new task
        PUT /task/tasks/{id} - Update a task
        DELETE /task/delete/{id} - Delete a task


### 📋 Prerequisites

- **Java 17**
- ** Spring boot 3.4.0 **
- **Maven**
- **PostgreSQL**

🎯 Features

    CRUD Operations for Tasks
    Task Prioritization
    Search and Filter Tasks by category and priority

📚 Technologies Used

    Java 17
    Spring Boot
    PostgreSQL
    Maven
    Hibernate