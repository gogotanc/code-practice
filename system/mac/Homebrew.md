# Homebrew 
包管理工具可以让你安装和更新程序变得更方便，目前在 OS X 系统中最受欢迎的包管理工具是 `Homebrew` 。
### 安装 HomeBrew
安装homebrew之前需要安装好 `XCode Command Line Tools` ,在 `iTrem` 中输入一下指令，完成安装。
```
$ ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"
```

#### 常用命令
安装一个包：
```
$ brew install <package_name>
```
更新包目录：
```
$ brew update
```
查看包是否需要更新：
```
$ brew outdated
```
更新包：
```
$ brew upgrade <package_name>
```
清理旧缓存：
```
$ brew cleanup
```
查看安装过的包：
```
$ brew list
```



### 安装 Brew Cash
`brew cask` 是在 `brew` 的基础上一个增强的工具，用来安装 `Mac` 上的 `Gui` 程序应用包 `.dmg/.pkg` , 比如 `qq` 等。它先下载解压到统一的目录中 `/opt/homebrew-cask/Caskroom` ，省掉了自己去下载、解压、拖拽（安装）等蛋疼步骤，同样，卸载相当容易与干净。然后再软链到 `~/Applications/` 目录下, 一气呵成。非常方便，而且还包含很多在 AppStore 里没有的常用软件。

#### 安装
运行下面的命令即可安装：
```
$ brew tap phinze/homebrew-cask && brew install brew-cask
```
需要安装应用时，打开「Terminal」，输入
```
brew cask install XXX
```



