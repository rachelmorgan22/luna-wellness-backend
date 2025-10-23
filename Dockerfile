# Use a JDK 21 image
FROM eclipse-temurin:21-jdk

# Set working directory in container
WORKDIR /app

# Copy everything to container
COPY . .

# Build the Spring Boot app
RUN ./mvnw clean package -DskipTests

# Expose the port Spring Boot runs on
EXPOSE 8080

# Run the Spring Boot app
CMD ["java", "-jar", "target/backend-0.0.1-SNAPSHOT.jar"]
