FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD config-client-0.0.1-SNAPSHOT.jar config-client.jar
#RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/config-client.jar"]
EXPOSE 8883