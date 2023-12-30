FROM openjdk:8-jdk-alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
COPY --from=build /home/app/target/sarma-0.0.1-SNAPSHOT.war sarma-0.0.1-SNAPSHOT.war
ENTRYPOINT ["java","-jar","/sarma-0.0.1-SNAPSHOT.war"]
