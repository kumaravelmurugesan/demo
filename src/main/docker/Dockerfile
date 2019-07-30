FROM openjdk:8-jre-alpine
VOLUME /tmp
COPY /target/@project.artifactId@-@project.version@.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
EXPOSE 8080