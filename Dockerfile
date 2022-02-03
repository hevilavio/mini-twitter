FROM openjdk:11.0.13-jre-slim

ADD target/mini-twitter.jar /app.jar

ENTRYPOINT exec java $JAVA_OPTS -jar app.jar
