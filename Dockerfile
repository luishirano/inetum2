FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8001
ADD ./target/usuario-service-1.0.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]