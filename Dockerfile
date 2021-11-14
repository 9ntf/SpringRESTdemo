FROM openjdk:11-jdk-slim

EXPOSE 8080

ADD target/spring-rest-demo-0.0.1-SNAPSHOT.jar app.jar

CMD ["java", "-jar", "app.jar"]

