FROM openjdk:11
ADD target/web-backend-1.0-SNAPSHOT.jar web-backend-1.0-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "web-backend-1.0-SNAPSHOT.jar"]