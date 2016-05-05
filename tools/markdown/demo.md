## 标题
这是一级标题
===
这是二级标题
---
## 段落
> 哈哈哈  
> 喀喀喀  
> 你好啊  

## 标签
**markdown** 标记行内代码使用反引号\`,比如：  
使用`public`
```html
<html>
	<h1>test</h1>
</html>
```
**html**
**你好**
*你好*
## 代码块
<pre><code>代码区块
</code></pre>

	public void main(){}


## 链接
google's website is [www.google.com](http://www.google.com).  
一般链接：  
<http://www.google.com/>

## 强调
**MARKDOWN** 使用星号 * 或者 _ 作为标记强调字符的符号，例如：  
*hello world*  
**hello markdown**  
_hello markdown_  

## 图片
![lalala](img/girl.jpg)

## 反斜杠
\` \*

## 测试

```java  
public class Test {
    public static void main(String[] args) {
        System.out.println("hello world!");
    } 
}
```

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Document</title>
</head>
<body>
    
</body>
</html>
```

```c
#include<stdio.h>

int main() 
{
    int i = 0;
}
```

First Header  | Second Header
------------- | -------------
Content Cell  | Content Cell
Content Cell  | Content Cell


Option name         | Markup           | Result if enabled     
--------------------|------------------|-----------------------
Intra-word emphasis | So A\*maz\*ing   | So A<em>maz</em>ing   
Strikethrough       | \~~Much wow\~~   | <del>Much wow</del>   
Underline [^under]  | \_So doge\_      | <u>So doge</u>        
Quote [^quote]      | \"Such editor\"  | <q>Such editor</q>    
Highlight           | \==So good\==    | <mark>So good</mark>  
Superscript         | hoge\^(fuga)     | hoge<sup>fuga</sup>   
Autolink            | http://t.co      | <http://t.co>         
Footnotes           | [\^4] and [\^4]: | [^4] and footnote 4   
