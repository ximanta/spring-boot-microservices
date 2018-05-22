FROM openjdk
EXPOSE 8888
ADD target/configuration-service-0.0.1-SNAPSHOT.jar usr/project/docker_jars/centralizedconfig.jar
WORKDIR usr/project/docker_jars
RUN sh -c 'touch centralizedconfig.jar'
ENTRYPOINT ["java", "-jar","centralizedconfig.jar"]
