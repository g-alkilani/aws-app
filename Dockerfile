FROM openjdk:13
WORKDIR /app
COPY ./target/myAwsProject.jar ./
CMD ["java", "-jar", "myAwsProject.jar"]

FROM nginx
EXPOSE 80