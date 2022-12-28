FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the project files
COPY . .

# Build the project
RUN ./gradlew build

# Run the application
CMD ["java", "-jar", "build/libs/kafka-streams-app-0.0.1-SNAPSHOT.jar"]
