#Build
FROM maven:3.8.3-openjdk-17 as build

WORKDIR /home/app
COPY . /home/app
RUN mvn clean package -DskipTests=true

#Package
FROM openjdk:17-alpine

copy --from=build /home/app/target/locationQuery-0.0.1-SNAPSHOT.jar /usr/local/lib/query.jar
EXPOSE 8080

ENTRYPOINT ["java","-jar","/usr/local/lib/producer.jar"]