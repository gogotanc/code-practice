## Linux 配置 IP 地址的方法
下面列举几个在 `Linux` 系统中配置 `IP` 地址的方法。

### ifconfig 命令临时配置 IP 地址

`ifconfig` = 查看与配置网络状态

```shell
# 临时设置eth0网卡的IP地址与子网掩码
$ ifconfig eth0 192.168.0.200 netmask 255.255.255.0
```

### setup 工具永久配置 IP 地址
红帽专有图形化工具 `setup` 设置 `IP` 地址。

### 修改网络配置文件 （常用）

- 网卡信息文件  

```shell
# /etc/sysconfig/network-scripts/ifcfg-eth0

# 网卡设备名
DEVICE='eth0'
# 是否自动获取 IP （none，static，dhcp）
BOOTPROTO=none
# MAC 地址
HWADDR=00.00.00.00.00.00
# 是否随网络服务启动，eth0生效
ONBOOT='yes'
# IP 地址
IPADDR='10.104.80.179'
# 子网掩码
NETMASK='255.255.192.0'
# 网关
GATEWAY='10.104.64.1'
```

虚拟机中配置静态 IP

```shell
$ cd /etc/sysconfig/network-scripts/
$ cp ifcfg-enp0s3 ifcfg-enp0s8
$ vi ifcfg-enp0s8

# 文件内容如下
DEVICE="enp0s8"  
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

$ systemctl restart network.service
```

- 主机名文件  

`hostname` = 查看与配置主机名

```shell
# /etc/sysconfig/network

[root@VM_80_179_centos ~]$ hostname host
[root@VM_80_179_centos ~]$ hostname
host
[root@host ~]$ 
```

- DNS 配置文件

```shell
# /etc/resolv.conf

ameserver 10.225.30.181
nameserver 10.225.30.223
options timeout:1 rotate
```

### 图形界面配置 IP 地址
服务器中一般不会安装图形化界面，所以这个一般不用。