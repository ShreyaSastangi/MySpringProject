FROM java:8

EXPOSE 8080

ADD target/springboot-first-app-0.0.1-SNAPSHOT.jar springboot-first-app-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","springboot-first-app-0.0.1-SNAPSHOT.jar"]