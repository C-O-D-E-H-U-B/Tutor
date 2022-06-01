# Tutor

## Introduction

This is a common platform for the students and the teacher for the tution class sector. Hope to provide following features in the future  

-  Welcome page with the teacher's advertisements and notices. 
-  Have a wall to pulish the teacher's notices and posts.
-  User Settings and User Permissions maintainin.
-  Birtday Reminder and gitt allocation
-  Comment section to make the conversations.
-  A messenger application to communication each other. 
-  Assignment room  
-  Reports room  
-  Lecture Room  
-  Admin panel with statical analitics
-  Time slot booking to contact teacher 
-  Advertiement platform to promote other classes, stationary items etc 


## Prerequisites

- [x] JDK 17 or later 
- [x] Apache Maven 3.5 or later 
- [x] Node.js (v14.16.0 or compatible)
- [x] Postgres server (v12.0 or compatible)
- [x] React 17 or lator
- [x] Postman Latest version (9.18.3)
- [x] Intellij idea
- [x] Westorm of VS code    

## Configurations

Update src/main/resources/application.yml file according to your Postgres server hostname, database and user credentials

e.g.
```yml
spring:
  datasource:
    url: ${JDBC_DATABASE_URL:jdbc:postgresql://localhost:5432/tutor}
    username: ${JDBC_DATABASE_USERNAME:postgres}
    password: ${JDBC_DATABASE_PASSWORD:mysecret}
  dbcp2:
    max-wait-millis: 30000
    validation-query: "SELECT 1"
    validation-query-timeout: 30
  jpa:
    hibernate:
      ddl-auto: update
    open-in-view: false
    properties:
      hibernate:
        dialect: org.hibernate.dialect.PostgreSQLDialect
        jdbc:
          lob:
            non_contextual_creation: true
        id:
          new_generator_mappings: true
  config:
    activate:
      on-profile: default
springdoc:
  pathsToMatch: /api/**
```

## Swagger UI

Swagger UI can be accessed via `http://localhost:8080/swagger-ui/index.html`

