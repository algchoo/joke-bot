FROM openjdk:11-alpine AS build
WORKDIR /home

# Install Prerequisites
#RUN yum -y install which git unzip zip

# Install SDKMan and Gradle
#RUN curl -s "https://get.sdkman.io" | bash
#sdk install gradle
#git clone https://github.com/algchoo/Bots.git 
#cd Bots/
#gradle build

# Stage 2
#FROM openjdk:11
#RUN mkdir /app
#RUN yum -y install unzip
#COPY --from=build /home/Bots/build/distributions/Bots.zip /app
#RUN unzip /app/Bots.zip
#ENTRYPOINT ["/bin/bash","/app/Bots/bin/Bots"]
