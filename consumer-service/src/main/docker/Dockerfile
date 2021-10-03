FROM openjdk:8-jdk-alpine
LABEL PROJECT_NAME=consumer-service \
      PROJECT=consumer-service
# In maven/ the files as specified in the <assembly> section is stored
# and need to be added manually
#ADD maven/  / 
RUN echo 'Jar name is' $JAR_FILE \n
COPY consumer-service-0.0.1-SNAPSHOT.jar  consumer-service.jar
EXPOSE 8384 8384
ENTRYPOINT ["java","-jar","/consumer-service.jar"]
