FROM openjdk:11 AS build
WORKDIR /home

# Install Prerequisites
RUN apt-get update
RUN apt-get -y install git zip unzip

# Install SDKMan and Gradle
RUN curl -s "https://get.sdkman.io" | bash
RUN /bin/bash -l -c 'sdk install gradle' 
RUN git clone https://github.com/algchoo/joke-bot.git 
WORKDIR joke-bot/
RUN /bin/bash -l -c 'gradle build'
WORKDIR ./build/distributions/
RUN unzip joke-bot.zip

# Stage 2
FROM openjdk:11
WORKDIR /app
RUN apt-get -y install unzip
COPY --from=build /home/joke-bot/build/distributions/joke-bot/lib/joke-bot.jar /app
COPY --from=build /home/joke-bot/jokes.json /app
ENTRYPOINT ["java", "-jar", "joke-bot.jar"]
