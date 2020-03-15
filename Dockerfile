FROM java:8-jdk-alpine
COPY ./build/libs/myspringboot-docker-1.jar /usr/app/
WORKDIR /usr/app
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "myspringboot-docker-1.jar"]