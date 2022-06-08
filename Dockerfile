FROM amazoncorretto:11
ARG JAR_FILE=./build/libs/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 80/tcp
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=prod", "/app.jar"]