FROM centos:latest
MAINTAINER liqihua
RUN yum -y install java-1.8.0-openjdk*
ADD ../target/springboot-demo1.war /opt/project/springboot-demo1.war
ADD restart.sh /opt/project/restart.sh
WORKDIR /opt/project/
RUN chmod 777 restart.sh
CMD sh restart.sh
