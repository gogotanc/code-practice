# Configuration for CentOS


### CentOS 7 static IP settings
- cd /etc/sysconfig/network-scripts/
- cp ifcfg-enp0s3 ifcfg-enp0s8
- vi ifcfg-enp0s8
> DEVICE="enp0s8"  
  BOOTPROTO=static  
  TYPE=Ethernet  
  NAME="enp0s8"  
  BROADCAST=192.168.1.255  
  IPADDR=192.168.1.123  
  IPV6INIT=yes  
  IPV6_AUTOCONF=yes  
  NETMASK=255.255.255.0  
  NETWORK=192.168.1.1  
  ONBOOT=yes  
- systemctl restart network.service

### CentOS INSTALL JDK
- use wget command download jdk (rpm or tar.gz)
> wget http://download.oracle.com/otn-pub/java/jdk/8u73-b02/jdk-8u73-linux-x64.tar.gz?AuthParam=1455867243_37d04d29fd2a3709b2007d40bf35e9b2
- change name
> mv jdk-8u73-linux-x64.tar.gz\?AuthParam\=1455867243_37d04d29fd2a3709b2007d40bf35e9b2 jdk-8u73-linux-x64.tar.gz
- create java dir
> cd /usr/  
  mkdir java
- move jdk.tar.gz to java dir and install
> mv jdk-8u73-linux-x64.tar.gz /usr/java/  
> tar -zxvf jdk-8u73-linux-x64.tar.gz  
> rm -rf jdk-8u73-linux-x64.tar.gz
- open /etc/profile
> JAVA_HOME=/usr/java/jdk1.7.0_40  
  CLASSPATH=.:$JAVA_HOME/lib.tools.jar  
  PATH=$JAVA_HOME/bin:$PATH  
  export JAVA_HOME CLASSPATH PATH

### Install Tomcat
```
wget http://www.us.apache.org/dist/tomcat/tomcat-8/v8.0.32/bin/apache-tomcat-8.0.32.tar.gz
cd /usr/local/tomcat8
```

### Install Maven
- wget http://mirror.cc.columbia.edu/pub/software/apache/maven/maven-3/3.3.9/binaries/apache-maven-3.3.9-bin.tar.gz

### Install git


### Download Jenkins
- wget http://ftp.tsukuba.wide.ad.jp/software/jenkins/war/1.648/jenkins.war