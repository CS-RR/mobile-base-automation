# Mobile Base Project

Serenity BDD Screenplay test automation scaffold using Cucumber 7, JUnit Platform,
Appium, Selenium, and Java 17.

## Prerequisites

- Java 17
- Android SDK and an Android emulator/device for Android runs
- Appium 2 with the UiAutomator2 driver installed and running at
  `http://127.0.0.1:4723`
- The application under test, copied locally to
  `src/test/resources/apps/your_application.apk`

The application binary is intentionally not committed. APK, IPA, and `.app`
artifacts are excluded by `.gitignore`. The iOS environment expects
`src/test/resources/apps/your_application.app`; update that path if your app
uses a different bundle or IPA.

## Build and test

On Windows:

```powershell
.\gradlew.bat build
```

On macOS/Linux:

```shell
./gradlew build
```

The wrapper pins Gradle 8.7. By default, the `@template` login scenario is
excluded because its application-specific locators and credentials are not
known yet. Remove that tag from `login.feature` after implementing the pending
steps and providing the app under test.

Run the iOS environment with:

```shell
./gradlew test -Denvironment=ios
```

## Project conventions

- Keep production Screenplay code under
  `src/main/java/co/com/automation/certification/baseproject`.
- Declare UI locators as `static final` fields in `UPPER_SNAKE_CASE`. Prefer
  accessibility IDs; use stable, relative XPath only when necessary.
- Name tasks with a verb followed by the object, such as `OpenApplication` or
  `LogIn`.
- Keep feature files in `src/test/resources/features`, app binaries in
  `src/test/resources/apps`, and Cucumber glue under the test package.
- Serenity aggregates reports after the test task. Reports are written under
  `target/site/serenity`.

The empty package directories are intentional extension points for the
exceptions, interactions, model, questions, tasks, user interface, and utility
code described by the project structure.
