# Real-Time Chat Application - Backend

## Description
A real-time group chat application backend built with Spring Boot, enabling users to create/join chat rooms and communicate instantly. Supports text messages, image/video sharing, and persistent message history using MongoDB.

## Key Features
- **Room Management** 
  - Create rooms with unique IDs
  - Join existing rooms
  - Validate room ID uniqueness
- **Real-Time Messaging**
  - WebSocket-based communication
  - Instant message delivery
  - Message persistence in MongoDB
- **User Features**
  - Random avatar generation
  - Message timestamps
  - Chat history access for new participants
- **Scalability**
  - MongoDB for scalable storage
  - WebSocket for efficient real-time updates

## Technologies Used
- **Backend**: Spring Boot 3.x
- **Database**: MongoDB
- **Real-Time Communication**: WebSocket (STOMP protocol)
- **Build Tool**: Maven

## Prerequisites
- Java 17+
- MongoDB 6.0+
- Maven 3.8+
- Spring Boot 3.2+
- WebSocket client library

## Installation
1. Clone repository:
 
   git clone https://github.com/yourusername/chat-app-backend.git
   
2. Configure MongoDB in application.properties:
   
   spring.data.mongodb.uri= mongodb://localhost:27017/chatdb

3. Build Project

  mvn clean install
  
4. Run Application

   mvn spring-boot:run





