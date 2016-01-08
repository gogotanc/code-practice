# 一些sql语句

### 内联视图，有一个没有用但必须的别名
- select * from (select sal as salary from user) x where salary < 500;

### 返回随机n条记录
- select * from user order by rand() limit 3;

### 查找空值只能用is null
- select * from user where sal is null;

### 模式搜索
- select * from user where sal in (2000, 3000) and email like '%qq%';

### 指定次序结果
- select * from user order by sal asc;
- select * from user order by sal desc;
- select * from user order by sal asc, name asc;