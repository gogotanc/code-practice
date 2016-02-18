# CentOS 7 静态IP设置
- cd /etc/sysconfig/network-scripts/
- cp ifcfg-enp0s3 ifcfg-enp0s8
- systemctl restart network.service