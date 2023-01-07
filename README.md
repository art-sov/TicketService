# UDEMY Spring Cloud Fundamentals
## Ticket Service

### Project requirements

Java 17. Install Java if you don't already have
it: [Java Downloads](https://www.oracle.com/java/technologies/downloads/)

Maven 3.8.7 or late

### Build Project

  ```
  mvn install
  ```

### Launch App locally

Required ports: 8080

1. Start [Price Service](https://github.com/art-sov/PriceService) spring-boot application on port 8090
2. Start Ticket Service:
```
java -jar target/ticketservice-0.0.1-SNAPSHOT.jar
```
