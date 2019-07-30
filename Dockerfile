FROM openjdk:8-jre-alpine
VOLUME /tmp
#RUN mkdir /home/vsts/work/1/s
WORKDIR /home/vsts/work/1/s
COPY /target/@project.artifactId@-@project.version@-repackage.jar app.jar
#COPY /target/demo-0.0.1-SNAPSHOT-repackage.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
EXPOSE 8080