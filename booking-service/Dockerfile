
FROM maven:3.9-eclipse-temurin-27 AS build

WORKDIR /app

COPY . .

RUN chmod +x mvnw && ./mvnw clean package -DskipTests

FROM eclipse-temurin:27-jre

WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

EXPOSE 9020

ENTRYPOINT ["java", "-jar", "app.jar"]
