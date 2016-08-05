# Redis 的安装和使用

## redis 的安装

下载，解压，编译，安装，ok

```shell
$ wget http://download.redis.io/releases/redis-3.2.0.tar.gz
$ tar xzf redis-3.2.0.tar.gz
$ cd redis-3.2.0
$ make
$ make install
```

3.2 特性

`GEO` 地理信息数据结构。

## redis 的启动

### 动态方式

```shell
$ redis-server --port 6380
```

### 配置文件方式

```shell
$ redis-server /etc/redis.conf
```

一些配置信息：

```
# 是否后台执行
daemonize yes

# 端口
port 6379

# 日志文件
logfile "redis-6379.log"

# 日志目录
dir /usr/local/redis3/data/

# 密码
requirepass yourpassword
```

具体的配置信息请查看 `redis.conf`。

查看有多少个配置：

```shell
# 查看所有的配置信息，过滤掉注释和空行。
$ cat redis.conf | grep -v '#' | grep -v '^$'

# 查看有多少个配置信息
$ cat redis.conf | grep -v '#' | grep -v '^$' | wc -l

# 输出为 50
```

### 检查 redis 是否启动

```shell
$ ps -ef | grep redis | grep 6379

# root     31166     1  0 3月14 ?       01:26:03 redis-server *:6379
```

## 客户端工具 Jedis

### 基本使用
`Manven` 依赖

```xml
<dependency>
    <groupId>redis.clients</groupId>
    <artifactId>jedis</artifactId>
    <version>2.8.0</version>
</dependency>
```

示例

```java
Jedis jedis = new Jedis("127.0.0.1", 6379);
jedis.set("Hello", "Jedis");
String str = jedis.get("Hello");
```

### Jedis 连接池