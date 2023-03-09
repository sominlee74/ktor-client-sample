val ktorVersion: String by project
val kotlinVersion: String by project

plugins {
    kotlin("jvm") version "1.5.31"
    application
}

group = "kr.mustg"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.ktor:ktor-client-core:$ktorVersion")
    implementation("io.ktor:ktor-client-cio:$ktorVersion")
}

kotlin {
    jvmToolchain {
        check(this is JavaToolchainSpec)
        languageVersion.set(JavaLanguageVersion.of(8))
    }
}

application {
    mainClass.set("ApplicationKt")
}