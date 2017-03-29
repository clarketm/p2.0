FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD uaa-service-0.0.1.jar uaa-service.jar
ENTRYPOINT ["sh", "-c", "-Djava.security.egd=file:/dev/./urandom -jar /uaa-service.jar"]

