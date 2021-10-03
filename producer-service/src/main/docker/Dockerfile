FROM openjdk:8-jdk-alpine
LABEL PROJECT_NAME=producer-service \
      PROJECT=producer-service
# In maven/ the files as specified in the <assembly> section is stored
# and need to be added manually
#ADD maven/  / 
#RUN echo 'Jar name is' $JAR_FILE \n
COPY producer-service-0.0.1-SNAPSHOT.jar  producer-service.jar
EXPOSE 8383 8383
ENTRYPOINT ["java","-jar","/producer-service.jar"]
