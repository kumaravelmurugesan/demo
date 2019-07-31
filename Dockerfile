FROM openjdk:8-jre-alpine
VOLUME /tmp
ARG JAR_FILE
#RUN echo $JAR_FILE
COPY target/$JAR_FILE app.jar
#COPY /target/demo-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
EXPOSE 8080