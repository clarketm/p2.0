FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD api-gateway-0.0.1.jar api-gateway.jar
ENTRYPOINT ["sh", "-c", "-Djava.security.egd=file:/dev/./urandom -jar /api-gateway.jar"]

