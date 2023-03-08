## Run tests on Android emulator with gradle
```bash
./gradlew :library:pixel5DebugAndroidTest \
  -Pandroid.testInstrumentationRunnerArguments.package=com.example
  -Pandroid.testInstrumentationRunnerArguments.class=CommonTest#testFromCommonTest
```

## Run tests on connected Android device with gradle
```bash
./gradlew :library:connectedAndroidTest \
  -Pandroid.testInstrumentationRunnerArguments.package=com.example
  -Pandroid.testInstrumentationRunnerArguments.class=CommonTest#testFromCommonTest
```

## Run test on JVM:
```bash
./gradlew :library:testDebugUnitTest \
  --tests 'com.example.CommonTest.testFromCommonTest'
```
