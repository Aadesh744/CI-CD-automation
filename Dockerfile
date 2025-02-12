FROM adoptopenjdk:11-jre-hotspot

WORKDIR /app

COPY target/devsecops-java-project-1.0-SNAPSHOT.jar /app/app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
