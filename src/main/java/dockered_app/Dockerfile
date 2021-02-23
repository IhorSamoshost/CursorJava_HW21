FROM adoptopenjdk/openjdk13:x86_64-alpine-jdk-13.0.2_8
EXPOSE 8080
ARG JAR_FILE=docker-db-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} application.jar
ENTRYPOINT ["java", "-jar", "application.jar"]