FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD service-registry-0.0.1.jar service-registry.jar
ENTRYPOINT ["sh", "-c", "-Djava.security.egd=file:/dev/./urandom -jar /service-registry.jar"]

