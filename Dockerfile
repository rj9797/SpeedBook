# From maven:3.8.4-openjdk-17 AS build
# WORKDIR /app
# COPY pom.xml .
# COPY src ./src
# RUN mvn clean install

# FROM openjdk:17-alpine
# WORKDIR /app
# COPY /target/irctc-0.0.1-SNAPSHOT.jar ./speed-book-build-1.0.jar
# EXPOSE 8080
# ENTRYPOINT ["java","-jar","/app/irctc-0.0.1-SNAPSHOT.jar"]

FROM maven:3.8.4-openjdk-17 AS build
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline
COPY src ./src
RUN mvn package -DskipTests

FROM openjdk:17-jdk
WORKDIR /app
COPY --from=build /app/target/*.jar speed-book.jar
ENTRYPOINT ["java", "-jar", "speed-book.jar"]