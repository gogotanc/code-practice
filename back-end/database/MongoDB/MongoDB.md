## MongoDB 相关使用

### 安装

在 `Mac OS` 上面，直接使用 `homebrew` 工具安装即可。

```shell
$ brew install mongodb
```

安装信息可以使用下面的命令查看。

```shell
$ brew info mongodb
```

```
MongoDB shell version: 3.2.8
connecting to: test
2016-08-05T19:55:00.930+0800 W NETWORK  [thread1] Failed to connect to 127.0.0.1:27017, reason: errno:61 Connection refused
2016-08-05T19:55:00.932+0800 E QUERY    [thread1] Error: couldn't connect to server 127.0.0.1:27017, connection attempt failed :
connect@src/mongo/shell/mongo.js:229:14
@(connect):1:6

mongodb: stable 3.2.8 (bottled)
High-performance, schema-free, document-oriented database
https://www.mongodb.org/
/usr/local/Cellar/mongodb/3.2.8 (17 files, 264.1M) *
  Poured from bottle on 2016-08-05 at 18:42:56
From: https://github.com/Homebrew/homebrew-core/blob/master/Formula/mongodb.rb
==> Dependencies
Build: go ✔, scons ✘
Recommended: openssl ✔
Optional: boost ✘
==> Options
--with-boost
    Compile using installed boost, not the version shipped with mongodb
--with-sasl
    Compile with SASL support
--without-openssl
    Build without openssl support
==> Caveats
To have launchd start mongodb now and restart at login:
  brew services start mongodb
Or, if you don't want/need a background service you can just run:
  mongod --config /usr/local/etc/mongod.conf
```

### 运行

使用 `homebrew` 工具安装好后，通过上面的提示信息可以看到如何启动运行 `mongodb`。因为我不需要一直运行，所以使用下面的命令随时运行就行了。

```shell
$ mongod --config /usr/local/etc/mongod.conf
```

现在 `MongoDB` 已经在运行了，使用 `mongo` 命令就可以连接上服务，进行使用了。

```shell
$ mongo
```

输入 `help`，就可以看到相关命令的使用说明了。

```shell
> help
```

```
    db.help()                    help on db methods
    db.mycoll.help()             help on collection methods
    sh.help()                    sharding helpers
    rs.help()                    replica set helpers
    help admin                   administrative help
    help connect                 connecting to a db help
    help keys                    key shortcuts
    help misc                    misc things to know
    help mr                      mapreduce

    show dbs                     show database names
    show collections             show collections in current database
    show users                   show users in current database
    show profile                 show most recent system.profile entries with time >= 1ms
    show logs                    show the accessible logger names
    show log [name]              prints out the last segment of log in memory, 'global' is default
    use <db_name>                set current database
    db.foo.find()                list objects in collection foo
    db.foo.find( { a : 1 } )     list objects in foo where a == 1
    it                           result of the last line evaluated; use to further iterate
    DBQuery.shellBatchSize = x   set default number of items to display on shell
    exit                         quit the mongo shell
```