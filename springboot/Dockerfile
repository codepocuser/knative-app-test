FROM openjdk:17-oracle
RUN groupadd -r spring && useradd -r -g spring spring
USER spring:spring
COPY build/libs/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]