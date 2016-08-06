# 数据库的一些操作

### 开启远程访问权限

```shell
$ mysql -h localhost -u root -p
```

```sql
GRANT ALL PRIVILEGES ON *.* TO 'root'@'%' IDENTIFIED BY 'gogotanc' WITH GRANT OPTION;

FLUSH PRIVILEGES;
```

### CentOS 安装 Mysql

[借鉴的教程](http://my.oschina.net/Laily/blog/713022)

#### 卸载系统自带的  mariadb-lib

```shell
$ rpm -qa | grep mariadb
#=> mariadb-libs-5.5.44-2.el7.centos.x86_64
$ rpm -e mariadb-libs-5.5.44-2.el7.centos.x86_64 --nodeps
```

我在安装的时候，运行上面的命令的时候，出现了三条记录，如果只删除了其中一条，结果后面安装要出错，于是将三条全部卸载，就可以正常安装了。

#### 下载

首先去到官方网站下载 `mysql-5.7.14-1.el7.x86_64.rpm-bundle.tar` 。可以直接使用 `wget` 工具下载，也可以先在本地下载好然后使用 `scp` 工具将文件传上服务器。

#### 安装

先解压

```shell
$ tar -xvf mysql-5.7.14-1.el7.x86_64.rpm-bundle.tar
```

我们得到了一堆 `rpm` 文件，不过我们只需要安装下面几个

```shell
$ rpm -ivh mysql-community-common-5.7.13-1.el7.x86_64.rpm
$ rpm -ivh mysql-community-libs-5.7.13-1.el7.x86_64.rpm
$ rpm -ivh mysql-community-client-5.7.13-1.el7.x86_64.rpm
$ rpm -ivh mysql-community-server-5.7.13-1.el7.x86_64.rpm
```

具体的文件名字使用 `tab` 补全哈。这样就安装好了。

#### 初始化

```shell
$ mysqld --initialize --user=mysql
```

这里演示使用的 --initialize 初始化的，会生成一个 root 账户密码，密码在log文件最后一行

```shell
$ cat /var/log/mysqld.log
#=> 2016-07-16T07:56:38.459524Z 1 [Note] A temporary password is generated for root@localhost: hm9dKgzQdm:W
```

#### 使用

然后就可以运行 `mysqld` ，并使用那个密码登陆了。

```shell
$ systemctl start mysqld
$ mysql -uroot -phm9dKgzQdm:W
```

#### 修改密码

```mysql
mysql> ALTER USER 'root'@'localhost' IDENTIFIED BY 'new_password';
```