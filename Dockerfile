FROM openjdk:11
WORKDIR /app

COPY target/cloudcomputing-0.0.1-SNAPSHOT.jar /app/cloudcomputing-0.0.1-SNAPSHOT.jar

EXPOSE 8081

CMD ["java", "-jar", "cloudcomputing-0.0.1-SNAPSHOT.jar"]