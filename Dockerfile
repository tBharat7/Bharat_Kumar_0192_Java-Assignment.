FROM java:8
EXPOSE 8080
ADD build/libs/*.jar Dockerapp.jar
ENTRYPOINT ["java","-jar","Dockerapp.jar"]
