# python 入门
刚刚开始接触 `Python` ，熟悉一下。

### 简介
`python` 是大小写敏感的。

### 数据类型
数据类型：整数，浮点数，字符串，布尔值，空值。
字符串可以使用 `r''` 表示 `''` 中的内容不被转义。  
多行内容可以使用 `'''...'''` 来表示，不用写 `\n` ，多行字符串前面也可以加上 `r` ，表示的意思一样。  
布尔值用 `True` 和 `False` 两种值表示，布尔值可以用 `and`、`or` 和 `not` 运算。  
空值使用 `None` 表示。

### 输入
`python` 提供了一个 `raw_input` ,可以让用户输入字符串。
```
>>> name = raw_input()
tanc
>>> name
`tanc`
>>> name = raw_input("please input your name:\n")
```

### 函数
```
# 定义一个函数
def my_abs(x):
	if(x>=0):
		return x
	else:
		return -x
```
```
# 空函数
def nop():
	pass
```

### 直接运行 .py 文件
在 `mac` 和 `linux` 系统中是能够直接用 `./XXX.py` 命令运行 `.py` 文件的。  
需要做的就是在首行添加下面这句：  
`#!/usr/bin/env python`
