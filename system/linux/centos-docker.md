# 阿里云主机安装 docker
教研室需要搭建深度学习的试验环境，因为种种原因，我决定在阿里云主机上面搭建一下 `tensorflow`，基于 `docker` 来搭建整个框架。

## 实验环境

- 1核1G内存学生机
- centos7.0

## 安装和运行

首先升级 `yum`

```shell
$ yum update
```

安装 `docker`，这里使用了阿里云的镜像，速度杠杠的。

```shell
$ curl -sSL http://acs-public-mirror.oss-cn-hangzhou.aliyuncs.com/docker-engine/internet | sh -

# 如果你使用的是阿里云主机，可以通过内网地址运行这个脚本

$ curl -sSL http://acs-public-mirror.oss-cn-hangzhou.aliyuncs.com/docker-engine/intranet | sh -
```

启动 `docker`

```shell
$ service docker start
```

## 配置阿里云镜像加速

配置 `Docker` 加速器

```shell
# 您可以使用如下的脚本将mirror的配置添加到docker daemon的启动参数中。
# 系统要求 CentOS 7 以上，Docker 1.9 以上。
$ sudo cp -n /lib/systemd/system/docker.service /etc/systemd/system/docker.service

$ sudo sed -i "s|ExecStart=/usr/bin/docker daemon|ExecStart=/usr/bin/docker daemon --registry-mirror=https://pmcivbav.mirror.aliyuncs.com|g" /etc/systemd/system/docker.service

$ sudo systemctl daemon-reload

$ sudo service docker restart
```

## 登陆 阿里云仓库

```shell
$ docker login -u sample@aliyun.com -p password -e sample.aliyun.com registry.aliyuncs.com
```

> 上面的账号密码为登陆阿里云控制台的账号和密码。

## 安装 docker-compose

运行下边的命令来安装 `docker-compose`：

```shell
$ curl -L https://github.com/docker/compose/releases/download/1.8.1/docker-compose-`uname -s`-`uname -m` > /usr/local/bin/docker-compose
$ chmod +x /usr/local/bin/docker-compose
```

安装好后使用 `docker-compose --version` 查看是否正确安装。

参考：
- [https://github.com/docker/compose/releases](https://github.com/docker/compose/releases)
- [https://docs.docker.com/compose/install/](https://docs.docker.com/compose/install/)
