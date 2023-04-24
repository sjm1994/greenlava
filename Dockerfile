# Base image
FROM gradle:jdk17-alpine

# Set working directory
WORKDIR /docker-app/springboot

VOLUME /docker-volume/springboot

# Copy the application jar file
COPY build/libs/*.jar app.jar

# Expose port
EXPOSE 8080

# Set entry point
ENTRYPOINT ["java","-jar", "-Dspring.profiles.active=prod","app.jar"]