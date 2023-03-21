# Linked lists

> View the code [_here_](https://github.com/AKushch1337/SDMaT-lab2/tree/master/src/main/kotlin).
> My gradebook number is 1313. 1313 mod 4 = 1, so my variant is _Doubly linked list_ and _Linked list based on built-in arrays/lists_
-------------------------------

## Description

At first I created an implementation of a doubly linked list, then I refactored the code and implemented a linked list using built-in list. Both of them are covered with unit tests. Also, there's an example of how all the commands work in the file Main.kt

## Prerequisites

- Verify that Java JDK version 8 or higher is installed:

```bash
$ java -version
java version "1.8.0_121"
```
- Make sure you have Kotlin compiler installed

```bash
$ kotlinc -version
info: kotlinc-jvm 1.8.10 (JRE 16.0.2+7-67)
```

## Build the project

- Clone the project

- Move into the folder

```bash
cd \path\to\project
```

- If you want to build the project
```
./gradlew build
```

- If you want to run the tests

```bash 
./gradlew test
```

- Build the .jar file

```bash 
kotlinc .\src\main\kotlin\*.kt -include-runtime -d app.jar
```

## Download the .jar file

Download [_here_](https://github.com/AKushch1337/SDMaT-lab2/releases/download/v1.0.0/app.jar)

## Run the .jar file

```bash 
java -jar app.jar
```
