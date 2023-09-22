FROM ghcr.io/graalvm/jdk-community:21

LABEL maintainer="SteelBridgeLabs"

RUN set -eux && \
    mkdir -p /java/lib && \
    mkdir -p /.cache && \
    microdnf update -y && \
    microdnf clean all

# make sure we start application from the root directory
WORKDIR /

# permissions
RUN chmod -R 777 /.cache

# add java/lib folder
ADD java/lib/* /java/lib/

# add application jar
ADD ${project.build.finalName}.jar /java/lib/

# container entry point
ENTRYPOINT exec java -Xshare:on -cp "/java/lib/*" org.graalvm.demo.Application
