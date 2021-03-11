# REST online store (Group project)

Group project at Kodilla's bootcamp.
Project back-end.

My tasks:
  1) Product Controller - initial implementation of endpoints,
  2) Order Controller - endpoint tests, 
  3) Entity User - implementation, 
  4) Entity Card - tests CRUD.
 
Project handling on Kaban board in Jira.


# 1. Description

This project is an implementation of a simple BackEnd logic for an ecommerce store. 
It is implemented in a REST architecture, and it is made of 5 entities (product, group, user, cart, order) 
coupled together with SQL-style relationships and business logic.

# 2. Demo

Project is not publicly available at the moment, and exists as this GitHub repo.

# 3. Requirements

- Java 8
- MySQL 8 server
- Gradle 4.10
- Spring Boot 2.1.1
- Lombok 1.18

# 4. Startup

Project can be launched locally by executing EcommerceeApplication class, which starts up the Spring ApplicationContext.
While running, it can be accessed under [local address](http://localhost:8080).

# 5. Application

At this stage, project simulates a simple operation of an ecommerce store, which houses the following:
- User & Cart (decoupled, a Cart can exist without a User, if not logged in)
- Product & Group (decoupled Products can belong to certain product Groups (1 group per product type), 
and Groups can exist without any products attached to them)
- Order (build based on a passed Cart)

Further development of the application can include the following:
- User logging in and out, with User's details being stored in the DB for easier Order completion
- Order class expansion to include user details required to issue an invoice
