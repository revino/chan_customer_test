FROM amazoncorretto:11
COPY ${JAR_FILE} app.jar
EXPOSE 80/tcp
ENTRYPOINT ["java","-jar","/app.jar"]