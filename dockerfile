FROM openjdk:17-jdk-alpine

RUN mkdir /files

COPY target/SpringBootGraphql-0.0.1-SNAPSHOT.jar SpringBoot_Graphql.jar

RUN chmod -R 777 /files

WORKDIR /

ENTRYPOINT ["java", "-jar", "/SpringBoot_Graphql.jar"]