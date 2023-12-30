FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/*.war sarma-0.0.1-SNAPSHOT.war
ENTRYPOINT ["java","-jar","/sarma-0.0.1-SNAPSHOT.war"]
EXPOSE 8080