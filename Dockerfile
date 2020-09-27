ARG DOCKER_HUB_PROXY
FROM ${DOCKER_HUB_PROXY}openjdk:13-alpine
WORKDIR /app
COPY ./target/myAwsProject.jar ./
EXPOSE 8080
CMD ["java", "-jar", "myAwsProject.jar"]