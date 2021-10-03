FROM openjdk:8-jdk-alpine
LABEL PROJECT_NAME=producer-service \
      PROJECT=producer-service

COPY target/producer-service-0.0.1-SNAPSHOT.jar  producer-service.jar
EXPOSE 8383 8383
ENTRYPOINT ["java","-jar","/producer-service.jar"]
