FROM openjdk:11 AS build
WORKDIR /home

# Install Prerequisites
RUN apt-get update
RUN apt-get -y install git zip unzip

# Install SDKMan and Gradle
RUN curl -s "https://get.sdkman.io" | bash
RUN /bin/bash -l -c 'sdk install gradle'
COPY . /joke-bot
WORKDIR /joke-bot
RUN /bin/bash -l -c 'gradle build'
WORKDIR ./build/distributions/
RUN unzip joke-bot.zip

# Run the application
FROM openjdk:11-jre-slim
WORKDIR /app
RUN apt-get update
RUN apt-get -y install unzip
COPY --from=build /joke-bot/build/distributions/joke-bot/lib/joke-bot.jar /app
COPY --from=build /joke-bot/jokes.json /app
ENTRYPOINT ["java", "-jar", "joke-bot.jar"]
