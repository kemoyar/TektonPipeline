# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the project's JAR file to the container
COPY /workspace/source/target/TektonPipeline-0.0.1-SNAPSHOT.jar /app/TektonPipeline.jar

# Expose the application port
EXPOSE 8080

# Define the command to run the JAR file
ENTRYPOINT ["java", "-jar", "/app/TektonPipeline.jar"]
