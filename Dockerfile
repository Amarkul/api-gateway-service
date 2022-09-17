FROM adoptopenjdk/openjdk11:alpine-jre
EXPOSE 9190
ADD target/api-gateway-service-1.0.0.jar api-gateway-service-1.0.0.jar
ENTRYPOINT ["java","-jar","/api-gateway-service-1.0.0.jar"]