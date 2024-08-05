FROM maven:latest
WORKDIR /reflect_service_registry_1

COPY . /reflect_service_registry_1
COPY . /src/main/resources/application.yaml
EXPOSE 8761
ENTRYPOINT ["java", "-jar", "/reflect_service_registry_1/target/reflect_service_registry_1-0.0.1-SNAPSHOT.jar"]