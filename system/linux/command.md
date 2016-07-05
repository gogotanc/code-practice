# Linux 常用命令

### 文件传输命令 scp（secure copy）


```shell
# 将远端文件复制到当前home目录
$ scp root@127.0.0.1:/usr/local/redis/redis.conf ~/redis.conf

# 反过来就是本地文件传到远端
$ scp ~/redis.conf root@127.0.0.1:/usr/local/redis/redis.conf
```

### 统计目录(或文件)所占磁盘空间的大小命令 du（disk usage）

**常用参数：**

`-a` 或 `-all` 为每个指定文件显示磁盘使用情况，或者为目录中每个文件显示各自磁盘使用情况。

`-b` 或 `-bytes` 显示目录或文件大小时，以byte为单位。

`-c` 或 `–total` 除了显示目录或文件的大小外，同时也显示所有目录或文件的总和。

`-h` 或 `–human-readable` 以K，M，G为单位，提高信息的可读性。

`-H` 或 `–si` 与 `-h` 参数相同，但是K，M，G是以1000为换算单位,而不是以1024为换算单位。

`-k` 或 `–kilobytes` 以1024 bytes为单位。

`-m` 或 `–megabytes` 以1MB为单位。

`-s` 或 `–summarize` 仅显示总计，即当前目录的大小。

`-S` 或 `–separate-dirs` 显示每个目录的大小时，并不含其子目录的大小。

`–exclude=<目录或文件>` 略过指定的目录或文件。

`–max-depth=<目录层数>` 超过指定层数的目录后，予以忽略。

**常用示例：**

```shell
# 显示当前文件夹大小
$ du -sh
```

### 树形显示文件夹结构 tree

`mac os` 默认没有安装这个命令，使用下面的命令进行安装：

```shell
$ brew install tree
```

```shell
# 树形显示当前文件夹的结构。
$ tree
```

### 查看硬盘使用情况 df

可以查看各个硬盘分区的使用情况。

```shell
$ df
```
