#!/bin/sh
TOMCAT_HOME = /usr/local/tomcat7
PROJECT_HOME = "$TOMCAT_HOME"/webapps
TARGET_WAR = /root/tanc-webdemo.war

echo "=============Begin to Publish tanc-webdemo============="
"$TOMCAT_HOME"/bin/shutdown.sh
rm -rf "$PROJECT_HOME"/tanc-webdemo
rm -rf "$PROJECT_HOME"/tanc-webdemo.war
mv "$TARGET_WAR" "$PROJECT_HOME"
sleep 5
"$TOMCAT_HOME"/bin/startup.sh
echo "===============End Publish tanc-webdemo================"
