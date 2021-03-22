FROM ubuntu:xenial
RUN apt-get update && apt-get install -y openjdk-8-jdk
ADD ./HelloMain.java HelloMain.java
RUN javac HelloMain.java