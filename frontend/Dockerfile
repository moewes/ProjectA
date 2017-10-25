FROM openjdk:8

ADD ./target/frontend-0.0.1-swarm.jar /opt/wildfly-swarm.jar

ENV JAVA_OPTS "-Xms256m -Xmx512m -Djava.net.preferIPv4Stack=true"

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/opt/wildfly-swarm.jar"]