[![Build Status](https://travis-ci.org/kullmanp/java-travis-docker.svg?branch=master)](https://travis-ci.org/kullmanp/java-travis-docker)


# Build
mvn clean package && docker build -t ch.kup/travistest .

# RUN

docker rm -f travistest || true && docker run -d -p 8080:8080 -p 4848:4848 --name travistest ch.kup/travistest 
