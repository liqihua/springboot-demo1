#!/bin/sh
#echo "----- killing pid ..."
#pidlist=`ps -ef|grep 9111|grep -v "grep"|awk '{print $2}'`
#if [ "$pidlist" = "" ]
#   then
#       echo "----- no pid alive!"
#else
#  echo "----- pid list :$pidlist"
#  kill -9 $pidlist
#  echo "----- KILL $pidlist:"
#  echo "----- service stop success"
#fi
#echo "----- starting project ..."
nohup java -jar -Dserver.port=9111 springboot-demo1.war &
#echo "---command finished."
