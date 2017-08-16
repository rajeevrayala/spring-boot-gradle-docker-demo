FROM java:8
ADD spring-gradle.jar app.jar
ENTRYPOINT [ "java", "-jar", "/app.jar" ] 