import groovy.xml.dom.DOMCategory.attributes
import org.gradle.internal.impldep.org.fusesource.jansi.AnsiRenderer.test

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