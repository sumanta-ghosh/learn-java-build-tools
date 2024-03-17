### Gradle Tutorial
```shell
gradle run 
```
```shell
gradle clean build 
```

The main class configured in the build file will be executed.
```shell
java -jar app/build/libs/app-1.0.4.jar
```

We specified the main class(org.example.Skg) that needs to be executed explicitly.
```shell
java -cp app/build/libs/app-1.0.4.jar org.example.Skg
```

We specified the main class(org.example.Add) that needs to be executed explicitly with args
```shell
java -cp app/build/libs/app-1.0.4.jar org.example.Add 1 2 3 4 5 6 7 8 9
```