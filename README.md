# 📂 User Registration API  

A **RESTful API** developed in **Java** with **Spring Boot**, designed for **user registration**, including **authentication**, **authorization**, and **profile management**. The API provides complete **CRUD** functionalities and ensures security with **JWT** (JSON Web Token).  

---

## 🚀 Technologies  

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white" />
  <img src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring&logoColor=white" />
  <img src="https://img.shields.io/badge/JPA-Hibernate-blue?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Spring_Security-6DB33F?style=for-the-badge&logo=spring&logoColor=white" />
  <img src="https://img.shields.io/badge/JWT-black?style=for-the-badge&logo=JSON%20web%20tokens" />
  <img src="https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white" />
  <img src="https://img.shields.io/badge/H2_Database-003545?style=for-the-badge&logo=h2&logoColor=white" />
  <img src="https://img.shields.io/badge/Lombok-9b4993?style=for-the-badge&logo=lombok&logoColor=white" />
  <img src="https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white" />
</p>

---

## ✅ Features  

- **User Registration:** Create new users with **name**, **email**, **password**, and **profile photo**.  
- **Authentication and Authorization:** Secure login using **Spring Security** and **JWT**.  
- **Profile Management:** Allows users to update their information.  
- **User Listing:** Retrieve users with **filters** and **pagination**.  
- **Account Deletion:** Safely delete user profiles.  
- **Data Validation:** **Jakarta Validation** is used to ensure valid input data.  

---

## 📦 Prerequisites  

- **Java 17** installed ([Download here](https://adoptium.net))  
- **Maven** installed ([Download here](https://maven.apache.org))  
- **MySQL** or **H2 Database**  
- **Git** to clone the repository  

---

## 🚦 Installation and Execution  

```bash
# Clone the repository
git clone https://github.com/your-username/user-registration-api.git

# Navigate to the project directory
cd user-registration-api

# Build the project
mvn clean install

# Run the application
mvn spring-boot:run

````

```bash
# MySQL Database Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/user_db
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

# JWT Configuration
jwt.secret=yourSecretJWT
jwt.expiration=86400000

# H2 Database (optional)
spring.datasource.url=jdbc:h2:mem:user_db
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
````
## 🔥 Main Endpoints  

### 🚪 **Authentication**  

| Method | Endpoint         | Description                                   |
|--------|------------------|-----------------------------------------------|
| `POST` | `/users/login`   | Performs login and returns a **JWT token**    |
| `POST` | `/users/register`| Registers a new user                          |

---

### 👤 **User Management**  

| Method   | Endpoint          | Description                                  |
|-----------|------------------|----------------------------------------------|
| `GET`    | `/users/all`      | Retrieves all users (**protected route**)    |
| `PUT`    | `/users/update`   | Updates the authenticated user's data        |
| `DELETE` | `/users/delete`   | Deletes the authenticated user               |

---

## 💡 Example Request: User Registration  

### ➡️ **Request (`POST /users/register`)**  

```json
{
    "name": "Sansão Vieira",
    "email": "sansao@email.com",
    "password": "password123",
    "photo": "https://link-to-photo.com/photo.png"
}
 
```
⬅️ Success Response (201 Created)  
```json
{
    "id": 1,
    "name": "Sansão Vieira",
    "email": "sansao@email.com",
    "photo": "https://link-to-photo.com/photo.png",
    "token": "eyJhbGciOiJIUzI1NiJ9..."
}
```
## 🛠️ Contributing  

1. **Fork** the repository.  
2. Create a **branch** for your feature:  

```bash
git checkout -b feature/new-feature
git commit -m 'Add new feature'
git push origin feature/new-feature
```

## 📄 License  
This project is licensed under the **MIT License**. See the [LICENSE](LICENSE) file for details.  

---

## 📧 Contact  
📍 **Sansão Vieira**  
📧 [sansaovieira@email.com](mailto:sansaovieira@email.com)  
🌐 [LinkedIn](https://www.linkedin.com/in/sansaovieira)  



