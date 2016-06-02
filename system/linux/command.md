# Linux 常用命令

### 文件传输命令 scp（secure copy）


```shell
# 将远端文件复制到当前home目录
$ scp root@127.0.0.1:/usr/local/redis/redis.conf ~/redis.conf

# 反过来就是本地文件传到远端
$ scp ~/redis.conf root@127.0.0.1:/usr/local/redis/redis.conf
```

### 统计目录(或文件)所占磁盘空间的大小命令 du（disk usage）
