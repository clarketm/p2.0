FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD dummy-service-0.0.1.jar dummy-service.jar
ENTRYPOINT ["sh", "-c", "-Djava.security.egd=file:/dev/./urandom -jar /dummy-service.jar"]

