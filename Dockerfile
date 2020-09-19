FROM openjdk:14-alpine
COPY build/libs/MicronautRest-*-all.jar MicronautRest.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "MicronautRest.jar"]