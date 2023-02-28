#base docker image
FROM openjdk:11
LABEL maintainer="tenzin.net"
ADD build/libs/fashiontrend-0.0.1-SNAPSHOT.jar fashiontrend-docker.jar
ENTRYPOINT ["java","-jar","fashiontrend-docker.jar"]