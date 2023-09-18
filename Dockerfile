#FROM eclipse-temurin:11-jdk-alpine
#VOLUME /tmp
#COPY target/*.jar app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]
#EXPOSE 8080

# Use a base image with JDK 11
FROM adoptopenjdk:11-jdk-hotspot-bionic

# Set a working directory inside the container
WORKDIR /app

# Copy the JAR file from your local machine to the container
COPY target/*.jar app.jar

# Define the default command to run when the container starts
CMD ["java", "-jar", "app.jar"]

# Expose port 8080 (optional, for documentation purposes)
EXPOSE 8080