FROM openjdk:17-jdk-alpine
COPY target/itauApp-0.0.1-SNAPSHOT.jar itau-app.jar
ENTRYPOINT ["java", "-jar", "itau-app.jar"]