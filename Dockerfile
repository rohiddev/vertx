FROM fabric8/java-jboss-openjdk8-jdk:1.5.1

ENV JAVA_APP_JAR hello-verticle-fatjar-3.8.4-fat.jar
ENV AB_ENABLED off
ENV JAVA_OPTIONS -Xmx512m

EXPOSE 8080

ADD target/hello-verticle-fatjar-3.8.4-fat.jar /deployments/
