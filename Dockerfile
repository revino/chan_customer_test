FROM amazoncorretto:11
COPY ${JAR_FILE} app.jar
EXPOSE 8080/tcp
ENTRYPOINT ["java","-jar","/app.jar"]