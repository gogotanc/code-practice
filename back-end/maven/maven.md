# Maven 使用说明
maven是java中优秀的包管理工具。有着各种插件，使用很方便。

### 新建一个 java web 项目

直接运行下面命令

```shell
$ mvn archetype:generate
```

需要稍等下，然后会让你选择和填写相关项目信息，如 `groupId`、`DartifactId` 和版本号之类的,主要是 `archetypeAritifactId` 要选择 `webapp`。