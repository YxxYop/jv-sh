plugins {
    id("java")
    application
}

group = "org.yxx"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

application {
    mainClass.set(
        (project.findProperty("mainClass") as String?) ?: "org.yxx.Main"
    )
}

tasks.named<JavaExec>("run") {
    standardInput = System.`in`
}

dependencies {
}

