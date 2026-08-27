FROM openjdk:21-jdk-slim
WORKDIR /app
COPY backend-core/ /app/
RUN ./mvnw clean package
CMD ["java", "-jar", "target/backend-core-0.0.1-SNAPSHOT.jar"]
