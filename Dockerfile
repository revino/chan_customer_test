FROM amazoncorretto:11
RUN yum -y update &&  yum -y install initscripts && yum -y install git && yum -y install java-11-openjdk && yum -y install wget && yum -y install telnet && yum -y install net-tools && yum clean all && yum clean metadata && rm -rf /var/cache/yum/*
VOLUME /tmp
ARG JAR_FILE
WORKDIR /
COPY ${JAR_FILE} app.jar
WORKDIR /
EXPOSE 8080/tcp
ENTRYPOINT ["java","-jar","/app.jar"]