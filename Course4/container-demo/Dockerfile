FROM openjdk:17

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} ws.jar

ENTRYPOINT ["java","-jar", "ws.jar"]