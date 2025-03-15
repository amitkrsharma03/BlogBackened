# 📝 Blog Backend

## 🚀 Overview
The **Blog Backend** is a RESTful API built with **Java Spring Boot**, designed to handle blog-related functionalities such as user management, post creation, commenting, and more. The backend is deployed on **AWS Elastic Beanstalk (EBS)** with **MySQL** as the database.

## 🛠 Tech Stack
<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white"/>
  <img src="https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white"/>
  <img src="https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white"/>
  <img src="https://img.shields.io/badge/AWS%20EBS-FF9900?style=for-the-badge&logo=amazon-aws&logoColor=white"/>
  <img src="https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white"/>
  <img src="https://img.shields.io/badge/Lombok-CA4245?style=for-the-badge&logo=java&logoColor=white"/>
</p>

#Database Architecture
![DatabaseArchitecture](https://github.com/user-attachments/assets/5e5f624b-4bf6-4176-940a-4969d0dcea31)

## 🎯 Features
- 📝 **Create, Read, Update, Delete (CRUD) operations** for blog posts.
- 👤 **User authentication and role-based access**.
- 💬 **Commenting system** for blog posts.
- 🏷️ **Category and tag management**.
- 🔍 **Search and filtering** capabilities.
- 📦 **AWS deployment for scalability**.

## 🚀 Installation & Setup
### 1️⃣ Clone the Repository
```sh
git clone https://github.com/amitkrsharma03/BlogBackened.git
cd BlogBackened
```

### 2️⃣ Configure Environment Variables
Create an `.env` file or configure `application.properties`:
```properties
spring.datasource.url=jdbc:mysql://your-db-url:3306/blog_db
spring.datasource.username=your-db-username
spring.datasource.password=your-db-password
jwt.secret=your-jwt-secret
server.port=8080
```

### 3️⃣ Run the Project
```sh
mvn clean install
mvn spring-boot:run
```

## 📌 API Endpoints (Sample)
| Method | Endpoint         | Description          |
|--------|----------------|----------------------|
| GET    | /api/posts     | Get all blog posts  |
| POST   | /api/posts     | Create a new post   |
| GET    | /api/users     | Get all users       |
| POST   | /api/comments  | Add a comment       |

## 🌍 Deployment
- **AWS Elastic Beanstalk (EBS)** for backend deployment.
- **AWS RDS** for managed MySQL database.
- **Docker** (if containerized deployment is used).

## 📌 Future Enhancements
- 📸 Image upload functionality
- 📢 Notifications for new comments
- 📊 Analytics and reporting

## 🤝 Contributing
Contributions are welcome! Feel free to fork the repo and submit pull requests.

## 📜 License
MIT License © [Amit Kumar Sharma](https://github.com/amitkrsharma03)

---
This backend serves as a scalable and efficient foundation for a blogging platform. 🚀

