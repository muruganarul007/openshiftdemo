FROM openjdk:8u191-jre-alpine
ADD openshiftdemo-0.0.1-SNAPSHOT.jar openshiftdemo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","openshiftdemo-0.0.1-SNAPSHOT.jar"]