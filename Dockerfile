FROM amazoncorretto:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 80/tcp
ENTRYPOINT ["java","-jar","/app.jar"]