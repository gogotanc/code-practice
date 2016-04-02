## Linux 中环境变量配置文件简介
`PATH`、`HISTSIZE`、`PS1`、`HOSTNAME`等环境变量写入对应的环境变量配置文件,下面列出的文件是登录时进行查找的文件，并且按照顺序执行的。

### /etc/profile

### /etc/profile.d/*.sh

### ~/.bash_profile

### ~/.bashrc

### /etc/bashrc

### 相关命令
`umask` - 查看系统默认权限  
`source` 或 `.` - 使修改的文件生效