FROM openjdk:8
ADD target/<jar-name> <jar-name>
EXPOSE 8085
ENTRYPOINT ["java","-jar","<jar-name>"]