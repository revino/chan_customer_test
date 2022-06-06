FROM amazoncorretto:11
COPY build/libs/*.jar app.jar
EXPOSE 80/tcp
ENTRYPOINT ["java","-jar","/app.jar"]