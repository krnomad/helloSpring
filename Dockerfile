FROM openjdk:8-jdk-alpine

ARG JAR_FILE=./build/libs/simple-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8881
ENTRYPOINT ["java","-jar","/app.jar"]

