//buildscript {
//    repositories {
//        mavenCentral()
//    }
//}

plugins {
    id("org.springframework.boot") version "2.6.8" apply(false)
    id("io.spring.dependency-management") version "1.0.11.RELEASE" apply(false)
    kotlin("jvm") version "1.6.21" apply(false)
    kotlin("plugin.spring") version "1.6.21" apply(false)
}

allprojects{
    group = "com.browngoo"
    version = "1.0-SNAPSHOT"

    tasks.withType<JavaCompile> {
        sourceCompatibility = "11"
    }

    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = "11"
        }
    }
}

subprojects{
    apply{
        plugin("io.spring.dependency-management")
    }

    repositories {
        mavenCentral()
    }
}