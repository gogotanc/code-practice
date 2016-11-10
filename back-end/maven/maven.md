# Maven 使用说明
`maven` 是 `java` 中优秀的包管理工具。有着各种插件，使用很方便。

### maven 国内镜像

国内的网连接 `maven` 的中央仓库速度很慢，这里安利一发国内的镜像。

```xml
<mirror>
  <id>alimaven</id>
  <name>aliyun maven</name>
  <url>http://maven.aliyun.com/nexus/content/groups/public/</url>
  <mirrorOf>central</mirrorOf>        
</mirror>
```

直接在 `settings.xml` 文件中 `mirrors` 标签下面添加上面的内容即可。

### 新建一个 java web 项目

直接运行下面命令

```shell
$ mvn archetype:generate
```

需要稍等下，然后会让你选择和填写相关项目信息，如 `groupId`、`DartifactId` 和版本号之类的,主要是 `archetypeAritifactId` 要选择 `webapp`。

### 跳过测试的命令

使用如下命令进行打包，可以跳过测试阶段。

```shell
$ mvn package -Dmaven.test.skip=true
```

离线打包的时候，有些测试是需要网络连接，于是不能通过，这时就可以使用这个命令。
