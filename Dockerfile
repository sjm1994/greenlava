FROM gradle:17-jdk-alpine
VOLUME /docker-volume/springboot
ARG JAR_FILE=build/libs/app.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]