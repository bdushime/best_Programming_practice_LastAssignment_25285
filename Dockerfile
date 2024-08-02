# Use the official Tomcat image from the Docker Hub
FROM tomcat:9.0-jdk12-openjdk-oracle

WORKDIR /usr/local/tomcat

RUN rm -rf webapps/*

# Copy your WAR file (or web application files) into the Tomcat webapps directory
COPY src/tesrr.war /usr/local/tomcat/webapps/

# Expose port 8080
EXPOSE 8080

# Run Tomcat
CMD ["catalina.sh", "run"]

