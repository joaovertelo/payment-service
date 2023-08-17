FROM amazoncorretto:17.0.7-alpine

WORKDIR /app

COPY target/payment-0.0.1-SNAPSHOT.jar /app/spring-app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "spring-app.jar"]