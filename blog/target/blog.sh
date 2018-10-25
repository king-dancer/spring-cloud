#!/bin/bash
if [ "$1" == "run" ]; then
    java -jar my-blog-3.3.0-SNAPSHOT.jar
else if [ "$1" == "start" ]; then
    nohup java -jar my-blog-3.3.0-SNAPSHOT.jar>/dev/null 2>&1 &
    echo "Application is starting."
else if [ "$1" == "stop" ]; then
    PID=$(ps -ef | grep my-blog-3.3.0-SNAPSHOT.jar | grep -v grep | awk '{ print $2 }')
    if [ -z "$PID" ]; then
        echo Application is already stopped
    else
        echo kill $PID
        kill $PID
    fi
else if [ "$1" == "status" ]; then
    PID=$(ps -ef | grep my-blog-3.3.0-SNAPSHOT.jar | grep -v grep | awk '{ print $2 }')
    if [ -z "$PID" ]; then
        echo Application is stopped
    else
        echo Application is running
        echo $PID
    fi
fi
fi
fi
fi
