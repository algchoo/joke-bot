FROM centos:centos7 AS build
WORKDIR /home

# Install Prerequisites
RUN yum -y install java-11-openjdk-devel which git unzip zip

# Install SDKMan and Gradle
RUN curl -s "https://get.sdkman.io" | bash &&\
    source "/root/.sdkman/bin/sdkman-init.sh" &&\
    sdk --version &&\
    sdk install gradle &&\
    git clone https://github.com/algchoo/Bots.git &&\
    cd Bots/ &&\
    gradle build

# Stage 2
FROM centos:centos7
RUN mkdir /app
RUN yum -y install unzip
COPY --from=build /home/Bots/build/distributions/Bots.zip /app
RUN unzip /app/Bots.zip
ENTRYPOINT ["/bin/bash","/app/Bots/bin/Bots"]
