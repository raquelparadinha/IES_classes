FROM openjdk:11
VOLUME /tmp
ARG JAR_FILE
COPY ./target/lab3_3-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]