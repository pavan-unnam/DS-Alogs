rootProject.name = "DS-Alogs"
include("algos")
include("ds")
include("java-18-features")
include("execution-framework")
include("problem-solving")
include("design-patterns")

pluginManagement {
    repositories {
        mavenLocal()
        mavenCentral()
        gradlePluginPortal()
    }

    buildscript {
        repositories {
            mavenLocal()
            mavenCentral()
            gradlePluginPortal()
        }

        dependencies {
            classpath("org.sonarsource.scanner.gradle:sonarqube-gradle-plugin:4.3.1.3277")
        }
    }

    plugins {
        id("org.sonarqube") version "4.3.1.3277"
        id("jacoco")
        id("org.gradle.toolchains.foojay-resolver-convention") version "0.7.0"
    }
}

dependencyResolutionManagement {
   repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        mavenLocal()
        mavenCentral()
        gradlePluginPortal()
    }
}

plugins {
    id("com.gradle.enterprise") version "3.14.1"
}

gradleEnterprise {
    buildScan {
        termsOfServiceUrl = "https://gradle.com/terms-of-service"
        termsOfServiceAgree = "yes"
        publishAlways()
    }
}


