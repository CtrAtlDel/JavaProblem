FROM bellsoft/liberica-openjdk-alpine as builder
#WORKDIR /src
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]