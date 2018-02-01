#!/bin/sh
serverPort=8080
while getopts "p:" opt; do
  case $opt in
    p)
      echo "--- server port is $OPTARG"
      serverPort=$OPTARG
      ;;
  esac
done
java -jar -Dserver.port=${serverPort} springboot-demo1.war
#echo "---command finished."
