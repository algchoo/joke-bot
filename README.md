# joke-bot

## Pre-requisites
- Install git
- Install docker

## Steps to run the application using Docker
1. Clone the repository from github
2. While in the directory containing the `Dockerfile` run the following command
```
docker build -t joke-bot:v2 .
```
3. Wait for the image to build and verify that it exists by running
```
docker images
```
4. To run the application, run the following command
```
docker run -it joke-bot:v2
```
