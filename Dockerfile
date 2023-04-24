FROM gradle:jdk17-alpine
VOLUME /docker-volume/springboot
ENV BASE_DIR=/docker-app/springboot
ENV TEMPLATE_DIR=${BASE_DIR}/templates
COPY build/libs/app.jar ${BASE_DIR}/app.jar
COPY src/main/resources/templates ${TEMPLATE_DIR}
ENTRYPOINT ["java","-jar","/docker-app/springboot/app.jar"]