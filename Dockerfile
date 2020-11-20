FROM openjdk:8
COPY target/job-portal*.jar /opt/job-portal/job-portal.jar
WORKDIR /opt/job-portal
ENV profiles default,dev
EXPOSE 8080
CMD ["java", "-Xms256m", "-Xmx256m", "-Duser.timezone=UTC", "-Djava.security.egd=file:/dev/./urandom", \
     "-Dspring.profiles.active=${profiles}", \
     "-jar","/opt/job-portal/job-portal.jar"]