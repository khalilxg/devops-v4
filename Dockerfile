FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS
ADD target/tpAchatProject-0.0.2-SNAPSHOT.jar tpAchatProject-0.0.2-SNAPSHOT.jar
EXPOSE 3000
ENTRYPOINT ["java","-jar","/tpAchatProject-0.0.2-SNAPSHOT.jar"]

# For Spring-Boot project, use the entrypoint below to reduce Tomcat startup time.
#ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar devopstpachatmainnnn.jar
