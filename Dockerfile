# Stage 1: Build the application
FROM openjdk:17-jdk-alpine AS build

# Install Maven
RUN apk add --no-cache maven

# Set the working directory in the container
WORKDIR /app

# Copy the Maven build files
COPY pom.xml .

# Copy the source code
COPY src ./src

# Build the application
RUN mvn package -DskipTests

# Stage 2: Create the final image
FROM openjdk:17-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the jar file from the build stage
COPY --from=build /app/target/*.jar app.jar

# Expose the port the application runs on
EXPOSE 8180

# Run the application with debug logging enabled
ENTRYPOINT ["java", "-jar", "/app/app.jar", "--debug"]
