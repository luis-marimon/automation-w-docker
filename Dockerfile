FROM picoded/ubuntu-openjdk-8-jdk
RUN apt update
RUN apt install wget
RUN wget https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb
RUN apt -y install ./google-chrome-stable_current_amd64.deb
RUN apt -y install maven
RUN apt -y install git

COPY pom.xml /app/
COPY src /app/src/
COPY start.sh /app/
COPY serenity.properties /app/
#COPY chromedriver /app/
WORKDIR /app/

ENTRYPOINT ["/bin/sh"]
#CMD ["start.sh"]

