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

配置Docker加速器

```shell
# 您可以使用如下的脚本将mirror的配置添加到docker daemon的启动参数中。
# 系统要求 CentOS 7 以上，Docker 1.9 以上。
$ sudo cp -n /lib/systemd/system/docker.service /etc/systemd/system/docker.service

$ sudo sed -i "s|ExecStart=/usr/bin/docker daemon|ExecStart=/usr/bin/docker daemon --registry-mirror=https://pmcivbav.mirror.aliyuncs.com|g" /etc/systemd/system/docker.service

$ sudo systemctl daemon-reload

$ sudo service docker restart
```

## denglu aliyun

```shell
$ docker login -u sample@aliyun.com -p password -e sample.aliyun.com registry.aliyuncs.com
```

shangmian de zhanghao mima wei denglu aliyun kongzhitai d zhanghao mima

## 安装 Compose

运行下边的命令来安装 Compose：

```shell
$ curl -L https://github.com/docker/compose/releases/download/1.3.1/docker-compose-`uname -s`-`uname -m` > /usr/local/bin/docker-compose
$ chmod +x /usr/local/bin/docker-compose
```

> 注意：如果你在安装的时候出现了 “Permission denied” 的错误信息，这说明你的 /usr/local/bin 目录是不可写的，你需要使用超级用户来安装。运行 sudo -i , 然后运行上边的两个命令，然后 exit 退出。
可选，你也可以在 shell 中使用命令行安装。

`Compose` 适用于 `OS X` 和 64位的 `Linux` 。 如果你使用其他平台，你可以安装一个 `Compose` 的 `Python` 包来完成安装。

```shell
$ sudo pip install -U docker-compose
```

到这里安装就结束了。`Compose` 已经安装完成。你可以使用 `docker-compose --version` 来进行测试 。
