# 虚拟机CentOS的操作


### CentOS 7 静态IP设置
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

### CentOS 安装JDK
- 