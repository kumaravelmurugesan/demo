FROM openjdk:8-jre-alpine
VOLUME /tmp
COPY /target/demo-0.0.1-SNAPSHOT-spring-boot.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.active.profile=dev","-jar","/app.jar"]
EXPOSE 8080