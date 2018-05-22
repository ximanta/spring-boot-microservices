FROM openjdk
EXPOSE 8082
ADD target/spring-boot-zuulgatwayproxy-0.0.1-SNAPSHOT.jar /usr/docker_jars/apigateway.jar
WORKDIR /usr/docker_jars
RUN sh -c 'touch apigateway.jar'
ENTRYPOINT ["java", "-jar","apigateway.jar"]
