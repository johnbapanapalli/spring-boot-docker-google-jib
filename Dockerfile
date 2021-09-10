FROM openjdk:8
EXPOSE 2020
ADD target/spring-boot-docker-google-jib.jar spring-boot-docker-google-jib.jar
ENTRYPOINT ["java","-jar","/spring-boot-docker-google-jib.jar"]