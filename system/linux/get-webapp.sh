#!/bin/sh
PROJECT_NAME=webapp
FILE_NAME=TancWebApp.war
LOCAL_PATH=/webapp
REMOTE_FILE=/root/.jenkins/jobs/$PROJECT_NAME/workspace/target/$FILE_NAME
REMOTE_HOST=root@119.29.161.146
LOG_FILE=/webapp/logs/publish.log

echo "scp started" >> $LOG_FILE
date >> $LOG_FILE
scp $REMOTE_HOST:$REMOTE_FILE $LOCAL_PATH
sh /webapp/publish-webapp.sh $LOCAL_PATH/$FILE_NAME
