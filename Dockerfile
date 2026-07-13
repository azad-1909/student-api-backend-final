# Use an official Java 17 runtime as a parent image
FROM eclipse-temurin:17-jdk-alpine

# Copy the packaged jar file into our docker image
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar

# Run the jar file 
ENTRYPOINT ["java", "-jar", "/app.jar"]