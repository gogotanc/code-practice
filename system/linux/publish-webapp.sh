#!/bin/sh
TOMCAT_HOME=/usr/local/tomcat7
PROJECT_ROOT=/webapp/www/ROOT
TARGET_WAR=$1
LOG_FILE=/webapp/logs/publish.log

echo $TARGET_WAR >> $LOG_FILE
echo "===== Begin To Publish =====" >> $LOG_FILE
$TOMCAT_HOME/bin/shutdown.sh >> $LOG_FILE
rm -rf $PROJECT_ROOT/*
unzip -oq $TARGET_WAR -d $PROJECT_ROOT
sleep 5
$TOMCAT_HOME/bin/startup.sh >> $LOG_FILE
rm -rf $TARGET_WAR
echo "===== END Publish =====" >> $LOG_FILE
