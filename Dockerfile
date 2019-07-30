FROM openjdk:8-jre-alpine
VOLUME /tmp
ARG JAR_FILE
#COPY /target/@project.artifactId@-@project.version@-repackage.jar app.jar
COPY /target/$JAR_FILE app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
EXPOSE 8080