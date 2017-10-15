<h1 align="center">
  <a href="https://curiosone-bot.github.io/"><img src="https://curiosone-bot.github.io/media/curiosone-bot-logo.png" alt="curiosone-bot" /></a>
</h1>
<div align="center">
  <a href="https://github.com/curiosone-bot/curiosone-core"><img src="https://img.shields.io/badge/curiosone-core-00d2ff.svg" alt="curiosone core" /></a>
  <a href="https://travis-ci.org/curiosone-bot/curiosone-core"> <img src="https://travis-ci.org/curiosone-bot/curiosone-core.svg?branch=next" alt="build status"></a>
  <a href="https://codecov.io/gh/curiosone-bot/curiosone-core"><img src="https://img.shields.io/codecov/c/github/curiosone-bot/curiosone-core/next.svg" alt="code coverage" /></a>
  <a href="https://google.github.io/styleguide/javaguide.html"><img src="https://img.shields.io/badge/code_style-Google-5ed9c7.svg" alt="code style" /></a>
  <a href="LICENSE"><img src="https://img.shields.io/github/license/curiosone-bot/curiosone-core.svg" alt="license" /></a>
</div>
<br />
<div align="center">
  💬 Conversational bot written in Java!
</div>
<div align="center">
  <sub>
    The API backend of the Curiosone.
  </sub>
</div>

## Background
Curiosone is a curious bot that is able to learn things chatting with people.  
You can try it [here](https://curiosone-bot.github.io/curiosone-web).

## Development
The bot codebase is splitted in different repositories:
- Curiosone Brain - [curiosone-core](https://github.com/curiosone-bot/curiosone-core)
- Curiosone Web App - [curiosone-web](https://github.com/curiosone-bot/curiosone-web)
- Curiosone Android App - [curiosone-app](https://github.com/curiosone-bot/curiosone-app)

Feel free to contribute!

## Get Started
Clone the repository to your local machine then cd into
the directory that was created by the cloning.

```
git clone https://github.com/curiosone-bot/curiosone-core.git
cd curiosone-core
```

## Requirements
If you don't have them already, you need to install some prerequisites:

* [Git](http://git-scm.com/downloads) (not needed if you install Github Desktop)
* [Java 8 JDK](http://www.oracle.com/technetwork/pt/java/javase/downloads/index.html)
* [Gradle](https://gradle.org/install)
* [GitHub Desktop](https://desktop.github.com/) (optional)
* [Checkstyle Plugin for Eclipse](http://eclipse-cs.sourceforge.net/) (optional - IDE Users only)
* [Checkstyle Plugin for IntelliJ](https://plugins.jetbrains.com/plugin/1065-checkstyle-idea) (optional - IDE Users only)
* [Google Styleguide Settings](https://github.com/HPI-Information-Systems/Metanome/wiki/Installing-the-google-styleguide-settings-in-intellij-and-eclipse) (optional - IDE Users only)

## Gradle
The project comes with some useful tools that will help you automatize some common tasks:

* `gradle clean` to clean up the files generated by the build process.
* `gradle build` to build and compile the entire project.
* `gradle test` to run unit tests.
* `gradle javadoc` to generate the javadoc.
* `gradle fixcs` to automagically fix the code style in a best-effort fashion
* `gradle dependencies` to display all dependencies declared in root project.
* `gradle run` to run the API server. (Will be available at http://localhost:4567/)
* `gradle --stop` to stop the API server..

## Authors
* **Simone Primarosa** - [simonepri](https://github.com/simonepri)

See also the list of [contributors](https://github.com/curiosone-bot/curiosone-core/contributors) who participated in this project.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
