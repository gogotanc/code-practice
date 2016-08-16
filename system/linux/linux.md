## Linux 相关的使用说明

### 定时任务

- 编辑 `/etc/crontab` 文件配置 `cron`

```shell
SHELL=/bin/bash
PATH=/sbin:/bin:/usr/sbin:/usr/bin
MAILTO=root

# For details see man 4 crontabs

# Example of job definition:
# .---------------- minute (0 - 59)
# |  .------------- hour (0 - 23)
# |  |  .---------- day of month (1 - 31)
# |  |  |  .------- month (1 - 12) OR jan,feb,mar,apr ...
# |  |  |  |  .---- day of week (0 - 6) (Sunday=0 or 7) OR sun,mon,tue,wed,thu,fri,sat
# |  |  |  |  |
# *  *  *  *  * user-name  command to be executed
59 23 * * * root sh ~/projects/dailycommit/main.sh
```

- 通过 `crontab` 命令来创建

### 文本编辑

之前教研室的项目需要用到文本处理，使用 `awk` 工具正好可以满足需要。

`awk` 工具通过空格作为间隔获取内容，使用 `$1` 可以获取对应位置的值，下面实现的是将一行内容分成5段，第一段单独拿出来，后面的使用分号连接起来，然后再输入到指定文件中。

```shell
$ cat filename | awk '{print $1" "$2";"$3";"$4";"$5}' > temp.md
```