FROM openjdk:17
ADD target/uuid.jar uuid
ENTRYPOINT ["java", "-jar","uuid"]