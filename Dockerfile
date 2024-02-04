FROM gradle:7.4.2-jdk17

RUN apt-get update && apt-get install -qq -y --no-recommends

ENV INSTALLPATH /flash-cards

RUN mkdir "$INSTALL_PATH"

WORKDIR $INSTALLPATH

COPY . .
