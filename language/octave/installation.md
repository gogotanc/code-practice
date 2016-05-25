## Homebrew

Homebrew is a package management system that simplifies the installation of software on Mac OS X. It is a free/open source software project to simplify installation of other free/open source software. It is similar in aim and function to MacPorts and Fink. It was written by Max Howell and has gained popularity in the Ruby on Rails community and earned praise for its extensibility.

### Simple Installation Instructions

First, install Homebrew:

1. Install Xcode via the Mac App Store.
2. For Mac OS 10.9 (Mavericks) install the command line tools by `xcode-select --install`.
3. For earlier versions of Mac OS, install the command line tools from Xcode's Apple Menu > Preferences > Downloads.
1. Follow Homebrew's installation instructions.
1. If running Mountain Lion (Mac OS 10.8) or later, install `XQuartz`.
1. Import the scientific computing packages, including Octave:

```shell
brew tap homebrew/science
```

To install Octave, update to the latest package definitions, install gfortran (Now you don't need to install it manually, it would be installed by dependency), and then Octave:

```shell
brew update && brew upgrade
brew install octave
```

This would install octave with the default dependencies. Note that the default dependencies include java runtime environment. If you do not have java installed, homebrew would guide you to do that. Or you can type brew install octave --without-java to remove its dependency on java.

Note: If brew complains about not having a formula for octave, the following command should fix it:

```shell
brew tap --repair
```

The command below upgrades Octave and its dependencies to the latest Homebrew-supported versions:

```shell
brew update && brew upgrade
```

Octave has many dependencies which will be downloaded and installed prior to Octave. The entire installation process can take a few hours, but precompiled binary packages called 'bottles' are available with default options for Octave and many of its dependencies.

Octave has an experimental built-in GUI (developed using Qt lib) installed by default so that gnuplot and other tools could use it directly. Gnuplot will build with Qt support if Octave's Qt-based GUI is enabled. You do not need to install an X server in most situations. 

Note: On Snow Leopard, Octave requires an X server. If you install without, Homebrew will guide you to the XQuartz project (https://xquartz.macosforge.org) where you can download this.

You might find that you need to add:

```shell
setenv ("GNUTERM", "X11")
```

to your octaverc file, normally located at `/usr/local/share/octave/site/m/startup`. See also `brew info octave` for recommended settings.

In case of trouble, see the Homebrew Troubleshooting Guide, which assists in diagnosing problems and craft useful bug reports. The post by Jatin Ganhotra may also be helpful. Bugs may be reported at Homebrew-science's issue tracker.