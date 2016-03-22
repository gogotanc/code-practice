# MacBook Pro 命令行的设置

### iterm + zsh + o-my-zsh
效果图
![pic](img/pic.png)

### iterm2
首先下载 `iterm2` ，直接将下载的文件拖进 `Application` 文件夹，就可以在 `Launchpad` 中打开，里面可以设置字体颜色等。
```
https://www.iterm2.com/downloads.html  
```

### 安装zsh
`mac` 默认是安装了 `zsh` 的。我们需要设置默认 `shell` 使用 `zsh` 。
```
# 设置默认为zsh
chsh -s /usr/local/bin/zsh
```
用 `vim` 打开 `~/.zshrc` 进行以下编辑:
```
# Set name of the theme to load.
# Look in ~/.oh-my-zsh/themes/
# Optionally, if you set this to "random", it'll load a random theme each
# time that oh-my-zsh is loaded.
# 我这里设置的是powerline
ZSH_THEME="powerline"
```

### 安装o-my-zsh
安装 `oh-my-zsh` 让 `zsh` 获得拓展功能和主题。
```
curl -L https://github.com/robbyrussell/oh-my-zsh/raw/master/tools/install.sh | sh
```

### 字体文件
上面设置好了过后，会出现字符显示的错误，所以需要下载字体文件。下面是我用到的字体：
```
https://github.com/powerline/fonts
```

### 配色方案
这里我使用了 `solarized` 的配色方案。
`github` 的地址：
```
https://github.com/altercation/solarized
```



