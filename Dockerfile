FROM openjdk:11
WORKDIR /app
COPY ./target/myAwsProject.jar ./
CMD ["java", "-jar", "myAwsProject.jar"]

EXPOSE 8080