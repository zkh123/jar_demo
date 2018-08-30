#!/bin/sh
PRGDIR=`dirname $0`
echo "starting app... please wait"
if [ ! -n "$1" ];then
    echo "please input into executable object file's name, \n like ./start xxx.jar"
    exit 0
fi
classpath=./lib/*:$1
#java -jar $1 $2 >> /data/xbsp/$3 $4 $5 $6 $7
java -jar $1 -filepath $2 -logFilePath $3 -threadNum01 $4 -threadNum02 $5 -currentDate $6 -creditLimitDate $7

echo "$2 is done!"

#sleep 15
#if test $(pgrep -f $1|wc -l) -eq 0
#then
#   echo "start failed"
#else
#   echo "start ok"
#fi