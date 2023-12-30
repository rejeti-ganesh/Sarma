FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
ENTRYPOINT ["java","-jar","./target/sarma-0.0.1-SNAPSHOT.war"]
EXPOSE 8080