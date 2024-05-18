Our Funeral Parlour System is a comprehensive solution developed using the Spring Tool Suite IDE and powered by the Spring Boot framework. This system aims to streamline the management and operations of a funeral parlour, offering various features and functionalities to efficiently handle funeral arrangements and services.

Key Dependencies:

Spring Boot Dev Tool: This dependency provides automatic restart capability for development, improving productivity by reducing the need for manual server restarts.

Thymeleaf: Thymeleaf is used as the template engine to create dynamic and interactive user interfaces, facilitating the presentation layer of the application.

Spring Web: The Spring Web dependency enables the development of web-based applications, providing essential components for handling HTTP requests and responses.

Spring Data JPA: Spring Data JPA simplifies the implementation of data access layers by providing a set of abstractions and utilities for interacting with relational databases. It promotes the use of the Java Persistence API (JPA) for database operations.

MySQL Driver: The MySQL Driver is used to establish a connection between the Spring application and the MySQL database, enabling data persistence and retrieval.

System Architecture:

The system follows a layered architecture, with separate layers for presentation, business logic, and data access. The presentation layer is implemented using Thymeleaf templates, which are dynamically rendered based on user interactions. The business logic layer contains service components responsible for processing business rules and orchestrating interactions between different parts of the system. The data access layer interacts with the MySQL database using Spring Data JPA repositories, providing seamless CRUD operations for managing funeral-related data.

Key Features:

Funeral Arrangement Management: Users can create, update, and manage funeral arrangements, including details such as casket selection, venue booking, and service customization.

Customer Interaction: The system facilitates customer interaction by allowing users to schedule appointments, make inquiries, and provide feedback on services.

Deployment:

The system is deployed on an Apache Tomcat server, providing a reliable and scalable environment for hosting the application. Continuous integration and deployment (CI/CD) practices may be employed to automate the deployment process and ensure seamless updates to the production environment.

Overall, our Funeral Parlour System offers a robust and user-friendly platform for managing funeral services efficiently, catering to the diverse needs of both funeral parlour staff and customers.
