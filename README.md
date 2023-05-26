Simple Java CLI app with Gradle in Kotlin
=========================================

### build:
 - compile: `./gradlew compileJava`
### test
 - test: `./gradlew test`
 - need to add Junit5 support and specify main class: 
`build.gradle.kts`
```Kotlin
plugins {
    java
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

tasks.withType<Jar> {
    manifest {
        attributes["Main-Class"] = "guru.ysy.languageapp.SayHello"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
```
> syntax are slightly different with groovy

## Run application:
 - `$ java -jar build/libs/get-going-with-gradle.jar <en/es/cn>`:
 - result:
    - en: Hello!
    - es: Hola!
    - cn: 您好！