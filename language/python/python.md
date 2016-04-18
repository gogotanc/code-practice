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
输入整数
```
num = int(raw_input('input your num:\n'))
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

### 编码问题
在文件的第二行指明文件的编码，写给 `Python` 解释器看的。否则，读取源代码的中文输出可能出现乱码。
```
# -*- coding: utf-8 -*-
```
### List
`Python` 内置的一种数据类型。有序集合，可以随时添加和删除其中的元素。
```
name = ['tanc', 'tracy', 'barry']
```
访问元素，下标从 `0` 开始: `name[0]` ，也可以是负数 `name[-1]` ，越界会报错。  
列表里面的数据类型也可以不同
```
list = ['tanc', ['a', 1], 2]
```

### Tuple
另一种有序列表，叫元组。 `tuple` 一初始化就不能修改。
```
name = ('tanc', 'tracy', 'barry')
```
获取元素同 `list` ，但不能赋成另外的值。 
因为 `tuple` 不可变，所以代码更安全。如果可能，能用 `tuple` 代替 `list` 就尽量用 `tuple` 。  
```
# 这个表示data=2
data = (2)
# 这个表示tuple
data = (2,)
```
`tuple` 里面放 `list` ，`list` 里面的值是可以改变的。

### if
```
age = 20
if age > 10 :
	print 'first class'
elif age > 5 :
	print 'second class'
elif age > 0 :
	print 'third class'
else :
	print 'fourth class'
```
不要忘记冒号。
```
if x :
	print 'True'
```
只要 `x` 是非零数值，非空字符串，非空列表等，就判断为 `True` ，否则为 `False` 。

### 循环
```
for x in range(101) :
	sum = sum + x
print sum
```
冒号！
```
sum = 0
n = 100
while n > 0 :
	sum = sum + n
	n = n - 2
print sum
```
### dict 和 set
`dict` 相当于 `java` 的 `map` 吧。`dict` 是空间换时间。
```
>>> data = {'tanc':34, 'tracy':55, 'barry':65}
>>> data['tanc']
34
>>> data['molly'] = 44
>>> data['molly']
44
>>> 'bbb' in data
False
>>> data.get('bbb')
>>> data.get('bbb', -1)
-1
>>> data.pop('molly')
44
```
`set` 是一组 `key` 的集合，但不存储值，`set` 中没有重复的 `key` 。
```
>>> s = set([1, 2, 3, 4])
>>> s
set([1, 2, 3, 4])
>>> s.add(4)
>>> s
set([1, 2, 3, 4])
>>> s.remove(4)
>>> s
set([1, 2, 3])
>>> s2 = set([2, 3])
>>> s & s2
set([2, 3])
```

