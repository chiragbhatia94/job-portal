FROM openjdk:8
COPY target/job-portal*.jar /opt/job-portal/job-portal.jar
WORKDIR /opt/job-portal
EXPOSE 8080
CMD ["java","-Xms256m","-Xmx256m","-jar","/opt/job-portal/job-portal.jar"]