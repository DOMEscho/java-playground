# Java Playground for educational purposes


We use [maven](https://maven.apache.org/what-is-maven.html) as a build tool. Why? According the their website:  
> Maven's primary goal is to allow a developer to comprehend the complete state of a development effort in the shortest period of time. In order to attain this goal, Maven deals with several areas of concern:
> 
> - Making the build process easy
> - Providing a uniform build system
> - Providing quality project information
> - Encouraging better development practices


Compile the source code (.java files):  
```
mvn compile
```

Run `playground.Main`:  
```
mvn exec:java
```

Run JUnit tests:  
```
mvn test
```
