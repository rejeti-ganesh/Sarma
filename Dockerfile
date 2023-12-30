FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY --from=build /home/app/target/sarma-0.0.1-SNAPSHOT.war sarma-0.0.1-SNAPSHOT.war
ENTRYPOINT ["java","-jar","/sarma-0.0.1-SNAPSHOT.war"]
