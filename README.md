 📅 Event Scheduler API

A simple Spring Boot REST API that allows users to create, view, update, and manage events.

---

## 🚀 Features

- Add new events
- View all scheduled events
- Get details of a specific event
- Update an existing event

---

## 🛠️ Tech Stack

- Java 17+
- Spring Boot 3.x
- Spring Web
- Spring Data JPA
- H2 / MySQL (configurable)
- Lombok (optional)
- Maven or Gradle

---

## 🗂️ Project Structure

com.saurabh.event
├── controller # REST Controllers
├── entity # Event entity class
├── repo # JPA Repository interface
├── request # DTO for incoming request (RequestEvent)
├── response # DTO for outgoing response (ResponseEvent)
├── service # Service Interface
├── service.impl # Service Implementation
└── EventSchedulerApplication.java

yaml
Copy
Edit

---

## 🔧 API Endpoints

| Method | Endpoint            | Description                |
|--------|---------------------|----------------------------|
| GET    | `/api/events`       | Get all events             |
| GET    | `/api/event/{name}` | Get an event by title      |
| POST   | `/api/event`        | Add a new event            |
| PUT    | `/api/event/{name}` | Update an existing event   |

---

## 📥 Sample Request Payload

### POST / PUT `/api/event`:

```json
{
  "title": "Team Meeting",
  "date": "2025-08-10",
  "location": "Conference Room A",
  "desc": "Discuss Q3 OKRs"
}
▶️ Running the Project
Clone the repository:

bash
Copy
Edit
git clone https://github.com/your-username/event-scheduler.git
cd event-scheduler
Run using Maven or your IDE:

bash
Copy
Edit
./mvnw spring-boot:run
Test with Postman or Swagger (if enabled).

💾 Database Configuration
Using H2 by default. You can switch to MySQL by updating application.properties:

properties
Copy
Edit
spring.datasource.url=jdbc:mysql://localhost:3306/eventdb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
