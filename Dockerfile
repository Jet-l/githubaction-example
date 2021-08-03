FROM openjdk:11
COPY ./target/*.jar  /home/githubaction.jar
ENTRYPOINT java - jar /home/githubaction.jar