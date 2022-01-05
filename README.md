# Logback Bug 1

Reproducing

```shell
./gradlew :logback128:test
./gradlew :logback1210:test
```

The code in the subprojects is identical.
The only difference is the version of logback.
