# Category-Product Management System

## Overview
The **Category-Product Management System** is a Spring Boot-based RESTful application designed to manage product categories and their associated products. This system allows users to perform CRUD operations (Create, Read, Update, Delete) on both categories and products, while maintaining a one-to-many relationship where a single category can have multiple products.

The application uses JPA and Hibernate for object-relational mapping and supports server-side pagination to efficiently fetch large sets of data in chunks. Each product is linked to a category, and while retrieving a product, the associated category details are also included in the response.

## Technologies Used
- **Spring Boot** - Backend framework
- **JPA (Java Persistence API)** & **Hibernate** - ORM for database interaction
- **RESTful APIs** - Communication over HTTP
- **MySQL** - Relational database
- **Spring Data JPA** - Repository abstraction layer
- **Pagination** - Server-side pagination for efficient data handling

## Features
- **Category CRUD Operations**
    - `GET /api/categories`: Get all categories with pagination
    - `POST /api/categories`: Create a new category
    - `GET /api/categories/{id}`: Get a category by ID
    - `PUT /api/categories/{id}`: Update an existing category
    - `DELETE /api/categories/{id}`: Delete a category by ID

- **Product CRUD Operations**
    - `GET /api/products`: Get all products with pagination
    - `POST /api/products`: Create a new product
    - `GET /api/products/{id}`: Get a product by ID along with its associated category
    - `PUT /api/products/{id}`: Update a product by ID
    - `DELETE /api/products/{id}`: Delete a product by ID

- **Category-Product Relationship**: 
    - A **Category** can have multiple **Products** (One-to-Many relationship).

## API Endpoints

### Categories
- **GET** `/api/categories?page={page}`: Get all categories (paginated)
- **POST** `/api/categories`: Create a new category
- **GET** `/api/categories/{id}`: Get category by ID
- **PUT** `/api/categories/{id}`: Update category by ID
- **DELETE** `/api/categories/{id}`: Delete category by ID

### Products
- **GET** `/api/products?page={page}`: Get all products (paginated)
- **POST** `/api/products`: Create a new product
- **GET** `/api/products/{id}`: Get product by ID with associated category details
- **PUT** `/api/products/{id}`: Update product by ID
- **DELETE** `/api/products/{id}`: Delete product by ID

## Setup and Installation

### Prerequisites
- Java 11 or later
- MySQL (or any other RDBMS)
- Maven (for managing dependencies)

### Steps to Run the Project

1. Clone the repository:
    ```bash
    git clone https://github.com/yourusername/category-product-management.git
    ```

2. Navigate to the project directory:
    ```bash
    cd category-product-management
    ```

3. Set up your **MySQL** database with the following configuration in `application.properties`:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/category_product_db
    spring.datasource.username=root
    spring.datasource.password=yourpassword
    spring.jpa.hibernate.ddl-auto=update
    ```

4. Build and run the project using Maven:
    ```bash
    mvn spring-boot:run
    ```

5. Open your browser and visit `http://localhost:8080` to test the APIs.

## Contribution
Feel free to fork the repository, create a branch, and submit a pull request for any improvements or fixes. Make sure to follow the standard commit message conventions.


