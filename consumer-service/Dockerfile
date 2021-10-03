FROM openjdk:8-jdk-alpine
LABEL PROJECT_NAME=consumer-service \
      PROJECT=consumer-service

COPY target/consumer-service-0.0.1-SNAPSHOT.jar  consumer-service.jar
EXPOSE 8384 8384
ENTRYPOINT ["java","-jar","/consumer-service.jar"]
