# CentOS 中 iptables 的使用

阿里云主机使用的是 iptables 作为防火墙，这里记录一下使用到的操作。

### 查看运行状态

查看 `iptables` 运行状态

```shell
$ systemctl status iptables
```

或者使用下面的命令

```shell
$ service iptables status
```
